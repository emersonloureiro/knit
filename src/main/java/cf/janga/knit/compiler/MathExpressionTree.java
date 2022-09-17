package cf.janga.knit.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

import java.util.List;
import java.util.Stack;

class MathExpressionTree extends BaseContext {

    private Stack<OperatorNode> _currentStack;

    public MathExpressionTree(VirtualMachine vm) {
        super(vm);
        _currentStack = new Stack<OperatorNode>();
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        OperatorNode current = _currentStack.peek();
        while (current.getParent() != null) {
            current = current.getParent();
        }
        return current.getInstructions(startIndex);
    }

    public void add(MathExpressionNode node) {
        if (_currentStack.isEmpty()) {
            _currentStack.push(new OperatorNode(_vm, false));
        }

        OperatorNode current = _currentStack.peek();
        if (node instanceof OperatorNode) {
            if (current.getOperator() == null) {
                current.setOperator(((OperatorNode) node).getOperator());
            } else if (current.isComplete()) {
                OperatorNode operatorNode = (OperatorNode) node;
                if (operatorNode.hasPrecedence(current) && !current.isGrouped()) {
                    MathExpressionNode currentRight = current.getRight();
                    operatorNode.setLeft(currentRight);
                    current.setRight(operatorNode);
                } else {
                    OperatorNode currentParent = current.getParent();
                    operatorNode.setLeft(current);
                    if (currentParent != null) {
                        if (currentParent.getRight() == current) {
                            currentParent.setRight(operatorNode);
                        } else if (currentParent.getLeft() == current) {
                            currentParent.setLeft(operatorNode);
                        }
                    }
                }
                _currentStack.pop();
                _currentStack.push(operatorNode);
            }
        } else {
            if (current.getLeft() == null) {
                current.setLeft(node);
            } else if (current.getRight() == null) {
                current.setRight(node);
            }
        }
    }

    public void addGrouping() {
        _currentStack.push(new OperatorNode(_vm, true));
    }

    public void takeGrouping() {
        if (_currentStack.size() > 1) {
            OperatorNode toBeAdded = _currentStack.pop();
            OperatorNode current = _currentStack.peek();
            if (current != null) {
                if (current.getLeft() == null) {
                    current.setLeft(toBeAdded);
                } else if (current.getRight() == null) {
                    current.setRight(toBeAdded);
                }
            }
        }
    }
}
