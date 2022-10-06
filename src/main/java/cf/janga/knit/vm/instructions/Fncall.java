package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.Function;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.RuntimeError;
import cf.janga.knit.vm.errors.program.FunctionNotFoundError;
import cf.janga.knit.vm.errors.program.ProgramError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Performs a function call and stores the result - if applicable -
 * on the operand stack.
 */
public class Fncall extends BaseInstruction {

    private final boolean returnResult;

    public Fncall(int index, VirtualMachine vm, boolean returnResult) {
        super(index, vm);
        this.returnResult = returnResult;
    }

    @Override
    protected void doExecute() throws ProgramError {
        String module = (String) this.vm.operandStack().pop();
        String functionName = (String) this.vm.operandStack().pop();
        String fullFunctionName = module + functionName;
        int numberOfArguments = (int) this.vm.operandStack().pop();
        List<Object> arguments = new ArrayList<>(numberOfArguments);
        while (arguments.size() < numberOfArguments) {
            arguments.add(this.vm.operandStack().pop());
        }
        Collections.reverse(arguments);
        Optional<Function> function = this.vm.getStdLibrary().lookup(fullFunctionName);
        if (function.isPresent()) {
            Optional<Object> result = function.get().execute(arguments.toArray());
            if (this.returnResult) {
                if (result.isPresent()) {
                    this.vm.operandStack().push(result.get());
                } else {
                    throw new RuntimeError("Expected a result from " + fullFunctionName + " but it did not return anything");
                }
            }
        } else {
            throw new FunctionNotFoundError(fullFunctionName);
        }
    }
}
