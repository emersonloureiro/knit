package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Exit extends BaseInstruction {

    public Exit(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
    }

    @Override
    protected Integer nextInstructionIndex() {
        return null;
    }

    @Override
    public String toString() {
        return "exit";
    }
}
