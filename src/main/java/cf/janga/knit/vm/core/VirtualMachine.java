package cf.janga.knit.vm.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import cf.janga.knit.compiler.CompilationError;
import cf.janga.knit.vm.errors.program.FunctionNotFoundError;
import cf.janga.knit.vm.errors.program.ProgramError;

public class VirtualMachine {

    private final MachineStack<Scope> scopeStack;
    private final MachineStack<Object> operandStack;
    private final Register<Integer> programCounter;
    private final Console console;
    private final StandardLibrary stdLibrary;
    private final Scope globalScope;
    private int exitCode;
    private LinkedHashMap<String, InstructionEntry> instructionsTable;
    private Instruction[] loadedInstructions;

    public VirtualMachine(Map<String, String> arguments) {
        this.scopeStack = new MachineStack<Scope>();
        this.operandStack = new MachineStack<Object>();
        this.programCounter = new Register<Integer>();
        this.console = new Console();
        this.stdLibrary = new StandardLibrary();
        this.globalScope = new Scope();
        this.instructionsTable = new LinkedHashMap<>();

        for (Entry<String, String> entry : arguments.entrySet()) {
            String argumentName = entry.getKey();
            Object argumentValue = typify(entry.getValue());
            this.globalScope.assign("@" + argumentName, argumentValue);
        }
    }

    private Object typify(String value) {
        String trimmedValue = value.trim();
        Pattern pattern = Pattern.compile("\\[(.+)(\\,.+)*\\]");
        if (pattern.matcher(trimmedValue).matches()) {
            String[] listElements = trimmedValue.substring(1, trimmedValue.length()-1).split(",");
            List<String> valueList = new ArrayList<>(listElements.length);
            for (String element: listElements) {
                valueList.add(element.trim());
            }
            return valueList;
        }

        // Treat as string by default then
        return value;
    }

    public void execute() throws ProgramError {
        Integer nextInstructionAddress = null;
        while ((nextInstructionAddress = this.programCounter.value()) != null) {
            this.loadedInstructions[nextInstructionAddress].execute();
        }
    }

    public void registerInstructions(String module, String function, List<Instruction> instructions) {
        if (this.instructionsTable.containsKey(function)) {
            throw new CompilationError(String.format("Duplicate definition of function '%s' at '%s'", function, this.instructionsTable.get(function).module));
        }
        this.instructionsTable.put(function, new InstructionEntry(module, instructions));
    }

    public void loadInstructions(String function, int startingInstruction) throws FunctionNotFoundError {
        InstructionEntry instructions = this.instructionsTable.get(function);
        if (instructions == null) {
            throw new FunctionNotFoundError(function);
        }
        this.programCounter.set(startingInstruction);
        this.loadedInstructions = instructions.instructions;
    }

    public LinkedHashMap<String, Instruction[]> getFunctionInstructions() {
        LinkedHashMap<String, Instruction[]> instructions = new LinkedHashMap<>();
        for (Map.Entry<String, InstructionEntry> entry : this.instructionsTable.entrySet()) {
            instructions.put(entry.getKey(), entry.getValue().instructions);
        }
        return instructions;
    }

    public Scope globalScope() {
        return this.globalScope;
    }

    public MachineStack<Scope> scopeStack() {
        return this.scopeStack;
    }

    public MachineStack<Object> operandStack() {
        return this.operandStack;
    }

    public StandardLibrary getStdLibrary() {
        return this.stdLibrary;
    }

    public Console console() {
        return this.console;
    }

    public Register<Integer> programCounter() {
        return this.programCounter;
    }

    public void setExitCode(int exitCode) {
        this.exitCode = exitCode;
    }

    public int getExitCode() {
        return this.exitCode;
    }

    private static class InstructionEntry {
        private Instruction[] instructions;
        private String module;

        public InstructionEntry(String module, List<Instruction> instructions) {
            this.instructions = instructions.toArray(new Instruction[]{});
            this.module = module;
        }
    }
}
