package cf.janga.knit.runtime.compiler;

import cf.janga.knit.vm.core.Instruction;

import java.util.List;

public interface Context {

    List<Instruction> getInstructions(int startIndex);
}
