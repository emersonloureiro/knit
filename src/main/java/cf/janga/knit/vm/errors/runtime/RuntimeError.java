package cf.janga.knit.vm.errors.runtime;

/**
 * Class of errors related exclusively to a program's execution,
 * as opposed to errors related to program semantics like using undeclared
 * variables. Runtime errors are unexpected and unrecoverable - e.g.,
 * division by 0, command failing to run.
 */
public class RuntimeError extends RuntimeException {

    private final String errorType;

    public RuntimeError(String message) {
        super(message);
        this.errorType = getClass().getName();
    }

    public String getErrorType() {
        return this.errorType;
    }
}
