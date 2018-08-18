package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

import java.util.List;

class MathExpressionTree extends BaseContext {

    private MathExpression _current;

    private MathExpression _root;

    public MathExpressionTree(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        return _root.getInstructions(startIndex);
    }

    public void add(MathExpressionNode node) {
        if (_root == null) {
            _root = (MathExpression) node;
            _current = _root;
        } else if (node instanceof OperatorNode) {
            if (_current.isComplete()) {
                SimpleMathExpression simpleMathExpression = new SimpleMathExpression(_vm);
                simpleMathExpression.setOperator((OperatorNode) node);
                MathExpressionNode currentParent = _current.getParent();
                simpleMathExpression.setLeft(_current);
                if (currentParent == null) {
                    _root = simpleMathExpression;
                } else {
                    if (currentParent.getRight() == _current) {
                        currentParent.setRight(simpleMathExpression);
                    } else if (currentParent.getLeft() == _current) {
                        currentParent.setLeft(simpleMathExpression);
                    }
                }
                _current = simpleMathExpression;
            } else if (_current.getOperator() == null) {
                _current.setOperator(((OperatorNode) node));
            }
        } else {
            if (_current.getLeft() == null) {
                _current.setLeft(node);
            } else if (_current.getRight() == null) {
                if (_current.getParent() != null && _current.getParent().hasPrecedence(_current)) {
                    MathExpressionNode currentLeft = _current.getLeft();
                    MathExpressionNode currentParent = _current.getParent();
                    _current.getParent().getParent().setRight(_current);
                    _current.setLeft(currentParent);
                    currentParent.setRight(currentLeft);
                }
                _current.setRight(node);
                if (node instanceof MathExpression) {
                    _current = (MathExpression) node;
                }
            }
        }
    }
}
