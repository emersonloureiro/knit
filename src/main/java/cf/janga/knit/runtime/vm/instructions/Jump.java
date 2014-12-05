package cf.janga.knit.runtime.vm.instructions;

import cf.janga.knit.runtime.vm.core.VirtualMachine;

public class Jump extends BaseInstruction {

    private final int instruction;

    public Jump(int index, VirtualMachine vm, int instruction) {
        super(index, vm);
        this.instruction = instruction;
    }

    @Override
    public void doExecute() {
        this.vm.lastInstruction().set(Integer.valueOf(this.index));
    }

    @Override
    protected Integer getNextInstruction() {
        return Integer.valueOf(this.instruction);
    }
}
