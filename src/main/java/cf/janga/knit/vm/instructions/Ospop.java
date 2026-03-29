package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Ospop extends BaseInstruction {

    private final String variableName;

    public Ospop(String variableName, int index, VirtualMachine vm) {
        super(index, vm);
        this.variableName = variableName;
    }

    @Override
    protected void doExecute() {
        Object value = this.vm.operandStack().pop();
        this.vm.scopeStack().top().assign(this.variableName, value);
    }

    @Override
    public String toStringParameter() {
        return this.variableName;
    }
}
