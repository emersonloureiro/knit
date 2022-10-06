package cf.janga.knit.vm.errors;

public class AssertionFailedError extends ProgramError {

    public AssertionFailedError() {
        super("Assertion failed");
    }
}
