package cf.janga.knit.compiler.constructs;

import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.compiler.ASTNode;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Exit;
import cf.janga.knit.vm.instructions.Jump;
import cf.janga.knit.vm.instructions.Osphc;

public class KnitProgram extends ASTNode {
    private Function mainFunction;

    private List<Function> functions;

    public KnitProgram(VirtualMachine vm) {
        super(vm);
        this.functions = new LinkedList<>();
    }

    public Function getMainFunction() {
        return this.mainFunction;
    }

    @Override
    public void doAddChild(ASTNode child) {
        if (child instanceof Function) {
            if (((Function) child).isMain()) {
                this.mainFunction = (Function) child;
            } else {
                this.functions.add((Function) child);
            }
        }
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new LinkedList<>();
        if (this.mainFunction != null) {
            // Instruction 0 is a jump to the last instruction,
            // which is an exit
            startIndex = 1;
            instructions.addAll(this.mainFunction.getInstructions(startIndex));
            startIndex += instructions.size();
            instructions.add(new Osphc(startIndex++, this.vm, 0));
            instructions.add(new Exit(startIndex++, this.vm));
            instructions.add(0, new Jump(0, vm, startIndex - 1));

            this.vm.registerInstructions(this.mainFunction.getModule(), this.mainFunction.getFunctionName(), instructions);
        }

        for (Function function : this.functions) {
            this.vm.registerInstructions(function.getModule(), function.getFunctionName(), function.getInstructions(0));
        }

        return instructions;
    }

    @Override
    public String toString() {
        return "KnitProgram";
    }
}
