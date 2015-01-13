package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

import java.util.List;

public class LsNext extends BaseInstruction {

    public LsNext(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        Object next = ((List<String>) this.vm.operandStack().top()).remove(0);
        this.vm.operandStack().push(next);
    }

    @Override
    public String toString() {
        return "lsnext";
    }
}