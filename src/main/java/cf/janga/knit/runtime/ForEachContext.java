package cf.janga.knit.runtime;

import cf.janga.knit.antlr.KnitLanguageParser;
import cf.janga.knit.vm.instructions.CondJump;

public class ForEachContext implements Context {

    private KnitLanguageParser.ForeachContext context;
    private CondJump condJumpInstruction;
    private int jumpBackToIndex;

    public ForEachContext(KnitLanguageParser.ForeachContext context, int jumpBackToIndex, CondJump condJumpInstruction) {
        this.context = context;
        this.condJumpInstruction = condJumpInstruction;
        this.jumpBackToIndex = jumpBackToIndex;
    }

    public int getJumpBackToIndex() {
        return this.jumpBackToIndex;
    }

    public CondJump getCondJumpInstruction() {
        return this.condJumpInstruction;
    }
}
