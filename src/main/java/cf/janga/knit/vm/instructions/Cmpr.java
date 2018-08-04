package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.ProgramError;

public class Cmpr extends BaseInstruction {

    public Cmpr(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        String operator = (String) _vm.operandStack().pop();
        Object value2 = _vm.operandStack().pop();
        Object value1 = _vm.operandStack().pop();

        if (operator.equals("==")) {
            _vm.operandStack().push(value1.equals(value2));
        } else if (operator.equals(">")) {
            _vm.operandStack().push(Double.valueOf(value1.toString()) > Double.valueOf(value2.toString()));
        } else if (operator.equals(">=")) {
            _vm.operandStack().push(Double.valueOf(value1.toString()) >= Double.valueOf(value2.toString()));
        } else if (operator.equals("<")) {
            _vm.operandStack().push(Double.valueOf(value1.toString()) < Double.valueOf(value2.toString()));
        } else if (operator.equals("<=")) {
            _vm.operandStack().push(Double.valueOf(value1.toString()) <= Double.valueOf(value2.toString()));
        } else if (operator.equals("!=")) {
            _vm.operandStack().push(!value1.equals(value2));
        } else {
            throw new ProgramError("Invalid comparison operator for boolean expression");
        }
    }

    @Override
    public String toString() {
        return "cmpr";
    }
}
