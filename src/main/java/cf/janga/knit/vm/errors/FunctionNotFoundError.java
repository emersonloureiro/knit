package cf.janga.knit.vm.errors;

public class FunctionNotFoundError extends ProgramError {

    public FunctionNotFoundError(String module, String functionName) {
        super("Function " + module + " not found");
    }
}
