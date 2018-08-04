package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

import java.util.List;

class MathExpressionTree extends MathExpressionNode {

    private OperatorNode _current;

    private OperatorNode _root;

    public MathExpressionTree(VirtualMachine vm) {
        super(vm);
        _current = new OperatorNode(vm);
        _root = _current;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        return _root.getInstructions(startIndex);
    }

    @Override
    public boolean hasPrecedence(MathExpressionNode node) {
        return true;
    }

    public void add(MathExpressionNode node) {
        if (_root.getOperator() == null && node instanceof OperatorNode) {
            _root.setOperator(((OperatorNode) node).getOperator());
            return;
        }
        if (_current.getRight() != null) {
            OperatorNode newNode = (OperatorNode) node;
            if (_current.hasPrecedence(node)) {
                if (_current.getParent() != null) {
                    ((OperatorNode) _current.getParent()).setRight(node);
                }
                newNode.setLeft(_current);
            } else {
                newNode.setLeft(_current.getRight());
                _current.setRight(node);
            }
            _current = newNode;
        } else {
            if (_current.getLeft() == null) {
                _current.setLeft(node);
            } else {
                _current.setRight(node);
            }
        }
        if (_current.getParent() == null) {
            _root = _current;
        }
    }
}
