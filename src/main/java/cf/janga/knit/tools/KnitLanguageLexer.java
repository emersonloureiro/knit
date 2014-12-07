// Generated from KnitLanguage.g4 by ANTLR 4.2.2
package cf.janga.knit.tools;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnitLanguageLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, STRING=7, COMMAND=8, FUNCTION_KEYWORD=9, 
		MAIN_KEYWORD=10, ALPHA_CHARACTER=11, DIGIT=12, SPACE=13, NEWLINE=14, TAB=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'{'", "','", "'='", "'}'", "STRING", "COMMAND", "'func'", 
		"'main'", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STRING", "COMMAND", "FUNCTION_KEYWORD", 
		"MAIN_KEYWORD", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB"
	};


	public KnitLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KnitLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b\60\n\b\f\b\16\b\63\13\b\3\b\3"+
		"\b\3\t\3\t\7\t9\n\t\f\t\16\t<\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16O\n\16\r\16\16\16P\3\16\3"+
		"\16\3\17\6\17V\n\17\r\17\16\17W\3\17\3\17\3\20\6\20]\n\20\r\20\16\20^"+
		"\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21\3\2\b\3\2$$\4\2C\\c|\3\2\63;\4\2\"\"))\5\2\13\f"+
		"\17\17~~\3\2\13\13f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2"+
		"\17-\3\2\2\2\21\66\3\2\2\2\23?\3\2\2\2\25D\3\2\2\2\27I\3\2\2\2\31K\3\2"+
		"\2\2\33N\3\2\2\2\35U\3\2\2\2\37\\\3\2\2\2!\"\7*\2\2\"\4\3\2\2\2#$\7+\2"+
		"\2$\6\3\2\2\2%&\7}\2\2&\b\3\2\2\2\'(\7.\2\2(\n\3\2\2\2)*\7?\2\2*\f\3\2"+
		"\2\2+,\7\177\2\2,\16\3\2\2\2-\61\7$\2\2.\60\n\2\2\2/.\3\2\2\2\60\63\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7$"+
		"\2\2\65\20\3\2\2\2\66:\7]\2\2\679\n\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7_\2\2>\22\3\2\2\2?@\7h\2\2@A\7w"+
		"\2\2AB\7p\2\2BC\7e\2\2C\24\3\2\2\2DE\7o\2\2EF\7c\2\2FG\7k\2\2GH\7p\2\2"+
		"H\26\3\2\2\2IJ\t\3\2\2J\30\3\2\2\2KL\t\4\2\2L\32\3\2\2\2MO\t\5\2\2NM\3"+
		"\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\16\2\2S\34\3\2\2\2"+
		"TV\t\6\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\b\17\2"+
		"\2Z\36\3\2\2\2[]\t\7\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3"+
		"\2\2\2`a\b\20\2\2a \3\2\2\2\b\2\61:PW^\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}