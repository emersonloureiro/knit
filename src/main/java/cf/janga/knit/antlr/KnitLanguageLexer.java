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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, FUNCTION_KEYWORD=15, MAIN_KEYWORD=16, 
		ALPHA_CHARACTER=17, DIGIT=18, SPACE=19, NEWLINE=20, TAB=21, STRING=22, 
		COMMAND=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'/'", "'->'", "'foreach'", "'{'", "'='", "'}'", "'print'", "'('", "')'", 
		"'*'", "'+'", "','", "'-'", "'.'", "'func'", "'main'", "ALPHA_CHARACTER", 
		"DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "COMMAND"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "FUNCTION_KEYWORD", "MAIN_KEYWORD", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u008d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\6\24h\n\24\r\24\16\24i\3\24\3\24\3\25\6\25o\n"+
		"\25\r\25\16\25p\3\25\3\25\3\26\6\26v\n\26\r\26\16\26w\3\26\3\26\3\27\3"+
		"\27\7\27~\n\27\f\27\16\27\u0081\13\27\3\27\3\27\3\30\3\30\7\30\u0087\n"+
		"\30\f\30\16\30\u008a\13\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\3\2\b\4\2C\\c|\3\2\62;\4\2\"\"))\5\2\13\f\17\17~~\3\2\13\13"+
		"\3\2$$\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\66\3\2\2\2\t>\3\2\2\2\13@\3"+
		"\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27P"+
		"\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37X\3\2\2\2!]\3\2\2\2#b\3"+
		"\2\2\2%d\3\2\2\2\'g\3\2\2\2)n\3\2\2\2+u\3\2\2\2-{\3\2\2\2/\u0084\3\2\2"+
		"\2\61\62\7\61\2\2\62\4\3\2\2\2\63\64\7/\2\2\64\65\7@\2\2\65\6\3\2\2\2"+
		"\66\67\7h\2\2\678\7q\2\289\7t\2\29:\7g\2\2:;\7c\2\2;<\7e\2\2<=\7j\2\2"+
		"=\b\3\2\2\2>?\7}\2\2?\n\3\2\2\2@A\7?\2\2A\f\3\2\2\2BC\7\177\2\2C\16\3"+
		"\2\2\2DE\7r\2\2EF\7t\2\2FG\7k\2\2GH\7p\2\2HI\7v\2\2I\20\3\2\2\2JK\7*\2"+
		"\2K\22\3\2\2\2LM\7+\2\2M\24\3\2\2\2NO\7,\2\2O\26\3\2\2\2PQ\7-\2\2Q\30"+
		"\3\2\2\2RS\7.\2\2S\32\3\2\2\2TU\7/\2\2U\34\3\2\2\2VW\7\60\2\2W\36\3\2"+
		"\2\2XY\7h\2\2YZ\7w\2\2Z[\7p\2\2[\\\7e\2\2\\ \3\2\2\2]^\7o\2\2^_\7c\2\2"+
		"_`\7k\2\2`a\7p\2\2a\"\3\2\2\2bc\t\2\2\2c$\3\2\2\2de\t\3\2\2e&\3\2\2\2"+
		"fh\t\4\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\24\2"+
		"\2l(\3\2\2\2mo\t\5\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2"+
		"\2rs\b\25\2\2s*\3\2\2\2tv\t\6\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2"+
		"\2\2xy\3\2\2\2yz\b\26\2\2z,\3\2\2\2{\177\7$\2\2|~\n\7\2\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\7$\2\2\u0083.\3\2\2\2\u0084\u0088\7]\2\2\u0085\u0087"+
		"\n\7\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7_"+
		"\2\2\u008c\60\3\2\2\2\b\2ipw\177\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}