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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		FUNCTION_KEYWORD=17, MAIN_KEYWORD=18, ALPHA_CHARACTER=19, DIGIT=20, SPACE=21, 
		NEWLINE=22, TAB=23, STRING=24, COMMAND=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'->'", "'foreach'", "'{'", "'=='", "'assert'", "'='", "'}'", "'print'", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'func'", "'main'", "ALPHA_CHARACTER", 
		"DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "COMMAND"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "FUNCTION_KEYWORD", 
		"MAIN_KEYWORD", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", 
		"STRING", "COMMAND"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\6\26v\n\26\r\26\16\26w\3\26\3\26\3\27\6\27}\n\27\r"+
		"\27\16\27~\3\27\3\27\3\30\6\30\u0084\n\30\r\30\16\30\u0085\3\30\3\30\3"+
		"\31\3\31\7\31\u008c\n\31\f\31\16\31\u008f\13\31\3\31\3\31\3\32\3\32\7"+
		"\32\u0095\n\32\f\32\16\32\u0098\13\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\3\2\b\4\2C\\c|\3\2\62;\4\2\"\"))\5\2"+
		"\13\f\17\17~~\3\2\13\13\3\2$$\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3"+
		"\2\2\2\5\67\3\2\2\2\7:\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rG\3\2\2\2\17N\3"+
		"\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31\\\3\2\2\2\33"+
		"^\3\2\2\2\35`\3\2\2\2\37b\3\2\2\2!d\3\2\2\2#f\3\2\2\2%k\3\2\2\2\'p\3\2"+
		"\2\2)r\3\2\2\2+u\3\2\2\2-|\3\2\2\2/\u0083\3\2\2\2\61\u0089\3\2\2\2\63"+
		"\u0092\3\2\2\2\65\66\7\61\2\2\66\4\3\2\2\2\678\7/\2\289\7@\2\29\6\3\2"+
		"\2\2:;\7h\2\2;<\7q\2\2<=\7t\2\2=>\7g\2\2>?\7c\2\2?@\7e\2\2@A\7j\2\2A\b"+
		"\3\2\2\2BC\7}\2\2C\n\3\2\2\2DE\7?\2\2EF\7?\2\2F\f\3\2\2\2GH\7c\2\2HI\7"+
		"u\2\2IJ\7u\2\2JK\7g\2\2KL\7t\2\2LM\7v\2\2M\16\3\2\2\2NO\7?\2\2O\20\3\2"+
		"\2\2PQ\7\177\2\2Q\22\3\2\2\2RS\7r\2\2ST\7t\2\2TU\7k\2\2UV\7p\2\2VW\7v"+
		"\2\2W\24\3\2\2\2XY\7*\2\2Y\26\3\2\2\2Z[\7+\2\2[\30\3\2\2\2\\]\7,\2\2]"+
		"\32\3\2\2\2^_\7-\2\2_\34\3\2\2\2`a\7.\2\2a\36\3\2\2\2bc\7/\2\2c \3\2\2"+
		"\2de\7\60\2\2e\"\3\2\2\2fg\7h\2\2gh\7w\2\2hi\7p\2\2ij\7e\2\2j$\3\2\2\2"+
		"kl\7o\2\2lm\7c\2\2mn\7k\2\2no\7p\2\2o&\3\2\2\2pq\t\2\2\2q(\3\2\2\2rs\t"+
		"\3\2\2s*\3\2\2\2tv\t\4\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3"+
		"\2\2\2yz\b\26\2\2z,\3\2\2\2{}\t\5\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\27\2\2\u0081.\3\2\2\2\u0082\u0084"+
		"\t\6\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\30\2\2\u0088\60\3\2\2"+
		"\2\u0089\u008d\7$\2\2\u008a\u008c\n\7\2\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7$\2\2\u0091\62\3\2\2\2\u0092\u0096\7]\2\2"+
		"\u0093\u0095\n\7\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7_\2\2\u009a\64\3\2\2\2\b\2w~\u0085\u008d\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}