package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.OsPushC;
import cf.janga.knit.vm.instructions.Jump;

public class ExitConstruct extends ASTNode {

    private int exitCode;

    public ExitConstruct(VirtualMachine vm, int exitCode) {
        super(vm);
        this.exitCode = exitCode;
    }
    
    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();

        instructions.add(new OsPushC(startIndex++, this.vm, this.exitCode));
        instructions.add(new Jump(startIndex, this.vm, 0));

        return instructions;
    }
}
