package cf.janga.knit.vm.instructions;

import cf.janga.knit.vm.core.BaseInstruction;
import cf.janga.knit.vm.core.CallFrame;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.errors.program.ProgramError;
import cf.janga.knit.vm.errors.runtime.RuntimeError;

/**
 * Returns from a function call, restoring the caller's instruction context.
 */
public class Return extends BaseInstruction {

    private int returnValueAddress;

    public Return(int index, VirtualMachine vm) {
        super(index, vm);
    }

    @Override
    protected void doExecute() throws ProgramError {
        if (!this.vm.hasCallFrame()) {
            throw new RuntimeError("Return statement executed outside of function context");
        }

        CallFrame frame = this.vm.popCallFrame();
        // Restore the caller's instruction array and program counter
        this.vm.loadInstructions(frame.getPreviousInstructions());
        this.returnValueAddress = frame.getReturnAddress();
    }

    @Override
    protected Integer nextInstructionIndex() {
        return Integer.valueOf(this.returnValueAddress);
    }
}
