package cf.janga.knit.language.core;

import cf.janga.knit.tools.KnitLanguageParser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VariableExpression implements Instruction {

    private String variableName;

    public VariableExpression(KnitLanguageParser.VarExContext context) {
        this.variableName = getVariableName(context.varNameEx());
    }

    @Override
    public void execute() {
        System.out.println(this.variableName);
    }

    private String getVariableName(KnitLanguageParser.VarNameExContext context) {
        String variableName = "";
        for (TerminalNode node : context.ALPHA_CHARACTER()) {
            variableName += node.getText();
        }
        return variableName;
    }
}
