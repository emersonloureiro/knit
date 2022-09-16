package cf.janga.knit.vm.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class VirtualMachine {

    private final MachineStack<Scope> _scopeStack;
    private final MachineStack<Object> _operandStack;
    private final Register<Integer> _programCounter;
    private final Console _console;
    private final StandardLibrary _stdLibrary;
    private final Scope _globalScope;

    public VirtualMachine(Map<String, String> arguments) {
        _scopeStack = new MachineStack<Scope>();
        _operandStack = new MachineStack<Object>();
        _programCounter = new Register<Integer>();
        _console = new Console();
        _stdLibrary = new StandardLibrary();
        _globalScope = new Scope();

        for (Entry<String, String> entry : arguments.entrySet()) {
            String argumentName = entry.getKey();
            Object argumentValue = typify(entry.getValue());
            _globalScope.assign("@" + argumentName, argumentValue);
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
        _programCounter.set(program.startInstruction());
        Integer nextInstructionAddress = null;
        while ((nextInstructionAddress = _programCounter.value()) != null) {
            program.instructions()[nextInstructionAddress].execute();
        }
    }

    public Scope globalScope() {
        return _globalScope;
    }

    public MachineStack<Scope> scopeStack() {
        return _scopeStack;
    }

    public MachineStack<Object> operandStack() {
        return _operandStack;
    }

    public StandardLibrary getStdLibrary() {
        return _stdLibrary;
    }

    public Console console() {
        return _console;
    }

    public Register<Integer> programCounter() {
        return _programCounter;
    }
}
