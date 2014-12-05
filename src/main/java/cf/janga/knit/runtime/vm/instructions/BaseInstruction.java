package cf.janga.knit.runtime.vm.instructions;

import cf.janga.knit.runtime.vm.core.VirtualMachine;

public abstract class BaseInstruction implements Instruction {

    final VirtualMachine vm;
    final int index;

    public BaseInstruction(int index, VirtualMachine vm) {
        this.vm = vm;
        this.index = index;
    }

    public final void execute() {
        doExecute();
        this.vm.programCounter().set(getNextInstruction());
    }

    protected Integer getNextInstruction() {
        return Integer.valueOf(this.index + 1);
    }

    protected abstract void doExecute();
}
