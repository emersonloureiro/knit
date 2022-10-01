package cf.janga.knit.vm.errors;

public class CommandError extends RuntimeError {
    public CommandError(String command, Exception exception) {
        super("An error occurred while executing command \"" + command + "\". Underlying error is \"" + exception.getMessage() + "\"");
    }
}
