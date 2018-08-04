package cf.janga.knit.vm.core;

public class VirtualMachine {

    private final MachineStack<Scope> _scopeStack;
    private final MachineStack<Object> _operandStack;
    private final Register<Integer> _programCounter;
    private final Console _console;
    private final StandardLibrary _stdLibrary;

    public VirtualMachine() {
        _scopeStack = new MachineStack<Scope>();
        _operandStack = new MachineStack<Object>();
        _programCounter = new Register<Integer>();
        _console = new Console();
        _stdLibrary = new StandardLibrary();
    }

    public void execute(Program program) {
        _programCounter.set(program.startInstruction());
        Integer nextInstructionAddress = null;
        while ((nextInstructionAddress = _programCounter.value()) != null) {
            program.instructions()[nextInstructionAddress].execute();
        }
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
