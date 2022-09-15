package cf.janga.knit.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArgumentsParser {
    public Map<String, String> parse(String rawCommands) throws ArgumentParsingException {
        Map<String, String> arguments = new HashMap<>();
        Pattern pattern = Pattern.compile("(--(\\w+|\\d+)\\s+(.+?))(?=\\s+--|$)+?");
        Matcher matcher = pattern.matcher(rawCommands);
        boolean firstMatch = true;
        while (matcher.find()) {
            if (firstMatch && matcher.start() != 0) {
                throw new ArgumentParsingException(String.format("Invalid argument input: %s", rawCommands));
            }
            firstMatch = false;
            if (matcher.groupCount() == 3) {
                String argumentName = matcher.group(2);
                String argumentValue = matcher.group(3);
                arguments.put(argumentName, argumentValue);
            } else {
                throw new ArgumentParsingException(String.format("Invalid argument input: %s", rawCommands));
            }
        }
        return arguments;
    }
}
