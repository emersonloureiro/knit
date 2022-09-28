package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.RuntimeError;

public class Raise extends BaseInstruction {

    public Raise(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        String errorType = (String) vm.operandStack().pop();
        String errorMessage = (String) vm.operandStack().pop();
        throw new RuntimeError(errorMessage, errorType);
    }

    @Override
    public String toString() {
        return "raise";
    }
}
