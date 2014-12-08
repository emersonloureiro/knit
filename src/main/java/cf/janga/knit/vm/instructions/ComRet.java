package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.CommandExecutor;
import cf.janga.knit.vm.core.VirtualMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class ComRet extends BaseInstruction {

    private final String command;

    private CommandExecutor executor;

    public ComRet(int index, VirtualMachine vm, String command) {
        super(index, vm);
        this.command = command;
        // TODO: Will need to fetch a command executor specifically for the underlying platform
        this.executor = new CommandExecutor();
    }

    @Override
    protected void doExecute() {
        Process process = this.executor.execute(this.command);
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        List<String> commandOutput = new LinkedList<String>();
        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                commandOutput.add(line);
            }
            this.vm.operandStack().push(commandOutput);
        } catch (IOException e) {
            // TODO: Proper runtime error handling
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "comret " + this.command;
    }
}
