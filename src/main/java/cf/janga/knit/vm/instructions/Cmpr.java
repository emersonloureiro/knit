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
        } else if (operator.equals("!=")) {
            _vm.operandStack().push(!value1.equals(value2));
        } else if (operator.equals(">") || operator.equals(">=") || operator.equals("<") || operator.equals("<=")) {
            try {
                Number number1 = (Number) value1;
                Number number2 = (Number) value2;
                if (operator.equals(">")) {
                    _vm.operandStack().push(number1.doubleValue() > number2.doubleValue());
                } else if (operator.equals(">=")) {
                    _vm.operandStack().push(number1.doubleValue() >= number2.doubleValue());
                } else if (operator.equals("<")) {
                    _vm.operandStack().push(number1.doubleValue() < number2.doubleValue());
                } else if (operator.equals("<=")) {
                    _vm.operandStack().push(number1.doubleValue() <= number2.doubleValue());
                }
            } catch (ClassCastException e) {
                throw new ProgramError("Can only compare numbers with boolean operator " + operator);
            }
        } else {
            throw new ProgramError("Invalid comparison operator for boolean expression");
        }
    }

    @Override
    public String toString() {
        return "cmpr";
    }
}
