package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.OsPushC;

import java.util.LinkedList;
import java.util.List;

class ContextWrapperMathExpressionNode extends MathExpressionNode {

    private final Context _context;

    public ContextWrapperMathExpressionNode(VirtualMachine vm, Context context) {
        super(vm);
        _context = context;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        return _context.getInstructions(startIndex);
    }

    @Override
    public boolean hasPrecedence(MathExpressionNode node) {
        return false;
    }
}
