package cf.janga.knit.vm.errors.program;

public class InvalidNumberOfFunctionArgumentsError extends ProgramError {

    public InvalidNumberOfFunctionArgumentsError(String function, int expectedNumberOfArguments, int receivedNumberOfArguments) {
        super("Incorrect number of arguments for function " + function + ". Expected " + expectedNumberOfArguments + " but got " + receivedNumberOfArguments);
    }
}
