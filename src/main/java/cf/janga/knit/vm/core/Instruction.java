package cf.janga.knit.vm.core;

import cf.janga.knit.vm.errors.program.ProgramError;

public interface Instruction {

    void execute() throws ProgramError;
}
