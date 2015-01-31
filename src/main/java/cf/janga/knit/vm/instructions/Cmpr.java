package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Cmpr extends BaseInstruction {

    public Cmpr(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        Object value1 = _vm.operandStack().pop();
        Object value2 = _vm.operandStack().pop();
        _vm.operandStack().push(value1.equals(value2));
    }

    @Override
    public String toString() {
        return "cmpr";
    }
}
