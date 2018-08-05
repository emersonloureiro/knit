package cf.janga.knit.vm.stdl.str;

import java.util.Optional;

/**
 * str_contains(string, subtstring)
 * Checks whether "string" contains "substring". Returns a boolean.
 */
class StringContains extends StringFunction {

    public StringContains() {
        super("str_contains");
    }

    @Override
    public Optional<Object> execute(Object[] arguments) {
        String string = (String) arguments[0];
        String substring = (String) arguments[1];
        return Optional.of(string.contains(substring));
    }
}
