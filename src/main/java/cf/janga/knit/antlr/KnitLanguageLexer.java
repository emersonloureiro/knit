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
		SINGLE_OUTPUT_COMMAND=27, IDENTIFIER=28, COMMENT=29, COMPARISON_OPERATOR=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "FUNCTION_KEYWORD", "MAIN_KEYWORD", 
		"FOR_KEYWORD", "IN_KEYWORD", "DO_KEYWORD", "ALPHA_CHARACTER", "DIGIT", 
		"SPACE", "NEWLINE", "TAB", "STRING", "LIST_OUTPUT_COMMAND", "SINGLE_OUTPUT_COMMAND", 
		"IDENTIFIER", "COMMENT", "COMPARISON_OPERATOR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'{'", "'}'", "'='", "'::'", "'-'", "'.'", 
		"'+'", "'*'", "'/'", "'print'", "'assert'", "'func'", "'main'", "'for'", 
		"'in'", "'do'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "FUNCTION_KEYWORD", "MAIN_KEYWORD", "FOR_KEYWORD", "IN_KEYWORD", 
		"DO_KEYWORD", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", 
		"LIST_OUTPUT_COMMAND", "SINGLE_OUTPUT_COMMAND", "IDENTIFIER", "COMMENT", 
		"COMPARISON_OPERATOR"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\6\27\177\n\27\r\27\16\27\u0080\3\27\3\27\3\30\6\30\u0086\n\30\r\30\16"+
		"\30\u0087\3\30\3\30\3\31\6\31\u008d\n\31\r\31\16\31\u008e\3\31\3\31\3"+
		"\32\3\32\7\32\u0095\n\32\f\32\16\32\u0098\13\32\3\32\3\32\3\33\3\33\7"+
		"\33\u009e\n\33\f\33\16\33\u00a1\13\33\3\33\3\33\3\34\3\34\7\34\u00a7\n"+
		"\34\f\34\16\34\u00aa\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u00b3"+
		"\n\35\f\35\16\35\u00b6\13\35\3\35\3\35\3\36\3\36\7\36\u00bc\n\36\f\36"+
		"\16\36\u00bf\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u00cc\n\37\4\u009f\u00a8\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\n\4\2C\\c|\3\2\62;\4\2\"\""+
		"))\5\2\13\f\17\17~~\3\2\13\13\3\2$$\4\2\f\f\17\17\4\2>>@@\u00da\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2\r"+
		"I\3\2\2\2\17K\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2"+
		"\31V\3\2\2\2\33X\3\2\2\2\35^\3\2\2\2\37e\3\2\2\2!j\3\2\2\2#o\3\2\2\2%"+
		"s\3\2\2\2\'v\3\2\2\2)y\3\2\2\2+{\3\2\2\2-~\3\2\2\2/\u0085\3\2\2\2\61\u008c"+
		"\3\2\2\2\63\u0092\3\2\2\2\65\u009b\3\2\2\2\67\u00a4\3\2\2\29\u00ad\3\2"+
		"\2\2;\u00b9\3\2\2\2=\u00cb\3\2\2\2?@\7*\2\2@\4\3\2\2\2AB\7.\2\2B\6\3\2"+
		"\2\2CD\7+\2\2D\b\3\2\2\2EF\7}\2\2F\n\3\2\2\2GH\7\177\2\2H\f\3\2\2\2IJ"+
		"\7?\2\2J\16\3\2\2\2KL\7<\2\2LM\7<\2\2M\20\3\2\2\2NO\7/\2\2O\22\3\2\2\2"+
		"PQ\7\60\2\2Q\24\3\2\2\2RS\7-\2\2S\26\3\2\2\2TU\7,\2\2U\30\3\2\2\2VW\7"+
		"\61\2\2W\32\3\2\2\2XY\7r\2\2YZ\7t\2\2Z[\7k\2\2[\\\7p\2\2\\]\7v\2\2]\34"+
		"\3\2\2\2^_\7c\2\2_`\7u\2\2`a\7u\2\2ab\7g\2\2bc\7t\2\2cd\7v\2\2d\36\3\2"+
		"\2\2ef\7h\2\2fg\7w\2\2gh\7p\2\2hi\7e\2\2i \3\2\2\2jk\7o\2\2kl\7c\2\2l"+
		"m\7k\2\2mn\7p\2\2n\"\3\2\2\2op\7h\2\2pq\7q\2\2qr\7t\2\2r$\3\2\2\2st\7"+
		"k\2\2tu\7p\2\2u&\3\2\2\2vw\7f\2\2wx\7q\2\2x(\3\2\2\2yz\t\2\2\2z*\3\2\2"+
		"\2{|\t\3\2\2|,\3\2\2\2}\177\t\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\27\2\2"+
		"\u0083.\3\2\2\2\u0084\u0086\t\5\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\b\30\3\2\u008a\60\3\2\2\2\u008b\u008d\t\6\2\2\u008c\u008b\3\2\2"+
		"\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\b\31\3\2\u0091\62\3\2\2\2\u0092\u0096\7$\2\2\u0093"+
		"\u0095\n\7\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\7$\2\2\u009a\64\3\2\2\2\u009b\u009f\7]\2\2\u009c\u009e\13\2\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7_\2\2\u00a3"+
		"\66\3\2\2\2\u00a4\u00a8\7^\2\2\u00a5\u00a7\13\2\2\2\u00a6\u00a5\3\2\2"+
		"\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7^\2\2\u00ac8\3\2\2\2\u00ad\u00ae"+
		"\b\35\4\2\u00ae\u00b4\5)\25\2\u00af\u00b3\5)\25\2\u00b0\u00b3\5+\26\2"+
		"\u00b1\u00b3\7a\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\35\5\2\u00b8:\3\2\2\2"+
		"\u00b9\u00bd\7%\2\2\u00ba\u00bc\n\b\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\b\36\6\2\u00c1<\3\2\2\2\u00c2\u00c3\7?\2\2"+
		"\u00c3\u00cc\7?\2\2\u00c4\u00cc\t\t\2\2\u00c5\u00c6\7>\2\2\u00c6\u00cc"+
		"\7?\2\2\u00c7\u00c8\7@\2\2\u00c8\u00cc\7?\2\2\u00c9\u00ca\7#\2\2\u00ca"+
		"\u00cc\7?\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c4\3\2\2\2\u00cb\u00c5\3\2"+
		"\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc>\3\2\2\2\r\2\u0080"+
		"\u0087\u008e\u0096\u009f\u00a8\u00b2\u00b4\u00bd\u00cb\7\3\27\2\b\2\2"+
		"\3\35\3\3\35\4\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}