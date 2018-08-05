package cf.janga.knit.vm.stdl.str;

import cf.janga.knit.vm.core.Function;

import java.util.Optional;

/**
 * str_contains(string, subtstring)
 * Checks whether "string" contains "substring". Returns a boolean.
 */
class StringContains extends Function {

    public StringContains() {
        super("knit::str::str_contains", 2);
    }

    @Override
    public Optional<Object> doExecute(Object[] arguments) {
        String string = (String) arguments[0];
        String substring = (String) arguments[1];
        return Optional.of(string.contains(substring));
    }
}
