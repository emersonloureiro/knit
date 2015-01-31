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
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, FUNCTION_KEYWORD=16, 
		MAIN_KEYWORD=17, ALPHA_CHARACTER=18, DIGIT=19, SPACE=20, NEWLINE=21, TAB=22, 
		STRING=23, COMMAND=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'->'", "'foreach'", "'{'", "'=='", "'='", "'}'", "'print'", "'('", 
		"')'", "'*'", "'+'", "','", "'-'", "'.'", "'func'", "'main'", "ALPHA_CHARACTER", 
		"DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "COMMAND"
	};
	public static final String[] ruleNames = {
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "FUNCTION_KEYWORD", "MAIN_KEYWORD", 
		"ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "COMMAND"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u0092\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25m\n\25\r\25\16\25"+
		"n\3\25\3\25\3\26\6\26t\n\26\r\26\16\26u\3\26\3\26\3\27\6\27{\n\27\r\27"+
		"\16\27|\3\27\3\27\3\30\3\30\7\30\u0083\n\30\f\30\16\30\u0086\13\30\3\30"+
		"\3\30\3\31\3\31\7\31\u008c\n\31\f\31\16\31\u008f\13\31\3\31\3\31\2\2\32"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\b\4\2C\\c|\3\2\62;\4"+
		"\2\"\"))\5\2\13\f\17\17~~\3\2\13\13\3\2$$\u0096\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3"+
		"\2\2\2\5\65\3\2\2\2\78\3\2\2\2\t@\3\2\2\2\13B\3\2\2\2\rE\3\2\2\2\17G\3"+
		"\2\2\2\21I\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33"+
		"W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#b\3\2\2\2%g\3\2\2\2\'i\3\2"+
		"\2\2)l\3\2\2\2+s\3\2\2\2-z\3\2\2\2/\u0080\3\2\2\2\61\u0089\3\2\2\2\63"+
		"\64\7\61\2\2\64\4\3\2\2\2\65\66\7/\2\2\66\67\7@\2\2\67\6\3\2\2\289\7h"+
		"\2\29:\7q\2\2:;\7t\2\2;<\7g\2\2<=\7c\2\2=>\7e\2\2>?\7j\2\2?\b\3\2\2\2"+
		"@A\7}\2\2A\n\3\2\2\2BC\7?\2\2CD\7?\2\2D\f\3\2\2\2EF\7?\2\2F\16\3\2\2\2"+
		"GH\7\177\2\2H\20\3\2\2\2IJ\7r\2\2JK\7t\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2"+
		"N\22\3\2\2\2OP\7*\2\2P\24\3\2\2\2QR\7+\2\2R\26\3\2\2\2ST\7,\2\2T\30\3"+
		"\2\2\2UV\7-\2\2V\32\3\2\2\2WX\7.\2\2X\34\3\2\2\2YZ\7/\2\2Z\36\3\2\2\2"+
		"[\\\7\60\2\2\\ \3\2\2\2]^\7h\2\2^_\7w\2\2_`\7p\2\2`a\7e\2\2a\"\3\2\2\2"+
		"bc\7o\2\2cd\7c\2\2de\7k\2\2ef\7p\2\2f$\3\2\2\2gh\t\2\2\2h&\3\2\2\2ij\t"+
		"\3\2\2j(\3\2\2\2km\t\4\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3"+
		"\2\2\2pq\b\25\2\2q*\3\2\2\2rt\t\5\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv"+
		"\3\2\2\2vw\3\2\2\2wx\b\26\2\2x,\3\2\2\2y{\t\6\2\2zy\3\2\2\2{|\3\2\2\2"+
		"|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\27\2\2\177.\3\2\2\2\u0080\u0084"+
		"\7$\2\2\u0081\u0083\n\7\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7$\2\2\u0088\60\3\2\2\2\u0089\u008d\7]\2\2\u008a\u008c"+
		"\n\7\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7_"+
		"\2\2\u0091\62\3\2\2\2\b\2nu|\u0084\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}