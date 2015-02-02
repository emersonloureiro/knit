package cf.janga.knit.vm.errors;

import java.io.IOException;

public class CommandError extends RuntimeError {
    public CommandError(String command, IOException exception) {
        super("An I/O error occurred while executing command \"" + command + "\". Underlying error is \"" + exception.getMessage() + "\"");
    }
}
