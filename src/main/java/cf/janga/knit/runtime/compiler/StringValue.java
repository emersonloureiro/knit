package cf.janga.knit.runtime.compiler;

public class StringValue implements Value<String> {

    private final String _value;

    public StringValue(String value) {
        _value = value;
    }

    @Override
    public String get() {
        return _value;
    }
}
