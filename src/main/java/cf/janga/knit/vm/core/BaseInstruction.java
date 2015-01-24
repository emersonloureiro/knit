package cf.janga.knit.vm.core;

public abstract class BaseInstruction implements Instruction {

    protected final VirtualMachine vm;
    private final int _index;

    public BaseInstruction(int index, VirtualMachine vm) {
        this.vm = vm;
        _index = index;
    }

    public final void execute() {
        doExecute();
        this.vm.programCounter().set(nextInstructionIndex());
    }

    protected Integer nextInstructionIndex() {
        return Integer.valueOf(_index + 1);
    }

    public int getIndex() {
        return _index;
    }

    protected abstract void doExecute();
}
