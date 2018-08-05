package cf.janga.knit.vm.core;

import cf.janga.knit.vm.stdl.BuiltInFunctions;
import cf.janga.knit.vm.stdl.str.StringFunctions;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Keeps a table of the available functions.
 */
public class StandardLibrary {

    private final Map<String, Function> _lookupTable;

    public StandardLibrary() {
        _lookupTable = new HashMap<>();

        StringFunctions.getFunctions().forEach(function -> {
            _lookupTable.put(function.getName(), function);
        });
        BuiltInFunctions.getFunctions().forEach(function -> {
            _lookupTable.put(function.getName(), function);
        });
    }

    public Optional<Function> lookup(String functionName) {
        return Optional.ofNullable(_lookupTable.get(functionName));
    }
}
