package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.compiler.CompilationError;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Add;
import cf.janga.knit.vm.instructions.Cmpr;
import cf.janga.knit.vm.instructions.Div;
import cf.janga.knit.vm.instructions.Mult;
import cf.janga.knit.vm.instructions.Not;
import cf.janga.knit.vm.instructions.Osphc;
import cf.janga.knit.vm.instructions.Subt;

public class MathOperator extends ASTNode {

    public static final String DIVISION = "/";
    public static final String MULTIPLICATION = "*";
    public static final String ADDITION = "+";
    public static final String SUBTRACTION = "-";
    public static final String AND = "&&";
    public static final String OR = "||";
    public static final String NOT_EQUALS = "!=";
    public static final String EQUALS = "==";
    public static final String GREATER_THAN = ">";
    public static final String LESS_THAN = "<";
    public static final String GREATER_THAN_OR_EQUAL_TO = ">=";
    public static final String LESS_THAN_OR_EQUAL_TO = "<=";
    public static final String NOT = "!";
    public static final String NONE_CHECK = "?";
    private final String operator;
    
    public MathOperator(VirtualMachine vm, String operator) {
        super(vm);
        this.operator = operator;
    }

    public boolean isPrecedental() {
        return this.operator.equals(MULTIPLICATION) || this.operator.equals(DIVISION);
    }

    public boolean isPrefix() {
        return this.operator.equals(NOT);
    }

    public boolean isSuffix() {
        return this.operator.equals(NONE_CHECK);
    }

    public String getOperator() {
        return operator;
    }
    
    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<Instruction>();

        if (this.operator != null) {
            switch (this.operator) {
                case MULTIPLICATION:
                    instructions.add(new Mult(startIndex, this.vm));
                    break;
                case DIVISION:
                    instructions.add(new Div(startIndex, this.vm));
                    break;
                case ADDITION:
                    instructions.add(new Add(startIndex, this.vm));
                    break;
                case SUBTRACTION:
                    instructions.add(new Subt(startIndex, this.vm));
                    break;
                case MathOperator.NOT:
                    instructions.add(new Not(startIndex, this.vm));
                    break;
                case OR:
                case EQUALS:
                case NOT_EQUALS:
                case GREATER_THAN:
                case GREATER_THAN_OR_EQUAL_TO:
                case LESS_THAN:
                case LESS_THAN_OR_EQUAL_TO:
                case AND:
                    instructions.add(new Osphc(startIndex++, this.vm, this.operator));
                    instructions.add(new Cmpr(startIndex, this.vm));        
                    break;
                default:
                    throw new CompilationError(String.format("Invalid math operator: %s", this.operator));
            }
        }
        return instructions;
    }

    @Override
    public String toString() {
        return this.operator;
    }
}
