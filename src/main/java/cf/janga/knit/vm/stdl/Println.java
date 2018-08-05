package cf.janga.knit.vm.stdl;

import cf.janga.knit.vm.core.Function;

import java.util.Optional;

/**
 * println(string)
 * Prints the string to the standard output.
 */
public class Println implements Function {

    @Override
    public Optional<Object> execute(Object[] arguments) {
        String toBePrinted = arguments[0].toString();
        System.out.println(toBePrinted);
        return Optional.empty();
    }

    @Override
    public String getName() {
        return "println";
    }
}
