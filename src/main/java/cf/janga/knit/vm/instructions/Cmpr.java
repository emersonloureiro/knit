package cf.janga.knit.vm.instructions;

import static cf.janga.knit.compiler.constructs.MathOperator.*;
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

        if (operator.equals(EQUALS)) {
            _vm.operandStack().push(value1.equals(value2));
        } else if (operator.equals(NOT_EQUALS)) {
            _vm.operandStack().push(!value1.equals(value2));
        } else if (operator.equals(GREATER_THAN)
                || operator.equals(GREATER_THAN_OR_EQUAL_TO)
                || operator.equals(LESS_THAN)
                || operator.equals(LESS_THAN_OR_EQUAL_TO)) {
            try {
                Number number1 = (Number) value1;
                Number number2 = (Number) value2;
                if (operator.equals(GREATER_THAN)) {
                    _vm.operandStack().push(number1.doubleValue() > number2.doubleValue());
                } else if (operator.equals(GREATER_THAN_OR_EQUAL_TO)) {
                    _vm.operandStack().push(number1.doubleValue() >= number2.doubleValue());
                } else if (operator.equals(LESS_THAN)) {
                    _vm.operandStack().push(number1.doubleValue() < number2.doubleValue());
                } else if (operator.equals(LESS_THAN_OR_EQUAL_TO)) {
                    _vm.operandStack().push(number1.doubleValue() <= number2.doubleValue());
                }
            } catch (ClassCastException e) {
                throw new ProgramError("Can only compare numbers with operator " + operator);
            }
        } else if (operator.equals(AND)
                || operator.equals(OR)) {
            try {
                Boolean boolean1 = (Boolean) value1;
                Boolean boolean2 = (Boolean) value2;
                if (operator.equals(AND)) {
                    _vm.operandStack().push(boolean1 && boolean2);
                } else if (operator.equals(OR)) {
                    _vm.operandStack().push(boolean1 || boolean2);
                }
            } catch (ClassCastException e) {
                throw new ProgramError("Can only compare boolean values with operator " + operator);
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
