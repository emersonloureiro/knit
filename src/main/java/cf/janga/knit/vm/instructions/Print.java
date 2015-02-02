package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Print extends BaseInstruction {

    public Print(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        Object value = _vm.operandStack().pop();
        _vm.console().write(value.toString());
    }

    @Override
    public String toString() {
        return "print";
    }
}
