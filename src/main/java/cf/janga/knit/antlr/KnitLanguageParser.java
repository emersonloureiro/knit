// Generated from KnitLanguage.g4 by ANTLR 4.2.2
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, FUNCTION_KEYWORD=18, MAIN_KEYWORD=19, ALPHA_CHARACTER=20, DIGIT=21, 
		SPACE=22, NEWLINE=23, TAB=24, STRING=25, COMMAND=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'->'", "'foreach'", "'asList'", "'{'", "'=='", "'assert'", 
		"'='", "'}'", "'print'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", 
		"'func'", "'main'", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", 
		"STRING", "COMMAND"
	};
	public static final int
		RULE_knitProgram = 0, RULE_function = 1, RULE_mainFunction = 2, RULE_functionBody = 3, 
		RULE_functionName = 4, RULE_parameter = 5, RULE_code = 6, RULE_programmingConstruct = 7, 
		RULE_variableDeclaration = 8, RULE_variableValue = 9, RULE_number = 10, 
		RULE_argument = 11, RULE_identifier = 12, RULE_systemFunctions = 13, RULE_systemMethod = 14, 
		RULE_listMethods = 15, RULE_methodCall = 16, RULE_mathOperator = 17, RULE_simpleMathExpression = 18, 
		RULE_enclosedMathExpression = 19, RULE_complexMathExpression = 20, RULE_booleanExpression = 21, 
		RULE_constant = 22, RULE_commandExpression = 23, RULE_plainCommand = 24, 
		RULE_asListCommand = 25, RULE_variableReference = 26, RULE_print = 27, 
		RULE_assertion = 28, RULE_foreach = 29;
	public static final String[] ruleNames = {
		"knitProgram", "function", "mainFunction", "functionBody", "functionName", 
		"parameter", "code", "programmingConstruct", "variableDeclaration", "variableValue", 
		"number", "argument", "identifier", "systemFunctions", "systemMethod", 
		"listMethods", "methodCall", "mathOperator", "simpleMathExpression", "enclosedMathExpression", 
		"complexMathExpression", "booleanExpression", "constant", "commandExpression", 
		"plainCommand", "asListCommand", "variableReference", "print", "assertion", 
		"foreach"
	};

	@Override
	public String getGrammarFileName() { return "KnitLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KnitLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KnitProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
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
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60); function();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(66); mainFunction();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_KEYWORD) {
				{
				{
				setState(67); function();
				}
				}
				setState(72);
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
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode FUNCTION_KEYWORD() { return getToken(KnitLanguageParser.FUNCTION_KEYWORD, 0); }
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
			setState(73); match(FUNCTION_KEYWORD);
			setState(74); functionName();
			setState(88);
			_la = _input.LA(1);
			if (_la==11) {
				{
				setState(75); match(11);
				setState(85);
				_la = _input.LA(1);
				if (_la==ALPHA_CHARACTER) {
					{
					setState(81);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(76); parameter();
							setState(77); match(15);
							}
							} 
						}
						setState(83);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(84); parameter();
					}
				}

				setState(87); match(12);
				}
			}

			setState(90); functionBody();
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
		public TerminalNode MAIN_KEYWORD() { return getToken(KnitLanguageParser.MAIN_KEYWORD, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode FUNCTION_KEYWORD() { return getToken(KnitLanguageParser.FUNCTION_KEYWORD, 0); }
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
			setState(92); match(FUNCTION_KEYWORD);
			setState(93); match(MAIN_KEYWORD);
			setState(94); functionBody();
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
			setState(96); code();
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

	public static class FunctionNameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_CHARACTER() { return getTokens(KnitLanguageParser.ALPHA_CHARACTER); }
		public TerminalNode ALPHA_CHARACTER(int i) {
			return getToken(KnitLanguageParser.ALPHA_CHARACTER, i);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(98); match(ALPHA_CHARACTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(101); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); identifier();
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
		public ProgrammingConstructContext programmingConstruct(int i) {
			return getRuleContext(ProgrammingConstructContext.class,i);
		}
		public List<ProgrammingConstructContext> programmingConstruct() {
			return getRuleContexts(ProgrammingConstructContext.class);
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
		enterRule(_localctx, 12, RULE_code);
		int _la;
		try {
			setState(114);
			switch (_input.LA(1)) {
			case 7:
			case 10:
			case ALPHA_CHARACTER:
			case COMMAND:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); programmingConstruct();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(5);
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107); programmingConstruct();
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 10) | (1L << ALPHA_CHARACTER) | (1L << COMMAND))) != 0) );
				setState(112); match(9);
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
		public SystemFunctionsContext systemFunctions() {
			return getRuleContext(SystemFunctionsContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public CommandExpressionContext commandExpression() {
			return getRuleContext(CommandExpressionContext.class,0);
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
		enterRule(_localctx, 14, RULE_programmingConstruct);
		try {
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); variableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); systemFunctions();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); methodCall();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119); commandExpression();
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
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 16, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); identifier();
			setState(123); match(8);
			setState(124); variableValue();
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

	public static class VariableValueContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ComplexMathExpressionContext complexMathExpression() {
			return getRuleContext(ComplexMathExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public CommandExpressionContext commandExpression() {
			return getRuleContext(CommandExpressionContext.class,0);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitVariableValue(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableValue);
		try {
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); commandExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); complexMathExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); booleanExpression();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(KnitLanguageParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(KnitLanguageParser.DIGIT); }
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
			setState(133);
			_la = _input.LA(1);
			if (_la==16) {
				{
				setState(132); match(16);
				}
			}

			{
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135); match(DIGIT);
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
			setState(146);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(140); match(17);
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141); match(DIGIT);
					}
					}
					setState(144); 
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
			setState(150);
			switch (_input.LA(1)) {
			case 16:
			case DIGIT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(148); constant();
				}
				break;
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(149); variableReference();
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
		public List<TerminalNode> ALPHA_CHARACTER() { return getTokens(KnitLanguageParser.ALPHA_CHARACTER); }
		public TerminalNode DIGIT(int i) {
			return getToken(KnitLanguageParser.DIGIT, i);
		}
		public TerminalNode ALPHA_CHARACTER(int i) {
			return getToken(KnitLanguageParser.ALPHA_CHARACTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(KnitLanguageParser.DIGIT); }
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(ALPHA_CHARACTER);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					_la = _input.LA(1);
					if ( !(_la==ALPHA_CHARACTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class SystemFunctionsContext extends ParserRuleContext {
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
		enterRule(_localctx, 26, RULE_systemFunctions);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case 10:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); assertion();
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

	public static class SystemMethodContext extends ParserRuleContext {
		public ListMethodsContext listMethods() {
			return getRuleContext(ListMethodsContext.class,0);
		}
		public SystemMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterSystemMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitSystemMethod(this);
		}
	}

	public final SystemMethodContext systemMethod() throws RecognitionException {
		SystemMethodContext _localctx = new SystemMethodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_systemMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); listMethods();
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

	public static class ListMethodsContext extends ParserRuleContext {
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public ListMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterListMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitListMethods(this);
		}
	}

	public final ListMethodsContext listMethods() throws RecognitionException {
		ListMethodsContext _localctx = new ListMethodsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); foreach();
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

	public static class MethodCallContext extends ParserRuleContext {
		public SystemMethodContext systemMethod() {
			return getRuleContext(SystemMethodContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); variableReference();
			setState(168); match(17);
			setState(169); systemMethod();
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
		enterRule(_localctx, 34, RULE_mathOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 13) | (1L << 14) | (1L << 16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public MathOperatorContext mathOperator(int i) {
			return getRuleContext(MathOperatorContext.class,i);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public VariableReferenceContext variableReference(int i) {
			return getRuleContext(VariableReferenceContext.class,i);
		}
		public List<VariableReferenceContext> variableReference() {
			return getRuleContexts(VariableReferenceContext.class);
		}
		public List<MathOperatorContext> mathOperator() {
			return getRuleContexts(MathOperatorContext.class);
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
		enterRule(_localctx, 36, RULE_simpleMathExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			switch (_input.LA(1)) {
			case 16:
			case DIGIT:
				{
				setState(173); number();
				}
				break;
			case ALPHA_CHARACTER:
				{
				setState(174); variableReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177); mathOperator();
					setState(180);
					switch (_input.LA(1)) {
					case 16:
					case DIGIT:
						{
						setState(178); number();
						}
						break;
					case ALPHA_CHARACTER:
						{
						setState(179); variableReference();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public MathOperatorContext mathOperator(int i) {
			return getRuleContext(MathOperatorContext.class,i);
		}
		public EnclosedMathExpressionContext enclosedMathExpression(int i) {
			return getRuleContext(EnclosedMathExpressionContext.class,i);
		}
		public SimpleMathExpressionContext simpleMathExpression() {
			return getRuleContext(SimpleMathExpressionContext.class,0);
		}
		public List<EnclosedMathExpressionContext> enclosedMathExpression() {
			return getRuleContexts(EnclosedMathExpressionContext.class);
		}
		public List<MathOperatorContext> mathOperator() {
			return getRuleContexts(MathOperatorContext.class);
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
		enterRule(_localctx, 38, RULE_enclosedMathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(187); match(11);
			setState(188); simpleMathExpression();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 13) | (1L << 14) | (1L << 16))) != 0)) {
				{
				{
				setState(189); mathOperator();
				setState(190); enclosedMathExpression();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197); match(12);
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
		public MathOperatorContext mathOperator(int i) {
			return getRuleContext(MathOperatorContext.class,i);
		}
		public EnclosedMathExpressionContext enclosedMathExpression(int i) {
			return getRuleContext(EnclosedMathExpressionContext.class,i);
		}
		public List<SimpleMathExpressionContext> simpleMathExpression() {
			return getRuleContexts(SimpleMathExpressionContext.class);
		}
		public SimpleMathExpressionContext simpleMathExpression(int i) {
			return getRuleContext(SimpleMathExpressionContext.class,i);
		}
		public List<EnclosedMathExpressionContext> enclosedMathExpression() {
			return getRuleContexts(EnclosedMathExpressionContext.class);
		}
		public List<MathOperatorContext> mathOperator() {
			return getRuleContexts(MathOperatorContext.class);
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
		enterRule(_localctx, 40, RULE_complexMathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			switch (_input.LA(1)) {
			case 16:
			case ALPHA_CHARACTER:
			case DIGIT:
				{
				setState(199); simpleMathExpression();
				}
				break;
			case 11:
				{
				setState(200); enclosedMathExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 13) | (1L << 14) | (1L << 16))) != 0)) {
				{
				{
				setState(203); mathOperator();
				setState(206);
				switch (_input.LA(1)) {
				case 16:
				case ALPHA_CHARACTER:
				case DIGIT:
					{
					setState(204); simpleMathExpression();
					}
					break;
				case 11:
					{
					setState(205); enclosedMathExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(212);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); argument();
			setState(214); match(6);
			setState(215); argument();
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
		enterRule(_localctx, 44, RULE_constant);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case 16:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(218); match(STRING);
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
		public AsListCommandContext asListCommand() {
			return getRuleContext(AsListCommandContext.class,0);
		}
		public PlainCommandContext plainCommand() {
			return getRuleContext(PlainCommandContext.class,0);
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
		enterRule(_localctx, 46, RULE_commandExpression);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); plainCommand();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); asListCommand();
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

	public static class PlainCommandContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(KnitLanguageParser.COMMAND, 0); }
		public PlainCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plainCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterPlainCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitPlainCommand(this);
		}
	}

	public final PlainCommandContext plainCommand() throws RecognitionException {
		PlainCommandContext _localctx = new PlainCommandContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_plainCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(COMMAND);
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

	public static class AsListCommandContext extends ParserRuleContext {
		public ListMethodsContext listMethods() {
			return getRuleContext(ListMethodsContext.class,0);
		}
		public TerminalNode COMMAND() { return getToken(KnitLanguageParser.COMMAND, 0); }
		public AsListCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asListCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterAsListCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitAsListCommand(this);
		}
	}

	public final AsListCommandContext asListCommand() throws RecognitionException {
		AsListCommandContext _localctx = new AsListCommandContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_asListCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(COMMAND);
			setState(228); match(17);
			setState(229); match(4);
			setState(232);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(230); match(17);
				setState(231); listMethods();
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
		enterRule(_localctx, 52, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); identifier();
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
		enterRule(_localctx, 54, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(10);
			setState(237); match(11);
			setState(238); argument();
			setState(239); match(12);
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
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		enterRule(_localctx, 56, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(7);
			setState(242); match(11);
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(243); booleanExpression();
				}
				break;

			case 2:
				{
				setState(244); variableReference();
				}
				break;
			}
			setState(247); match(12);
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

	public static class ForeachContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitForeach(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(3);
			setState(250); match(5);
			setState(251); identifier();
			setState(252); match(2);
			setState(253); code();
			setState(254); match(9);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0103\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3R\n\3\f\3\16\3U\13\3\3\3\5\3X\n\3\3\3\5\3[\n\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\6\6f\n\6\r\6\16\6g\3\7\3\7\3\b\3\b\3\b\6\bo\n\b"+
		"\r\b\16\bp\3\b\3\b\5\bu\n\b\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\5\13\u0085\n\13\3\f\5\f\u0088\n\f\3\f\6\f\u008b\n\f"+
		"\r\f\16\f\u008c\3\f\3\f\6\f\u0091\n\f\r\f\16\f\u0092\5\f\u0095\n\f\3\r"+
		"\3\r\5\r\u0099\n\r\3\16\3\16\7\16\u009d\n\16\f\16\16\16\u00a0\13\16\3"+
		"\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\5\24\u00b2\n\24\3\24\3\24\3\24\5\24\u00b7\n\24\7\24\u00b9"+
		"\n\24\f\24\16\24\u00bc\13\24\3\25\3\25\3\25\3\25\3\25\7\25\u00c3\n\25"+
		"\f\25\16\25\u00c6\13\25\3\25\3\25\3\26\3\26\5\26\u00cc\n\26\3\26\3\26"+
		"\3\26\5\26\u00d1\n\26\7\26\u00d3\n\26\f\26\16\26\u00d6\13\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\5\30\u00de\n\30\3\31\3\31\5\31\u00e2\n\31\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\5\33\u00eb\n\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u00f8\n\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<\2\4\3\2\26\27\5\2\3\3\17\20\22\22\u0104\2A\3"+
		"\2\2\2\4K\3\2\2\2\6^\3\2\2\2\bb\3\2\2\2\ne\3\2\2\2\fi\3\2\2\2\16t\3\2"+
		"\2\2\20z\3\2\2\2\22|\3\2\2\2\24\u0084\3\2\2\2\26\u0087\3\2\2\2\30\u0098"+
		"\3\2\2\2\32\u009a\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5\3\2\2\2 \u00a7\3\2"+
		"\2\2\"\u00a9\3\2\2\2$\u00ad\3\2\2\2&\u00b1\3\2\2\2(\u00bd\3\2\2\2*\u00cb"+
		"\3\2\2\2,\u00d7\3\2\2\2.\u00dd\3\2\2\2\60\u00e1\3\2\2\2\62\u00e3\3\2\2"+
		"\2\64\u00e5\3\2\2\2\66\u00ec\3\2\2\28\u00ee\3\2\2\2:\u00f3\3\2\2\2<\u00fb"+
		"\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2C"+
		"A\3\2\2\2DH\5\6\4\2EG\5\4\3\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"I\3\3\2\2\2JH\3\2\2\2KL\7\24\2\2LZ\5\n\6\2MW\7\r\2\2NO\5\f\7\2OP\7\21"+
		"\2\2PR\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2"+
		"\2\2VX\5\f\7\2WS\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y[\7\16\2\2ZM\3\2\2\2Z[\3"+
		"\2\2\2[\\\3\2\2\2\\]\5\b\5\2]\5\3\2\2\2^_\7\24\2\2_`\7\25\2\2`a\5\b\5"+
		"\2a\7\3\2\2\2bc\5\16\b\2c\t\3\2\2\2df\7\26\2\2ed\3\2\2\2fg\3\2\2\2ge\3"+
		"\2\2\2gh\3\2\2\2h\13\3\2\2\2ij\5\32\16\2j\r\3\2\2\2ku\5\20\t\2ln\7\7\2"+
		"\2mo\5\20\t\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\13"+
		"\2\2su\3\2\2\2tk\3\2\2\2tl\3\2\2\2u\17\3\2\2\2v{\5\22\n\2w{\5\34\17\2"+
		"x{\5\"\22\2y{\5\60\31\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\21\3"+
		"\2\2\2|}\5\32\16\2}~\7\n\2\2~\177\5\24\13\2\177\23\3\2\2\2\u0080\u0085"+
		"\5.\30\2\u0081\u0085\5\60\31\2\u0082\u0085\5*\26\2\u0083\u0085\5,\27\2"+
		"\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\25\3\2\2\2\u0086\u0088\7\22\2\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\7\27\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u0094\3\2\2\2\u008e\u0090\7\23\2\2\u008f\u0091\7\27\2\2\u0090\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u0095\3\2\2\2\u0095\27\3\2\2"+
		"\2\u0096\u0099\5.\30\2\u0097\u0099\5\66\34\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\31\3\2\2\2\u009a\u009e\7\26\2\2\u009b\u009d\t\2\2"+
		"\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\33\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\58\35\2\u00a2"+
		"\u00a4\5:\36\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\35\3\2\2"+
		"\2\u00a5\u00a6\5 \21\2\u00a6\37\3\2\2\2\u00a7\u00a8\5<\37\2\u00a8!\3\2"+
		"\2\2\u00a9\u00aa\5\66\34\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\5\36\20\2"+
		"\u00ac#\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae%\3\2\2\2\u00af\u00b2\5\26\f"+
		"\2\u00b0\u00b2\5\66\34\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\u00ba\3\2\2\2\u00b3\u00b6\5$\23\2\u00b4\u00b7\5\26\f\2\u00b5\u00b7\5"+
		"\66\34\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b3\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\'\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\r\2\2\u00be\u00c4"+
		"\5&\24\2\u00bf\u00c0\5$\23\2\u00c0\u00c1\5(\25\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\16\2\2\u00c8"+
		")\3\2\2\2\u00c9\u00cc\5&\24\2\u00ca\u00cc\5(\25\2\u00cb\u00c9\3\2\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc\u00d4\3\2\2\2\u00cd\u00d0\5$\23\2\u00ce\u00d1"+
		"\5&\24\2\u00cf\u00d1\5(\25\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5+\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8"+
		"\5\30\r\2\u00d8\u00d9\7\b\2\2\u00d9\u00da\5\30\r\2\u00da-\3\2\2\2\u00db"+
		"\u00de\5\26\f\2\u00dc\u00de\7\33\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3"+
		"\2\2\2\u00de/\3\2\2\2\u00df\u00e2\5\62\32\2\u00e0\u00e2\5\64\33\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\61\3\2\2\2\u00e3\u00e4\7\34\2"+
		"\2\u00e4\63\3\2\2\2\u00e5\u00e6\7\34\2\2\u00e6\u00e7\7\23\2\2\u00e7\u00ea"+
		"\7\6\2\2\u00e8\u00e9\7\23\2\2\u00e9\u00eb\5 \21\2\u00ea\u00e8\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\65\3\2\2\2\u00ec\u00ed\5\32\16\2\u00ed\67\3"+
		"\2\2\2\u00ee\u00ef\7\f\2\2\u00ef\u00f0\7\r\2\2\u00f0\u00f1\5\30\r\2\u00f1"+
		"\u00f2\7\16\2\2\u00f29\3\2\2\2\u00f3\u00f4\7\t\2\2\u00f4\u00f7\7\r\2\2"+
		"\u00f5\u00f8\5,\27\2\u00f6\u00f8\5\66\34\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\16\2\2\u00fa;\3\2\2\2\u00fb"+
		"\u00fc\7\5\2\2\u00fc\u00fd\7\7\2\2\u00fd\u00fe\5\32\16\2\u00fe\u00ff\7"+
		"\4\2\2\u00ff\u0100\5\16\b\2\u0100\u0101\7\13\2\2\u0101=\3\2\2\2\36AHS"+
		"WZgptz\u0084\u0087\u008c\u0092\u0094\u0098\u009e\u00a3\u00b1\u00b6\u00ba"+
		"\u00c4\u00cb\u00d0\u00d4\u00dd\u00e1\u00ea\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}