package cf.janga.knit.vm.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Scope {

    private final Map<String, Object> localVariables;

    private Optional<Scope> parent;

    public Scope(Scope parent) {
        this();
        this.parent = Optional.of(parent);
    }

    public Scope() {
        this.localVariables = new HashMap<>(10);
        this.parent = Optional.empty();
    }

    public void assign(String variableName, Object value) {
        this.localVariables.put(variableName, value);
    }

    public Object valueOf(String variableName) {
        Object localValue = this.localVariables.get(variableName);
        if (localValue != null) {
            return localValue;
        }
        return this.parent.map(p -> p.valueOf(variableName)).orElse(null);
    }

    public void destroy() {
        this.localVariables.clear();
    }
}
