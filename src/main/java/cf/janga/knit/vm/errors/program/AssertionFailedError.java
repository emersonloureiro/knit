package cf.janga.knit.vm.errors.program;

public class AssertionFailedError extends ProgramError {

    public AssertionFailedError() {
        super("Assertion failed");
    }
}
