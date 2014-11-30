package cf.janga.knit.runtime;

public interface Instruction<T> {

    T execute();

    void afterExecution();

    void afterSequence();
}
