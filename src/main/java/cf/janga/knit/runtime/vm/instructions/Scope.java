package cf.janga.knit.runtime.vm.instructions;

public class Scope {

    private final Integer lastInstruction;

    public Scope(Integer lastInstruction) {
        this.lastInstruction = lastInstruction;
    }

    public void assign(String variableName, Object value) {
    }

    public Object valueOf(String variableName) {
        return null;
    }

    public void destroy() {
    }

    public Integer lastInstruction() {
        return this.lastInstruction;
    }
}
