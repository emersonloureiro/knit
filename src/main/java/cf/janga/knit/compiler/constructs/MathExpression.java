package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class MathExpression extends ASTNode {

    private List<MathOperator> operators;
    private List<ASTNode> expressions;
    private boolean isBoolean;

    public MathExpression(VirtualMachine vm, boolean isBoolean) {
        super(vm);
        this.operators = new ArrayList<>(10);
        this.expressions = new ArrayList<>(10);
        this.isBoolean = isBoolean;
    }

    @Override
    public String toString() {
        return "EME";
    }

    public boolean isBoolean() {
        return isBoolean;
    }

    @Override
    public void doAddChild(ASTNode child) {
        if (child instanceof MathOperator) {
            if (((MathOperator) child).isSuffix()) {
                ASTNode lastExpression = this.expressions.remove(this.expressions.size() - 1);
                ASTNode booleanSuffixNode = new BooleanSuffix(this.vm, (MathOperator) child, lastExpression);
                this.expressions.add(booleanSuffixNode);
            } else {
                this.operators.add((MathOperator) child);
            }
        } else {
            if (!this.operators.isEmpty() && this.operators.get(this.operators.size() - 1).isPrefix()) {
                MathOperator lastOperator = this.operators.get(this.operators.size() - 1);
                this.operators.remove(this.operators.size() - 1);
                ASTNode booleanPrefixNode = new BooleanPrefix(this.vm, lastOperator, child);
                this.expressions.add(booleanPrefixNode);
            } else {
                this.expressions.add(child);
            }

            if (this.hasMinimalGroupingSize()
                && this.operators.get(this.operators.size() - 1).isPrecedental()) {
                this.group(this.operators.size() - 1, this.expressions.size() - 1);
            }
        }
    }

    private boolean hasMinimalGroupingSize() {
        return this.operators.size() + this.expressions.size() >= 5;
    }

    private void group(int endOperatorIndex, int endExpressionIndex) {
        MathExpression newGroup = new MathExpression(this.vm, this.isBoolean);
        ASTNode rightNode = this.expressions.remove(endExpressionIndex);
        ASTNode leftNode = this.expressions.remove(endExpressionIndex - 1);
        MathOperator precedenceOperator = this.operators.remove(endOperatorIndex);

        this.remove(leftNode);
        this.remove(precedenceOperator);

        this.addChild(newGroup);
        this.doAddChild(newGroup);
        newGroup.addChild(leftNode);
        newGroup.addChild(precedenceOperator);
        newGroup.addChild(rightNode);
        newGroup.doAddChild(leftNode);
        newGroup.doAddChild(precedenceOperator);
        newGroup.doAddChild(rightNode);
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();

        Iterator<ASTNode> expressionsIterator = this.expressions.iterator();
        List<Instruction> expressionInstructions = expressionsIterator.next().getInstructions(startIndex);
        instructions.addAll(expressionInstructions);
        startIndex += expressionInstructions.size();

        Iterator<MathOperator> operatorsIterator = this.operators.iterator();

        while (expressionsIterator.hasNext() && operatorsIterator.hasNext()) {
            expressionInstructions = expressionsIterator.next().getInstructions(startIndex);
            instructions.addAll(expressionInstructions);
            startIndex += expressionInstructions.size();
    
            MathOperator operator = operatorsIterator.next();
            List<Instruction> operatorInstructions = operator.getInstructions(startIndex);
            instructions.addAll(operatorInstructions);
            startIndex += operatorInstructions.size();
        }

        return instructions;
    }
}
