package cf.janga.knit.compiler;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

/**
 * A node in the AST representing a Knit program, representing
 * a construct of the program - such as variable definition, an
 * expression, a command statement - which has been traversed
 * as a Knit source file is parsed.
 */
public abstract class ASTNode {

    private List<ASTNode> children;

    protected final VirtualMachine vm;

    private ASTNode parent;

    public ASTNode(VirtualMachine vm) {
        this.children = new LinkedList<>();
        this.vm = vm;
    }

    public void addChild(ASTNode child) {
        this.children.add(child);
    }

    public List<ASTNode> getChildren() {
        return this.children;
    }

    public final void setParent(ASTNode parent) {
        this.parent = parent;
    }

    public final ASTNode getParent() {
        return parent;
    }

    public void doAddChild(ASTNode child) {
    }

    protected final List<Instruction> getChildrenInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();
        int instructionIndex = startIndex;
        for (ASTNode child : this.children) {
            List<Instruction> childInstructions = child.getInstructions(instructionIndex);
            instructions.addAll(childInstructions);
            instructionIndex += childInstructions.size();
        }
        return instructions;
    }

    protected void remove(ASTNode child) {
        int index = this.children.indexOf(child);
        if (index == -1) {
            throw new CompilationError("Attempting to remove invalid node");
        }
        this.children.remove(index);
    }

    public void print(int spaces) {
        String space = "";
        for (int i = 0; i < spaces; i++) {
            space += " ";
        }
        System.out.println(String.format("%s%s", space, this.toString()));
        spaces += 1;
        for (ASTNode child : this.children) {
            child.print(spaces);
        }
    }

    public abstract List<Instruction> getInstructions(int startIndex);
}
