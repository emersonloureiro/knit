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
        OperatorNode other = null;
        if (node instanceof OperatorNode) {
            other = (OperatorNode) node;
        } else if (node instanceof SimpleMathExpression) {
            other = (OperatorNode) ((SimpleMathExpression) node).getOperator();
        }
        if ((other != null) && ((_operator == Operator.DIVISION || _operator == Operator.MULTIPLICATION)
                && (other.getOperator() == Operator.ADDITION || other.getOperator() == Operator.SUBTRACTION))) {
            return true;
        }
        return false;
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
