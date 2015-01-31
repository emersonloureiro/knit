package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Div extends BaseInstruction {

    public Div(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        Float operand_1 = (Float) _vm.operandStack().pop();
        Float operand_2 = (Float) _vm.operandStack().pop();
        _vm.operandStack().push(operand_2 / operand_1);
    }

    @Override
    public String toString() {
        return "div";
    }
}
