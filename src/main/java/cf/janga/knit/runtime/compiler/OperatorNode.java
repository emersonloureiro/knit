package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.*;

import java.util.LinkedList;
import java.util.List;

class OperatorNode extends MathExpressionNode {
    private Operator _operator;

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

    public OperatorNode(VirtualMachine vm, Operator operator) {
        super(vm);
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
                default:
                    instructions.add(new OsPushC(startIndex++, _vm, toString(_operator)));
                    instruction = new Cmpr(startIndex, _vm);
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
