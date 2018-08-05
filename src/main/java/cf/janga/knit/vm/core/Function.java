package cf.janga.knit.vm.core;

import cf.janga.knit.vm.errors.ProgramError;

import java.util.Optional;

/**
 * A function in code that can be called elsewhere in the code.
 */
public abstract class Function {

    private final int _numberOfArguments;
    private final String _name;

    public Function(String name, int numberOfArguments) {
        _name = name;
        _numberOfArguments = numberOfArguments;
    }

    /**
     * Calls this function and results its result.
     *
     * @param arguments The arguments to the function
     * @return
     */
    public final Optional<Object> execute(Object[] arguments) {
        if (arguments.length != _numberOfArguments) {
            throw new ProgramError("Incorrect number of arguments for function " + _name + ". Expected " + _numberOfArguments + " but got " + arguments.length);
        }
        return doExecute(arguments);
    }

    public abstract Optional<Object> doExecute(Object[] arguments);

    /**
     * Returns the full name of this function, which will include
     * the module it's placed in; e.g.,:
     * knit::str::str_contains
     *
     * @return
     */
    public final String getName() {
        return _name;
    }
}
