package cf.janga.knit.vm.errors.program;

public class UnknownOperatorError extends ProgramError {

    public UnknownOperatorError(String operator) {
        super(String.format("Unknown operator %s", operator));
    }
}
