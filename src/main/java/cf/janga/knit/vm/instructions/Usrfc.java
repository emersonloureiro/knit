package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.program.ProgramError;
import cf.janga.knit.vm.errors.runtime.RuntimeError;

import java.util.List;

/**
 * Performs a user-defined function call, handles arguments and scope binding.
 */
public class Usrfc extends BaseInstruction {

    public Usrfc(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() throws ProgramError {
        String module = (String) this.vm.operandStack().pop();
        String functionName = (String) this.vm.operandStack().pop();

        // Call user-defined function
        callUserDefinedFunction(module, functionName);
    }

    private void callUserDefinedFunction(String module, String functionName)
            throws ProgramError {
        // Default to "main" module if no module specified
        if (module == null || module.isEmpty()) {
            module = "main";
        }

        // Get the function's parameter names
        List<String> parameters = this.vm.getFunctionParameters(module, functionName);
        int numberOfArguments = (int) this.vm.operandStack().pop();

        // Validate argument count
        if (numberOfArguments != parameters.size()) {
            throw new RuntimeError(String.format("Function '%s' expects %d arguments but received %d",
                    functionName, parameters.size(), numberOfArguments));
        }

        // Save the current context and load the function
        // The return address is the current instruction index + 1
        this.vm.pushCallFrame(this.getIndex() + 1);
        this.vm.loadInstructions(this.vm.fetchInstructions(functionName));
    }

    @Override
    protected Integer nextInstructionIndex() {
        // Control is transferred to the called function, so we don't increment the
        // index here
        return Integer.valueOf(0);
    }
}
