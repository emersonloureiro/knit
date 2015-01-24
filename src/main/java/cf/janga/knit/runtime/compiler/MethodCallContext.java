package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.OsPushR;

import java.util.ArrayList;
import java.util.List;

public class MethodCallContext extends CompositeContext implements WithIdentifier {

    private String _identifier;

    public MethodCallContext(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public List<Instruction> before(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new OsPushR(startIndex++, _vm, _identifier));
        return instructions;
    }

    @Override
    public void setIdentifier(String identifier) {
        _identifier = identifier;
    }
}
