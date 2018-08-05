package cf.janga.knit.vm.stdl;

import cf.janga.knit.vm.core.Function;

import java.util.Optional;

/**
 * println(string)
 * Prints the string to the standard output.
 */
public class Println extends Function {

    public Println() {
        super("println", 1);
    }

    @Override
    public Optional<Object> doExecute(Object[] arguments) {
        String toBePrinted = arguments[0].toString();
        System.out.println(toBePrinted);
        return Optional.empty();
    }
}
