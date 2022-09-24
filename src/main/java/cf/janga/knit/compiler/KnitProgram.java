package cf.janga.knit.compiler;

import java.util.List;

import cf.janga.knit.compiler.constructs.Function;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

public class KnitProgram extends ASTNode {
    private Function mainFunction;

    public KnitProgram(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public void doAddChild(ASTNode child) {
        if (child instanceof Function) {
            if (((Function) child).isMain()) {
                this.mainFunction = (Function) child;
            }
        }
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        return this.mainFunction.getInstructions(startIndex);
    }

    @Override
    public String toString() {
        return "KnitProgram";
    }
}
