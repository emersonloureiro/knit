package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.VirtualMachine;

import java.util.ArrayList;
import java.util.List;

abstract class MathExpressionNode extends BaseContext {
    private MathExpressionNode _parent;

    private List<MathExpressionNode> _children;

    public MathExpressionNode(VirtualMachine vm) {
        super(vm);
        _children = new ArrayList<MathExpressionNode>(10);
    }

    public MathExpressionNode getParent() {
        return _parent;
    }

    void setParent(MathExpressionNode parent) {
        _parent = parent;
    }

    protected final void setChildAt(int index, MathExpressionNode node) {
        if (index + 1 > _children.size()) {
            _children.add(node);
        } else {
            _children.set(index, node);
        }
    }

    protected final MathExpressionNode getChildAt(int index) {
        if (index + 1 > _children.size()) {
            return null;
        }
        return _children.get(index);
    }

    public abstract boolean hasPrecedence(MathExpressionNode node);
}
