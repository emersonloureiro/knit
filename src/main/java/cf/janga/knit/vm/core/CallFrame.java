package cf.janga.knit.vm.core;

/**
 * Represents a function call frame that stores the execution context
 * for returning to the caller after a function completes.
 */
public class CallFrame {
    private final Instruction[] previousInstructions;
    private final int returnAddress;

    public CallFrame(Instruction[] previousInstructions, int returnAddress) {
        this.previousInstructions = previousInstructions;
        this.returnAddress = returnAddress;
    }

    public Instruction[] getPreviousInstructions() {
        return this.previousInstructions;
    }

    public int getReturnAddress() {
        return this.returnAddress;
    }
}
