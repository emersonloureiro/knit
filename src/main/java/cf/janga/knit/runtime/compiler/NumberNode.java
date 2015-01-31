package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.OsPushC;

import java.util.LinkedList;
import java.util.List;

class NumberNode extends ExpressionNode {

    private Float _number;

    public NumberNode(VirtualMachine vm, Float number) {
        super(vm);
        _number = number;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        OsPushC ospushc = new OsPushC(startIndex, _vm, _number);
        List<Instruction> instructions = new LinkedList<Instruction>();
        instructions.add(ospushc);
        return instructions;
    }

    @Override
    public boolean hasPrecedence(ExpressionNode node) {
        return false;
    }
}
