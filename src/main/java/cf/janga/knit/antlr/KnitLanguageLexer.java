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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, FUNCTION_KEYWORD=17, 
		MAIN_KEYWORD=18, ALPHA_CHARACTER=19, DIGIT=20, SPACE=21, NEWLINE=22, TAB=23, 
		STRING=24, LIST_OUTPUT_COMMAND=25, SINGLE_OUTPUT_COMMAND=26, IDENTIFIER=27, 
		COMMENT=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "FUNCTION_KEYWORD", 
		"MAIN_KEYWORD", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", 
		"STRING", "LIST_OUTPUT_COMMAND", "SINGLE_OUTPUT_COMMAND", "IDENTIFIER", 
		"COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'{'", "'}'", "'='", "'-'", "'.'", "'+'", "'*'", 
		"'/'", "'=='", "'print'", "'assert'", "'foreach'", "'->'", "'func'", "'main'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "FUNCTION_KEYWORD", "MAIN_KEYWORD", "ALPHA_CHARACTER", 
		"DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "LIST_OUTPUT_COMMAND", "SINGLE_OUTPUT_COMMAND", 
		"IDENTIFIER", "COMMENT"
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
		case 20:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26|"+
		"\n\26\r\26\16\26}\3\26\3\26\3\27\6\27\u0083\n\27\r\27\16\27\u0084\3\27"+
		"\3\27\3\30\6\30\u008a\n\30\r\30\16\30\u008b\3\30\3\30\3\31\3\31\7\31\u0092"+
		"\n\31\f\31\16\31\u0095\13\31\3\31\3\31\3\32\5\32\u009a\n\32\3\32\3\32"+
		"\7\32\u009e\n\32\f\32\16\32\u00a1\13\32\3\32\3\32\3\33\5\33\u00a6\n\33"+
		"\3\33\3\33\7\33\u00aa\n\33\f\33\16\33\u00ad\13\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\7\34\u00b5\n\34\f\34\16\34\u00b8\13\34\3\34\3\34\3\35\3\35"+
		"\7\35\u00be\n\35\f\35\16\35\u00c1\13\35\3\35\3\35\4\u009f\u00ab\2\36\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\t"+
		"\4\2C\\c|\3\2\62;\4\2\"\"))\5\2\13\f\17\17~~\3\2\13\13\3\2$$\4\2\f\f\17"+
		"\17\u00ce\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2\2\2\rE\3\2\2"+
		"\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27O\3\2\2\2\31Q\3\2"+
		"\2\2\33T\3\2\2\2\35Z\3\2\2\2\37a\3\2\2\2!i\3\2\2\2#l\3\2\2\2%q\3\2\2\2"+
		"\'v\3\2\2\2)x\3\2\2\2+{\3\2\2\2-\u0082\3\2\2\2/\u0089\3\2\2\2\61\u008f"+
		"\3\2\2\2\63\u0099\3\2\2\2\65\u00a5\3\2\2\2\67\u00b0\3\2\2\29\u00bb\3\2"+
		"\2\2;<\7*\2\2<\4\3\2\2\2=>\7.\2\2>\6\3\2\2\2?@\7+\2\2@\b\3\2\2\2AB\7}"+
		"\2\2B\n\3\2\2\2CD\7\177\2\2D\f\3\2\2\2EF\7?\2\2F\16\3\2\2\2GH\7/\2\2H"+
		"\20\3\2\2\2IJ\7\60\2\2J\22\3\2\2\2KL\7-\2\2L\24\3\2\2\2MN\7,\2\2N\26\3"+
		"\2\2\2OP\7\61\2\2P\30\3\2\2\2QR\7?\2\2RS\7?\2\2S\32\3\2\2\2TU\7r\2\2U"+
		"V\7t\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\34\3\2\2\2Z[\7c\2\2[\\\7u\2\2\\]"+
		"\7u\2\2]^\7g\2\2^_\7t\2\2_`\7v\2\2`\36\3\2\2\2ab\7h\2\2bc\7q\2\2cd\7t"+
		"\2\2de\7g\2\2ef\7c\2\2fg\7e\2\2gh\7j\2\2h \3\2\2\2ij\7/\2\2jk\7@\2\2k"+
		"\"\3\2\2\2lm\7h\2\2mn\7w\2\2no\7p\2\2op\7e\2\2p$\3\2\2\2qr\7o\2\2rs\7"+
		"c\2\2st\7k\2\2tu\7p\2\2u&\3\2\2\2vw\t\2\2\2w(\3\2\2\2xy\t\3\2\2y*\3\2"+
		"\2\2z|\t\4\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\b\26\2\2\u0080,\3\2\2\2\u0081\u0083\t\5\2\2\u0082\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\b\27\3\2\u0087.\3\2\2\2\u0088\u008a\t\6\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\30\3\2\u008e\60\3\2\2\2\u008f\u0093"+
		"\7$\2\2\u0090\u0092\n\7\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\7$\2\2\u0097\62\3\2\2\2\u0098\u009a\7\u0080\2\2\u0099"+
		"\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009f\7]"+
		"\2\2\u009c\u009e\13\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a3\7_\2\2\u00a3\64\3\2\2\2\u00a4\u00a6\7\u0080\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ab\7>"+
		"\2\2\u00a8\u00aa\13\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00af\7@\2\2\u00af\66\3\2\2\2\u00b0\u00b1\b\34\4\2\u00b1\u00b6"+
		"\5\'\24\2\u00b2\u00b5\5\'\24\2\u00b3\u00b5\5)\25\2\u00b4\u00b2\3\2\2\2"+
		"\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\34\5\2"+
		"\u00ba8\3\2\2\2\u00bb\u00bf\7%\2\2\u00bc\u00be\n\b\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\b\35\6\2\u00c3:\3\2\2\2"+
		"\16\2}\u0084\u008b\u0093\u0099\u009f\u00a5\u00ab\u00b4\u00b6\u00bf\7\3"+
		"\26\2\b\2\2\3\34\3\3\34\4\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}