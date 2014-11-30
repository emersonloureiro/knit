package cf.janga.knit.runtime;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class SequentialInstruction<T> implements Instruction {

    private List<Instruction> instructions;

    public SequentialInstruction() {
        instructions = new LinkedList<Instruction>();
    }

    public T execute() {
        // TODO: Remote nulls altogether from the language
        T returnValue = null;
        for (Iterator<Instruction> iterator = instructions.iterator(); iterator.hasNext(); ) {
            Instruction nextInstruction = iterator.next();
            Object result = nextInstruction.execute();
            nextInstruction.afterExecution();
            if (!iterator.hasNext()) {
                returnValue = (T) result;
            }
        }

        for (Instruction nextInstruction : instructions) {
            nextInstruction.afterSequence();
        }

        return returnValue;
    }

    public final void addInstruction(Instruction instruction) {
        instructions.add(instruction);
    }
}
