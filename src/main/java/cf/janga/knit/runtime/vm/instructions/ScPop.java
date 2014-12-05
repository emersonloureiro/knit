package cf.janga.knit.runtime.vm.instructions;

import cf.janga.knit.runtime.vm.core.VirtualMachine;

public class ScPop extends BaseInstruction {

    private Integer nextInstruction;

    public ScPop(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() {
        Scope scope = this.vm.scopeStack().pop();
        this.nextInstruction = scope.lastInstruction();
        scope.destroy();
    }

    @Override
    protected Integer getNextInstruction() {
        return this.nextInstruction;
    }
}
