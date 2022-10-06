package cf.janga.knit.vm.core;

import cf.janga.knit.vm.errors.InvalidNumberOfFunctionArgumentsError;
import cf.janga.knit.vm.errors.ProgramError;

import java.util.Optional;

/**
 * A function in code that can be called elsewhere in the code.
 */
public abstract class Function {

    private final int numberOfArguments;
    private final String name;

    public Function(String name, int numberOfArguments) {
        this.name = name;
        this.numberOfArguments = numberOfArguments;
    }

    /**
     * Calls this function and results its result.
     *
     * @param arguments The arguments to the function
     * @return
     */
    public final Optional<Object> execute(Object[] arguments) throws ProgramError {
        if (arguments.length != this.numberOfArguments) {
            throw new InvalidNumberOfFunctionArgumentsError(name, numberOfArguments, arguments.length);
        }
        return doExecute(arguments);
    }

    public abstract Optional<Object> doExecute(Object[] arguments) throws ProgramError;

    /**
     * Returns the full name of this function, which will include
     * the module it's placed in; e.g.,:
     * knit::str::str_contains
     *
     * @return
     */
    public final String getName() {
        return this.name;
    }
}
