package cf.janga.knit.vm.errors;

public class RuntimeError extends RuntimeException {

    private final String _errorType;

    public RuntimeError(String message) {
        super(message);
        _errorType = getClass().getName();
    }

    public RuntimeError(String message, String errorType) {
        super(message);
        _errorType = errorType;
    }

    public String getErrorType() {
        return _errorType;
    }
}
