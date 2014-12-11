package cf.janga.knit.runtime;

import cf.janga.knit.parser.KnitLanguageParser;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.*;
import org.antlr.v4.runtime.misc.NotNull;

import static cf.janga.knit.runtime.CompilationUtils.getText;

public class CodeBuilder extends Builder<KnitLanguageParser.CodeContext> {

    public CodeBuilder(int currentInstructionNumber, VirtualMachine vm) {
        super(currentInstructionNumber, vm);
    }

    @Override
    public void enterChainedCall(@NotNull KnitLanguageParser.ChainedCallContext ctx) {
        addInstructionsFromBuilderAndReset(new ChainedCallBuilder(currentInstructionNumber(), this.vm), ctx);
    }

    @Override
    public void enterVariableValue(@NotNull KnitLanguageParser.VariableValueContext ctx) {
        if (ctx.STRING() != null) {
            addInstruction(new OsPushC(returnAndIncrementInstruction(), this.vm, getText(ctx.STRING(), 1)));
        }
        if (ctx.COMMAND() != null) {
            addInstruction(new ComRet(returnAndIncrementInstruction(), this.vm, getText(ctx.COMMAND(), 1)));
        }
        if (ctx.number() != null) {
            Float number = Float.parseFloat(getText(ctx.number().children));
            addInstruction(new OsPushC(returnAndIncrementInstruction(), this.vm, number));
        }
    }

    @Override
    public void exitVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx) {
        addInstruction(new ScStore(returnAndIncrementInstruction(), this.vm, getText(ctx.identifier().children)));
    }

    @Override
    public void enterArgument(@NotNull KnitLanguageParser.ArgumentContext ctx) {
        if (ctx.STRING() != null) {
            addInstruction(new OsPushC(returnAndIncrementInstruction(), this.vm, ctx.STRING().getText()));
        }
        if (ctx.number() != null) {
            addInstruction(new OsPushC(returnAndIncrementInstruction(), this.vm, getText(ctx.number().children)));
        }
        if (ctx.identifier() != null) {
            addInstruction(new OsPushR(returnAndIncrementInstruction(), this.vm, getText(ctx.identifier().children)));
        }
        addInstruction(new Print(returnAndIncrementInstruction(), this.vm));
    }
}
