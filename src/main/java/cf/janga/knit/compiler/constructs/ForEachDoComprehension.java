package cf.janga.knit.compiler.constructs;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.*;

import java.util.ArrayList;
import java.util.List;

public class ForEachDoComprehension extends ASTNode {

    private String identifier;

    private ASTNode input;

    private ASTNode code;

    public ForEachDoComprehension(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public void doAddChild(ASTNode child) {
        if (child instanceof Identifier) {
            this.identifier = ((Identifier) child).getName();
        } else if (child instanceof VariableReference || child instanceof Command) {
            this.input = child;
        } else if (child instanceof Code) {
            this.code = child;
        }
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();

        List<Instruction> childrenInstructions = this.input.getInstructions(startIndex);
        instructions.addAll(childrenInstructions);
        startIndex += childrenInstructions.size();

        Lssze lsSize = new Lssze(startIndex++, this.vm);
        instructions.add(lsSize);
        Cdjmp condJump = new Cdjmp(startIndex++, this.vm);
        instructions.add(condJump);
        instructions.add(new Scpsh(startIndex++, this.vm));
        instructions.add(new Lsnxt(startIndex++, this.vm));
        instructions.add(new Scstr(startIndex++, this.vm, this.identifier));

        childrenInstructions = this.code.getInstructions(startIndex);
        instructions.addAll(childrenInstructions);
        startIndex += childrenInstructions.size();

        instructions.add(new Scpopx(startIndex++, this.vm));
        instructions.add(new Jump(startIndex++, this.vm, lsSize.getIndex()));
        condJump.setJumpToInstruction(startIndex);
        return instructions;
    }
}
