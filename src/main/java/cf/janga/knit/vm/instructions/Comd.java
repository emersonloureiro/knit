package cf.janga.knit.vm.instructions;

import cf.janga.knit.compiler.constructs.Command.Type;
import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.CommandExecutor;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.program.InvalidReturn;
import cf.janga.knit.vm.errors.program.ProgramError;
import cf.janga.knit.vm.errors.program.UndeclaredVariableError;
import cf.janga.knit.vm.errors.runtime.CommandError;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Comd extends BaseInstruction {

    private final String command;

    private final List<String> referencedVariables;

    private final Type type;

    private final boolean returnValue;

    private CommandExecutor executor;

    public Comd(CommandExecutor executor, int index, VirtualMachine vm, String command, List<String> referencedVariables, Type type, boolean returnValue) {
        super(index, vm);
        this.command = command;
        this.referencedVariables = referencedVariables;
        // TODO: Will need to fetch a command executor specifically for the underlying platform
        this.executor = executor;
        this.type = type;
        this.returnValue = returnValue;
    }

    @Override
    protected void doExecute() throws ProgramError {
        if (this.returnValue && this.type == Type.STANDARD) {
            throw new InvalidReturn(String.format("Command |%s| returns nothing", this.command));
        }

        String finalCommand = this.command;
        if (!this.referencedVariables.isEmpty()) {
            for (String referencedVariable : this.referencedVariables) {
                Object variableValue = (Object) this.vm.scopeStack().top().valueOf(referencedVariable);
                if (variableValue == null) {
                    throw new UndeclaredVariableError(referencedVariable);
                }
                finalCommand = finalCommand.replaceAll("\\$\\{\\s*" + referencedVariable + "\\s*\\}", variableValue.toString());
            }
        }
        Process process = this.executor.execute(finalCommand);
        BufferedReader br = getProcessStream(process);
        switch (this.type) {
            case LIST_OUTPUT:
                listOutputCommand(br);
                break;
            case SINGLE_OUTPUT:
                singleOutputCommand(br);
                break;
            case STANDARD:
                standardOutputCommand(br);
                break;
        }
        float exitValue = this.wait(process);
        this.vm.operandStack().push(exitValue);
    }

    BufferedReader getProcessStream(Process process) {
        return new BufferedReader(new InputStreamReader(process.getInputStream()));
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

    private void standardOutputCommand(BufferedReader br) {
        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                this.vm.console().write(line);
            }
        } catch (IOException e) {
            throw new CommandError(command, e);
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
    public String toStringParameter() {
        return this.command;
    }
}
