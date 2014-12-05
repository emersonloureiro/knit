package cf.janga.knit.runtime.vm.instructions;

import cf.janga.knit.runtime.vm.core.VirtualMachine;

public class ScPush extends BaseInstruction {

    public ScPush(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    public void doExecute() {
        this.vm.scopeStack().push(new Scope(this.vm.lastInstruction().value()));
        this.vm.lastInstruction().set(null);
    }
}
