package cf.janga.knit.tools;

import java.util.List;

public class ParsingResult {

    private final boolean success;
    private final List<String> errors;
    private final KnitLanguageParser.KnitProgramContext tree;

    public ParsingResult(boolean success, KnitLanguageParser.KnitProgramContext tree, List<String> errors) {
        this.success = success;
        this.errors = errors;
        this.tree = tree;
    }

    public boolean success() {
        return this.success;
    }

    public List<String> getErrors() {
        return this.errors;
    }

    public KnitLanguageParser.KnitProgramContext getTree() {
        return this.tree;
    }
}
