package cf.janga.knit.runtime;

import java.util.Map;

public class KnitRuntime {

    public int run(String args[]) {
        if (args.length == 0) {
            System.out.println("Usage: knit [/path/to/knit/file.knit ARGUMENTS]");
            System.out.println("where:");
            System.out.println("\tARGUMENTS is the list of arguments to be passed, in the form --argumentName argumentValue ..., e.g.,");
            System.out.println("\t\t--arg1 value1 -- arg2 value2 --arg3 value3");
            return 1;
        }
        String knitFile = args[0];
        String remainingArguments = "";
        for (int i = 1; i < args.length; i++) {
            remainingArguments += args[i] + " ";
        }
        ArgumentsParser argumentsParser = new ArgumentsParser();
        try {
            Map<String, String> arguments = argumentsParser.parse(remainingArguments);
            return new KnitProgramRunner(new RuntimeFactory()).run(knitFile, arguments);
        } catch (ArgumentParsingException ape) {
            System.out.println(ape.getMessage());
        }
        return 1;
    }

    public static void main(String[] args) {
        int exitCode = new KnitRuntime().run(args);
        System.exit(exitCode);
    }
}
