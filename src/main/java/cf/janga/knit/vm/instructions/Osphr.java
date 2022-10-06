package cf.janga.knit.vm.instructions;

import cf.janga.knit.compiler.KnitType;
import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.program.ProgramError;
import cf.janga.knit.vm.errors.program.UndeclaredVariableError;

/**
 * Pushes the value of a variable to the operand stack.
 */
public class Osphr extends BaseInstruction {

    private final String variableName;
    private boolean failOnUndeclared;

    public Osphr(int index, VirtualMachine vm, String variableName, boolean failOnUndeclared) {
        super(index, vm);
        this.variableName = variableName;
        this.failOnUndeclared = failOnUndeclared;
    }

    @Override
    public void doExecute() throws ProgramError {
        Object value = vm.scopeStack().top().valueOf(this.variableName);
        if (value == null) {
            if (this.failOnUndeclared) {
                throw new UndeclaredVariableError(this.variableName);
            } else {
                vm.operandStack().push(KnitType.NONE);
            }
        } else {
            vm.operandStack().push(value);
        }
    }

    @Override
    public String toStringParameter() {
        return this.variableName;
    }
}

