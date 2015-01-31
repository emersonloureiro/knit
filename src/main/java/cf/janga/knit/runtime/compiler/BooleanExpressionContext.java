package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Cmpr;
import cf.janga.knit.vm.instructions.OsPushC;
import cf.janga.knit.vm.instructions.OsPushR;

import java.util.LinkedList;
import java.util.List;

public class BooleanExpressionContext extends BaseContext {

    private KnitType[] _types;
    private Object[] _values;

    public BooleanExpressionContext(VirtualMachine vm) {
        super(vm);
        _types = new KnitType[2];
        _values = new Object[2];
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<Instruction>();
        instructions.add(getInstructionForIndex(0, startIndex));
        instructions.add(getInstructionForIndex(1, startIndex + 1));
        instructions.add(new Cmpr(startIndex + 2, _vm));
        return instructions;
    }

    private Instruction getInstructionForIndex(int index, int startIndex) {
        KnitType type = _types[index];
        Object value = _values[index];

        switch (type) {
            case NUMBER:
                return new OsPushC(startIndex, _vm, value);
            case STRING:
                return new OsPushC(startIndex, _vm, value);
            case REFERENCE:
                return new OsPushR(startIndex, _vm, (String) value);
            default:
                throw new CompilationError("Invalid type for boolean expression " + type);
        }
    }

    public void addParameter(KnitType type, Object value) {
        if (_types[0] == null) {
            _types[0] = type;
            _values[0] = value;
        } else {
            _types[1] = type;
            _values[1] = value;
        }
    }
}
