package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.ComRet;
import cf.janga.knit.vm.instructions.OsPushC;

import java.util.ArrayList;
import java.util.List;

public class VariableValueContext extends CompositeContext {

    private Value _value;

    public VariableValueContext(VirtualMachine vm) {
        super(vm);
    }

    @Override
    public List<Instruction> before(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();
        if (_value instanceof NumberValue) {
            instructions.add(new OsPushC(startIndex++, _vm, ((NumberValue) _value).get()));
        }
        if (_value instanceof CommandValue) {
            instructions.add(new ComRet(startIndex++, _vm, ((CommandValue) _value).get()));
        }
        if (_value instanceof StringValue) {
            instructions.add(new OsPushC(startIndex++, _vm, ((StringValue) _value).get()));
        }
        return instructions;
    }

    public void setValue(Value value) {
        _value = value;
    }
}
