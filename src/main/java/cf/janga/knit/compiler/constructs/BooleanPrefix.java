package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Not;

public class BooleanPrefix extends ASTNode {

    private ASTNode child;
    private MathOperator operator;

    public BooleanPrefix(VirtualMachine vm, MathOperator operator, ASTNode child) {
        super(vm);
        this.child = child;
        this.operator =  operator;
    }

    @Override
    public void doAddChild(ASTNode child) {
        this.child.doAddChild(child);
    }

    @Override
    public void addChild(ASTNode child) {
        this.child.addChild(child);
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new LinkedList<>();

        children.add(this.operator);
        children.addAll(this.getChildren());

        return children;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();
        
        instructions.addAll(this.child.getInstructions(startIndex));
        startIndex += instructions.size();

        instructions.add(new Not(startIndex, this.vm));

        return instructions;
    }
}
