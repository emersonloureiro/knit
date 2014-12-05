package cf.janga.knit.runtime.vm.instructions;

import cf.janga.knit.runtime.vm.core.VirtualMachine;

public class OsPushR  extends BaseInstruction {

    private final String variableName;

    public OsPushR(int index, VirtualMachine vm, String variableName) {
        super(index, vm);
        this.variableName = variableName;
    }

    @Override
    public void doExecute() {
        this.vm.operandStack().push(this.vm.scopeStack().top().valueOf(this.variableName));
    }
}

