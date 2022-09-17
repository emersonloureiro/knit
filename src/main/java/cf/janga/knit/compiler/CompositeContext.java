package cf.janga.knit.compiler;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompositeContext extends BaseContext {

    private final List<Context> _contexts;

    public CompositeContext(VirtualMachine vm) {
        super(vm);
        _contexts = new LinkedList<Context>();
    }

    public void add(Context context) {
        _contexts.add(context);
    }

    protected List<Instruction> before(int startIndex) {
        return new ArrayList<Instruction>();
    }

    protected List<Instruction> after(int startIndex) {
        return new ArrayList<Instruction>();
    }


    @Override
    final public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> result = new LinkedList<Instruction>();
        List<Instruction> beforeInstructions = before(startIndex);
        result.addAll(beforeInstructions);
        int instructionIndex = startIndex + beforeInstructions.size();
        for (Context context : _contexts) {
            List<Instruction> instructions = context.getInstructions(instructionIndex);
            result.addAll(instructions);
            instructionIndex += instructions.size();
        }
        result.addAll(after(instructionIndex));
        return result;
    }
}
