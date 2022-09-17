package cf.janga.knit.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.*;

import java.util.ArrayList;
import java.util.List;

public class ForEachDoComprehension extends CompositeContext implements WithIdentifier {

    private String _identifier;

    private CondJump _condJump;

    private LsSize _lsSize;

    public ForEachDoComprehension(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public List<Instruction> before(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        _lsSize = new LsSize(startIndex++, _vm);
        instructions.add(_lsSize);
        _condJump = new CondJump(startIndex++, _vm);
        instructions.add(_condJump);
        instructions.add(new ScPush(startIndex++, _vm));
        instructions.add(new LsNext(startIndex++, _vm));
        instructions.add(new ScStore(startIndex, _vm, _identifier));
        return instructions;
    }

    @Override
    protected List<Instruction> after(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        instructions.add(new ScPop(startIndex++, _vm));
        instructions.add(new Jump(startIndex++, _vm, _lsSize.getIndex()));
        _condJump.setJumpToInstruction(startIndex);
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
