// Generated from KnitLanguage.g4 by ANTLR 4.9
package cf.janga.knit.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KnitLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, FUNCTION_KEYWORD=23, 
		MAIN_KEYWORD=24, FOR_KEYWORD=25, IN_KEYWORD=26, DO_KEYWORD=27, ALPHA_CHARACTER=28, 
		DIGIT=29, SPACE=30, NEWLINE=31, TAB=32, STRING=33, LIST_OUTPUT_COMMAND=34, 
		SINGLE_OUTPUT_COMMAND=35, IDENTIFIER=36, COMMENT=37, CLI_ARGUMENT_REFERENCE=38, 
		CLI_ARGUMENT_MARKER=39;
	public static final int
		RULE_knitProgram = 0, RULE_function = 1, RULE_mainFunction = 2, RULE_parameter = 3, 
		RULE_code = 4, RULE_programmingConstruct = 5, RULE_variableDeclaration = 6, 
		RULE_expression = 7, RULE_functionCallExpression = 8, RULE_modulePrefix = 9, 
		RULE_number = 10, RULE_argument = 11, RULE_identifier = 12, RULE_foreachDoComprehension = 13, 
		RULE_numericalOperator = 14, RULE_mathExpression = 15, RULE_numericalExpression = 16, 
		RULE_simpleNumericalExpression = 17, RULE_enclosedNumericalExpression = 18, 
		RULE_booleanOperator = 19, RULE_booleanExpression = 20, RULE_simpleBooleanExpression = 21, 
		RULE_enclosedBooleanExpression = 22, RULE_constant = 23, RULE_bool = 24, 
		RULE_commandExpression = 25, RULE_listOutputCommand = 26, RULE_singleOutputCommand = 27, 
		RULE_variableReference = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"knitProgram", "function", "mainFunction", "parameter", "code", "programmingConstruct", 
			"variableDeclaration", "expression", "functionCallExpression", "modulePrefix", 
			"number", "argument", "identifier", "foreachDoComprehension", "numericalOperator", 
			"mathExpression", "numericalExpression", "simpleNumericalExpression", 
			"enclosedNumericalExpression", "booleanOperator", "booleanExpression", 
			"simpleBooleanExpression", "enclosedBooleanExpression", "constant", "bool", 
			"commandExpression", "listOutputCommand", "singleOutputCommand", "variableReference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "'='", "'::'", "'-'", "'.'", 
			"'+'", "'*'", "'/'", "'=='", "'>'", "'<'", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'false'", "'true'", "'func'", "'main'", "'for'", "'in'", "'do'", 
			null, null, null, null, null, null, null, null, null, null, null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "FUNCTION_KEYWORD", 
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

	@Override
	public String getGrammarFileName() { return "KnitLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private boolean skipSpace = true;

	public KnitLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class KnitProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public KnitProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knitProgram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterKnitProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitKnitProgram(this);
		}
	}

	public final KnitProgramContext knitProgram() throws RecognitionException {
		KnitProgramContext _localctx = new KnitProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_knitProgram);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					function();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(64);
			mainFunction();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_KEYWORD) {
				{
				{
				setState(65);
				function();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION_KEYWORD() { return getToken(KnitLanguageParser.FUNCTION_KEYWORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(FUNCTION_KEYWORD);
			setState(72);
			identifier();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(73);
				match(T__0);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(74);
							parameter();
							setState(75);
							match(T__1);
							}
							} 
						}
						setState(81);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(82);
					parameter();
					}
				}

				setState(85);
				match(T__2);
				}
			}

			setState(88);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION_KEYWORD() { return getToken(KnitLanguageParser.FUNCTION_KEYWORD, 0); }
		public TerminalNode MAIN_KEYWORD() { return getToken(KnitLanguageParser.MAIN_KEYWORD, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitMainFunction(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(FUNCTION_KEYWORD);
			setState(91);
			match(MAIN_KEYWORD);
			setState(92);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public List<ProgrammingConstructContext> programmingConstruct() {
			return getRuleContexts(ProgrammingConstructContext.class);
		}
		public ProgrammingConstructContext programmingConstruct(int i) {
			return getRuleContext(ProgrammingConstructContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_code);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_KEYWORD:
			case LIST_OUTPUT_COMMAND:
			case SINGLE_OUTPUT_COMMAND:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				programmingConstruct();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__3);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					programmingConstruct();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KEYWORD) | (1L << LIST_OUTPUT_COMMAND) | (1L << SINGLE_OUTPUT_COMMAND) | (1L << IDENTIFIER))) != 0) );
				setState(103);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgrammingConstructContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ForeachDoComprehensionContext foreachDoComprehension() {
			return getRuleContext(ForeachDoComprehensionContext.class,0);
		}
		public CommandExpressionContext commandExpression() {
			return getRuleContext(CommandExpressionContext.class,0);
		}
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public ProgrammingConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programmingConstruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterProgrammingConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitProgrammingConstruct(this);
		}
	}

	public final ProgrammingConstructContext programmingConstruct() throws RecognitionException {
		ProgrammingConstructContext _localctx = new ProgrammingConstructContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_programmingConstruct);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				foreachDoComprehension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				commandExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				functionCallExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			identifier();
			setState(114);
			match(T__5);
			setState(115);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public CommandExpressionContext commandExpression() {
			return getRuleContext(CommandExpressionContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				commandExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				variableReference();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				mathExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				functionCallExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ModulePrefixContext> modulePrefix() {
			return getRuleContexts(ModulePrefixContext.class);
		}
		public ModulePrefixContext modulePrefix(int i) {
			return getRuleContext(ModulePrefixContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitFunctionCallExpression(this);
		}
	}

	public final FunctionCallExpressionContext functionCallExpression() throws RecognitionException {
		FunctionCallExpressionContext _localctx = new FunctionCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCallExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					modulePrefix();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(130);
			identifier();
			setState(131);
			match(T__0);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__20) | (1L << T__21) | (1L << DIGIT) | (1L << STRING) | (1L << LIST_OUTPUT_COMMAND) | (1L << SINGLE_OUTPUT_COMMAND) | (1L << IDENTIFIER) | (1L << CLI_ARGUMENT_REFERENCE))) != 0)) {
				{
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						expression();
						setState(133);
						match(T__1);
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(140);
				expression();
				}
			}

			setState(143);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModulePrefixContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ModulePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterModulePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitModulePrefix(this);
		}
	}

	public final ModulePrefixContext modulePrefix() throws RecognitionException {
		ModulePrefixContext _localctx = new ModulePrefixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modulePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			identifier();
			setState(146);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(KnitLanguageParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(KnitLanguageParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(148);
				match(T__7);
				}
			}

			{
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				match(DIGIT);
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(156);
				match(T__8);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					match(DIGIT);
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argument);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__20:
			case T__21:
			case DIGIT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				constant();
				}
				break;
			case IDENTIFIER:
			case CLI_ARGUMENT_REFERENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				variableReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KnitLanguageParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachDoComprehensionContext extends ParserRuleContext {
		public TerminalNode FOR_KEYWORD() { return getToken(KnitLanguageParser.FOR_KEYWORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN_KEYWORD() { return getToken(KnitLanguageParser.IN_KEYWORD, 0); }
		public TerminalNode DO_KEYWORD() { return getToken(KnitLanguageParser.DO_KEYWORD, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public ListOutputCommandContext listOutputCommand() {
			return getRuleContext(ListOutputCommandContext.class,0);
		}
		public ForeachDoComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachDoComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterForeachDoComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitForeachDoComprehension(this);
		}
	}

	public final ForeachDoComprehensionContext foreachDoComprehension() throws RecognitionException {
		ForeachDoComprehensionContext _localctx = new ForeachDoComprehensionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_foreachDoComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(FOR_KEYWORD);
			setState(171);
			identifier();
			setState(172);
			match(IN_KEYWORD);
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case CLI_ARGUMENT_REFERENCE:
				{
				setState(173);
				variableReference();
				}
				break;
			case LIST_OUTPUT_COMMAND:
				{
				setState(174);
				listOutputCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(177);
			match(DO_KEYWORD);
			setState(178);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericalOperatorContext extends ParserRuleContext {
		public NumericalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterNumericalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitNumericalOperator(this);
		}
	}

	public final NumericalOperatorContext numericalOperator() throws RecognitionException {
		NumericalOperatorContext _localctx = new NumericalOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numericalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathExpressionContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitMathExpression(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mathExpression);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				numericalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				booleanExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericalExpressionContext extends ParserRuleContext {
		public SimpleNumericalExpressionContext simpleNumericalExpression() {
			return getRuleContext(SimpleNumericalExpressionContext.class,0);
		}
		public EnclosedNumericalExpressionContext enclosedNumericalExpression() {
			return getRuleContext(EnclosedNumericalExpressionContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<NumericalOperatorContext> numericalOperator() {
			return getRuleContexts(NumericalOperatorContext.class);
		}
		public NumericalOperatorContext numericalOperator(int i) {
			return getRuleContext(NumericalOperatorContext.class,i);
		}
		public List<NumericalExpressionContext> numericalExpression() {
			return getRuleContexts(NumericalExpressionContext.class);
		}
		public NumericalExpressionContext numericalExpression(int i) {
			return getRuleContext(NumericalExpressionContext.class,i);
		}
		public NumericalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterNumericalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitNumericalExpression(this);
		}
	}

	public final NumericalExpressionContext numericalExpression() throws RecognitionException {
		NumericalExpressionContext _localctx = new NumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numericalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(186);
				simpleNumericalExpression();
				}
				break;
			case 2:
				{
				setState(187);
				enclosedNumericalExpression();
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(188);
						numericalOperator();
						setState(189);
						numericalExpression();
						}
						} 
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(196);
				number();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleNumericalExpressionContext extends ParserRuleContext {
		public NumericalOperatorContext numericalOperator() {
			return getRuleContext(NumericalOperatorContext.class,0);
		}
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public SimpleNumericalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleNumericalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterSimpleNumericalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitSimpleNumericalExpression(this);
		}
	}

	public final SimpleNumericalExpressionContext simpleNumericalExpression() throws RecognitionException {
		SimpleNumericalExpressionContext _localctx = new SimpleNumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleNumericalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case DIGIT:
				{
				setState(199);
				number();
				}
				break;
			case IDENTIFIER:
			case CLI_ARGUMENT_REFERENCE:
				{
				setState(200);
				variableReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			numericalOperator();
			setState(204);
			numericalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedNumericalExpressionContext extends ParserRuleContext {
		public NumericalExpressionContext numericalExpression() {
			return getRuleContext(NumericalExpressionContext.class,0);
		}
		public EnclosedNumericalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedNumericalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterEnclosedNumericalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitEnclosedNumericalExpression(this);
		}
	}

	public final EnclosedNumericalExpressionContext enclosedNumericalExpression() throws RecognitionException {
		EnclosedNumericalExpressionContext _localctx = new EnclosedNumericalExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enclosedNumericalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__0);
			setState(207);
			numericalExpression();
			setState(208);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanOperatorContext extends ParserRuleContext {
		public BooleanOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterBooleanOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitBooleanOperator(this);
		}
	}

	public final BooleanOperatorContext booleanOperator() throws RecognitionException {
		BooleanOperatorContext _localctx = new BooleanOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public SimpleBooleanExpressionContext simpleBooleanExpression() {
			return getRuleContext(SimpleBooleanExpressionContext.class,0);
		}
		public EnclosedBooleanExpressionContext enclosedBooleanExpression() {
			return getRuleContext(EnclosedBooleanExpressionContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public List<BooleanOperatorContext> booleanOperator() {
			return getRuleContexts(BooleanOperatorContext.class);
		}
		public BooleanOperatorContext booleanOperator(int i) {
			return getRuleContext(BooleanOperatorContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitBooleanExpression(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_booleanExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(212);
				simpleBooleanExpression();
				}
				break;
			case 2:
				{
				setState(213);
				enclosedBooleanExpression();
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214);
						booleanOperator();
						setState(215);
						booleanExpression();
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(222);
				argument();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleBooleanExpressionContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public BooleanOperatorContext booleanOperator() {
			return getRuleContext(BooleanOperatorContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public SimpleBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleBooleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterSimpleBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitSimpleBooleanExpression(this);
		}
	}

	public final SimpleBooleanExpressionContext simpleBooleanExpression() throws RecognitionException {
		SimpleBooleanExpressionContext _localctx = new SimpleBooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleBooleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			argument();
			setState(226);
			booleanOperator();
			setState(227);
			booleanExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedBooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public EnclosedBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedBooleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterEnclosedBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitEnclosedBooleanExpression(this);
		}
	}

	public final EnclosedBooleanExpressionContext enclosedBooleanExpression() throws RecognitionException {
		EnclosedBooleanExpressionContext _localctx = new EnclosedBooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enclosedBooleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__0);
			setState(230);
			booleanExpression();
			setState(231);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KnitLanguageParser.STRING, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constant);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(STRING);
				}
				break;
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandExpressionContext extends ParserRuleContext {
		public ListOutputCommandContext listOutputCommand() {
			return getRuleContext(ListOutputCommandContext.class,0);
		}
		public SingleOutputCommandContext singleOutputCommand() {
			return getRuleContext(SingleOutputCommandContext.class,0);
		}
		public CommandExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterCommandExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitCommandExpression(this);
		}
	}

	public final CommandExpressionContext commandExpression() throws RecognitionException {
		CommandExpressionContext _localctx = new CommandExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_commandExpression);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST_OUTPUT_COMMAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				listOutputCommand();
				}
				break;
			case SINGLE_OUTPUT_COMMAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				singleOutputCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListOutputCommandContext extends ParserRuleContext {
		public TerminalNode LIST_OUTPUT_COMMAND() { return getToken(KnitLanguageParser.LIST_OUTPUT_COMMAND, 0); }
		public ListOutputCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOutputCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterListOutputCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitListOutputCommand(this);
		}
	}

	public final ListOutputCommandContext listOutputCommand() throws RecognitionException {
		ListOutputCommandContext _localctx = new ListOutputCommandContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listOutputCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(LIST_OUTPUT_COMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleOutputCommandContext extends ParserRuleContext {
		public TerminalNode SINGLE_OUTPUT_COMMAND() { return getToken(KnitLanguageParser.SINGLE_OUTPUT_COMMAND, 0); }
		public SingleOutputCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleOutputCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterSingleOutputCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitSingleOutputCommand(this);
		}
	}

	public final SingleOutputCommandContext singleOutputCommand() throws RecognitionException {
		SingleOutputCommandContext _localctx = new SingleOutputCommandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_singleOutputCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(SINGLE_OUTPUT_COMMAND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode CLI_ARGUMENT_REFERENCE() { return getToken(KnitLanguageParser.CLI_ARGUMENT_REFERENCE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitVariableReference(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableReference);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLI_ARGUMENT_REFERENCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(CLI_ARGUMENT_REFERENCE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3P"+
		"\n\3\f\3\16\3S\13\3\3\3\5\3V\n\3\3\3\5\3Y\n\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\6\6f\n\6\r\6\16\6g\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3"+
		"\7\5\7r\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\7\n\u0080"+
		"\n\n\f\n\16\n\u0083\13\n\3\n\3\n\3\n\3\n\3\n\7\n\u008a\n\n\f\n\16\n\u008d"+
		"\13\n\3\n\5\n\u0090\n\n\3\n\3\n\3\13\3\13\3\13\3\f\5\f\u0098\n\f\3\f\6"+
		"\f\u009b\n\f\r\f\16\f\u009c\3\f\3\f\6\f\u00a1\n\f\r\f\16\f\u00a2\5\f\u00a5"+
		"\n\f\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b2"+
		"\n\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u00bb\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00c2\n\22\f\22\16\22\u00c5\13\22\3\22\5\22\u00c8\n\22"+
		"\3\23\3\23\5\23\u00cc\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u00dc\n\26\f\26\16\26\u00df\13\26\3\26"+
		"\5\26\u00e2\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\5\31\u00ef\n\31\3\32\3\32\3\33\3\33\5\33\u00f5\n\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\5\36\u00fd\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:\2\5\4\2\n\n\f\16\3\2\17\26\3\2\27\30"+
		"\2\u0104\2?\3\2\2\2\4I\3\2\2\2\6\\\3\2\2\2\b`\3\2\2\2\nk\3\2\2\2\fq\3"+
		"\2\2\2\16s\3\2\2\2\20|\3\2\2\2\22\u0081\3\2\2\2\24\u0093\3\2\2\2\26\u0097"+
		"\3\2\2\2\30\u00a8\3\2\2\2\32\u00aa\3\2\2\2\34\u00ac\3\2\2\2\36\u00b6\3"+
		"\2\2\2 \u00ba\3\2\2\2\"\u00c7\3\2\2\2$\u00cb\3\2\2\2&\u00d0\3\2\2\2(\u00d4"+
		"\3\2\2\2*\u00e1\3\2\2\2,\u00e3\3\2\2\2.\u00e7\3\2\2\2\60\u00ee\3\2\2\2"+
		"\62\u00f0\3\2\2\2\64\u00f4\3\2\2\2\66\u00f6\3\2\2\28\u00f8\3\2\2\2:\u00fc"+
		"\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A"+
		"?\3\2\2\2BF\5\6\4\2CE\5\4\3\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"G\3\3\2\2\2HF\3\2\2\2IJ\7\31\2\2JX\5\32\16\2KU\7\3\2\2LM\5\b\5\2MN\7\4"+
		"\2\2NP\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2"+
		"\2\2TV\5\b\5\2UQ\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\5\2\2XK\3\2\2\2XY\3\2"+
		"\2\2YZ\3\2\2\2Z[\5\n\6\2[\5\3\2\2\2\\]\7\31\2\2]^\7\32\2\2^_\5\n\6\2_"+
		"\7\3\2\2\2`a\5\32\16\2a\t\3\2\2\2bl\5\f\7\2ce\7\6\2\2df\5\f\7\2ed\3\2"+
		"\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\7\2\2jl\3\2\2\2kb\3\2"+
		"\2\2kc\3\2\2\2l\13\3\2\2\2mr\5\16\b\2nr\5\34\17\2or\5\64\33\2pr\5\22\n"+
		"\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\r\3\2\2\2st\5\32\16\2tu\7"+
		"\b\2\2uv\5\20\t\2v\17\3\2\2\2w}\5\60\31\2x}\5\64\33\2y}\5:\36\2z}\5 \21"+
		"\2{}\5\22\n\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\21\3"+
		"\2\2\2~\u0080\5\24\13\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2"+
		"\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\5\32\16\2\u0085\u008f\7\3\2\2\u0086\u0087\5\20\t\2\u0087\u0088"+
		"\7\4\2\2\u0088\u008a\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0090\5\20\t\2\u008f\u008b\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\7\5\2\2\u0092\23\3\2\2\2\u0093\u0094\5\32\16"+
		"\2\u0094\u0095\7\t\2\2\u0095\25\3\2\2\2\u0096\u0098\7\n\2\2\u0097\u0096"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\7\37\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u00a4\3\2\2\2\u009e\u00a0\7\13\2\2\u009f\u00a1\7\37\2\2"+
		"\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\27\3\2\2\2\u00a6\u00a9\5\60\31\2\u00a7\u00a9\5:\36\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\7&\2\2\u00ab\33"+
		"\3\2\2\2\u00ac\u00ad\7\33\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00b1\7\34\2"+
		"\2\u00af\u00b2\5:\36\2\u00b0\u00b2\5\66\34\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\35\2\2\u00b4\u00b5\5"+
		"\n\6\2\u00b5\35\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\37\3\2\2\2\u00b8\u00bb"+
		"\5\"\22\2\u00b9\u00bb\5*\26\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2"+
		"\u00bb!\3\2\2\2\u00bc\u00c8\5$\23\2\u00bd\u00c3\5&\24\2\u00be\u00bf\5"+
		"\36\20\2\u00bf\u00c0\5\"\22\2\u00c0\u00c2\3\2\2\2\u00c1\u00be\3\2\2\2"+
		"\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\5\26\f\2\u00c7\u00bc\3\2\2\2"+
		"\u00c7\u00bd\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00cc\5"+
		"\26\f\2\u00ca\u00cc\5:\36\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\5\36\20\2\u00ce\u00cf\5\"\22\2\u00cf%\3\2\2"+
		"\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\5\"\22\2\u00d2\u00d3\7\5\2\2\u00d3"+
		"\'\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5)\3\2\2\2\u00d6\u00e2\5,\27\2\u00d7"+
		"\u00dd\5.\30\2\u00d8\u00d9\5(\25\2\u00d9\u00da\5*\26\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00e2\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\5\30"+
		"\r\2\u00e1\u00d6\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"+\3\2\2\2\u00e3\u00e4\5\30\r\2\u00e4\u00e5\5(\25\2\u00e5\u00e6\5*\26\2"+
		"\u00e6-\3\2\2\2\u00e7\u00e8\7\3\2\2\u00e8\u00e9\5*\26\2\u00e9\u00ea\7"+
		"\5\2\2\u00ea/\3\2\2\2\u00eb\u00ef\5\26\f\2\u00ec\u00ef\7#\2\2\u00ed\u00ef"+
		"\5\62\32\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\61\3\2\2\2\u00f0\u00f1\t\4\2\2\u00f1\63\3\2\2\2\u00f2\u00f5\5\66"+
		"\34\2\u00f3\u00f5\58\35\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\65\3\2\2\2\u00f6\u00f7\7$\2\2\u00f7\67\3\2\2\2\u00f8\u00f9\7%\2\2\u00f9"+
		"9\3\2\2\2\u00fa\u00fd\7(\2\2\u00fb\u00fd\5\32\16\2\u00fc\u00fa\3\2\2\2"+
		"\u00fc\u00fb\3\2\2\2\u00fd;\3\2\2\2\35?FQUXgkq|\u0081\u008b\u008f\u0097"+
		"\u009c\u00a2\u00a4\u00a8\u00b1\u00ba\u00c3\u00c7\u00cb\u00dd\u00e1\u00ee"+
		"\u00f4\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}