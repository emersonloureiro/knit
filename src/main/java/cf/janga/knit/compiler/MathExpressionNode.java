package cf.janga.knit.compiler;

import cf.janga.knit.vm.core.VirtualMachine;

abstract class MathExpressionNode extends BaseContext {

    private OperatorNode _parent;

    public MathExpressionNode(VirtualMachine vm) {
        super(vm);
    }

    public OperatorNode getParent() {
        return _parent;
    }

    void setParent(OperatorNode parent) {
        _parent = parent;
    }
}
