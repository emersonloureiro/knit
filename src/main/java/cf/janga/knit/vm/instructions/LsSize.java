package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

import java.util.List;

public class LsSize extends BaseInstruction {

    public LsSize(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        List<String> list = (List<String>) vm.operandStack().top();
        this.vm.operandStack().push(list.isEmpty());
    }

    @Override
    public String toString() {
        return "lssize";
    }
}