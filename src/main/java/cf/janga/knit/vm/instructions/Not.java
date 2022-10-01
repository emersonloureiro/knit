package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Not extends BaseInstruction {

    public Not(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        boolean operand = (Boolean) vm.operandStack().pop();
        vm.operandStack().push(!operand);
    }
}
