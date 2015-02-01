package cf.janga.knit.vm.errors;

public class VariableReassignmentError extends RuntimeError {
    public VariableReassignmentError(String variableName) {
        super("Reassignment of variable \"" + variableName + "\"");
    }
}
