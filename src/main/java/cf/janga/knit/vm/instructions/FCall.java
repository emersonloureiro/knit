package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.Function;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.FunctionNotFoundError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Performs a function call and stores the result - if applicable -
 * on the operand stack.
 */
public class FCall extends BaseInstruction {

    private final boolean _returnResult;

    public FCall(int index, VirtualMachine vm, boolean returnResult) {
        super(index, vm);
        _returnResult = returnResult;
    }

    @Override
    protected void doExecute() {
        String module = (String) _vm.operandStack().pop();
        String functionName = (String) _vm.operandStack().pop();
        int numberOfArguments = (int) _vm.operandStack().pop();
        List<Object> arguments = new ArrayList<>(numberOfArguments);
        while (arguments.size() < numberOfArguments) {
            arguments.add(_vm.operandStack().pop());
        }
        Collections.reverse(arguments);
        Optional<Function> function = _vm.getStdLibrary().lookup(module + functionName);
        if (function.isPresent()) {
            Object result = function.get().execute(arguments.toArray());
            if (_returnResult) {
                _vm.operandStack().push(result);
            }
        } else {
            throw new FunctionNotFoundError(module, functionName);
        }
    }

    @Override
    public String toString() {
        return "fcall";
    }
}
