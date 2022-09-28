package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.Function;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.ProgramError;
import cf.janga.knit.vm.errors.RuntimeError;

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
        String module = (String) vm.operandStack().pop();
        String functionName = (String) vm.operandStack().pop();
        String fullFunctionName = module + functionName;
        int numberOfArguments = (int) vm.operandStack().pop();
        List<Object> arguments = new ArrayList<>(numberOfArguments);
        while (arguments.size() < numberOfArguments) {
            arguments.add(vm.operandStack().pop());
        }
        Collections.reverse(arguments);
        Optional<Function> function = vm.getStdLibrary().lookup(fullFunctionName);
        if (function.isPresent()) {
            Optional<Object> result = function.get().execute(arguments.toArray());
            if (_returnResult) {
                if (result.isPresent()) {
                    vm.operandStack().push(result.get());
                } else {
                    throw new RuntimeError("Expected a result from " + fullFunctionName + " but it did not return anything");
                }
            }
        } else {
            throw new ProgramError("Function " + fullFunctionName + " not found");
        }
    }

    @Override
    public String toString() {
        return "fcall";
    }
}
