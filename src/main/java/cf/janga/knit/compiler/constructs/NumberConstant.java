package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.List;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Osphc;

public class NumberConstant extends Constant {

    private Float number;

    public NumberConstant(VirtualMachine vm, Float constant) {
        super(vm);
        this.number = constant;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new Osphc(startIndex, vm, this.number));
        return instructions;
    }

    @Override
    public String toString() {
        return String.valueOf(this.number);
    }
}
