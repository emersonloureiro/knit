package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.OsPushR;

import java.util.ArrayList;
import java.util.List;

public class VariableReferenceContext extends BaseContext {

    private String _identifier;

    public VariableReferenceContext(VirtualMachine vm, String identifier) {
        super(vm);
        _identifier = identifier;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new OsPushR(startIndex, _vm, _identifier));
        return instructions;
    }
}
