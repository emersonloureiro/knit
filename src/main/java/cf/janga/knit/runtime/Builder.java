package cf.janga.knit.runtime;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public abstract class Builder<T extends ParserRuleContext> extends Compiler {

    public Builder(int currentInstructionNumber, VirtualMachine vm) {
        super(currentInstructionNumber, vm);
    }

    public final Instruction[] build(T tree) {
        if (!CompilationUtils.visited(tree)) {
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(this, tree);
            CompilationUtils.markVisited(tree);
            return instructions().toArray(new Instruction[]{});
        }
        return new Instruction[]{};
    }
}
