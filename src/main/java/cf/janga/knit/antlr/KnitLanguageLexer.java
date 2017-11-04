// Generated from KnitLanguage.g4 by ANTLR 4.5
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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, FUNCTION_KEYWORD=15, 
		MAIN_KEYWORD=16, FOR_KEYWORD=17, IN_KEYWORD=18, DO_KEYWORD=19, ALPHA_CHARACTER=20, 
		DIGIT=21, SPACE=22, NEWLINE=23, TAB=24, STRING=25, LIST_OUTPUT_COMMAND=26, 
		SINGLE_OUTPUT_COMMAND=27, IDENTIFIER=28, COMMENT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "FUNCTION_KEYWORD", "MAIN_KEYWORD", 
		"FOR_KEYWORD", "IN_KEYWORD", "DO_KEYWORD", "ALPHA_CHARACTER", "DIGIT", 
		"SPACE", "NEWLINE", "TAB", "STRING", "LIST_OUTPUT_COMMAND", "SINGLE_OUTPUT_COMMAND", 
		"IDENTIFIER", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'{'", "'}'", "'='", "'-'", "'.'", "'+'", "'*'", 
		"'/'", "'=='", "'print'", "'assert'", "'func'", "'main'", "'for'", "'in'", 
		"'do'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "FUNCTION_KEYWORD", "MAIN_KEYWORD", "FOR_KEYWORD", "IN_KEYWORD", 
		"DO_KEYWORD", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", 
		"LIST_OUTPUT_COMMAND", "SINGLE_OUTPUT_COMMAND", "IDENTIFIER", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    private boolean skipSpace = true;


	public KnitLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KnitLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			if (skipSpace) skip();
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skipSpace = false;
			break;
		case 2:
			skipSpace = true;
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\6"+
		"\27}\n\27\r\27\16\27~\3\27\3\27\3\30\6\30\u0084\n\30\r\30\16\30\u0085"+
		"\3\30\3\30\3\31\6\31\u008b\n\31\r\31\16\31\u008c\3\31\3\31\3\32\3\32\7"+
		"\32\u0093\n\32\f\32\16\32\u0096\13\32\3\32\3\32\3\33\3\33\7\33\u009c\n"+
		"\33\f\33\16\33\u009f\13\33\3\33\3\33\3\34\3\34\7\34\u00a5\n\34\f\34\16"+
		"\34\u00a8\13\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00b0\n\35\f\35\16"+
		"\35\u00b3\13\35\3\35\3\35\3\36\3\36\7\36\u00b9\n\36\f\36\16\36\u00bc\13"+
		"\36\3\36\3\36\4\u009d\u00a6\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37\3\2\t\4\2C\\c|\3\2\62;\4\2\"\"))\5\2"+
		"\13\f\17\17~~\3\2\13\13\3\2$$\4\2\f\f\17\17\u00c7\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3"+
		"\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3"+
		"\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33V\3\2\2\2\35"+
		"\\\3\2\2\2\37c\3\2\2\2!h\3\2\2\2#m\3\2\2\2%q\3\2\2\2\'t\3\2\2\2)w\3\2"+
		"\2\2+y\3\2\2\2-|\3\2\2\2/\u0083\3\2\2\2\61\u008a\3\2\2\2\63\u0090\3\2"+
		"\2\2\65\u0099\3\2\2\2\67\u00a2\3\2\2\29\u00ab\3\2\2\2;\u00b6\3\2\2\2="+
		">\7*\2\2>\4\3\2\2\2?@\7.\2\2@\6\3\2\2\2AB\7+\2\2B\b\3\2\2\2CD\7}\2\2D"+
		"\n\3\2\2\2EF\7\177\2\2F\f\3\2\2\2GH\7?\2\2H\16\3\2\2\2IJ\7/\2\2J\20\3"+
		"\2\2\2KL\7\60\2\2L\22\3\2\2\2MN\7-\2\2N\24\3\2\2\2OP\7,\2\2P\26\3\2\2"+
		"\2QR\7\61\2\2R\30\3\2\2\2ST\7?\2\2TU\7?\2\2U\32\3\2\2\2VW\7r\2\2WX\7t"+
		"\2\2XY\7k\2\2YZ\7p\2\2Z[\7v\2\2[\34\3\2\2\2\\]\7c\2\2]^\7u\2\2^_\7u\2"+
		"\2_`\7g\2\2`a\7t\2\2ab\7v\2\2b\36\3\2\2\2cd\7h\2\2de\7w\2\2ef\7p\2\2f"+
		"g\7e\2\2g \3\2\2\2hi\7o\2\2ij\7c\2\2jk\7k\2\2kl\7p\2\2l\"\3\2\2\2mn\7"+
		"h\2\2no\7q\2\2op\7t\2\2p$\3\2\2\2qr\7k\2\2rs\7p\2\2s&\3\2\2\2tu\7f\2\2"+
		"uv\7q\2\2v(\3\2\2\2wx\t\2\2\2x*\3\2\2\2yz\t\3\2\2z,\3\2\2\2{}\t\4\2\2"+
		"|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\b\27\2\2\u0081.\3\2\2\2\u0082\u0084\t\5\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\b\30\3\2\u0088\60\3\2\2\2\u0089\u008b\t\6\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\b\31\3\2\u008f\62\3\2\2\2\u0090\u0094\7$\2"+
		"\2\u0091\u0093\n\7\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7$\2\2\u0098\64\3\2\2\2\u0099\u009d\7]\2\2\u009a\u009c\13\2\2\2"+
		"\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7_\2\2\u00a1"+
		"\66\3\2\2\2\u00a2\u00a6\7>\2\2\u00a3\u00a5\13\2\2\2\u00a4\u00a3\3\2\2"+
		"\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa8\3\2\2\2\u00ab\u00ac"+
		"\b\35\4\2\u00ac\u00b1\5)\25\2\u00ad\u00b0\5)\25\2\u00ae\u00b0\5+\26\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\b\35\5\2\u00b5:\3\2\2\2\u00b6\u00ba\7%\2\2\u00b7\u00b9\n\b\2\2"+
		"\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\b\36\6\2"+
		"\u00be<\3\2\2\2\f\2~\u0085\u008c\u0094\u009d\u00a6\u00af\u00b1\u00ba\7"+
		"\3\27\2\b\2\2\3\35\3\3\35\4\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}