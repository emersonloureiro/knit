package cf.janga.knit.vm.core;

public class Register<T> {

    private T value;

    public Register() {
    }

    public T value() {
        return this.value;
    }

    public void set(T value) {
        this.value = value;
    }
}
