package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.program.ProgramError;
import cf.janga.knit.vm.errors.program.VariableReassignmentError;

public class Scstr extends BaseInstruction {

    private final String variableName;
    private boolean storeInGlobal;
    private boolean allowOverwrite;

    public Scstr(int index, VirtualMachine vm, String variableName) {
        this(index, vm, variableName, false, false);
    }

    public Scstr(int index, VirtualMachine vm, String variableName, boolean storeInGlobal, boolean allowOverwrite) {
        super(index, vm);
        this.variableName = variableName;
        this.storeInGlobal = storeInGlobal;
        this.allowOverwrite = allowOverwrite;
    }

    @Override
    public void doExecute() throws ProgramError {
        if (this.storeInGlobal) {
            if (vm.globalScope().valueOf(this.variableName) != null && !this.allowOverwrite) {
                throw new VariableReassignmentError(this.variableName);
            }
            Object value = vm.operandStack().pop();
            vm.globalScope().assign(this.variableName, value);
        } else {
            if (vm.scopeStack().top().valueOf(this.variableName) != null && !this.allowOverwrite) {
                throw new VariableReassignmentError(this.variableName);
            }
            Object value = vm.operandStack().pop();
            vm.scopeStack().top().assign(this.variableName, value);
        }
    }

    @Override
    public String toStringParameter() {
        return this.variableName;
    }
}
