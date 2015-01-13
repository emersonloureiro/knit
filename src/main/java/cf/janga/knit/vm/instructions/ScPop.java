package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.Scope;
import cf.janga.knit.vm.core.VirtualMachine;

public class ScPop extends BaseInstruction {

    public ScPop(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        Scope scope = this.vm.scopeStack().pop();
        scope.destroy();
    }

    @Override
    public String toString() {
        return "scpop";
    }
}