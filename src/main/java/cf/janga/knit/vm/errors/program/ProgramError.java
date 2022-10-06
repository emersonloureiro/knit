package cf.janga.knit.vm.errors.program;

/**
 * Class of errors related to the semantic correctness of a
 * program - such as use of undeclared variables, invalid
 * variable assignments, etc.
 */
public abstract class ProgramError extends Exception {

    public ProgramError(String details) {
        super(String.format("Program error:\n%s", details));
    }
}
