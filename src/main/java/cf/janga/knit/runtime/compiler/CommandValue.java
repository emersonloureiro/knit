package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.CommandExecutor;

public class CommandValue implements Value<String> {

    private final String _command;
    private final CommandExecutor _executor;

    public CommandValue(String command) {
        _command = command;
        _executor = new CommandExecutor();
    }

    @Override
    public String get() {
        return _command;
    }
}
