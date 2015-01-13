package cf.janga.knit.vm.core;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    private final Map<String, Object> localVariables;

    public Scope() {
        this.localVariables = new HashMap<>(10);
    }

    public void assign(String variableName, Object value) {
        this.localVariables.put(variableName, value);
    }

    public Object valueOf(String variableName) {
        return this.localVariables.get(variableName);
    }

    public void destroy() {
        this.localVariables.clear();
    }
}
