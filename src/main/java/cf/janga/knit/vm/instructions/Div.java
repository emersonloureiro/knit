package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.runtime.ArithmeticError;

public class Div extends BaseInstruction {

    public Div(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        Float operand_1 = (Float) vm.operandStack().pop();
        Float operand_2 = (Float) vm.operandStack().pop();

        try {
            Float result = operand_2 / operand_1;
            vm.operandStack().push(result);
        } catch (ArithmeticException e) {
            throw new ArithmeticError(e.getMessage());
        }
    }
}
