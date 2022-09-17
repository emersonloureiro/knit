package cf.janga.knit.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OperatorNode extends MathExpressionNode {

    public enum Operator {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION,
        GREATER_THAN,
        GREATER_THAN_OR_EQUAL_TO,
        LESS_THAN,
        LESS_THAN_OR_EQUAL_TO,
        AND,
        OR,
        EQUAL,
        NOT_EQUAL
    }

    private MathExpressionNode _left;

    private MathExpressionNode _right;

    private Operator _operator;

    private boolean _grouped;

    public OperatorNode(VirtualMachine vm, Operator operator) {
        this(vm, false);
        _operator = operator;
    }

    public OperatorNode(VirtualMachine vm, boolean grouped) {
        super(vm);
        _grouped = grouped;
    }

    public boolean isGrouped() {
        return _grouped;
    }

    public Operator getOperator() {
        return _operator;
    }

    public void setOperator(Operator operator) {
        _operator = operator;
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
                default:
                    instructions.add(new OsPushC(startIndex++, _vm, toString(_operator)));
                    instruction = new Cmpr(startIndex, _vm);
            }
            instructions.add(instruction);
        }
        return instructions;
    }

    public boolean hasPrecedence(OperatorNode other) {
        if ((other != null) && ((_operator == Operator.DIVISION || _operator == Operator.MULTIPLICATION)
                && (other.getOperator() == Operator.ADDITION || other.getOperator() == Operator.SUBTRACTION))) {
            return true;
        }
        return false;
    }

    public boolean isComplete() {
        return _operator != null && getLeft() != null && getRight() != null;
    }

    @Override
    public String toString() {
        return Optional.ofNullable(getLeft()).map(l -> l.toString()).orElse("n/a") + " " + toString(_operator) + " "
                + Optional.ofNullable(getRight()).map(r -> r.toString()).orElse("n/a");
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
        } else if (operator.equals(">=")) {
            return Operator.GREATER_THAN_OR_EQUAL_TO;
        } else if (operator.equals(">")) {
            return Operator.GREATER_THAN;
        } else if (operator.equals("<=")) {
            return Operator.LESS_THAN_OR_EQUAL_TO;
        } else if (operator.equals("<")) {
            return Operator.LESS_THAN;
        } else if (operator.equals("&&")) {
            return Operator.AND;
        } else if (operator.equals("||")) {
            return Operator.OR;
        } else if (operator.equals("==")) {
            return Operator.EQUAL;
        } else if (operator.equals("!=")) {
            return Operator.NOT_EQUAL;
        }
        return null;
    }

    public static String toString(Operator operator) {
        if (operator == null) {
            return null;
        }
        if (operator.equals(Operator.ADDITION)) {
            return "+";
        } else if (operator.equals(Operator.SUBTRACTION)) {
            return "-";
        } else if (operator.equals(Operator.MULTIPLICATION)) {
            return "*";
        } else if (operator.equals(Operator.DIVISION)) {
            return "/";
        } else if (operator.equals(Operator.GREATER_THAN_OR_EQUAL_TO)) {
            return ">=";
        } else if (operator.equals(Operator.GREATER_THAN)) {
            return ">";
        } else if (operator.equals(Operator.LESS_THAN_OR_EQUAL_TO)) {
            return "<=";
        } else if (operator.equals(Operator.LESS_THAN)) {
            return "<";
        } else if (operator.equals(Operator.AND)) {
            return "&&";
        } else if (operator.equals(Operator.OR)) {
            return "||";
        } else if (operator.equals(Operator.EQUAL)) {
            return "==";
        } else if (operator.equals(Operator.NOT_EQUAL)) {
            return "!=";
        }
        return null;
    }
}
