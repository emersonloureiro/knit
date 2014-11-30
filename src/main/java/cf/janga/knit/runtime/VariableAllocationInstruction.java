package cf.janga.knit.runtime;

public class VariableAllocationInstruction implements Instruction<Boolean> {

    private String variableName;

    public VariableAllocationInstruction(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public Boolean execute() {
        return true;
    }

    @Override
    public void afterExecution() {
    }

    @Override
    public void afterSequence() {
    }
}
