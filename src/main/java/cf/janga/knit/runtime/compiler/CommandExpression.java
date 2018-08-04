package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Comm;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandExpression extends BaseContext {

    private final boolean _asList;
    private final boolean _returnValue;
    private String _command;
    private Pattern startPattern = Pattern.compile("\\$\\{\\s*");

    public CommandExpression(VirtualMachine vm, String command, boolean asList, boolean returnValue) {
        super(vm);
        _command = command;
        _asList = asList;
        _returnValue = returnValue;
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
        instructions.add(new Comm(startIndex, _vm, _command, referencedVariable, _asList, _returnValue));
        return instructions;
    }
}
