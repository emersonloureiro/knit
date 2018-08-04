package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.OsPushC;

import java.util.ArrayList;
import java.util.List;

public class Constant extends BaseContext {

    private Object _constant;

    public Constant(VirtualMachine vm, Object constant) {
        super(vm);
        _constant = constant;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new OsPushC(startIndex, _vm, _constant));
        return instructions;
    }
}
