package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.VirtualMachine;

public class SimpleMathExpression extends MathExpression {

    public SimpleMathExpression(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public boolean hasPrecedence(MathExpressionNode node) {
        if (node instanceof SimpleMathExpression) {
            return getOperator().hasPrecedence(((SimpleMathExpression)node).getOperator());
        } else {
            return false;
        }
    }
}
