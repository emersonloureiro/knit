package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.LinkedList;
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
        STANDARD,
    }

    private final Type type;
    private String command;
    private Pattern startPattern = Pattern.compile("\\$\\{\\s*");

    public Command(VirtualMachine vm, String command, Type type) {
        super(vm);
        this.type = type;

        switch (this.type) {
            case LIST_OUTPUT:
                this.command = this.discardMarker(command, "\\$\\[", "$]");
                break;
            case SINGLE_OUTPUT:
                this.command = this.discardMarker(command, "\\$\\\\", "$\\");
                break;
            case STANDARD:
                this.command = this.discardMarker(command, "\\$\\(", "$)");
                break;
        }
    }

    private String discardMarker(String originalCommandString, String startMarker, String endMarker) {
        String basicFormattedString = originalCommandString.replaceFirst(startMarker, "")
            .replaceAll("\\n", "")
            .replaceAll("\\r", "")
            .replaceAll("\\t", "");
        StringBuffer buffer = new StringBuffer(basicFormattedString);
        int lastIndex = buffer.lastIndexOf(endMarker);
        buffer.replace(lastIndex, lastIndex + endMarker.length() + 1, "");
        return buffer.toString().trim();
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        boolean returnValue = 
            (this.getParent() instanceof Expression
                || this.getParent() instanceof ForEachDoComprehension);

        String referencedVariable = null;

        Matcher matcher = startPattern.matcher(command);
        List<String> referencedVariables = new LinkedList<>();
        while (matcher.find()) {
            int start = matcher.toMatchResult().start();
            int end = command.indexOf("}", start);
            referencedVariable = command.substring(start + 2, end).trim();
            referencedVariables.add(referencedVariable);
        }

        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new Comd(new CommandExecutor(), startIndex++, this.vm, command, referencedVariables, this.type, returnValue));
        instructions.add(new Scstr(startIndex++, this.vm, COMMAND_EXIT_CODE_VARIABLE, true, true));
        return instructions;
    }
    
}
