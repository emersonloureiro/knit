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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		FUNCTION_KEYWORD=25, MAIN_KEYWORD=26, FOR_KEYWORD=27, IF_KEYWORD=28, ELSE_KEYWORD=29, 
		IN_KEYWORD=30, DO_KEYWORD=31, EXIT_KEYWORD=32, ALPHA_CHARACTER=33, DIGIT=34, 
		SPACE=35, NEWLINE=36, TAB=37, STRING=38, LIST_OUTPUT_COMMAND=39, SINGLE_OUTPUT_COMMAND=40, 
		IDENTIFIER=41, COMMENT=42, CLI_ARGUMENT_REFERENCE=43, CLI_ARGUMENT_MARKER=44, 
		PROCESS_EXIT_CODE_VARIABLE=45;
	public static final int
		RULE_knitProgram = 0, RULE_function = 1, RULE_mainFunction = 2, RULE_parameter = 3, 
		RULE_code = 4, RULE_programmingConstruct = 5, RULE_variableDeclaration = 6, 
		RULE_expression = 7, RULE_functionCallExpression = 8, RULE_modulePrefix = 9, 
		RULE_number = 10, RULE_argument = 11, RULE_identifier = 12, RULE_foreachDoComprehension = 13, 
		RULE_ifCondition = 14, RULE_numericalOperator = 15, RULE_mathExpression = 16, 
		RULE_numericalExpression = 17, RULE_simpleNumericalExpression = 18, RULE_enclosedNumericalExpression = 19, 
		RULE_booleanOperator = 20, RULE_booleanExpression = 21, RULE_simpleBooleanExpression = 22, 
		RULE_enclosedBooleanExpression = 23, RULE_booleanPrefix = 24, RULE_booleanSuffix = 25, 
		RULE_constant = 26, RULE_bool = 27, RULE_commandExpression = 28, RULE_listOutputCommand = 29, 
		RULE_singleOutputCommand = 30, RULE_variableReference = 31, RULE_exit = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"knitProgram", "function", "mainFunction", "parameter", "code", "programmingConstruct", 
			"variableDeclaration", "expression", "functionCallExpression", "modulePrefix", 
			"number", "argument", "identifier", "foreachDoComprehension", "ifCondition", 
			"numericalOperator", "mathExpression", "numericalExpression", "simpleNumericalExpression", 
			"enclosedNumericalExpression", "booleanOperator", "booleanExpression", 
			"simpleBooleanExpression", "enclosedBooleanExpression", "booleanPrefix", 
			"booleanSuffix", "constant", "bool", "commandExpression", "listOutputCommand", 
			"singleOutputCommand", "variableReference", "exit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "'='", "'::'", "'-'", "'.'", 
			"'+'", "'*'", "'/'", "'=='", "'>'", "'<'", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'!'", "'?'", "'false'", "'true'", "'func'", "'main'", "'for'", 
			"'if'", "'else'", "'in'", "'do'", "'exit'", null, null, null, null, null, 
			null, null, null, null, null, null, "'@'", "'$?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "FUNCTION_KEYWORD", "MAIN_KEYWORD", "FOR_KEYWORD", "IF_KEYWORD", 
			"ELSE_KEYWORD", "IN_KEYWORD", "DO_KEYWORD", "EXIT_KEYWORD", "ALPHA_CHARACTER", 
			"DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "LIST_OUTPUT_COMMAND", 
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
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					function();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(72);
			mainFunction();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_KEYWORD) {
				{
				{
				setState(73);
				function();
				}
				}
				setState(78);
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
			setState(79);
			match(FUNCTION_KEYWORD);
			setState(80);
			identifier();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(81);
				match(T__0);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(87);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(82);
							parameter();
							setState(83);
							match(T__1);
							}
							} 
						}
						setState(89);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(90);
					parameter();
					}
				}

				setState(93);
				match(T__2);
				}
			}

			setState(96);
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
			setState(98);
			match(FUNCTION_KEYWORD);
			setState(99);
			match(MAIN_KEYWORD);
			setState(100);
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
			setState(102);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_KEYWORD:
			case IF_KEYWORD:
			case EXIT_KEYWORD:
			case LIST_OUTPUT_COMMAND:
			case SINGLE_OUTPUT_COMMAND:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				programmingConstruct();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__3);
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					programmingConstruct();
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KEYWORD) | (1L << IF_KEYWORD) | (1L << EXIT_KEYWORD) | (1L << LIST_OUTPUT_COMMAND) | (1L << SINGLE_OUTPUT_COMMAND) | (1L << IDENTIFIER))) != 0) );
				setState(111);
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
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				foreachDoComprehension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				commandExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				functionCallExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				exit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				ifCondition();
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
			setState(123);
			identifier();
			setState(124);
			match(T__5);
			setState(125);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				commandExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				variableReference();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				mathExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
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
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					modulePrefix();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(140);
			identifier();
			setState(141);
			match(T__0);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << DIGIT) | (1L << STRING) | (1L << LIST_OUTPUT_COMMAND) | (1L << SINGLE_OUTPUT_COMMAND) | (1L << IDENTIFIER) | (1L << CLI_ARGUMENT_REFERENCE) | (1L << PROCESS_EXIT_CODE_VARIABLE))) != 0)) {
				{
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(142);
						expression();
						setState(143);
						match(T__1);
						}
						} 
					}
					setState(149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(150);
				expression();
				}
			}

			setState(153);
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
			setState(155);
			identifier();
			setState(156);
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
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(158);
				match(T__7);
				}
			}

			{
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				match(DIGIT);
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(166);
				match(T__8);
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					match(DIGIT);
					}
					}
					setState(170); 
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__22:
			case T__23:
			case DIGIT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				constant();
				}
				break;
			case IDENTIFIER:
			case CLI_ARGUMENT_REFERENCE:
			case PROCESS_EXIT_CODE_VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
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
			setState(178);
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
			setState(180);
			match(FOR_KEYWORD);
			setState(181);
			identifier();
			setState(182);
			match(IN_KEYWORD);
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case CLI_ARGUMENT_REFERENCE:
			case PROCESS_EXIT_CODE_VARIABLE:
				{
				setState(183);
				variableReference();
				}
				break;
			case LIST_OUTPUT_COMMAND:
				{
				setState(184);
				listOutputCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(187);
			match(DO_KEYWORD);
			setState(188);
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

	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF_KEYWORD() { return getToken(KnitLanguageParser.IF_KEYWORD, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<TerminalNode> ELSE_KEYWORD() { return getTokens(KnitLanguageParser.ELSE_KEYWORD); }
		public TerminalNode ELSE_KEYWORD(int i) {
			return getToken(KnitLanguageParser.ELSE_KEYWORD, i);
		}
		public List<IfConditionContext> ifCondition() {
			return getRuleContexts(IfConditionContext.class);
		}
		public IfConditionContext ifCondition(int i) {
			return getRuleContext(IfConditionContext.class,i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitIfCondition(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifCondition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IF_KEYWORD);
			setState(191);
			mathExpression();
			setState(192);
			code();
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					match(ELSE_KEYWORD);
					setState(194);
					ifCondition();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(200);
				match(ELSE_KEYWORD);
				setState(201);
				code();
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
		enterRule(_localctx, 30, RULE_numericalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 32, RULE_mathExpression);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				numericalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
		enterRule(_localctx, 34, RULE_numericalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(210);
				simpleNumericalExpression();
				}
				break;
			case 2:
				{
				setState(211);
				enclosedNumericalExpression();
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						numericalOperator();
						setState(213);
						numericalExpression();
						}
						} 
					}
					setState(219);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(220);
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
		enterRule(_localctx, 36, RULE_simpleNumericalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case DIGIT:
				{
				setState(223);
				number();
				}
				break;
			case IDENTIFIER:
			case CLI_ARGUMENT_REFERENCE:
			case PROCESS_EXIT_CODE_VARIABLE:
				{
				setState(224);
				variableReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(227);
			numericalOperator();
			setState(228);
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
		enterRule(_localctx, 38, RULE_enclosedNumericalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__0);
			setState(231);
			numericalExpression();
			setState(232);
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
		enterRule(_localctx, 40, RULE_booleanOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		public BooleanPrefixContext booleanPrefix() {
			return getRuleContext(BooleanPrefixContext.class,0);
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
		public BooleanSuffixContext booleanSuffix() {
			return getRuleContext(BooleanSuffixContext.class,0);
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
		enterRule(_localctx, 42, RULE_booleanExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(236);
				booleanPrefix();
				}
			}

			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(239);
				simpleBooleanExpression();
				}
				break;
			case 2:
				{
				setState(240);
				enclosedBooleanExpression();
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(241);
						booleanOperator();
						setState(242);
						booleanExpression();
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(249);
				argument();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(250);
					booleanSuffix();
					}
				}

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
		public BooleanSuffixContext booleanSuffix() {
			return getRuleContext(BooleanSuffixContext.class,0);
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
		enterRule(_localctx, 44, RULE_simpleBooleanExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			argument();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(256);
				booleanSuffix();
				}
			}

			setState(259);
			booleanOperator();
			setState(260);
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
		enterRule(_localctx, 46, RULE_enclosedBooleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__0);
			setState(263);
			booleanExpression();
			setState(264);
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

	public static class BooleanPrefixContext extends ParserRuleContext {
		public BooleanPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterBooleanPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitBooleanPrefix(this);
		}
	}

	public final BooleanPrefixContext booleanPrefix() throws RecognitionException {
		BooleanPrefixContext _localctx = new BooleanPrefixContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__20);
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

	public static class BooleanSuffixContext extends ParserRuleContext {
		public BooleanSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterBooleanSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitBooleanSuffix(this);
		}
	}

	public final BooleanSuffixContext booleanSuffix() throws RecognitionException {
		BooleanSuffixContext _localctx = new BooleanSuffixContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_booleanSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__21);
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
		enterRule(_localctx, 52, RULE_constant);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(STRING);
				}
				break;
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
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
		enterRule(_localctx, 54, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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
		enterRule(_localctx, 56, RULE_commandExpression);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST_OUTPUT_COMMAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				listOutputCommand();
				}
				break;
			case SINGLE_OUTPUT_COMMAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
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
		enterRule(_localctx, 58, RULE_listOutputCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		enterRule(_localctx, 60, RULE_singleOutputCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		public TerminalNode PROCESS_EXIT_CODE_VARIABLE() { return getToken(KnitLanguageParser.PROCESS_EXIT_CODE_VARIABLE, 0); }
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
		enterRule(_localctx, 62, RULE_variableReference);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLI_ARGUMENT_REFERENCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(CLI_ARGUMENT_REFERENCE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				identifier();
				}
				break;
			case PROCESS_EXIT_CODE_VARIABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(PROCESS_EXIT_CODE_VARIABLE);
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

	public static class ExitContext extends ParserRuleContext {
		public TerminalNode EXIT_KEYWORD() { return getToken(KnitLanguageParser.EXIT_KEYWORD, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(KnitLanguageParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(KnitLanguageParser.DIGIT, i);
		}
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitExit(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(EXIT_KEYWORD);
			setState(292); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(291);
				match(DIGIT);
				}
				}
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u012b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\5\3^\n\3\3\3\5"+
		"\3a\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\6\6n\n\6\r\6\16\6"+
		"o\3\6\3\6\5\6t\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0087\n\t\3\n\7\n\u008a\n\n\f\n\16\n\u008d\13\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u0094\n\n\f\n\16\n\u0097\13\n\3\n\5\n\u009a\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\5\f\u00a2\n\f\3\f\6\f\u00a5\n\f\r\f\16\f"+
		"\u00a6\3\f\3\f\6\f\u00ab\n\f\r\f\16\f\u00ac\5\f\u00af\n\f\3\r\3\r\5\r"+
		"\u00b3\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00bc\n\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\7\20\u00c6\n\20\f\20\16\20\u00c9\13\20"+
		"\3\20\3\20\5\20\u00cd\n\20\3\21\3\21\3\22\3\22\5\22\u00d3\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\7\23\u00da\n\23\f\23\16\23\u00dd\13\23\3\23\5\23\u00e0"+
		"\n\23\3\24\3\24\5\24\u00e4\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\5\27\u00f0\n\27\3\27\3\27\3\27\3\27\3\27\7\27\u00f7\n\27\f"+
		"\27\16\27\u00fa\13\27\3\27\3\27\5\27\u00fe\n\27\5\27\u0100\n\27\3\30\3"+
		"\30\5\30\u0104\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\5\34\u0114\n\34\3\35\3\35\3\36\3\36\5\36\u011a\n"+
		"\36\3\37\3\37\3 \3 \3!\3!\3!\5!\u0123\n!\3\"\3\"\6\"\u0127\n\"\r\"\16"+
		"\"\u0128\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@B\2\5\4\2\n\n\f\16\3\2\17\26\3\2\31\32\2\u0135\2G\3\2\2\2\4"+
		"Q\3\2\2\2\6d\3\2\2\2\bh\3\2\2\2\ns\3\2\2\2\f{\3\2\2\2\16}\3\2\2\2\20\u0086"+
		"\3\2\2\2\22\u008b\3\2\2\2\24\u009d\3\2\2\2\26\u00a1\3\2\2\2\30\u00b2\3"+
		"\2\2\2\32\u00b4\3\2\2\2\34\u00b6\3\2\2\2\36\u00c0\3\2\2\2 \u00ce\3\2\2"+
		"\2\"\u00d2\3\2\2\2$\u00df\3\2\2\2&\u00e3\3\2\2\2(\u00e8\3\2\2\2*\u00ec"+
		"\3\2\2\2,\u00ef\3\2\2\2.\u0101\3\2\2\2\60\u0108\3\2\2\2\62\u010c\3\2\2"+
		"\2\64\u010e\3\2\2\2\66\u0113\3\2\2\28\u0115\3\2\2\2:\u0119\3\2\2\2<\u011b"+
		"\3\2\2\2>\u011d\3\2\2\2@\u0122\3\2\2\2B\u0124\3\2\2\2DF\5\4\3\2ED\3\2"+
		"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\5\6\4\2KM\5\4"+
		"\3\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\3\3\2\2\2PN\3\2\2\2QR\7"+
		"\33\2\2R`\5\32\16\2S]\7\3\2\2TU\5\b\5\2UV\7\4\2\2VX\3\2\2\2WT\3\2\2\2"+
		"X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\5\b\5\2]Y\3\2\2"+
		"\2]^\3\2\2\2^_\3\2\2\2_a\7\5\2\2`S\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\n\6"+
		"\2c\5\3\2\2\2de\7\33\2\2ef\7\34\2\2fg\5\n\6\2g\7\3\2\2\2hi\5\32\16\2i"+
		"\t\3\2\2\2jt\5\f\7\2km\7\6\2\2ln\5\f\7\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2pq\3\2\2\2qr\7\7\2\2rt\3\2\2\2sj\3\2\2\2sk\3\2\2\2t\13\3\2\2"+
		"\2u|\5\16\b\2v|\5\34\17\2w|\5:\36\2x|\5\22\n\2y|\5B\"\2z|\5\36\20\2{u"+
		"\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\r\3\2\2\2"+
		"}~\5\32\16\2~\177\7\b\2\2\177\u0080\5\20\t\2\u0080\17\3\2\2\2\u0081\u0087"+
		"\5\66\34\2\u0082\u0087\5:\36\2\u0083\u0087\5@!\2\u0084\u0087\5\"\22\2"+
		"\u0085\u0087\5\22\n\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\21\3\2\2\2\u0088"+
		"\u008a\5\24\13\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\5\32\16\2\u008f\u0099\7\3\2\2\u0090\u0091\5\20\t\2\u0091\u0092"+
		"\7\4\2\2\u0092\u0094\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u009a\5\20\t\2\u0099\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\7\5\2\2\u009c\23\3\2\2\2\u009d\u009e\5\32\16"+
		"\2\u009e\u009f\7\t\2\2\u009f\25\3\2\2\2\u00a0\u00a2\7\n\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\7$\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00ae\3\2\2\2\u00a8\u00aa\7\13\2\2\u00a9\u00ab\7$\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\27\3\2\2\2\u00b0\u00b3\5\66\34\2\u00b1\u00b3\5@!\2\u00b2\u00b0\3\2\2"+
		"\2\u00b2\u00b1\3\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5\33\3"+
		"\2\2\2\u00b6\u00b7\7\35\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00bb\7 \2\2\u00b9"+
		"\u00bc\5@!\2\u00ba\u00bc\5<\37\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2"+
		"\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7!\2\2\u00be\u00bf\5\n\6\2\u00bf\35"+
		"\3\2\2\2\u00c0\u00c1\7\36\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c7\5\n\6\2"+
		"\u00c3\u00c4\7\37\2\2\u00c4\u00c6\5\36\20\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\37\2\2\u00cb\u00cd\5\n\6\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\37\3\2\2\2\u00ce\u00cf\t\2\2"+
		"\2\u00cf!\3\2\2\2\u00d0\u00d3\5$\23\2\u00d1\u00d3\5,\27\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3#\3\2\2\2\u00d4\u00e0\5&\24\2\u00d5"+
		"\u00db\5(\25\2\u00d6\u00d7\5 \21\2\u00d7\u00d8\5$\23\2\u00d8\u00da\3\2"+
		"\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5\26"+
		"\f\2\u00df\u00d4\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"%\3\2\2\2\u00e1\u00e4\5\26\f\2\u00e2\u00e4\5@!\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5 \21\2\u00e6\u00e7\5$"+
		"\23\2\u00e7\'\3\2\2\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\5$\23\2\u00ea\u00eb"+
		"\7\5\2\2\u00eb)\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed+\3\2\2\2\u00ee\u00f0"+
		"\5\62\32\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ff\3\2\2\2"+
		"\u00f1\u0100\5.\30\2\u00f2\u00f8\5\60\31\2\u00f3\u00f4\5*\26\2\u00f4\u00f5"+
		"\5,\27\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0100\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fb\u00fd\5\30\r\2\u00fc\u00fe\5\64\33\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00f1\3\2\2\2\u00ff\u00f2\3\2"+
		"\2\2\u00ff\u00fb\3\2\2\2\u0100-\3\2\2\2\u0101\u0103\5\30\r\2\u0102\u0104"+
		"\5\64\33\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2"+
		"\u0105\u0106\5*\26\2\u0106\u0107\5,\27\2\u0107/\3\2\2\2\u0108\u0109\7"+
		"\3\2\2\u0109\u010a\5,\27\2\u010a\u010b\7\5\2\2\u010b\61\3\2\2\2\u010c"+
		"\u010d\7\27\2\2\u010d\63\3\2\2\2\u010e\u010f\7\30\2\2\u010f\65\3\2\2\2"+
		"\u0110\u0114\5\26\f\2\u0111\u0114\7(\2\2\u0112\u0114\58\35\2\u0113\u0110"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\67\3\2\2\2\u0115"+
		"\u0116\t\4\2\2\u01169\3\2\2\2\u0117\u011a\5<\37\2\u0118\u011a\5> \2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a;\3\2\2\2\u011b\u011c\7)\2\2\u011c"+
		"=\3\2\2\2\u011d\u011e\7*\2\2\u011e?\3\2\2\2\u011f\u0123\7-\2\2\u0120\u0123"+
		"\5\32\16\2\u0121\u0123\7/\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0122\u0121\3\2\2\2\u0123A\3\2\2\2\u0124\u0126\7\"\2\2\u0125\u0127\7"+
		"$\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129C\3\2\2\2#GNY]`os{\u0086\u008b\u0095\u0099\u00a1\u00a6"+
		"\u00ac\u00ae\u00b2\u00bb\u00c7\u00cc\u00d2\u00db\u00df\u00e3\u00ef\u00f8"+
		"\u00fd\u00ff\u0103\u0113\u0119\u0122\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}