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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, ALPHA_CHARACTER=13, DIGIT=14, DECIMAL=15, MISC_CHARACTER=16, 
		NEWLINE=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'func'", "'main'", "'\"'", "'return'", "'('", "')'", "'['", "'{'", "','", 
		"']'", "'='", "'}'", "ALPHA_CHARACTER", "DIGIT", "DECIMAL", "MISC_CHARACTER", 
		"NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "ALPHA_CHARACTER", "DIGIT", "DECIMAL", "MISC_CHARACTER", 
		"NEWLINE", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20P\n\20\r\20\16\20Q\3\20\3\20"+
		"\6\20V\n\20\r\20\16\20W\3\21\3\21\3\22\3\22\3\23\6\23_\n\23\r\23\16\23"+
		"`\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\4\2C\\c|\3\2\63;\t\2$$)+.\61"+
		"<>@A^^~~\5\2\f\f\17\17AA\7\2\13\f\17\17\"\"))~~f\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3"+
		"\2\2\2\5,\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17"+
		">\3\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2"+
		"\33J\3\2\2\2\35L\3\2\2\2\37O\3\2\2\2!Y\3\2\2\2#[\3\2\2\2%^\3\2\2\2\'("+
		"\7h\2\2()\7w\2\2)*\7p\2\2*+\7e\2\2+\4\3\2\2\2,-\7o\2\2-.\7c\2\2./\7k\2"+
		"\2/\60\7p\2\2\60\6\3\2\2\2\61\62\7$\2\2\62\b\3\2\2\2\63\64\7t\2\2\64\65"+
		"\7g\2\2\65\66\7v\2\2\66\67\7w\2\2\678\7t\2\289\7p\2\29\n\3\2\2\2:;\7*"+
		"\2\2;\f\3\2\2\2<=\7+\2\2=\16\3\2\2\2>?\7]\2\2?\20\3\2\2\2@A\7}\2\2A\22"+
		"\3\2\2\2BC\7.\2\2C\24\3\2\2\2DE\7_\2\2E\26\3\2\2\2FG\7?\2\2G\30\3\2\2"+
		"\2HI\7\177\2\2I\32\3\2\2\2JK\t\2\2\2K\34\3\2\2\2LM\t\3\2\2M\36\3\2\2\2"+
		"NP\5\35\17\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\7\60"+
		"\2\2TV\5\35\17\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X \3\2\2\2YZ\t"+
		"\4\2\2Z\"\3\2\2\2[\\\t\5\2\2\\$\3\2\2\2]_\t\6\2\2^]\3\2\2\2_`\3\2\2\2"+
		"`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\23\2\2c&\3\2\2\2\6\2QW`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}