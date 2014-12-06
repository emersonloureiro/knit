package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.VirtualMachine;

public class OsPushC extends BaseInstruction {

    private final Object value;

    public OsPushC(int index, VirtualMachine vm, Object value) {
        super(index, vm);
        this.value = value;
    }

    @Override
    public void doExecute() {
        vm.operandStack().push(this.value);
    }

    @Override
    public String toString() {
        return "ospushc " + this.value;
    }
}
