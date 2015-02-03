package cf.janga.knit.vm.errors;

public class UndeclaredVariableError extends ProgramError {

    public UndeclaredVariableError(String variableName) {
        super("Variable \"" + variableName + "\" has not been declared in the scope");
    }
}
