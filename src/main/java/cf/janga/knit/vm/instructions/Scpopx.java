package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.Scope;
import cf.janga.knit.vm.core.VirtualMachine;

public class Scpopx extends BaseInstruction {

    public Scpopx(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        Scope scope = vm.scopeStack().pop();
        scope.destroy();
    }
}