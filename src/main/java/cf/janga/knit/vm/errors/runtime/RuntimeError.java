package cf.janga.knit.vm.errors.runtime;

/**
 * Class of errors related exclusively to a program's execution,
 * as opposed to errors related to program semantics like using undeclared
 * variables. Runtime errors are unexpected and unrecoverable - e.g.,
 * division by 0, command failing to run.
 */
public class RuntimeError extends RuntimeException {

    private Object details;

    public RuntimeError(String details) {
        super();
        this.details = details;
    }

    @Override
    public String getMessage() {
        return String.format("Runtime error:\n%s: %s", getClass().getSimpleName(), this.details);
    }
}
