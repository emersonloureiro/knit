package cf.janga.knit.vm.errors;

public class UnknownOperatorError extends ProgramError {

    public UnknownOperatorError(String operator) {
        super(String.format("Unknown operator %s", operator));
    }
}
