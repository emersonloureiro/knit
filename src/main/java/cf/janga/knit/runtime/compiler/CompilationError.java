package cf.janga.knit.runtime.compiler;

public class CompilationError extends RuntimeException {

    public CompilationError(String message) {
        super(message);
    }
}
