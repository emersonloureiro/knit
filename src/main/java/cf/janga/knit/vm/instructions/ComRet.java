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

    private final String _referencedVariable;

    private final boolean _asList;

    private final boolean _returnValue;

    private CommandExecutor _executor;

    public ComRet(int index, VirtualMachine vm, String command, String referencedVariable, boolean asList, boolean returnValue) {
        super(index, vm);
        _command = command;
        _referencedVariable = referencedVariable;
        // TODO: Will need to fetch a command executor specifically for the underlying platform
        _executor = new CommandExecutor();
        _asList = asList;
        _returnValue = returnValue;
    }

    @Override
    protected void doExecute() {
        String finalCommand = null;
        if (_referencedVariable == null) {
            finalCommand = _command;
        } else {
            String variableValue = (String) _vm.scopeStack().top().valueOf(_referencedVariable);
            finalCommand = _command.replaceAll("\\$\\{\\s*" + _referencedVariable + "\\s*\\}", variableValue);
        }
        Process process = _executor.execute(finalCommand);
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        if (_asList) {
            commandAsList(br);
        } else {
            plainCommand(br);
        }
    }

    private void commandAsList(BufferedReader br) {
        List<String> commandOutput = new LinkedList<String>();
        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                commandOutput.add(line);
            }
            if (_returnValue) {
                _vm.operandStack().push(commandOutput);
            }
        } catch (IOException e) {
            throw new CommandError(_command, e);
        }
    }

    private void plainCommand(BufferedReader br) {
        StringBuffer commandOutput = new StringBuffer();
        String line;
        try {
            while ((line = br.readLine()) != null) {
                commandOutput.append(line + "\n\r");
            }
            if (_returnValue) {
                _vm.operandStack().push(commandOutput.toString());
            }
        } catch (IOException e) {
            throw new CommandError(_command, e);
        }
    }

    @Override
    public String toString() {
        return "comret " + _command;
    }
}
