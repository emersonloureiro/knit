import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.Nullable;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;

public class ScruxParser {

	public ParsingResult parse(File file) throws ParsingException {
		try {
			CharStream charStream = new ANTLRFileStream(file.getPath());
			Lexer lexer = new ScruxLanguageLexer(charStream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tokens.fill();
            ScruxLanguageParser parser = new ScruxLanguageParser(tokens);
			parser.scruxProgram();
			boolean success = parser.getNumberOfSyntaxErrors() == 0 ? true : false;
			return new ParsingResult(success, new ArrayList<String>());
		} catch (IOException e) {
			throw new ParsingException("Error reading the file provided. Error message: \"" + e.getMessage() + "\"", e);
		}
	}
}
