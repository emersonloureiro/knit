package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Exit;
import cf.janga.knit.vm.instructions.ScPop;
import cf.janga.knit.vm.instructions.ScPush;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody extends CompositeContext {

    private final boolean _main;

    public FunctionBody(VirtualMachine vm, boolean main) {
        super(vm);
        _main = main;
    }

    @Override
    protected List<Instruction> before(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new ScPush(startIndex++, _vm));
        return instructions;
    }

    @Override
    protected List<Instruction> after(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new ScPop(startIndex, _vm));
        if (_main) {
            instructions.add(new Exit(startIndex++, _vm));
        }
        return instructions;
    }
}
