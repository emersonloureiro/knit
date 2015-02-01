package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.ComRet;

import java.util.ArrayList;
import java.util.List;

public class CommandExpressionContext extends BaseContext {

    private String _command;

    public CommandExpressionContext(VirtualMachine vm, String command) {
        super(vm);
        _command = command;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new ComRet(startIndex, _vm, _command));
        return instructions;
    }
}
