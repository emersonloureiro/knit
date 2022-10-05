package cf.janga.knit.runtime;

import static org.junit.Assert.assertThrows;

import java.util.Map;

import junit.framework.TestCase;

public class ArgumentsParserTest extends TestCase {

    public static void testParseProperlyFormattedArguments() throws ArgumentParsingException {
        ArgumentsParser parser = new ArgumentsParser();
        Map<String, String> result = parser.parse("--arg1 1 --arg2 two --arg3 three3");
        assertEquals("1", result.get("arg1"));
        assertEquals("two", result.get("arg2"));
        assertEquals("three3", result.get("arg3"));
    }

    public static void testParseListArguments() throws ArgumentParsingException {
        ArgumentsParser parser = new ArgumentsParser();
        Map<String, String> result = parser.parse("--listArg [1,2,3,4,5,6] --otherArg value");
        assertEquals("[1,2,3,4,5,6]", result.get("listArg"));
        assertEquals("value", result.get("otherArg"));
    }

    public static void testParseArgumentsWithSpaces() throws ArgumentParsingException {
        ArgumentsParser parser = new ArgumentsParser();
        Map<String, String> result = parser.parse("--arg1 foo bar --arg2 foo --arg3 bar");
        assertEquals("foo bar", result.get("arg1"));
        assertEquals("foo", result.get("arg2"));
        assertEquals("bar", result.get("arg3"));
    }

    public static void testParseArgumentsWithMiscCharacters() throws ArgumentParsingException {
        ArgumentsParser parser = new ArgumentsParser();
        Map<String, String> result = parser.parse("--arg1 .;'{}' --arg2 ()=+_ --arg3 $%&@*!)");
        assertEquals(".;'{}'", result.get("arg1"));
        assertEquals("()=+_", result.get("arg2"));
        assertEquals("$%&@*!)", result.get("arg3"));
    }

    public static void testParseArgumentsNoSpaceBetween() throws ArgumentParsingException {
        ArgumentsParser parser = new ArgumentsParser();
        Map<String, String> result = parser.parse("--arg1 1--arg2 two --arg3 three3");
        assertEquals("1--arg2 two", result.get("arg1"));
        assertEquals(null, result.get("arg2"));
        assertEquals("three3", result.get("arg3"));
    }

    public static void testParseInvalidStartOfArgumentsString() throws ArgumentParsingException {
        ArgumentsParser parser = new ArgumentsParser();
        assertThrows(ArgumentParsingException.class, () -> parser.parse("invalidstart --arg1 1 --arg2 two --arg3 three3"));
    }
}
