package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.List;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Scpop;
import cf.janga.knit.vm.instructions.Scpsh;

public class Function extends WrapperNode {

    private boolean main;

    public Function(VirtualMachine vm, boolean main) {
        super(vm, "Function");
        this.main = main;
    }

    public boolean isMain() {
        return this.main;
    }

    @Override
    public String toString() {
        if (this.main) {
            return "Main function";
        }
        return "Function";
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new Scpsh(startIndex++, this.vm));
        List<Instruction> childrenInstructions = super.getInstructions(startIndex);
        instructions.addAll(childrenInstructions);
        startIndex += childrenInstructions.size();
        instructions.add(new Scpop(startIndex++, this.vm));
        return instructions;
    }
}
