package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Add;
import cf.janga.knit.vm.instructions.Div;
import cf.janga.knit.vm.instructions.Mult;
import cf.janga.knit.vm.instructions.Subt;

import java.util.LinkedList;
import java.util.List;

class OperatorNode extends MathExpressionNode {
    private Operator _operator;

    public enum Operator {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
    }

    public OperatorNode(VirtualMachine vm, Operator operator) {
        super(vm);
        _operator = operator;
    }

    public OperatorNode(VirtualMachine vm) {
        this(vm, null);
    }

    public MathExpressionNode getLeft() {
        return getChildAt(0);
    }

    public void setLeft(MathExpressionNode node) {
        setChildAt(0, node);
        node.setParent(this);
    }

    public MathExpressionNode getRight() {
        return getChildAt(1);
    }

    public void setRight(MathExpressionNode node) {
        setChildAt(1, node);
        node.setParent(this);
    }

    public void setOperator(Operator operator) {
        _operator = operator;
    }

    public Operator getOperator() {
        return _operator;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<Instruction>();
        List<Instruction> leftNodeInstructions = getLeft().getInstructions(startIndex);
        instructions.addAll(leftNodeInstructions);
        startIndex = startIndex + leftNodeInstructions.size();

        if (getRight() != null) {
            List<Instruction> rightNodeInstructions = getRight().getInstructions(startIndex);
            instructions.addAll(rightNodeInstructions);
            startIndex = startIndex + rightNodeInstructions.size();
        }

        if (_operator != null) {
            Instruction instruction = null;
            switch (_operator) {
                case MULTIPLICATION:
                    instruction = new Mult(startIndex, _vm);
                    break;
                case DIVISION:
                    instruction = new Div(startIndex, _vm);
                    break;
                case ADDITION:
                    instruction = new Add(startIndex, _vm);
                    break;
                case SUBTRACTION:
                    instruction = new Subt(startIndex, _vm);
                    break;
            }
            instructions.add(instruction);
        }
        return instructions;
    }

    public boolean hasPrecedence(MathExpressionNode node) {
        if (node instanceof OperatorNode) {
            OperatorNode other = (OperatorNode) node;
            if (_operator == Operator.ADDITION && other.getOperator() == Operator.SUBTRACTION) {
                return true;
            }
            if (_operator == Operator.SUBTRACTION && other.getOperator() == Operator.ADDITION) {
                return true;
            }
            if (_operator == Operator.MULTIPLICATION) {
                return true;
            }
            if (_operator == Operator.DIVISION) {
                return true;
            }
            return false;
        } else {
            return !node.hasPrecedence(this);
        }
    }

    public static Operator fromString(String operator) {
        if (operator.equals("+")) {
            return Operator.ADDITION;
        } else if (operator.equals("-")) {
            return Operator.SUBTRACTION;
        } else if (operator.equals("*")) {
            return Operator.MULTIPLICATION;
        } else if (operator.equals("/")) {
            return Operator.DIVISION;
        }
        return null;
    }
}
