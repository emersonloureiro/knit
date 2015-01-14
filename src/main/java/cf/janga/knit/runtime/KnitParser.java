package cf.janga.knit.runtime;

import cf.janga.knit.antlr.KnitLanguageLexer;
import cf.janga.knit.antlr.KnitLanguageParser;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class KnitParser {

	public ParsingResult parse(File file) throws ParsingException {
		try {
			CharStream charStream = new ANTLRFileStream(file.getPath());
			Lexer lexer = new KnitLanguageLexer(charStream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			tokens.fill();
            KnitLanguageParser parser = new KnitLanguageParser(tokens);
			KnitLanguageParser.KnitProgramContext tree = parser.knitProgram();
            return new ParsingResult(parser.getNumberOfSyntaxErrors() == 0, tree, new ArrayList<String>());
		} catch (IOException e) {
			throw new ParsingException("Error reading the file provided. Error message: \"" + e.getMessage() + "\"", e);
		}
	}
}
