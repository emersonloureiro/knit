package cf.janga.knit.vm.instructions;

import cf.janga.knit.compiler.constructs.Command.Type;
import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.CommandExecutor;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.CommandError;
import cf.janga.knit.vm.errors.UndeclaredVariableError;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Comm extends BaseInstruction {

    private final String command;

    private final String referencedVariable;

    private final Type type;

    private final boolean returnValue;

    private CommandExecutor executor;

    public Comm(int index, VirtualMachine vm, String command, String referencedVariable, Type type, boolean returnValue) {
        super(index, vm);
        this.command = command.substring(1, command.length() - 1);
        this.referencedVariable = referencedVariable;
        // TODO: Will need to fetch a command executor specifically for the underlying platform
        this.executor = new CommandExecutor();
        this.type = type;
        this.returnValue = returnValue;
    }

    @Override
    protected void doExecute() {
        String finalCommand = null;
        if (this.referencedVariable == null) {
            finalCommand = this.command;
        } else {
            String variableValue = (String) this.vm.scopeStack().top().valueOf(this.referencedVariable);
            if (variableValue == null) {
                throw new UndeclaredVariableError(this.referencedVariable);
            }
            finalCommand = this.command.replaceAll("\\$\\{\\s*" + this.referencedVariable + "\\s*\\}", variableValue);
        }
        Process process = this.executor.execute(finalCommand);
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        if (this.type == Type.LIST_OUTPUT) {
            listOutputCommand(br);
        } else {
            singleOutputCommand(br);
        }
        float exitValue = this.wait(process);
        this.vm.operandStack().push(exitValue);
    }

    private int wait(Process process) {
        try {
            boolean exited = process.waitFor(5, TimeUnit.SECONDS);
            if (exited) {
                return process.exitValue();
            } else {
                return -1;
            }
        } catch (InterruptedException e) {
            throw new CommandError(this.command, e);
        }
    }

    private void listOutputCommand(BufferedReader br) {
        List<String> commandOutput = new LinkedList<String>();
        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                commandOutput.add(line);
            }
            if (returnValue) {
                this.vm.operandStack().push(commandOutput);
            }
        } catch (IOException e) {
            throw new CommandError(command, e);
        }
    }

    private void singleOutputCommand(BufferedReader br) {
        StringBuffer commandOutput = new StringBuffer();
        String line;
        try {
            while ((line = br.readLine()) != null) {
                commandOutput.append(line + "\n\r");
            }
            if (returnValue) {
                this.vm.operandStack().push(commandOutput.toString());
            }
        } catch (IOException e) {
            throw new CommandError(command, e);
        }
    }

    @Override
    public String toString() {
        return "comm " + this.command;
    }
}
