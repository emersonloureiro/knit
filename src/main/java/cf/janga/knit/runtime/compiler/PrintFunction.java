package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Print;

import java.util.ArrayList;
import java.util.List;

public class PrintFunction extends CompositeContext {

    public PrintFunction(VirtualMachine vm) {
        super(vm);
    }

    @Override
    protected List<Instruction> after(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new cf.janga.knit.vm.instructions.Print(startIndex, _vm));
        return instructions;
    }
}
