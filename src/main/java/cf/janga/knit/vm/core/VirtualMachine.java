package cf.janga.knit.vm.core;

public class VirtualMachine {

    private final MachineStack<Scope> scopeStack;
    private final MachineStack<Object> operandStack;
    private final Register<Integer> programCounter;

    public VirtualMachine() {
        this.scopeStack = new MachineStack<Scope>();
        this.operandStack = new MachineStack<Object>();
        this.programCounter = new Register<Integer>();
    }

    public void execute(Program program) {
        this.programCounter.set(program.startInstruction());
        Integer nextInstructionAddress = null;
        while((nextInstructionAddress = this.programCounter.value()) != null) {
            program.instructions()[nextInstructionAddress].execute();
        }
    }

    public MachineStack<Scope> scopeStack() {
        return this.scopeStack;
    }

    public MachineStack<Object> operandStack() {
        return this.operandStack;
    }

    public Register<Integer> programCounter() {
        return this.programCounter;
    }
}
