package cf.janga.knit.language.core;

import cf.janga.knit.tools.KnitLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;

public class InstructionFactory {

    private InstructionFactory() {
    }

    public static Instruction create(ParserRuleContext context) {
        if (context instanceof KnitLanguageParser.VarExContext) {
            return new VariableExpression((KnitLanguageParser.VarExContext) context);
        }

        return null;
    }
}
