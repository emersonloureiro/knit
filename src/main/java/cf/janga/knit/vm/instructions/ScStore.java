package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.VariableReassignmentError;

public class ScStore extends BaseInstruction {

    private final String variableName;

    public ScStore(int index, VirtualMachine vm, String variableName) {
        super(index, vm);
        this.variableName = variableName;
    }

    @Override
    public void doExecute() {
        Object value = vm.operandStack().pop();
        if (vm.scopeStack().top().valueOf(this.variableName) != null) {
            throw new VariableReassignmentError(this.variableName);
        }
        vm.scopeStack().top().assign(this.variableName, value);
    }

    @Override
    public String toString() {
        return "scstore " + this.variableName;
    }
}
