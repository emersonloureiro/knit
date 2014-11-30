package cf.janga.knit.runtime;

public class RealNumberConstantInstruction extends SimpleInstruction<Double> {

    private final Double _number;

    public RealNumberConstantInstruction(double number) {
        _number = number;
    }

    @Override
    public Double execute() {
        return _number;
    }
}
