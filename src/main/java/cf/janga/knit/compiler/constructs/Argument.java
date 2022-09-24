package cf.janga.knit.compiler.constructs;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.VirtualMachine;

public abstract class Argument extends ASTNode {

    public Argument(VirtualMachine vm) {
        super(vm);
    }
}
