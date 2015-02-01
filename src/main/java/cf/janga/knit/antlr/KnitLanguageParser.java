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
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, FUNCTION_KEYWORD=16, 
		MAIN_KEYWORD=17, ALPHA_CHARACTER=18, DIGIT=19, SPACE=20, NEWLINE=21, TAB=22, 
		STRING=23, COMMAND=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'->'", "'foreach'", "'{'", "'=='", "'='", "'}'", 
		"'print'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'func'", 
		"'main'", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", 
		"COMMAND"
	};
	public static final int
		RULE_knitProgram = 0, RULE_function = 1, RULE_mainFunction = 2, RULE_functionBody = 3, 
		RULE_functionName = 4, RULE_parameter = 5, RULE_code = 6, RULE_programmingConstruct = 7, 
		RULE_variableDeclaration = 8, RULE_variableValue = 9, RULE_number = 10, 
		RULE_argument = 11, RULE_identifier = 12, RULE_systemFunctions = 13, RULE_systemMethod = 14, 
		RULE_listMethods = 15, RULE_methodCall = 16, RULE_mathOperator = 17, RULE_simpleMathExpression = 18, 
		RULE_enclosedMathExpression = 19, RULE_complexMathExpression = 20, RULE_booleanExpression = 21, 
		RULE_constant = 22, RULE_commandExpression = 23, RULE_variableReference = 24, 
		RULE_print = 25, RULE_foreach = 26;
	public static final String[] ruleNames = {
		"knitProgram", "function", "mainFunction", "functionBody", "functionName", 
		"parameter", "code", "programmingConstruct", "variableDeclaration", "variableValue", 
		"number", "argument", "identifier", "systemFunctions", "systemMethod", 
		"listMethods", "methodCall", "mathOperator", "simpleMathExpression", "enclosedMathExpression", 
		"complexMathExpression", "booleanExpression", "constant", "commandExpression", 
		"variableReference", "print", "foreach"
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
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54); function();
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(60); mainFunction();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_KEYWORD) {
				{
				{
				setState(61); function();
				}
				}
				setState(66);
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
			setState(67); match(FUNCTION_KEYWORD);
			setState(68); functionName();
			setState(82);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(69); match(9);
				setState(79);
				_la = _input.LA(1);
				if (_la==ALPHA_CHARACTER) {
					{
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(70); parameter();
							setState(71); match(13);
							}
							} 
						}
						setState(77);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(78); parameter();
					}
				}

				setState(81); match(10);
				}
			}

			setState(84); functionBody();
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
			setState(86); match(FUNCTION_KEYWORD);
			setState(87); match(MAIN_KEYWORD);
			setState(88); functionBody();
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
			setState(90); code();
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
			setState(93); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(92); match(ALPHA_CHARACTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(95); 
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
			setState(97); identifier();
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
			setState(108);
			switch (_input.LA(1)) {
			case 8:
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); programmingConstruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); match(4);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101); programmingConstruct();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==8 || _la==ALPHA_CHARACTER );
				setState(106); match(7);
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
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); variableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); systemFunctions();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); methodCall();
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
			setState(115); identifier();
			setState(116); match(6);
			setState(117); variableValue();
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
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); commandExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121); complexMathExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122); booleanExpression();
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
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125); match(DIGIT);
				}
				}
				setState(128); 
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
			setState(132);
			switch (_input.LA(1)) {
			case DIGIT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); constant();
				}
				break;
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); variableReference();
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
			setState(134); match(ALPHA_CHARACTER);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					_la = _input.LA(1);
					if ( !(_la==ALPHA_CHARACTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(141); print();
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
			setState(143); listMethods();
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
			setState(145); foreach();
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
			setState(147); variableReference();
			setState(148); match(15);
			setState(149); systemMethod();
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
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 11) | (1L << 12) | (1L << 14))) != 0)) ) {
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
			setState(155);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(153); number();
				}
				break;
			case ALPHA_CHARACTER:
				{
				setState(154); variableReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157); mathOperator();
					setState(160);
					switch (_input.LA(1)) {
					case DIGIT:
						{
						setState(158); number();
						}
						break;
					case ALPHA_CHARACTER:
						{
						setState(159); variableReference();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(166);
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
			setState(167); match(9);
			setState(168); simpleMathExpression();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 11) | (1L << 12) | (1L << 14))) != 0)) {
				{
				{
				setState(169); mathOperator();
				setState(170); enclosedMathExpression();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); match(10);
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
			setState(181);
			switch (_input.LA(1)) {
			case ALPHA_CHARACTER:
			case DIGIT:
				{
				setState(179); simpleMathExpression();
				}
				break;
			case 9:
				{
				setState(180); enclosedMathExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 11) | (1L << 12) | (1L << 14))) != 0)) {
				{
				{
				setState(183); mathOperator();
				setState(186);
				switch (_input.LA(1)) {
				case ALPHA_CHARACTER:
				case DIGIT:
					{
					setState(184); simpleMathExpression();
					}
					break;
				case 9:
					{
					setState(185); enclosedMathExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(192);
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
			setState(193); argument();
			setState(194); match(5);
			setState(195); argument();
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
			setState(199);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); match(STRING);
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
		public ListMethodsContext listMethods() {
			return getRuleContext(ListMethodsContext.class,0);
		}
		public TerminalNode COMMAND() { return getToken(KnitLanguageParser.COMMAND, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); match(COMMAND);
			setState(204);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(202); match(15);
				setState(203); listMethods();
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
		enterRule(_localctx, 48, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); identifier();
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
		enterRule(_localctx, 50, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(8);
			setState(209); match(9);
			setState(210); argument();
			setState(211); match(10);
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
		enterRule(_localctx, 52, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(3);
			setState(214); match(4);
			setState(215); identifier();
			setState(216); match(2);
			setState(217); code();
			setState(218); match(7);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3"+
		"\3\5\3R\n\3\3\3\5\3U\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6`\n\6"+
		"\r\6\16\6a\3\7\3\7\3\b\3\b\3\b\6\bi\n\b\r\b\16\bj\3\b\3\b\5\bo\n\b\3\t"+
		"\3\t\3\t\5\tt\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\6"+
		"\f\u0081\n\f\r\f\16\f\u0082\3\r\3\r\5\r\u0087\n\r\3\16\3\16\7\16\u008b"+
		"\n\16\f\16\16\16\u008e\13\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\5\24\u009e\n\24\3\24\3\24\3\24\5\24\u00a3"+
		"\n\24\7\24\u00a5\n\24\f\24\16\24\u00a8\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u00af\n\25\f\25\16\25\u00b2\13\25\3\25\3\25\3\26\3\26\5\26\u00b8"+
		"\n\26\3\26\3\26\3\26\5\26\u00bd\n\26\7\26\u00bf\n\26\f\26\16\26\u00c2"+
		"\13\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00ca\n\30\3\31\3\31\3\31\5"+
		"\31\u00cf\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\4\3\2\24\25\5\2\3\3\r\16\20\20\u00dc\2;\3\2\2\2\4"+
		"E\3\2\2\2\6X\3\2\2\2\b\\\3\2\2\2\n_\3\2\2\2\fc\3\2\2\2\16n\3\2\2\2\20"+
		"s\3\2\2\2\22u\3\2\2\2\24}\3\2\2\2\26\u0080\3\2\2\2\30\u0086\3\2\2\2\32"+
		"\u0088\3\2\2\2\34\u008f\3\2\2\2\36\u0091\3\2\2\2 \u0093\3\2\2\2\"\u0095"+
		"\3\2\2\2$\u0099\3\2\2\2&\u009d\3\2\2\2(\u00a9\3\2\2\2*\u00b7\3\2\2\2,"+
		"\u00c3\3\2\2\2.\u00c9\3\2\2\2\60\u00cb\3\2\2\2\62\u00d0\3\2\2\2\64\u00d2"+
		"\3\2\2\2\66\u00d7\3\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3"+
		"\2\2\2<>\3\2\2\2=;\3\2\2\2>B\5\6\4\2?A\5\4\3\2@?\3\2\2\2AD\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2C\3\3\2\2\2DB\3\2\2\2EF\7\22\2\2FT\5\n\6\2GQ\7\13\2\2"+
		"HI\5\f\7\2IJ\7\17\2\2JL\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2NP\3\2\2\2OM\3\2\2\2PR\5\f\7\2QM\3\2\2\2QR\3\2\2\2RS\3\2\2\2SU\7\f\2"+
		"\2TG\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\5\b\5\2W\5\3\2\2\2XY\7\22\2\2YZ\7\23"+
		"\2\2Z[\5\b\5\2[\7\3\2\2\2\\]\5\16\b\2]\t\3\2\2\2^`\7\24\2\2_^\3\2\2\2"+
		"`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\13\3\2\2\2cd\5\32\16\2d\r\3\2\2\2eo\5"+
		"\20\t\2fh\7\6\2\2gi\5\20\t\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k"+
		"l\3\2\2\2lm\7\t\2\2mo\3\2\2\2ne\3\2\2\2nf\3\2\2\2o\17\3\2\2\2pt\5\22\n"+
		"\2qt\5\34\17\2rt\5\"\22\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\21\3\2\2\2uv"+
		"\5\32\16\2vw\7\b\2\2wx\5\24\13\2x\23\3\2\2\2y~\5.\30\2z~\5\60\31\2{~\5"+
		"*\26\2|~\5,\27\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\25\3\2\2\2\177"+
		"\u0081\7\25\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\27\3\2\2\2\u0084\u0087\5.\30\2\u0085\u0087"+
		"\5\62\32\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\31\3\2\2\2\u0088"+
		"\u008c\7\24\2\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\33\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\5\64\33\2\u0090\35\3\2\2\2\u0091\u0092\5 \21"+
		"\2\u0092\37\3\2\2\2\u0093\u0094\5\66\34\2\u0094!\3\2\2\2\u0095\u0096\5"+
		"\62\32\2\u0096\u0097\7\21\2\2\u0097\u0098\5\36\20\2\u0098#\3\2\2\2\u0099"+
		"\u009a\t\3\2\2\u009a%\3\2\2\2\u009b\u009e\5\26\f\2\u009c\u009e\5\62\32"+
		"\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a6\3\2\2\2\u009f\u00a2"+
		"\5$\23\2\u00a0\u00a3\5\26\f\2\u00a1\u00a3\5\62\32\2\u00a2\u00a0\3\2\2"+
		"\2\u00a2\u00a1\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\'\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00b0\5&\24\2\u00ab\u00ac\5"+
		"$\23\2\u00ac\u00ad\5(\25\2\u00ad\u00af\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\f\2\2\u00b4)\3\2\2\2\u00b5\u00b8"+
		"\5&\24\2\u00b6\u00b8\5(\25\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00c0\3\2\2\2\u00b9\u00bc\5$\23\2\u00ba\u00bd\5&\24\2\u00bb\u00bd\5("+
		"\25\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00b9\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1+\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\5\30\r\2\u00c4\u00c5"+
		"\7\7\2\2\u00c5\u00c6\5\30\r\2\u00c6-\3\2\2\2\u00c7\u00ca\5\26\f\2\u00c8"+
		"\u00ca\7\31\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca/\3\2\2\2"+
		"\u00cb\u00ce\7\32\2\2\u00cc\u00cd\7\21\2\2\u00cd\u00cf\5 \21\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\61\3\2\2\2\u00d0\u00d1\5\32\16\2\u00d1"+
		"\63\3\2\2\2\u00d2\u00d3\7\n\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\5\30"+
		"\r\2\u00d5\u00d6\7\f\2\2\u00d6\65\3\2\2\2\u00d7\u00d8\7\5\2\2\u00d8\u00d9"+
		"\7\6\2\2\u00d9\u00da\5\32\16\2\u00da\u00db\7\4\2\2\u00db\u00dc\5\16\b"+
		"\2\u00dc\u00dd\7\t\2\2\u00dd\67\3\2\2\2\30;BMQTajns}\u0082\u0086\u008c"+
		"\u009d\u00a2\u00a6\u00b0\u00b7\u00bc\u00c0\u00c9\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}