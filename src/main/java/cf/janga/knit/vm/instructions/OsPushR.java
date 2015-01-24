package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class OsPushR extends BaseInstruction {

    private final String variableName;

    public OsPushR(int index, VirtualMachine vm, String variableName) {
        super(index, vm);
        this.variableName = variableName;
    }

    @Override
    public void doExecute() {
        this._vm.operandStack().push(this._vm.scopeStack().top().valueOf(this.variableName));
    }

    @Override
    public String toString() {
        return "ospushr &" + this.variableName;
    }
}

