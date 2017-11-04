package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.ScStore;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclarationContext extends CompositeContext implements WithIdentifier {

    private String _identifier;

    public VariableDeclarationContext(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public List<Instruction> after(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new ScStore(startIndex, _vm, _identifier));
        return instructions;
    }

    @Override
    public void setIdentifier(String identifier) {
        _identifier = identifier;
    }

    @Override
    public String getIdentifier() {
        return _identifier;
    }
}
