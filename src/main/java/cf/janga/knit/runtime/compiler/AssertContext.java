package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.CondJump;
import cf.janga.knit.vm.instructions.OsPushC;
import cf.janga.knit.vm.instructions.Raise;

import java.util.ArrayList;
import java.util.List;

public class AssertContext extends CompositeContext {

    private final int _lineNumber;

    public AssertContext(VirtualMachine vm, int lineNumber) {
        super(vm);
        _lineNumber = lineNumber;
    }

    @Override
    protected List<Instruction> after(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        CondJump condJump = new CondJump(startIndex++, _vm);
        instructions.add(condJump);
        instructions.add(new OsPushC(startIndex++, _vm, "Assertion failed at line " + _lineNumber));
        instructions.add(new OsPushC(startIndex++, _vm, "AssertionError"));
        instructions.add(new Raise(startIndex++, _vm));
        condJump.setJumpToInstruction(startIndex);
        return instructions;
    }
}
