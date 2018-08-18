package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.VirtualMachine;

abstract class MathExpressionNode extends BaseContext {

    private MathExpressionNode _parent;

    private MathExpressionNode _left;

    private MathExpressionNode _right;

    public MathExpressionNode(VirtualMachine vm) {
        super(vm);
    }

    public MathExpressionNode getParent() {
        return _parent;
    }

    void setParent(MathExpressionNode parent) {
        _parent = parent;
    }

    public MathExpressionNode getLeft() {
        return _left;
    }

    public MathExpressionNode getRight() {
        return _right;
    }

    public void setRight(MathExpressionNode node) {
        _right = node;
        node.setParent(this);
    }

    public void setLeft(MathExpressionNode node) {
        _left = node;
        node.setParent(this);
    }

    public abstract boolean hasPrecedence(MathExpressionNode node);
}
