package cf.janga.knit.vm.errors;

/**
 * Class of errors related to the semantic correctness of a
 * program - such as use of undeclared variables, invalid
 * variable assignments, etc.
 */
public class ProgramError extends Exception {

    public ProgramError(String message) {
        super(message);
    }
}
