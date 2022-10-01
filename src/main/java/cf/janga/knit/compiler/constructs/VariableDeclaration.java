package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Scstr;

public class VariableDeclaration extends ASTNode {

    private Identifier identifier;

    public VariableDeclaration(VirtualMachine vm) {
        super(vm);
    }

    public void doAddChild(ASTNode child) {
        if (child instanceof Identifier) {
            this.identifier = (Identifier) child;
        }
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        List<Instruction> childrenInstructions = this.getChildrenInstructions(startIndex);
        instructions.addAll(childrenInstructions);
        startIndex += childrenInstructions.size();
        instructions.add(new Scstr(startIndex, this.vm, this.identifier.getName()));
        return instructions;
    }

    @Override
    public String toString() {
        return "VariableDeclaration";
    }
}
