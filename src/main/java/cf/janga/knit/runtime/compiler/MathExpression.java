package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

import java.util.List;
import java.util.Optional;

public abstract class MathExpression extends MathExpressionNode {

    private Optional<OperatorNode> _operator;

    public MathExpression(VirtualMachine vm) {
        super(vm);
        _operator = Optional.empty();
    }

    public void setOperator(OperatorNode node) {
        _operator = Optional.of(node);
        Optional.ofNullable(super.getLeft()).ifPresent(l -> node.setLeft(l));
        Optional.ofNullable(super.getRight()).ifPresent(r -> node.setRight(r));
        Optional.ofNullable(super.getParent()).ifPresent(p -> node.setParent(p));
    }

    public OperatorNode getOperator() {
        return _operator.orElse(null);
    }

    @Override
    public MathExpressionNode getParent() {
        return _operator.map(o -> o.getParent()).orElse(null);
    }

    @Override
    void setParent(MathExpressionNode parent) {
        super.setParent(parent);
        _operator.ifPresent(o -> o.setParent(parent));
    }

    @Override
    public MathExpressionNode getLeft() {
        return _operator.map(o -> o.getLeft()).orElse(null);
    }

    @Override
    public MathExpressionNode getRight() {
        return _operator.map(o -> o.getRight()).orElse(null);
    }

    @Override
    public void setRight(MathExpressionNode node) {
        super.setRight(node);
        _operator.ifPresent(o -> {
            o.setRight(node);
            node.setParent(o);
        });
    }

    @Override
    public void setLeft(MathExpressionNode node) {
        super.setLeft(node);
        _operator.ifPresent(o -> {
            o.setLeft(node);
            node.setParent(o);
        });
    }

    @Override
    public final List<Instruction> getInstructions(int startIndex) {
        return _operator.map(o -> o.getInstructions(startIndex)).orElseGet(() -> {
            if (super.getRight() != null) {
                return super.getRight().getInstructions(startIndex);
            } else {
                return super.getLeft().getInstructions(startIndex);
            }
        });
    }

    public boolean isComplete() {
        return _operator.isPresent() && getLeft() != null && getRight() != null;
    }
}
