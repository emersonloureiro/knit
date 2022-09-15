// Generated from KnitLanguage.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, FUNCTION_KEYWORD=21, MAIN_KEYWORD=22, FOR_KEYWORD=23, 
		IN_KEYWORD=24, DO_KEYWORD=25, ALPHA_CHARACTER=26, DIGIT=27, SPACE=28, 
		NEWLINE=29, TAB=30, STRING=31, LIST_OUTPUT_COMMAND=32, SINGLE_OUTPUT_COMMAND=33, 
		IDENTIFIER=34, COMMENT=35, CLI_ARGUMENT_REFERENCE=36, CLI_ARGUMENT_MARKER=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "FUNCTION_KEYWORD", "MAIN_KEYWORD", "FOR_KEYWORD", 
			"IN_KEYWORD", "DO_KEYWORD", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", 
			"TAB", "STRING", "LIST_OUTPUT_COMMAND", "SINGLE_OUTPUT_COMMAND", "IDENTIFIER", 
			"COMMENT", "CLI_ARGUMENT_REFERENCE", "CLI_ARGUMENT_MARKER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "'='", "'::'", "'-'", "'.'", 
			"'+'", "'*'", "'/'", "'=='", "'>'", "'<'", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'func'", "'main'", "'for'", "'in'", "'do'", null, null, null, 
			null, null, null, null, null, null, null, null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "FUNCTION_KEYWORD", 
			"MAIN_KEYWORD", "FOR_KEYWORD", "IN_KEYWORD", "DO_KEYWORD", "ALPHA_CHARACTER", 
			"DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "LIST_OUTPUT_COMMAND", 
			"SINGLE_OUTPUT_COMMAND", "IDENTIFIER", "COMMENT", "CLI_ARGUMENT_REFERENCE", 
			"CLI_ARGUMENT_MARKER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\6\35\u0096\n\35\r\35\16\35\u0097\3\35\3\35\3\36"+
		"\6\36\u009d\n\36\r\36\16\36\u009e\3\36\3\36\3\37\6\37\u00a4\n\37\r\37"+
		"\16\37\u00a5\3\37\3\37\3 \3 \7 \u00ac\n \f \16 \u00af\13 \3 \3 \3!\3!"+
		"\7!\u00b5\n!\f!\16!\u00b8\13!\3!\3!\3\"\3\"\7\"\u00be\n\"\f\"\16\"\u00c1"+
		"\13\"\3\"\3\"\3#\3#\3#\3#\3#\7#\u00ca\n#\f#\16#\u00cd\13#\3#\3#\3$\3$"+
		"\7$\u00d3\n$\f$\16$\u00d6\13$\3$\3$\3%\3%\3%\3&\3&\4\u00b6\u00bf\2\'\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'\3\2\t\4\2C\\c|\3\2\62;\4\2\"\"))\5\2\13\f\17\17~~\3"+
		"\2\13\13\3\2$$\4\2\f\f\17\17\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2"+
		"\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21"+
		"\\\3\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27b\3\2\2\2\31d\3\2\2\2\33f\3\2\2\2"+
		"\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#p\3\2\2\2%s\3\2\2\2\'v\3\2\2\2)y\3"+
		"\2\2\2+|\3\2\2\2-\u0081\3\2\2\2/\u0086\3\2\2\2\61\u008a\3\2\2\2\63\u008d"+
		"\3\2\2\2\65\u0090\3\2\2\2\67\u0092\3\2\2\29\u0095\3\2\2\2;\u009c\3\2\2"+
		"\2=\u00a3\3\2\2\2?\u00a9\3\2\2\2A\u00b2\3\2\2\2C\u00bb\3\2\2\2E\u00c4"+
		"\3\2\2\2G\u00d0\3\2\2\2I\u00d9\3\2\2\2K\u00dc\3\2\2\2MN\7*\2\2N\4\3\2"+
		"\2\2OP\7.\2\2P\6\3\2\2\2QR\7+\2\2R\b\3\2\2\2ST\7}\2\2T\n\3\2\2\2UV\7\177"+
		"\2\2V\f\3\2\2\2WX\7?\2\2X\16\3\2\2\2YZ\7<\2\2Z[\7<\2\2[\20\3\2\2\2\\]"+
		"\7/\2\2]\22\3\2\2\2^_\7\60\2\2_\24\3\2\2\2`a\7-\2\2a\26\3\2\2\2bc\7,\2"+
		"\2c\30\3\2\2\2de\7\61\2\2e\32\3\2\2\2fg\7?\2\2gh\7?\2\2h\34\3\2\2\2ij"+
		"\7@\2\2j\36\3\2\2\2kl\7>\2\2l \3\2\2\2mn\7>\2\2no\7?\2\2o\"\3\2\2\2pq"+
		"\7@\2\2qr\7?\2\2r$\3\2\2\2st\7#\2\2tu\7?\2\2u&\3\2\2\2vw\7(\2\2wx\7(\2"+
		"\2x(\3\2\2\2yz\7~\2\2z{\7~\2\2{*\3\2\2\2|}\7h\2\2}~\7w\2\2~\177\7p\2\2"+
		"\177\u0080\7e\2\2\u0080,\3\2\2\2\u0081\u0082\7o\2\2\u0082\u0083\7c\2\2"+
		"\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085.\3\2\2\2\u0086\u0087\7h\2"+
		"\2\u0087\u0088\7q\2\2\u0088\u0089\7t\2\2\u0089\60\3\2\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7p\2\2\u008c\62\3\2\2\2\u008d\u008e\7f\2\2\u008e\u008f"+
		"\7q\2\2\u008f\64\3\2\2\2\u0090\u0091\t\2\2\2\u0091\66\3\2\2\2\u0092\u0093"+
		"\t\3\2\2\u00938\3\2\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009a\b\35\2\2\u009a:\3\2\2\2\u009b\u009d\t\5\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\b\36\3\2\u00a1<\3\2\2\2\u00a2\u00a4\t\6\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\37\3\2\u00a8>\3\2\2\2\u00a9"+
		"\u00ad\7$\2\2\u00aa\u00ac\n\7\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1@\3\2\2\2\u00b2\u00b6\7]\2\2\u00b3"+
		"\u00b5\13\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\7_\2\2\u00baB\3\2\2\2\u00bb\u00bf\7^\2\2\u00bc\u00be\13\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7^\2\2\u00c3"+
		"D\3\2\2\2\u00c4\u00c5\b#\4\2\u00c5\u00cb\5\65\33\2\u00c6\u00ca\5\65\33"+
		"\2\u00c7\u00ca\5\67\34\2\u00c8\u00ca\7a\2\2\u00c9\u00c6\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\b#\5\2\u00cfF\3\2\2\2\u00d0\u00d4\7%\2\2\u00d1\u00d3\n\b\2\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\b$\6\2\u00d8"+
		"H\3\2\2\2\u00d9\u00da\5K&\2\u00da\u00db\5E#\2\u00dbJ\3\2\2\2\u00dc\u00dd"+
		"\7B\2\2\u00ddL\3\2\2\2\f\2\u0097\u009e\u00a5\u00ad\u00b6\u00bf\u00c9\u00cb"+
		"\u00d4\7\3\35\2\b\2\2\3#\3\3#\4\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}