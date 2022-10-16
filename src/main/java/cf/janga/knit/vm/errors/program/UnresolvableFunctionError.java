package cf.janga.knit.vm.errors.program;

import java.util.List;

public class UnresolvableFunctionError extends ProgramError {

    public UnresolvableFunctionError(String function, List<String> modules) {
        super(String.format("Cannot resolve function '%s'. Declared in:%s", function, modules.stream().reduce("", (ac, cu) -> ac += " " + cu)));
    }
}
