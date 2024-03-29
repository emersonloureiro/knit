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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		FUNCTION_KEYWORD=25, MAIN_KEYWORD=26, FOR_KEYWORD=27, IF_KEYWORD=28, ELSE_KEYWORD=29, 
		IN_KEYWORD=30, DO_KEYWORD=31, EXIT_KEYWORD=32, ALPHA_CHARACTER=33, DIGIT=34, 
		SPACE=35, NEWLINE=36, TAB=37, STRING=38, STANDARD_COMMAND=39, LIST_OUTPUT_COMMAND=40, 
		SINGLE_OUTPUT_COMMAND=41, IDENTIFIER=42, COMMENT=43, CLI_ARGUMENT_REFERENCE=44, 
		CLI_ARGUMENT_MARKER=45, PROCESS_EXIT_CODE_VARIABLE=46;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "FUNCTION_KEYWORD", 
			"MAIN_KEYWORD", "FOR_KEYWORD", "IF_KEYWORD", "ELSE_KEYWORD", "IN_KEYWORD", 
			"DO_KEYWORD", "EXIT_KEYWORD", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", 
			"TAB", "STRING", "STANDARD_COMMAND", "LIST_OUTPUT_COMMAND", "SINGLE_OUTPUT_COMMAND", 
			"IDENTIFIER", "COMMENT", "CLI_ARGUMENT_REFERENCE", "CLI_ARGUMENT_MARKER", 
			"PROCESS_EXIT_CODE_VARIABLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "'='", "'::'", "'-'", "'.'", 
			"'+'", "'*'", "'/'", "'=='", "'>'", "'<'", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'!'", "'?'", "'false'", "'true'", "'func'", "'main'", "'for'", 
			"'if'", "'else'", "'in'", "'do'", "'exit'", null, null, null, null, null, 
			null, null, null, null, null, null, null, "'@'", "'$?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "FUNCTION_KEYWORD", "MAIN_KEYWORD", "FOR_KEYWORD", "IF_KEYWORD", 
			"ELSE_KEYWORD", "IN_KEYWORD", "DO_KEYWORD", "EXIT_KEYWORD", "ALPHA_CHARACTER", 
			"DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "STANDARD_COMMAND", "LIST_OUTPUT_COMMAND", 
			"SINGLE_OUTPUT_COMMAND", "IDENTIFIER", "COMMENT", "CLI_ARGUMENT_REFERENCE", 
			"CLI_ARGUMENT_MARKER", "PROCESS_EXIT_CODE_VARIABLE"
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
		case 34:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0120\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\6$\u00c4\n"+
		"$\r$\16$\u00c5\3$\3$\3%\6%\u00cb\n%\r%\16%\u00cc\3%\3%\3&\6&\u00d2\n&"+
		"\r&\16&\u00d3\3&\3&\3\'\3\'\7\'\u00da\n\'\f\'\16\'\u00dd\13\'\3\'\3\'"+
		"\3(\3(\3(\3(\7(\u00e5\n(\f(\16(\u00e8\13(\3(\3(\3(\3)\3)\3)\3)\7)\u00f1"+
		"\n)\f)\16)\u00f4\13)\3)\3)\3)\3*\3*\3*\3*\6*\u00fd\n*\r*\16*\u00fe\3*"+
		"\3*\3*\3+\3+\3+\3+\3+\7+\u0109\n+\f+\16+\u010c\13+\3+\3+\3,\3,\7,\u0112"+
		"\n,\f,\16,\u0115\13,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3/\5\u00e6\u00f2\u00fe"+
		"\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\t\4\2C\\c|\3\2\62;\4\2"+
		"\"\"))\5\2\13\f\17\17~~\3\2\13\13\3\2$$\4\2\f\f\17\17\2\u012a\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7"+
		"c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21n\3\2\2\2\23"+
		"p\3\2\2\2\25r\3\2\2\2\27t\3\2\2\2\31v\3\2\2\2\33x\3\2\2\2\35{\3\2\2\2"+
		"\37}\3\2\2\2!\177\3\2\2\2#\u0082\3\2\2\2%\u0085\3\2\2\2\'\u0088\3\2\2"+
		"\2)\u008b\3\2\2\2+\u008e\3\2\2\2-\u0090\3\2\2\2/\u0092\3\2\2\2\61\u0098"+
		"\3\2\2\2\63\u009d\3\2\2\2\65\u00a2\3\2\2\2\67\u00a7\3\2\2\29\u00ab\3\2"+
		"\2\2;\u00ae\3\2\2\2=\u00b3\3\2\2\2?\u00b6\3\2\2\2A\u00b9\3\2\2\2C\u00be"+
		"\3\2\2\2E\u00c0\3\2\2\2G\u00c3\3\2\2\2I\u00ca\3\2\2\2K\u00d1\3\2\2\2M"+
		"\u00d7\3\2\2\2O\u00e0\3\2\2\2Q\u00ec\3\2\2\2S\u00f8\3\2\2\2U\u0103\3\2"+
		"\2\2W\u010f\3\2\2\2Y\u0118\3\2\2\2[\u011b\3\2\2\2]\u011d\3\2\2\2_`\7*"+
		"\2\2`\4\3\2\2\2ab\7.\2\2b\6\3\2\2\2cd\7+\2\2d\b\3\2\2\2ef\7}\2\2f\n\3"+
		"\2\2\2gh\7\177\2\2h\f\3\2\2\2ij\7?\2\2j\16\3\2\2\2kl\7<\2\2lm\7<\2\2m"+
		"\20\3\2\2\2no\7/\2\2o\22\3\2\2\2pq\7\60\2\2q\24\3\2\2\2rs\7-\2\2s\26\3"+
		"\2\2\2tu\7,\2\2u\30\3\2\2\2vw\7\61\2\2w\32\3\2\2\2xy\7?\2\2yz\7?\2\2z"+
		"\34\3\2\2\2{|\7@\2\2|\36\3\2\2\2}~\7>\2\2~ \3\2\2\2\177\u0080\7>\2\2\u0080"+
		"\u0081\7?\2\2\u0081\"\3\2\2\2\u0082\u0083\7@\2\2\u0083\u0084\7?\2\2\u0084"+
		"$\3\2\2\2\u0085\u0086\7#\2\2\u0086\u0087\7?\2\2\u0087&\3\2\2\2\u0088\u0089"+
		"\7(\2\2\u0089\u008a\7(\2\2\u008a(\3\2\2\2\u008b\u008c\7~\2\2\u008c\u008d"+
		"\7~\2\2\u008d*\3\2\2\2\u008e\u008f\7#\2\2\u008f,\3\2\2\2\u0090\u0091\7"+
		"A\2\2\u0091.\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094\u0095"+
		"\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\60\3\2\2\2\u0098\u0099"+
		"\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b\7w\2\2\u009b\u009c\7g\2\2\u009c"+
		"\62\3\2\2\2\u009d\u009e\7h\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7e\2\2\u00a1\64\3\2\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\66\3\2\2\2\u00a7\u00a8\7h\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7t\2\2\u00aa8\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac"+
		"\u00ad\7h\2\2\u00ad:\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2<\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7p\2\2\u00b5>\3\2\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7q\2\2\u00b8"+
		"@\3\2\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7z\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7v\2\2\u00bdB\3\2\2\2\u00be\u00bf\t\2\2\2\u00bfD\3\2\2\2\u00c0"+
		"\u00c1\t\3\2\2\u00c1F\3\2\2\2\u00c2\u00c4\t\4\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\b$\2\2\u00c8H\3\2\2\2\u00c9\u00cb\t\5\2\2\u00ca\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\b%\3\2\u00cfJ\3\2\2\2\u00d0\u00d2\t\6\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b&\3\2\u00d6L\3\2\2\2\u00d7\u00db"+
		"\7$\2\2\u00d8\u00da\n\7\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00df\7$\2\2\u00dfN\3\2\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e2"+
		"\7*\2\2\u00e2\u00e6\3\2\2\2\u00e3\u00e5\13\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2"+
		"\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7&\2\2\u00ea\u00eb\7+\2\2\u00ebP"+
		"\3\2\2\2\u00ec\u00ed\7&\2\2\u00ed\u00ee\7]\2\2\u00ee\u00f2\3\2\2\2\u00ef"+
		"\u00f1\13\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f3\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f6\7&\2\2\u00f6\u00f7\7_\2\2\u00f7R\3\2\2\2\u00f8\u00f9\7&\2\2\u00f9"+
		"\u00fa\7^\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\13\2\2\2\u00fc\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\7&\2\2\u0101\u0102\7^\2\2\u0102T\3\2\2\2\u0103"+
		"\u0104\b+\4\2\u0104\u010a\5C\"\2\u0105\u0109\5C\"\2\u0106\u0109\5E#\2"+
		"\u0107\u0109\7a\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\b+\5\2\u010eV\3\2\2\2\u010f"+
		"\u0113\7%\2\2\u0110\u0112\n\b\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\b,\6\2\u0117X\3\2\2\2\u0118\u0119\5[.\2\u0119"+
		"\u011a\5U+\2\u011aZ\3\2\2\2\u011b\u011c\7B\2\2\u011c\\\3\2\2\2\u011d\u011e"+
		"\7&\2\2\u011e\u011f\7A\2\2\u011f^\3\2\2\2\r\2\u00c5\u00cc\u00d3\u00db"+
		"\u00e6\u00f2\u00fe\u0108\u010a\u0113\7\3$\2\b\2\2\3+\3\3+\4\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}