package cf.janga.knit.vm.core;

import cf.janga.knit.vm.errors.CommandError;

import java.io.IOException;

public class CommandExecutor {

    public Process execute(String command) {
        ProcessBuilder pb = new ProcessBuilder("/bin/bash", "-c", command).redirectErrorStream(true);
        try {
            return pb.start();
        } catch (IOException e) {
            throw new CommandError(command, e);
        }
    }
}
