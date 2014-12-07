package cf.janga.knit.vm.core;

import java.io.IOException;

public class CommandExecutor {

    public Process execute(String command) {
        ProcessBuilder pb = new ProcessBuilder("/bin/bash", "-c", command);
        try {
            return pb.start();
        } catch (IOException e) {
            // TODO: Proper runtime error handling
            throw new RuntimeException(e);
        }
    }
}
