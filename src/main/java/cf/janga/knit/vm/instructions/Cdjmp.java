package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Cdjmp extends BaseInstruction {

    private int jumpToInstruction;

    public Cdjmp(int index, VirtualMachine vm) {
        super(index, vm);
    }

    public void setJumpToInstruction(int jumpToInstruction) {
        this.jumpToInstruction = jumpToInstruction;
    }

    @Override
    protected void doExecute() {
    }

    @Override
    protected Integer nextInstructionIndex() {
        Boolean value = (Boolean) this.vm.operandStack().pop();
        if (value) {
            return this.jumpToInstruction;
        }
        return getIndex() + 1;
    }

    @Override
    public String toStringParameter() {
        return String.valueOf(this.jumpToInstruction);
    }
}