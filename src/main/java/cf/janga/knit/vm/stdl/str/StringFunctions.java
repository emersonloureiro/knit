package cf.janga.knit.vm.stdl.str;

import cf.janga.knit.vm.core.Function;

import java.util.LinkedList;
import java.util.List;

public class StringFunctions {

    public static List<Function> getFunctions() {
        List<Function> functions = new LinkedList<>();
        functions.add(new StringContains());
        functions.add(new StrConcat());
        return functions;
    }
}
