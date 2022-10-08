package cf.janga.knit.compiler.constructs;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.VirtualMachine;
import cf.janga.knit.vm.instructions.Fncal;
import cf.janga.knit.vm.instructions.Osphc;
import cf.janga.knit.vm.instructions.Osphr;

public class StringConstant extends Constant {

    private String string;
    private Pattern variableSubstitutionStartPattern = Pattern.compile("\\$\\{\\s*");

    public StringConstant(VirtualMachine vm, String constant) {
        super(vm);
        this.string = constant;
    }

    @Override
    public List<Instruction> getInstructions(int startIndex) {
        List<Instruction> instructions = new ArrayList<Instruction>();

        Matcher matcher = variableSubstitutionStartPattern.matcher(this.string);
        int start = 0;
        int pushedOperands = 0;
        while (matcher.find()) {
            int matchStart = matcher.toMatchResult().start();
            int end = this.string.indexOf("}", matchStart);

            if (end != -1) {
                if (matchStart > start) {
                    String substringConstant = this.string.substring(start, matchStart);
                    instructions.add(new Osphc(startIndex++, this.vm, substringConstant));
                    pushedOperands++;
                    if (this.needsConcatenate(pushedOperands)) {
                        // Call concatenate function
                        instructions.add(new Osphc(startIndex++, this.vm, 2));
                        instructions.add(new Osphc(startIndex++, this.vm, "strConcat"));
                        instructions.add(new Osphc(startIndex++, this.vm, "knit::str::"));
                        instructions.add(new Fncal(startIndex++, this.vm, true));
                    }
                }
                String referencedVariable = this.string.substring(matchStart + 2, end).trim();
                instructions.add(new Osphr(startIndex++, this.vm, referencedVariable, true));
                pushedOperands++;
                if (this.needsConcatenate(pushedOperands)) {
                    // Call concatenate function
                    instructions.add(new Osphc(startIndex++, this.vm, 2));
                    instructions.add(new Osphc(startIndex++, this.vm, "strConcat"));
                    instructions.add(new Osphc(startIndex++, this.vm, "knit::str::"));
                    instructions.add(new Fncal(startIndex++, this.vm, true));
                }
                start = end + 1;
            }
        }

        if (start < this.string.length()) {
            // Take what's left
            String substringConstant = this.string.substring(start, this.string.length());
            instructions.add(new Osphc(startIndex++, this.vm, substringConstant));
            pushedOperands++;
            if (this.needsConcatenate(pushedOperands)) {
                // Call concatenate function
                instructions.add(new Osphc(startIndex++, this.vm, 2));
                instructions.add(new Osphc(startIndex++, this.vm, "strConcat"));
                instructions.add(new Osphc(startIndex++, this.vm, "knit::str::"));
                instructions.add(new Fncal(startIndex++, this.vm, true));
            }
        }

        return instructions;
    }

    private boolean needsConcatenate(int pushedOperands) {
        return pushedOperands == 2 || pushedOperands > 2;
    }
}
