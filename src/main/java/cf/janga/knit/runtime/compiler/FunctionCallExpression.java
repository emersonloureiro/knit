package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.FCall;
import cf.janga.knit.vm.instructions.OsPushC;

import java.util.LinkedList;
import java.util.List;

public class FunctionCallExpression extends CompositeContext {

    private final List<String> _modules;
    private final String _function;
    private final int _numberOfArguments;
    private final boolean _returnValue;

    public FunctionCallExpression(VirtualMachine vm, List<String> modules, String function, int numberOfArguments, boolean returnValue) {
        super(vm);
        _modules = modules;
        _function = function;
        _numberOfArguments = numberOfArguments;
        _returnValue = returnValue;
    }

    @Override
    protected List<Instruction> before(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();
        instructions.add(new OsPushC(startIndex++, _vm, _numberOfArguments));
        instructions.add(new OsPushC(startIndex++, _vm, _function));
        String module = _modules.stream().reduce("", (current, accumulator) -> {
            return current + accumulator;
        });
        instructions.add(new OsPushC(startIndex++, _vm, module));
        instructions.add(new FCall(startIndex++, _vm, _returnValue));
        return instructions;
    }
}
