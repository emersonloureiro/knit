package cf.janga.knit.vm.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class VirtualMachine {

    private final MachineStack<Scope> scopeStack;
    private final MachineStack<Object> operandStack;
    private final Register<Integer> programCounter;
    private final Console console;
    private final StandardLibrary stdLibrary;
    private final Scope globalScope;
    private int exitCode;

    public VirtualMachine(Map<String, String> arguments) {
        this.scopeStack = new MachineStack<Scope>();
        this.operandStack = new MachineStack<Object>();
        this.programCounter = new Register<Integer>();
        this.console = new Console();
        this.stdLibrary = new StandardLibrary();
        this.globalScope = new Scope();

        for (Entry<String, String> entry : arguments.entrySet()) {
            String argumentName = entry.getKey();
            Object argumentValue = typify(entry.getValue());
            this.globalScope.assign("@" + argumentName, argumentValue);
        }
    }

    private Object typify(String value) {
        try {
            double number = Double.parseDouble(value);
            return number;
        } catch (NumberFormatException e) {
        }

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

    public void execute(Program program) {
        this.programCounter.set(program.startInstruction());
        Integer nextInstructionAddress = null;
        while ((nextInstructionAddress = this.programCounter.value()) != null) {
            program.instructions()[nextInstructionAddress].execute();
        }
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
}
