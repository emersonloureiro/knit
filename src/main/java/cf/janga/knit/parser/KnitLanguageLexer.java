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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, FUNCTION_KEYWORD=8, 
		MAIN_KEYWORD=9, ALPHA_CHARACTER=10, DIGIT=11, SPACE=12, NEWLINE=13, TAB=14, 
		STRING=15, COMMAND=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'print('", "'('", "')'", "'{'", "','", "'='", "'}'", "'func'", "'main'", 
		"ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "COMMAND"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "FUNCTION_KEYWORD", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\6\rF\n\r\r"+
		"\r\16\rG\3\r\3\r\3\16\6\16M\n\16\r\16\16\16N\3\16\3\16\3\17\6\17T\n\17"+
		"\r\17\16\17U\3\17\3\17\3\20\3\20\7\20\\\n\20\f\20\16\20_\13\20\3\20\3"+
		"\20\3\21\3\21\7\21e\n\21\f\21\16\21h\13\21\3\21\3\21\2\2\22\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"\3\2\b\4\2C\\c|\3\2\63;\4\2\"\"))\5\2\13\f\17\17~~\3\2\13\13\3\2$$o\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2"+
		"\2\5*\3\2\2\2\7,\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\64\3"+
		"\2\2\2\21\66\3\2\2\2\23;\3\2\2\2\25@\3\2\2\2\27B\3\2\2\2\31E\3\2\2\2\33"+
		"L\3\2\2\2\35S\3\2\2\2\37Y\3\2\2\2!b\3\2\2\2#$\7r\2\2$%\7t\2\2%&\7k\2\2"+
		"&\'\7p\2\2\'(\7v\2\2()\7*\2\2)\4\3\2\2\2*+\7*\2\2+\6\3\2\2\2,-\7+\2\2"+
		"-\b\3\2\2\2./\7}\2\2/\n\3\2\2\2\60\61\7.\2\2\61\f\3\2\2\2\62\63\7?\2\2"+
		"\63\16\3\2\2\2\64\65\7\177\2\2\65\20\3\2\2\2\66\67\7h\2\2\678\7w\2\28"+
		"9\7p\2\29:\7e\2\2:\22\3\2\2\2;<\7o\2\2<=\7c\2\2=>\7k\2\2>?\7p\2\2?\24"+
		"\3\2\2\2@A\t\2\2\2A\26\3\2\2\2BC\t\3\2\2C\30\3\2\2\2DF\t\4\2\2ED\3\2\2"+
		"\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\r\2\2J\32\3\2\2\2KM\t\5"+
		"\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\16\2\2Q\34"+
		"\3\2\2\2RT\t\6\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2W"+
		"X\b\17\2\2X\36\3\2\2\2Y]\7$\2\2Z\\\n\7\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2"+
		"\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7$\2\2a \3\2\2\2bf\7]\2\2ce\n\7\2"+
		"\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7_\2"+
		"\2j\"\3\2\2\2\b\2GNU]f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}