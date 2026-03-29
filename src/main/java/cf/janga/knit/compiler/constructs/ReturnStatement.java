package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Return;

/**
 * Represents a return statement that evaluates an expression and returns from
 * the function.
 */
public class ReturnStatement extends ASTNode {

    public ReturnStatement(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public void doAddChild(ASTNode child) {
        // Children are added by the parent, just collect them
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<>();

        // Get all child instructions (the expression being returned)
        List<Instruction> childrenInstructions = this.getChildrenInstructions(startIndex);
        instructions.addAll(childrenInstructions);
        startIndex += childrenInstructions.size();

        // Then, execute the return instruction
        instructions.add(new Return(startIndex, this.vm));

        return instructions;
    }
}
