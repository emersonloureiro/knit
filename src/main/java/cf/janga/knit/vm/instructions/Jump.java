package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Jump extends BaseInstruction {

    private final int instruction;

    public Jump(int index, VirtualMachine vm, int instruction) {
        super(index, vm);
        this.instruction = instruction;
    }

    @Override
    public void doExecute() {
    }

    @Override
    protected Integer nextInstructionIndex() {
        return Integer.valueOf(this.instruction);
    }

    public String toStringParameter() {
        return String.valueOf(this.instruction);
    }
}
