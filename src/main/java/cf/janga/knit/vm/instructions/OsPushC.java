package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

/**
 * Pushes a constant value to the operand stack.
 */
public class OsPushC extends BaseInstruction {

    private final Object _value;

    public OsPushC(int index, VirtualMachine vm, Object value) {
        super(index, vm);
        _value = value;
    }

    @Override
    public void doExecute() {
        _vm.operandStack().push(_value);
    }

    @Override
    public String toString() {
        return "ospushc " + _value;
    }
}
