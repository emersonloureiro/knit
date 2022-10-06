package cf.janga.knit.vm.stdl;

import cf.janga.knit.vm.core.Function;
import cf.janga.knit.vm.errors.program.AssertionFailedError;
import cf.janga.knit.vm.errors.program.ProgramError;

import java.util.Optional;

/**
 * assert(boolean)
 * Checks if the boolean is true, erroring out and stopping the program
 * execution if it's not.
 */
public class Assert extends Function {

    public Assert() {
        super("assert", 1);
    }

    @Override
    public Optional<Object> doExecute(Object[] arguments) throws ProgramError {
        Boolean value = (Boolean) arguments[0];
        if (!value) {
            throw new AssertionFailedError();
        }
        return Optional.empty();
    }
}
