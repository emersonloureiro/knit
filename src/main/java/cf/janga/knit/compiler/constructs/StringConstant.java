package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.List;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.OsPushC;

public class StringConstant extends Constant {

    private String string;

    public StringConstant(VirtualMachine vm, String constant) {
        super(vm);
        this.string = constant;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new OsPushC(startIndex, this.vm, this.string));
        return instructions;
    }
}
