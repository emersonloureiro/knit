package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.compiler.CompilationError;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Cdjmp;
import cf.janga.knit.vm.instructions.Not;

public class IfCondition extends ASTNode {

    private ASTNode ifCode;
    private ASTNode booleanExpression;
    private ASTNode elseCode;
    private ASTNode innerIf;

    public IfCondition(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public void doAddChild(ASTNode child) {
        if (child instanceof Code) {
            if (this.ifCode == null) {
                this.ifCode = child;
            } else if (this.elseCode == null) {
                this.elseCode = child;
            } else {
                throw new CompilationError("Unexpected code on 'if'");
            }
        } else if (child instanceof MathExpression && this.booleanExpression == null) {
            if (!((MathExpression) child).isBoolean()) {
                throw new CompilationError("Numerical expression on 'if' (seriously?!)");
            }
            this.booleanExpression = child;
        } else if (child instanceof IfCondition && this.innerIf == null) {
            this.innerIf = child;
        } else {
            throw new CompilationError(String.format("Unexpected element for 'if': %s", child));
        }
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();

        List<Instruction> booleanExpressionInstructions = this.booleanExpression.getInstructions(startIndex);
        startIndex += booleanExpressionInstructions.size();
        instructions.addAll(booleanExpressionInstructions);
        instructions.add(new Not(startIndex++, this.vm));
        Cdjmp condJump = new Cdjmp(startIndex++, this.vm);
        instructions.add(condJump);

        List<Instruction> codeInstructions = this.ifCode.getInstructions(startIndex);
        instructions.addAll(codeInstructions);
        startIndex += codeInstructions.size();
        condJump.setJumpToInstruction(startIndex);

        if (this.innerIf != null) {
            List<Instruction> innerIfInstructions = this.innerIf.getInstructions(startIndex);
            instructions.addAll(innerIfInstructions);
            startIndex += innerIfInstructions.size();
        }

        if (this.elseCode != null) {
            List<Instruction> elseCodeInstructions = this.elseCode.getInstructions(startIndex);
            instructions.addAll(elseCodeInstructions);
            startIndex += elseCodeInstructions.size();
        }

        return instructions;
    }
    
}
