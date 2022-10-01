package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.Scope;
import cf.janga.knit.vm.core.VirtualMachine;

public class Scpsh extends BaseInstruction {

    public Scpsh(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    public void doExecute() {
        vm.scopeStack().push(new Scope(vm.globalScope()));
    }
}
