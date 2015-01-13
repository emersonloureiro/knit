package cf.janga.knit.runtime;

public class CompilationError extends RuntimeException {

    public CompilationError(String message) {
        super(message);
    }
}
