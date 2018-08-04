package cf.janga.knit.vm.core;

/**
 * A function in code that can be called elsewhere in the code.
 */
public interface Function {
    /**
     * Calls this function and results its result.
     * @param arguments The arguments to the function
     * @return
     */
    Object execute(Object[] arguments);

    /**
     * Returns the full name of this function, which will include
     * the module it's placed in; e.g.,:
     * knit::str::str_contains
     *
     * @return
     */
    String getName();
}
