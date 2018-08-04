package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Cmpr;

import java.util.LinkedList;
import java.util.List;

public class BooleanExpression extends CompositeContext {

    public BooleanExpression(VirtualMachine vm) {
        super(vm);
    }

    @Override
    protected List<Instruction> after(int startIndex) {
        List<Instruction> instructions = new LinkedList<Instruction>();
        instructions.add(new Cmpr(startIndex, _vm));
        return instructions;
    }
}
