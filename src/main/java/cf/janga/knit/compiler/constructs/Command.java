package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.CommandExecutor;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Comd;
import cf.janga.knit.vm.instructions.Scstr;

public class Command extends ASTNode {

    private static final String COMMAND_EXIT_CODE_VARIABLE = "$?";

    public enum Type {
        LIST_OUTPUT,
        SINGLE_OUTPUT,
    }

    private final Type type;
    private String command;
    private Pattern startPattern = Pattern.compile("\\$\\{\\s*");

    public Command(VirtualMachine vm, String command, Type type) {
        super(vm);
        this.command = command;
        this.type = type;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        boolean returnValue = 
            (this.getParent() instanceof Expression
                || this.getParent() instanceof ForEachDoComprehension);

        String referencedVariable = null;

        Matcher matcher = startPattern.matcher(command);
        if (matcher.find()) {
            int start = matcher.toMatchResult().start();
            int end = command.indexOf("}", start);
            referencedVariable = command.substring(start + 2, end).trim();
        }

        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new Comd(new CommandExecutor(), startIndex++, this.vm, command, referencedVariable, this.type, returnValue));
        instructions.add(new Scstr(startIndex++, this.vm, COMMAND_EXIT_CODE_VARIABLE, true, true));
        return instructions;
    }
    
}
