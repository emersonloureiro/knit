package cf.janga.knit.runtime;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class CompilationUtils {

    private static Map<Integer, Boolean> contextMap;

    static {
        contextMap = new TreeMap<Integer, Boolean>();
    }

    private CompilationUtils() {
    }

    public static boolean visited(ParserRuleContext context) {
        if (contextMap.containsKey(context.hashCode())) {
            return contextMap.get(context.hashCode());
        }
        return false;
    }

    public static String getText(TerminalNode node, int reference) {
        String text = node.getText();
        return text.substring(reference, text.length() - reference);
    }

    public static String getText(List<ParseTree> nodes) {
        String text = "";
        for (ParseTree node : nodes) {
            text += node.getText();
        }
        return text;
    }

    public static void clearMap() {
        contextMap.clear();
    }

    public static void markVisited(ParserRuleContext tree) {
        contextMap.put(tree.hashCode(), true);
    }
}
