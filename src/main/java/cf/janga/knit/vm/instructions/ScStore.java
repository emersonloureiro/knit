package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.VirtualMachine;

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

    @Override
    public String toString() {
        return "scstore &" + this.variableName;
    }
}
