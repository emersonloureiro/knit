package cf.janga.knit.vm.errors;

public class InvalidComparisonError extends ProgramError {

    public InvalidComparisonError(String operator, String validType) {
        super(String.format("Invalid use of operator %s. Only applicable to %s", operator, validType));
    }
}
