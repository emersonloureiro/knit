package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.List;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.OsPushC;

public class BooleanConstant extends Argument {

    private boolean bool;

    public BooleanConstant(VirtualMachine vm, boolean constant) {
        super(vm);
        this.bool = constant;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new OsPushC(startIndex, this.vm, this.bool));
        return instructions;
    }
}
