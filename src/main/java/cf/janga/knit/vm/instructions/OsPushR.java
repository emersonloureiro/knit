package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.UndeclaredVariableError;

/**
 * Pushes the value of a variable to the operand stack.
 */
public class OsPushR extends BaseInstruction {

    private final String _variableName;

    public OsPushR(int index, VirtualMachine vm, String variableName) {
        super(index, vm);
       _variableName = variableName;
    }

    @Override
    public void doExecute() {
        Object value = _vm.scopeStack().top().valueOf(_variableName);
        if (value == null) {
            throw new UndeclaredVariableError(_variableName);
        }
        _vm.operandStack().push(value);
    }

    @Override
    public String toString() {
        return "ospushr " + _variableName;
    }
}

