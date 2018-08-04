package cf.janga.knit.vm.errors;

public abstract class ProgramError extends RuntimeException {

    public ProgramError(String message) {
        super(message);
    }
}
