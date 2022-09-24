package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class WrapperNode extends ASTNode {

    private String name;

    public WrapperNode(VirtualMachine vm, String name) {
        super(vm);
        this.name = name;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();
        int instructionIndex = startIndex;
        for (ASTNode child : this.getChildren()) {
            List<Instruction> childInstructions = child.getInstructions(instructionIndex);
            instructions.addAll(childInstructions);
            instructionIndex += childInstructions.size();
        }
        return instructions;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
