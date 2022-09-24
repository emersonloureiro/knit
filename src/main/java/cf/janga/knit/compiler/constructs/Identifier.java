package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class Identifier extends ASTNode {

    private String name;

    public Identifier(VirtualMachine vm, String name) {
        super(vm);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        return new LinkedList<>();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
