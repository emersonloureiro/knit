package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Cmpr;
import cf.janga.knit.vm.instructions.OsPushC;

public class BooleanOperator extends ASTNode {

    private final String operator;

    public BooleanOperator(VirtualMachine vm, String operator) {
        super(vm);
        this.operator = operator;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();
        instructions.add(new OsPushC(startIndex++, this.vm, this.operator));
        instructions.add(new Cmpr(startIndex, this.vm));
        return instructions;
    }

    @Override
    public String toString() {
        return this.operator;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof BooleanOperator && this.operator.equals(((BooleanOperator) other).operator);
    }
}
