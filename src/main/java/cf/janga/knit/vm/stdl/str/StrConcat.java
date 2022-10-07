package cf.janga.knit.vm.stdl.str;

import java.util.Optional;

import cf.janga.knit.vm.core.Function;

public class StrConcat extends Function {
    
    public StrConcat() {
        super("knit::str::strConcat", 2);
    }

    @Override
    public Optional<Object> doExecute(Object[] arguments) {
        String firstString = (String) arguments[0];
        String secondString = (String) arguments[1];
        return Optional.of(firstString + secondString);
    }

}
