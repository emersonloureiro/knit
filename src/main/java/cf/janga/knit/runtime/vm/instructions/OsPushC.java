package cf.janga.knit.runtime.vm.instructions;

import cf.janga.knit.runtime.vm.core.VirtualMachine;

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
}
