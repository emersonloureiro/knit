package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.CommandExecutor;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.CommandError;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class ComRet extends BaseInstruction {

    private final String _command;

    private CommandExecutor _executor;

    public ComRet(int index, VirtualMachine vm, String command) {
        super(index, vm);
        _command = command;
        // TODO: Will need to fetch a command executor specifically for the underlying platform
        _executor = new CommandExecutor();
    }

    @Override
    protected void doExecute() {
        Process process = _executor.execute(_command);
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        List<String> commandOutput = new LinkedList<String>();
        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                commandOutput.add(line);
            }
            _vm.operandStack().push(commandOutput);
        } catch (IOException e) {
            throw new CommandError(_command, e);
        }
    }

    @Override
    public String toString() {
        return "comret " + _command;
    }
}
