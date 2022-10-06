package cf.janga.knit.vm.errors;

public class FunctionNotFoundError extends ProgramError {

    public FunctionNotFoundError(String functionName) {
        super(String.format("Function %s is not defined", functionName));
    }
}
