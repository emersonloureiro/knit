package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

/**
 * Pushes a constant value to the operand stack.
 */
public class Osphc extends BaseInstruction {

    private final Object value;

    public Osphc(int index, VirtualMachine vm, Object value) {
        super(index, vm);
        this.value = value;
    }

    @Override
    public void doExecute() {
        vm.operandStack().push(this.value);
    }

    @Override
    public String toStringParameter() {
        return String.valueOf(this.value);
    }
}
