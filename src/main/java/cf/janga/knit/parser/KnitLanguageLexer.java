// Generated from KnitLanguage.g4 by ANTLR 4.2.2
package cf.janga.knit.parser;
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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		FUNCTION_KEYWORD=10, MAIN_KEYWORD=11, ALPHA_CHARACTER=12, DIGIT=13, SPACE=14, 
		NEWLINE=15, TAB=16, STRING=17, COMMAND=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'print('", "'->'", "'('", "')'", "'{'", "','", "'='", "'}'", "'.'", "'func'", 
		"'main'", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", 
		"COMMAND"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"FUNCTION_KEYWORD", "MAIN_KEYWORD", "ALPHA_CHARACTER", "DIGIT", "SPACE", 
		"NEWLINE", "TAB", "STRING", "COMMAND"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17O\n\17\r\17\16\17P\3\17\3\17\3"+
		"\20\6\20V\n\20\r\20\16\20W\3\20\3\20\3\21\6\21]\n\21\r\21\16\21^\3\21"+
		"\3\21\3\22\3\22\7\22e\n\22\f\22\16\22h\13\22\3\22\3\22\3\23\3\23\7\23"+
		"n\n\23\f\23\16\23q\13\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\b\4\2"+
		"C\\c|\3\2\63;\4\2\"\"))\5\2\13\f\17\17~~\3\2\13\13\3\2$$x\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\3\'\3\2\2\2\5.\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67"+
		"\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27D\3\2\2\2\31"+
		"I\3\2\2\2\33K\3\2\2\2\35N\3\2\2\2\37U\3\2\2\2!\\\3\2\2\2#b\3\2\2\2%k\3"+
		"\2\2\2\'(\7r\2\2()\7t\2\2)*\7k\2\2*+\7p\2\2+,\7v\2\2,-\7*\2\2-\4\3\2\2"+
		"\2./\7/\2\2/\60\7@\2\2\60\6\3\2\2\2\61\62\7*\2\2\62\b\3\2\2\2\63\64\7"+
		"+\2\2\64\n\3\2\2\2\65\66\7}\2\2\66\f\3\2\2\2\678\7.\2\28\16\3\2\2\29:"+
		"\7?\2\2:\20\3\2\2\2;<\7\177\2\2<\22\3\2\2\2=>\7\60\2\2>\24\3\2\2\2?@\7"+
		"h\2\2@A\7w\2\2AB\7p\2\2BC\7e\2\2C\26\3\2\2\2DE\7o\2\2EF\7c\2\2FG\7k\2"+
		"\2GH\7p\2\2H\30\3\2\2\2IJ\t\2\2\2J\32\3\2\2\2KL\t\3\2\2L\34\3\2\2\2MO"+
		"\t\4\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\17\2\2"+
		"S\36\3\2\2\2TV\t\5\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2"+
		"\2YZ\b\20\2\2Z \3\2\2\2[]\t\6\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_`\3\2\2\2`a\b\21\2\2a\"\3\2\2\2bf\7$\2\2ce\n\7\2\2dc\3\2\2\2eh"+
		"\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7$\2\2j$\3\2\2\2ko"+
		"\7]\2\2ln\n\7\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo"+
		"\3\2\2\2rs\7_\2\2s&\3\2\2\2\b\2PW^fo\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}