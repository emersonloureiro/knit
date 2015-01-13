package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class CondJump extends BaseInstruction {

    private int jumpToInstruction;

    public CondJump(int index, VirtualMachine vm) {
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
        Integer value = (Integer) this.vm.operandStack().pop();
        if (value == 0) {
            return this.jumpToInstruction;
        }
        return this.index + 1;
    }

    @Override
    public String toString() {
        return "condjump " + this.jumpToInstruction;
    }
}