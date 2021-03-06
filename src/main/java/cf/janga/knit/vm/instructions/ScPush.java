package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.Scope;
import cf.janga.knit.vm.core.VirtualMachine;

public class ScPush extends BaseInstruction {

    public ScPush(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    public void doExecute() {
        _vm.scopeStack().push(new Scope());
    }

    @Override
    public String toString() {
        return "scpush";
    }
}
