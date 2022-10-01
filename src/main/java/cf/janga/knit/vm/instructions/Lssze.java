package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

import java.util.List;

public class Lssze extends BaseInstruction {

    public Lssze(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void doExecute() {
        List<String> list = (List<String>) vm.operandStack().top();
        this.vm.operandStack().push(list.isEmpty());
    }
}