package cf.janga.knit.runtime.vm.core;

import java.util.Deque;
import java.util.LinkedList;

public class MachineStack<T> {

    private final Deque<T> stack;

    public MachineStack() {
        this.stack = new LinkedList<T>();
    }

    public void push(T t) {
        this.stack.push(t);
    }

    public T top() {
        return this.stack.peek();
    }

    public T pop() {
        return this.stack.pop();
    }
}
