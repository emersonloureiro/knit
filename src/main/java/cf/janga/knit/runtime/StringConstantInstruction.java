package cf.janga.knit.runtime;

public class StringConstantInstruction extends SimpleInstruction<String> {

    private final String _string;

    public StringConstantInstruction(String string) {
        _string = string;
    }

    @Override
    public String execute() {
        return _string;
    }
}
