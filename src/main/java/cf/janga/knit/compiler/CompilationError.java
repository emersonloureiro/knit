package cf.janga.knit.compiler;

public class CompilationError extends RuntimeException {

    private String details;

    public CompilationError(String details) {
        super();
        this.details = details;
    }

    @Override
    public String getMessage() {
        return String.format("Compilation error:\n%s", this.details);
    }
}
