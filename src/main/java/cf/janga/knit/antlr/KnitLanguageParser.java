// Generated from KnitLanguage.g4 by ANTLR 4.5
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
	public static final int
		RULE_knitProgram = 0, RULE_function = 1, RULE_mainFunction = 2, RULE_functionBody = 3, 
		RULE_parameter = 4, RULE_code = 5, RULE_programmingConstruct = 6, RULE_variableDeclaration = 7, 
		RULE_expression = 8, RULE_functionCallExpression = 9, RULE_modulePrefix = 10, 
		RULE_number = 11, RULE_argument = 12, RULE_identifier = 13, RULE_systemFunctions = 14, 
		RULE_foreachDoComprehension = 15, RULE_mathOperator = 16, RULE_simpleMathExpression = 17, 
		RULE_enclosedMathExpression = 18, RULE_complexMathExpression = 19, RULE_booleanExpression = 20, 
		RULE_constant = 21, RULE_commandExpression = 22, RULE_listOutputCommand = 23, 
		RULE_singleOutputCommand = 24, RULE_variableReference = 25, RULE_print = 26, 
		RULE_assertion = 27;
	public static final String[] ruleNames = {
		"knitProgram", "function", "mainFunction", "functionBody", "parameter", 
		"code", "programmingConstruct", "variableDeclaration", "expression", "functionCallExpression", 
		"modulePrefix", "number", "argument", "identifier", "systemFunctions", 
		"foreachDoComprehension", "mathOperator", "simpleMathExpression", "enclosedMathExpression", 
		"complexMathExpression", "booleanExpression", "constant", "commandExpression", 
		"listOutputCommand", "singleOutputCommand", "variableReference", "print", 
		"assertion"
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
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					function();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(62);
			mainFunction();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_KEYWORD) {
				{
				{
				setState(63);
				function();
				}
				}
				setState(68);
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
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
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
			setState(69);
			match(FUNCTION_KEYWORD);
			setState(70);
			identifier();
			setState(84);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(71);
				match(T__0);
				setState(81);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(72);
							parameter();
							setState(73);
							match(T__1);
							}
							} 
						}
						setState(79);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(80);
					parameter();
					}
				}

				setState(83);
				match(T__2);
				}
			}

			setState(86);
			functionBody();
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
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
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
			setState(88);
			match(FUNCTION_KEYWORD);
			setState(89);
			match(MAIN_KEYWORD);
			setState(90);
			functionBody();
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 8, RULE_parameter);
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
		enterRule(_localctx, 10, RULE_code);
		int _la;
		try {
			setState(105);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << FOR_KEYWORD) | (1L << LIST_OUTPUT_COMMAND) | (1L << SINGLE_OUTPUT_COMMAND) | (1L << IDENTIFIER))) != 0) );
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
		public SystemFunctionsContext systemFunctions() {
			return getRuleContext(SystemFunctionsContext.class,0);
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
		enterRule(_localctx, 12, RULE_programmingConstruct);
		try {
			setState(112);
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
				systemFunctions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				foreachDoComprehension();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				commandExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
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
		enterRule(_localctx, 14, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			identifier();
			setState(115);
			match(T__5);
			setState(116);
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
		public ComplexMathExpressionContext complexMathExpression() {
			return getRuleContext(ComplexMathExpressionContext.class,0);
		}
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				commandExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				variableReference();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				complexMathExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				functionCallExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
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
		enterRule(_localctx, 18, RULE_functionCallExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					modulePrefix();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(132);
			identifier();
			setState(133);
			match(T__0);
			setState(143);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << DIGIT) | (1L << STRING) | (1L << LIST_OUTPUT_COMMAND) | (1L << SINGLE_OUTPUT_COMMAND) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(134);
						expression();
						setState(135);
						match(T__1);
						}
						} 
					}
					setState(141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(142);
				expression();
				}
			}

			setState(145);
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
		enterRule(_localctx, 20, RULE_modulePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			identifier();
			setState(148);
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
		enterRule(_localctx, 22, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(150);
				match(T__7);
				}
			}

			{
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				match(DIGIT);
				}
				}
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
			setState(164);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(158);
				match(T__8);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					match(DIGIT);
					}
					}
					setState(162); 
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
		enterRule(_localctx, 24, RULE_argument);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case T__7:
			case DIGIT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				constant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
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
		enterRule(_localctx, 26, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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

	public static class SystemFunctionsContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public SystemFunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemFunctions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterSystemFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitSystemFunctions(this);
		}
	}

	public final SystemFunctionsContext systemFunctions() throws RecognitionException {
		SystemFunctionsContext _localctx = new SystemFunctionsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_systemFunctions);
		try {
			setState(174);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				print();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				assertion();
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

	public static class ForeachDoComprehensionContext extends ParserRuleContext {
		public TerminalNode FOR_KEYWORD() { return getToken(KnitLanguageParser.FOR_KEYWORD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IN_KEYWORD() { return getToken(KnitLanguageParser.IN_KEYWORD, 0); }
		public TerminalNode DO_KEYWORD() { return getToken(KnitLanguageParser.DO_KEYWORD, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
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
		enterRule(_localctx, 30, RULE_foreachDoComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(FOR_KEYWORD);
			setState(177);
			identifier();
			setState(178);
			match(IN_KEYWORD);
			setState(181);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(179);
				variableReference();
				}
				break;
			case LIST_OUTPUT_COMMAND:
				{
				setState(180);
				listOutputCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(183);
			match(DO_KEYWORD);
			setState(184);
			functionBody();
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

	public static class MathOperatorContext extends ParserRuleContext {
		public MathOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterMathOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitMathOperator(this);
		}
	}

	public final MathOperatorContext mathOperator() throws RecognitionException {
		MathOperatorContext _localctx = new MathOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class SimpleMathExpressionContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<VariableReferenceContext> variableReference() {
			return getRuleContexts(VariableReferenceContext.class);
		}
		public VariableReferenceContext variableReference(int i) {
			return getRuleContext(VariableReferenceContext.class,i);
		}
		public List<MathOperatorContext> mathOperator() {
			return getRuleContexts(MathOperatorContext.class);
		}
		public MathOperatorContext mathOperator(int i) {
			return getRuleContext(MathOperatorContext.class,i);
		}
		public SimpleMathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleMathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterSimpleMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitSimpleMathExpression(this);
		}
	}

	public final SimpleMathExpressionContext simpleMathExpression() throws RecognitionException {
		SimpleMathExpressionContext _localctx = new SimpleMathExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleMathExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			switch (_input.LA(1)) {
			case T__7:
			case DIGIT:
				{
				setState(188);
				number();
				}
				break;
			case IDENTIFIER:
				{
				setState(189);
				variableReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					mathOperator();
					setState(195);
					switch (_input.LA(1)) {
					case T__7:
					case DIGIT:
						{
						setState(193);
						number();
						}
						break;
					case IDENTIFIER:
						{
						setState(194);
						variableReference();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class EnclosedMathExpressionContext extends ParserRuleContext {
		public SimpleMathExpressionContext simpleMathExpression() {
			return getRuleContext(SimpleMathExpressionContext.class,0);
		}
		public List<MathOperatorContext> mathOperator() {
			return getRuleContexts(MathOperatorContext.class);
		}
		public MathOperatorContext mathOperator(int i) {
			return getRuleContext(MathOperatorContext.class,i);
		}
		public List<EnclosedMathExpressionContext> enclosedMathExpression() {
			return getRuleContexts(EnclosedMathExpressionContext.class);
		}
		public EnclosedMathExpressionContext enclosedMathExpression(int i) {
			return getRuleContext(EnclosedMathExpressionContext.class,i);
		}
		public EnclosedMathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedMathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterEnclosedMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitEnclosedMathExpression(this);
		}
	}

	public final EnclosedMathExpressionContext enclosedMathExpression() throws RecognitionException {
		EnclosedMathExpressionContext _localctx = new EnclosedMathExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enclosedMathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(202);
			match(T__0);
			setState(203);
			simpleMathExpression();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(204);
				mathOperator();
				setState(205);
				enclosedMathExpression();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(T__2);
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

	public static class ComplexMathExpressionContext extends ParserRuleContext {
		public List<SimpleMathExpressionContext> simpleMathExpression() {
			return getRuleContexts(SimpleMathExpressionContext.class);
		}
		public SimpleMathExpressionContext simpleMathExpression(int i) {
			return getRuleContext(SimpleMathExpressionContext.class,i);
		}
		public List<EnclosedMathExpressionContext> enclosedMathExpression() {
			return getRuleContexts(EnclosedMathExpressionContext.class);
		}
		public EnclosedMathExpressionContext enclosedMathExpression(int i) {
			return getRuleContext(EnclosedMathExpressionContext.class,i);
		}
		public List<MathOperatorContext> mathOperator() {
			return getRuleContexts(MathOperatorContext.class);
		}
		public MathOperatorContext mathOperator(int i) {
			return getRuleContext(MathOperatorContext.class,i);
		}
		public ComplexMathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexMathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterComplexMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitComplexMathExpression(this);
		}
	}

	public final ComplexMathExpressionContext complexMathExpression() throws RecognitionException {
		ComplexMathExpressionContext _localctx = new ComplexMathExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_complexMathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			switch (_input.LA(1)) {
			case T__7:
			case DIGIT:
			case IDENTIFIER:
				{
				setState(214);
				simpleMathExpression();
				}
				break;
			case T__0:
				{
				setState(215);
				enclosedMathExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) {
				{
				{
				setState(218);
				mathOperator();
				setState(221);
				switch (_input.LA(1)) {
				case T__7:
				case DIGIT:
				case IDENTIFIER:
					{
					setState(219);
					simpleMathExpression();
					}
					break;
				case T__0:
					{
					setState(220);
					enclosedMathExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(227);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public TerminalNode COMPARISON_OPERATOR() { return getToken(KnitLanguageParser.COMPARISON_OPERATOR, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			argument();
			setState(229);
			match(COMPARISON_OPERATOR);
			setState(230);
			argument();
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
		enterRule(_localctx, 42, RULE_constant);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case T__7:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(STRING);
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
		enterRule(_localctx, 44, RULE_commandExpression);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case LIST_OUTPUT_COMMAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				listOutputCommand();
				}
				break;
			case SINGLE_OUTPUT_COMMAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
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
		enterRule(_localctx, 46, RULE_listOutputCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 48, RULE_singleOutputCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 50, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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

	public static class PrintContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__12);
			setState(247);
			match(T__0);
			setState(248);
			argument();
			setState(249);
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

	public static class AssertionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public FunctionCallExpressionContext functionCallExpression() {
			return getRuleContext(FunctionCallExpressionContext.class,0);
		}
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__13);
			setState(252);
			match(T__0);
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(253);
				booleanExpression();
				}
				break;
			case 2:
				{
				setState(254);
				variableReference();
				}
				break;
			case 3:
				{
				setState(255);
				functionCallExpression();
				}
				break;
			}
			setState(258);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u0107\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16"+
		"\3Q\13\3\3\3\5\3T\n\3\3\3\5\3W\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\6\7f\n\7\r\7\16\7g\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\bs\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\7"+
		"\13\u0082\n\13\f\13\16\13\u0085\13\13\3\13\3\13\3\13\3\13\3\13\7\13\u008c"+
		"\n\13\f\13\16\13\u008f\13\13\3\13\5\13\u0092\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\5\r\u009a\n\r\3\r\6\r\u009d\n\r\r\r\16\r\u009e\3\r\3\r\6\r\u00a3"+
		"\n\r\r\r\16\r\u00a4\5\r\u00a7\n\r\3\16\3\16\5\16\u00ab\n\16\3\17\3\17"+
		"\3\20\3\20\5\20\u00b1\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00b8\n\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\5\23\u00c1\n\23\3\23\3\23\3\23\5\23"+
		"\u00c6\n\23\7\23\u00c8\n\23\f\23\16\23\u00cb\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00d2\n\24\f\24\16\24\u00d5\13\24\3\24\3\24\3\25\3\25\5\25"+
		"\u00db\n\25\3\25\3\25\3\25\5\25\u00e0\n\25\7\25\u00e2\n\25\f\25\16\25"+
		"\u00e5\13\25\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00ed\n\27\3\30\3\30\5"+
		"\30\u00f1\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0103\n\35\3\35\3\35\3\35\2\2\36\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\3\4\2\n\n\f"+
		"\16\u010f\2=\3\2\2\2\4G\3\2\2\2\6Z\3\2\2\2\b^\3\2\2\2\n`\3\2\2\2\fk\3"+
		"\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22~\3\2\2\2\24\u0083\3\2\2\2\26\u0095\3"+
		"\2\2\2\30\u0099\3\2\2\2\32\u00aa\3\2\2\2\34\u00ac\3\2\2\2\36\u00b0\3\2"+
		"\2\2 \u00b2\3\2\2\2\"\u00bc\3\2\2\2$\u00c0\3\2\2\2&\u00cc\3\2\2\2(\u00da"+
		"\3\2\2\2*\u00e6\3\2\2\2,\u00ec\3\2\2\2.\u00f0\3\2\2\2\60\u00f2\3\2\2\2"+
		"\62\u00f4\3\2\2\2\64\u00f6\3\2\2\2\66\u00f8\3\2\2\28\u00fd\3\2\2\2:<\5"+
		"\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\5"+
		"\6\4\2AC\5\4\3\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2\2\2FD"+
		"\3\2\2\2GH\7\21\2\2HV\5\34\17\2IS\7\3\2\2JK\5\n\6\2KL\7\4\2\2LN\3\2\2"+
		"\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RT\5\n\6"+
		"\2SO\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\7\5\2\2VI\3\2\2\2VW\3\2\2\2WX\3\2\2"+
		"\2XY\5\b\5\2Y\5\3\2\2\2Z[\7\21\2\2[\\\7\22\2\2\\]\5\b\5\2]\7\3\2\2\2^"+
		"_\5\f\7\2_\t\3\2\2\2`a\5\34\17\2a\13\3\2\2\2bl\5\16\b\2ce\7\6\2\2df\5"+
		"\16\b\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\7\2\2jl"+
		"\3\2\2\2kb\3\2\2\2kc\3\2\2\2l\r\3\2\2\2ms\5\20\t\2ns\5\36\20\2os\5 \21"+
		"\2ps\5.\30\2qs\5\24\13\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2"+
		"\2\2s\17\3\2\2\2tu\5\34\17\2uv\7\b\2\2vw\5\22\n\2w\21\3\2\2\2x\177\5,"+
		"\27\2y\177\5.\30\2z\177\5\64\33\2{\177\5(\25\2|\177\5\24\13\2}\177\5*"+
		"\26\2~x\3\2\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177"+
		"\23\3\2\2\2\u0080\u0082\5\26\f\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u0087\5\34\17\2\u0087\u0091\7\3\2\2\u0088\u0089\5\22\n"+
		"\2\u0089\u008a\7\4\2\2\u008a\u008c\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0092\5\22\n\2\u0091\u008d\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\5\2\2\u0094\25\3\2\2\2\u0095"+
		"\u0096\5\34\17\2\u0096\u0097\7\t\2\2\u0097\27\3\2\2\2\u0098\u009a\7\n"+
		"\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u009d\7\27\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a6\3\2\2\2\u00a0\u00a2\7\13\2\2\u00a1"+
		"\u00a3\7\27\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00ab\5,\27\2\u00a9\u00ab\5\64\33"+
		"\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\33\3\2\2\2\u00ac\u00ad"+
		"\7\36\2\2\u00ad\35\3\2\2\2\u00ae\u00b1\5\66\34\2\u00af\u00b1\58\35\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\37\3\2\2\2\u00b2\u00b3\7\23\2"+
		"\2\u00b3\u00b4\5\34\17\2\u00b4\u00b7\7\24\2\2\u00b5\u00b8\5\64\33\2\u00b6"+
		"\u00b8\5\60\31\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00bb\5\b\5\2\u00bb!\3\2\2\2\u00bc\u00bd"+
		"\t\2\2\2\u00bd#\3\2\2\2\u00be\u00c1\5\30\r\2\u00bf\u00c1\5\64\33\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c9\3\2\2\2\u00c2\u00c5\5\""+
		"\22\2\u00c3\u00c6\5\30\r\2\u00c4\u00c6\5\64\33\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca%\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cd\7\3\2\2\u00cd\u00d3\5$\23\2\u00ce\u00cf\5\"\22\2"+
		"\u00cf\u00d0\5&\24\2\u00d0\u00d2\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d7\7\5\2\2\u00d7\'\3\2\2\2\u00d8\u00db\5$\23\2"+
		"\u00d9\u00db\5&\24\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00e3"+
		"\3\2\2\2\u00dc\u00df\5\"\22\2\u00dd\u00e0\5$\23\2\u00de\u00e0\5&\24\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00dc"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		")\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5\32\16\2\u00e7\u00e8\7 \2\2"+
		"\u00e8\u00e9\5\32\16\2\u00e9+\3\2\2\2\u00ea\u00ed\5\30\r\2\u00eb\u00ed"+
		"\7\33\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed-\3\2\2\2\u00ee"+
		"\u00f1\5\60\31\2\u00ef\u00f1\5\62\32\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1/\3\2\2\2\u00f2\u00f3\7\34\2\2\u00f3\61\3\2\2\2\u00f4\u00f5"+
		"\7\35\2\2\u00f5\63\3\2\2\2\u00f6\u00f7\5\34\17\2\u00f7\65\3\2\2\2\u00f8"+
		"\u00f9\7\17\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc"+
		"\7\5\2\2\u00fc\67\3\2\2\2\u00fd\u00fe\7\20\2\2\u00fe\u0102\7\3\2\2\u00ff"+
		"\u0103\5*\26\2\u0100\u0103\5\64\33\2\u0101\u0103\5\24\13\2\u0102\u00ff"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\7\5\2\2\u01059\3\2\2\2\37=DOSVgkr~\u0083\u008d\u0091\u0099\u009e"+
		"\u00a4\u00a6\u00aa\u00b0\u00b7\u00c0\u00c5\u00c9\u00d3\u00da\u00df\u00e3"+
		"\u00ec\u00f0\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}