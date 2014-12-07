package cf.janga.knit.vm.core;

public abstract class BaseInstruction implements Instruction {

    protected final VirtualMachine vm;
    protected final int index;

    public BaseInstruction(int index, VirtualMachine vm) {
        this.vm = vm;
        this.index = index;
    }

    public final void execute() {
        doExecute();
        this.vm.programCounter().set(nextInstructionIndex());
    }

    protected Integer nextInstructionIndex() {
        return Integer.valueOf(this.index + 1);
    }

    protected abstract void doExecute();
}
