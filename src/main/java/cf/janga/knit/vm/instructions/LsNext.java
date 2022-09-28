package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

import java.util.List;

public class LsNext extends BaseInstruction {

    public LsNext(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void doExecute() {
        Object next = ((List<String>) vm.operandStack().top()).remove(0);
        vm.operandStack().push(next);
    }

    @Override
    public String toString() {
        return "lsnext";
    }
}