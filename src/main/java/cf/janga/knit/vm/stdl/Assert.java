package cf.janga.knit.vm.stdl;

import cf.janga.knit.vm.core.Function;
import cf.janga.knit.vm.errors.ProgramError;

import java.util.Optional;

/**
 * assert(boolean_expression)
 * Checks if the expression is true, erroring out and stopping program
 * execution when it's not.
 */
public class Assert extends Function {

    public Assert() {
        super("assert", 1);
    }

    @Override
    public Optional<Object> doExecute(Object[] arguments) throws ProgramError {
        Boolean expression = (Boolean) arguments[0];
        if (!expression) {
            throw new ProgramError("Assertion failed");
        }
        return Optional.empty();
    }
}
