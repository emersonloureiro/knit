package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.VariableReassignmentError;

public class ScStore extends BaseInstruction {

    private final String _variableName;

    public ScStore(int index, VirtualMachine vm, String variableName) {
        super(index, vm);
        _variableName = variableName;
    }

    @Override
    public void doExecute() {
        Object value = vm.operandStack().pop();
        if (vm.scopeStack().top().valueOf(_variableName) != null) {
            throw new VariableReassignmentError(_variableName);
        }
        vm.scopeStack().top().assign(_variableName, value);
    }

    @Override
    public String toString() {
        return "scstore " + _variableName;
    }
}
