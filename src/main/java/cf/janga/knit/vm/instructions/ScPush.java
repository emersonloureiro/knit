package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.Scope;
import cf.janga.knit.vm.core.VirtualMachine;

public class ScPush extends BaseInstruction {

    public ScPush(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    public void doExecute() {
        this.vm.scopeStack().push(new Scope(this.vm.lastInstruction().value()));
        this.vm.lastInstruction().set(null);
    }

    @Override
    public String toString() {
        return "scpush";
    }
}
