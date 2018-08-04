package cf.janga.knit.vm.stdl.str;

import cf.janga.knit.vm.core.Function;

/**
 * Base class for all string functions.
 */
abstract class StringFunction implements Function {
    private final String _name;

    public StringFunction(String name) {
        _name = name;
    }

    @Override
    public final String getName() {
        return "knit::str::" + _name;
    }
}
