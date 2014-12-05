package cf.janga.knit.runtime.vm.instructions;

import cf.janga.knit.runtime.vm.core.VirtualMachine;

public class ScStore extends BaseInstruction {

    private final String variableName;

    public ScStore(int index, VirtualMachine vm, String variableName) {
        super(index, vm);
        this.variableName = variableName;
    }

    @Override
    public void doExecute() {
        Object value = this.vm.operandStack().pop();
        this.vm.scopeStack().top().assign(this.variableName, value);
    }
}
