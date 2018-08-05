package cf.janga.knit.vm.stdl;

import cf.janga.knit.vm.core.Function;

import java.util.LinkedList;
import java.util.List;

public class BuiltInFunctions {

    public static List<Function> getFunctions() {
        List<Function> functions = new LinkedList<>();
        functions.add(new Println());
        functions.add(new Assert());
        return functions;
    }
}
