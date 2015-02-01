package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.errors.RuntimeError;
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
        Object value = _vm.operandStack().pop();
        if (_vm.scopeStack().top().valueOf(_variableName) != null) {
            throw new VariableReassignmentError(_variableName);
        }
        _vm.scopeStack().top().assign(_variableName, value);
    }

    @Override
    public String toString() {
        return "scstore " + _variableName;
    }
}
