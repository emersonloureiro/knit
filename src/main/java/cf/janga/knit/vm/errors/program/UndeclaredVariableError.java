package cf.janga.knit.vm.errors.program;

public class UndeclaredVariableError extends ProgramError {

    public UndeclaredVariableError(String variableName) {
        super("Variable \"" + variableName + "\" has not been declared in the scope");
    }
}
