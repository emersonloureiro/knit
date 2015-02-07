package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.ComRet;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandExpressionContext extends BaseContext {

    private String _command;
    private Pattern startPattern = Pattern.compile("\\$\\{\\s*");

    public CommandExpressionContext(VirtualMachine vm, String command) {
        super(vm);
        _command = command;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        String referencedVariable = null;

        Matcher matcher = startPattern.matcher(_command);
        if (matcher.find()) {
            int start = matcher.toMatchResult().start();
            int end = _command.indexOf("}", start);
            referencedVariable = _command.substring(start + 2, end).trim();
        }

        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new ComRet(startIndex, _vm, _command, referencedVariable));
        return instructions;
    }
}
