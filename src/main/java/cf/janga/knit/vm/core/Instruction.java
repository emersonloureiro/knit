package cf.janga.knit.vm.core;

import cf.janga.knit.vm.errors.ProgramError;

public interface Instruction {

    void execute() throws ProgramError;
}
