package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Stdlb;
import cf.janga.knit.vm.instructions.Osphc;

public class FunctionCall extends ASTNode {

    private final List<String> modules;
    private final String function;
    private final int numberOfArguments;

    public FunctionCall(VirtualMachine vm, List<String> modules, String function, int numberOfArguments) {
        super(vm);
        this.modules = modules;
        this.function = function;
        this.numberOfArguments = numberOfArguments;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();

        List<Instruction> childrenInstructions = this.getChildrenInstructions(startIndex);
        instructions.addAll(childrenInstructions);
        startIndex += childrenInstructions.size();

        boolean returnValue = this.getParent() instanceof Expression;

        instructions.add(new Osphc(startIndex++, this.vm, this.numberOfArguments));
        instructions.add(new Osphc(startIndex++, this.vm, this.function));
        String module = this.modules.stream().reduce("", (current, accumulator) -> {
            return current + accumulator;
        });
        instructions.add(new Osphc(startIndex++, this.vm, module));
        instructions.add(new Stdlb(startIndex, this.vm, returnValue));
        return instructions;
    }
    
    @Override
    public String toString() {
        return "FunctionCall";
    }
}
