package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.VirtualMachine;

public class EnclosedMathExpression extends MathExpression {

    public EnclosedMathExpression(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public boolean hasPrecedence(MathExpressionNode node) {
        return true;
    }
}
