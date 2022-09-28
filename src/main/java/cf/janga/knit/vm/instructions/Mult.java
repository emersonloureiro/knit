package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Mult extends BaseInstruction {

    public Mult(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        Float operand_1 = (Float) vm.operandStack().pop();
        Float operand_2 = (Float) vm.operandStack().pop();
        vm.operandStack().push(operand_2 * operand_1);
    }

    @Override
    public String toString() {
        return "mult";
    }
}
