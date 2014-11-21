package cf.janga.knit.tools;

import cf.janga.knit.language.core.Instruction;
import cf.janga.knit.language.core.InstructionFactory;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class KnitRuntime extends KnitListenerAdapter {

    public void run(KnitLanguageParser.KnitProgramContext tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
    }

    @Override
    public void enterVarEx(@NotNull KnitLanguageParser.VarExContext ctx) {
        executeInstructionForContext(ctx);
    }

    private void executeInstructionForContext(ParserRuleContext context) {
        Instruction instruction = InstructionFactory.create(context);
        if (instruction != null) {
            instruction.execute();
        }
    }
}
