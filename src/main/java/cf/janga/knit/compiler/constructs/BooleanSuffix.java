package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.compiler.CompilationError;
import cf.janga.knit.compiler.KnitType;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Cmpr;
import cf.janga.knit.vm.instructions.OsPushC;
import cf.janga.knit.vm.instructions.OsPushR;
import cf.janga.knit.vm.instructions.ScStore;

public class BooleanSuffix extends ASTNode {

    private MathOperator operator;
    private ASTNode child;

    public BooleanSuffix(VirtualMachine vm, MathOperator operator, ASTNode child) {
        super(vm);
        this.operator = operator;
        this.child = child;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();
        switch (this.operator.getOperator()) {
            case MathOperator.NONE_CHECK: 
                if (this.child instanceof Constant) {
                    // None check against a constant doesn't make sense, but
                    // I guess it's always true (i.e., it's defined)
                    instructions.add(new OsPushC(startIndex++, this.vm, true));
                    break;
                } else if (this.child instanceof VariableReference) {
                    String variable = ((VariableReference) this.child).getIdentifier();
                    instructions.add(new OsPushR(startIndex++, this.vm, variable, false));
                    instructions.add(new OsPushC(startIndex++, this.vm, KnitType.NONE));
                    instructions.add(new OsPushC(startIndex++, this.vm, "!="));
                    instructions.add(new Cmpr(startIndex++, this.vm));
                    break;
                } else if (this.child instanceof BooleanPrefix) {
                    BooleanPrefix booleanPrefix = (BooleanPrefix) this.child;
                    if (booleanPrefix.getExpression() instanceof Constant) {
                        // None check against a constant doesn't make sense, but
                        // I guess it's always true (i.e., it's defined)
                        instructions.add(new OsPushC(startIndex++, this.vm, true));
                        instructions.addAll(booleanPrefix.getOperator().getInstructions(startIndex++));
                        break;
                    } else if (booleanPrefix.getExpression() instanceof VariableReference) {
                        String variable = ((VariableReference) booleanPrefix.getExpression()).getIdentifier();
                        instructions.add(new OsPushR(startIndex++, this.vm, variable, false));
                        instructions.add(new OsPushC(startIndex++, this.vm, KnitType.NONE));
                        instructions.add(new OsPushC(startIndex++, this.vm, "!="));
                        instructions.add(new Cmpr(startIndex++, this.vm));
                        instructions.addAll(booleanPrefix.getOperator().getInstructions(startIndex++));
                        break;
                    }
                }
                throw new CompilationError(String.format("Unknown expression applied to suffix operator: %s", this.child.toString()));
            default:
                throw new CompilationError(String.format("Unknown boolean suffix operator: %s", this.operator.getOperator()));
        }
        return instructions;
    }

}
