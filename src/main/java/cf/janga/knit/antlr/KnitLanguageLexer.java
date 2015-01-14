// Generated from KnitLanguage.g4 by ANTLR 4.2.2
package cf.janga.knit.antlr;
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
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, FUNCTION_KEYWORD=11, MAIN_KEYWORD=12, ALPHA_CHARACTER=13, DIGIT=14, 
		SPACE=15, NEWLINE=16, TAB=17, STRING=18, COMMAND=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'->'", "'foreach'", "'print'", "'('", "')'", "'{'", "','", "'='", "'}'", 
		"'.'", "'func'", "'main'", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", 
		"TAB", "STRING", "COMMAND"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "FUNCTION_KEYWORD", "MAIN_KEYWORD", "ALPHA_CHARACTER", "DIGIT", 
		"SPACE", "NEWLINE", "TAB", "STRING", "COMMAND"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\6\20X\n\20\r\20\16\20Y\3\20\3\20\3\21\6\21_\n\21\r\21\16\21`\3\21\3\21"+
		"\3\22\6\22f\n\22\r\22\16\22g\3\22\3\22\3\23\3\23\7\23n\n\23\f\23\16\23"+
		"q\13\23\3\23\3\23\3\24\3\24\7\24w\n\24\f\24\16\24z\13\24\3\24\3\24\2\2"+
		"\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25\3\2\b\4\2C\\c|\3\2\63;\4\2\"\"))\5\2\13\f\17"+
		"\17~~\3\2\13\13\3\2$$\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5,\3"+
		"\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21B"+
		"\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31M\3\2\2\2\33R\3\2\2\2\35"+
		"T\3\2\2\2\37W\3\2\2\2!^\3\2\2\2#e\3\2\2\2%k\3\2\2\2\'t\3\2\2\2)*\7/\2"+
		"\2*+\7@\2\2+\4\3\2\2\2,-\7h\2\2-.\7q\2\2./\7t\2\2/\60\7g\2\2\60\61\7c"+
		"\2\2\61\62\7e\2\2\62\63\7j\2\2\63\6\3\2\2\2\64\65\7r\2\2\65\66\7t\2\2"+
		"\66\67\7k\2\2\678\7p\2\289\7v\2\29\b\3\2\2\2:;\7*\2\2;\n\3\2\2\2<=\7+"+
		"\2\2=\f\3\2\2\2>?\7}\2\2?\16\3\2\2\2@A\7.\2\2A\20\3\2\2\2BC\7?\2\2C\22"+
		"\3\2\2\2DE\7\177\2\2E\24\3\2\2\2FG\7\60\2\2G\26\3\2\2\2HI\7h\2\2IJ\7w"+
		"\2\2JK\7p\2\2KL\7e\2\2L\30\3\2\2\2MN\7o\2\2NO\7c\2\2OP\7k\2\2PQ\7p\2\2"+
		"Q\32\3\2\2\2RS\t\2\2\2S\34\3\2\2\2TU\t\3\2\2U\36\3\2\2\2VX\t\4\2\2WV\3"+
		"\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\b\20\2\2\\ \3\2\2\2"+
		"]_\t\5\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\21\2"+
		"\2c\"\3\2\2\2df\t\6\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2"+
		"\2\2ij\b\22\2\2j$\3\2\2\2ko\7$\2\2ln\n\7\2\2ml\3\2\2\2nq\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7$\2\2s&\3\2\2\2tx\7]\2\2uw\n\7\2"+
		"\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7_\2"+
		"\2|(\3\2\2\2\b\2Y`gox\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}