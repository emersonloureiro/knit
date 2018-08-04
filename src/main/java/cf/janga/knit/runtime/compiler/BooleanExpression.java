package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Cmpr;
import cf.janga.knit.vm.instructions.OsPushC;

import java.util.LinkedList;
import java.util.List;

public class BooleanExpression extends CompositeContext {

    private final String _comparisonOperator;

    public BooleanExpression(VirtualMachine vm, String comparisonOperator) {
        super(vm);
        _comparisonOperator = comparisonOperator;
    }

    @Override
    protected List<Instruction> after(int startIndex) {
        List<Instruction> instructions = new LinkedList<Instruction>();
        instructions.add(new OsPushC(startIndex++, _vm, _comparisonOperator));
        instructions.add(new Cmpr(startIndex, _vm));
        return instructions;
    }
}
