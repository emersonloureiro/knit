package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.VirtualMachine;

import java.util.ArrayList;
import java.util.List;

abstract class ExpressionNode extends BaseContext {
    private ExpressionNode _parent;

    private List<ExpressionNode> _children;

    public ExpressionNode(VirtualMachine vm) {
        super(vm);
        _children = new ArrayList<ExpressionNode>(10);
    }

    public ExpressionNode getParent() {
        return _parent;
    }

    void setParent(ExpressionNode parent) {
        _parent = parent;
    }

    protected final void setChildAt(int index, ExpressionNode node) {
        if (index + 1 > _children.size()) {
            _children.add(node);
        } else {
            _children.set(index, node);
        }
    }

    protected final ExpressionNode getChildAt(int index) {
        if (index + 1 > _children.size()) {
            return null;
        }
        return _children.get(index);
    }

    public abstract boolean hasPrecedence(ExpressionNode node);
}
