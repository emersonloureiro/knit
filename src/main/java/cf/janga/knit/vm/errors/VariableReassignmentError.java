package cf.janga.knit.vm.errors;

public class VariableReassignmentError extends ProgramError {
    public VariableReassignmentError(String variableName) {
        super("Reassignment of variable \"" + variableName + "\"");
    }
}
