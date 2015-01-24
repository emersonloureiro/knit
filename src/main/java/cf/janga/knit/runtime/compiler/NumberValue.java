package cf.janga.knit.runtime.compiler;

public class NumberValue implements Value<Float> {

    private final Float _value;

    public NumberValue(Float value) {
        _value = value;
    }

    @Override
    public Float get() {
        return _value;
    }
}
