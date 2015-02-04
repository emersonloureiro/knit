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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		FUNCTION_KEYWORD=17, MAIN_KEYWORD=18, ALPHA_CHARACTER=19, DIGIT=20, SPACE=21, 
		NEWLINE=22, TAB=23, STRING=24, COMMAND=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'->'", "'foreach'", "'{'", "'=='", "'assert'", "'='", 
		"'}'", "'print'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'func'", 
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
		RULE_print = 25, RULE_assertion = 26, RULE_foreach = 27;
	public static final String[] ruleNames = {
		"knitProgram", "function", "mainFunction", "functionBody", "functionName", 
		"parameter", "code", "programmingConstruct", "variableDeclaration", "variableValue", 
		"number", "argument", "identifier", "systemFunctions", "systemMethod", 
		"listMethods", "methodCall", "mathOperator", "simpleMathExpression", "enclosedMathExpression", 
		"complexMathExpression", "booleanExpression", "constant", "commandExpression", 
		"variableReference", "print", "assertion", "foreach"
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
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56); function();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(62); mainFunction();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_KEYWORD) {
				{
				{
				setState(63); function();
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
			setState(69); match(FUNCTION_KEYWORD);
			setState(70); functionName();
			setState(84);
			_la = _input.LA(1);
			if (_la==10) {
				{
				setState(71); match(10);
				setState(81);
				_la = _input.LA(1);
				if (_la==ALPHA_CHARACTER) {
					{
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(72); parameter();
							setState(73); match(14);
							}
							} 
						}
						setState(79);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(80); parameter();
					}
				}

				setState(83); match(11);
				}
			}

			setState(86); functionBody();
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
			setState(88); match(FUNCTION_KEYWORD);
			setState(89); match(MAIN_KEYWORD);
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
			setState(92); code();
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
			setState(95); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(94); match(ALPHA_CHARACTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97); 
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
			setState(99); identifier();
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
			setState(110);
			switch (_input.LA(1)) {
			case 6:
			case 9:
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); programmingConstruct();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); match(4);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103); programmingConstruct();
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 9) | (1L << ALPHA_CHARACTER))) != 0) );
				setState(108); match(8);
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
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); variableDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); systemFunctions();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114); methodCall();
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
			setState(117); identifier();
			setState(118); match(7);
			setState(119); variableValue();
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
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); constant();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); commandExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123); complexMathExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124); booleanExpression();
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
			setState(128);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(127); match(15);
				}
			}

			{
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130); match(DIGIT);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
			setState(141);
			_la = _input.LA(1);
			if (_la==16) {
				{
				setState(135); match(16);
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136); match(DIGIT);
					}
					}
					setState(139); 
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
			setState(145);
			switch (_input.LA(1)) {
			case 15:
			case DIGIT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); constant();
				}
				break;
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); variableReference();
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
			setState(147); match(ALPHA_CHARACTER);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					_la = _input.LA(1);
					if ( !(_la==ALPHA_CHARACTER || _la==DIGIT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(153);
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
			setState(156);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); print();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); assertion();
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
			setState(158); listMethods();
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
			setState(160); foreach();
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
			setState(162); variableReference();
			setState(163); match(16);
			setState(164); systemMethod();
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
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 12) | (1L << 13) | (1L << 15))) != 0)) ) {
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
			setState(170);
			switch (_input.LA(1)) {
			case 15:
			case DIGIT:
				{
				setState(168); number();
				}
				break;
			case ALPHA_CHARACTER:
				{
				setState(169); variableReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172); mathOperator();
					setState(175);
					switch (_input.LA(1)) {
					case 15:
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
					}
					} 
				}
				setState(181);
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
			setState(182); match(10);
			setState(183); simpleMathExpression();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 12) | (1L << 13) | (1L << 15))) != 0)) {
				{
				{
				setState(184); mathOperator();
				setState(185); enclosedMathExpression();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192); match(11);
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
			setState(196);
			switch (_input.LA(1)) {
			case 15:
			case ALPHA_CHARACTER:
			case DIGIT:
				{
				setState(194); simpleMathExpression();
				}
				break;
			case 10:
				{
				setState(195); enclosedMathExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 12) | (1L << 13) | (1L << 15))) != 0)) {
				{
				{
				setState(198); mathOperator();
				setState(201);
				switch (_input.LA(1)) {
				case 15:
				case ALPHA_CHARACTER:
				case DIGIT:
					{
					setState(199); simpleMathExpression();
					}
					break;
				case 10:
					{
					setState(200); enclosedMathExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(207);
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
			setState(208); argument();
			setState(209); match(5);
			setState(210); argument();
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
			setState(214);
			switch (_input.LA(1)) {
			case 15:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); match(STRING);
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
			setState(216); match(COMMAND);
			setState(219);
			_la = _input.LA(1);
			if (_la==16) {
				{
				setState(217); match(16);
				setState(218); listMethods();
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
			setState(221); identifier();
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
			setState(223); match(9);
			setState(224); match(10);
			setState(225); argument();
			setState(226); match(11);
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
		enterRule(_localctx, 52, RULE_assertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); match(6);
			setState(229); match(10);
			setState(232);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(230); booleanExpression();
				}
				break;

			case 2:
				{
				setState(231); variableReference();
				}
				break;
			}
			setState(234); match(11);
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
		enterRule(_localctx, 54, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(3);
			setState(237); match(4);
			setState(238); identifier();
			setState(239); match(2);
			setState(240); code();
			setState(241); match(8);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00f6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16"+
		"\3Q\13\3\3\3\5\3T\n\3\3\3\5\3W\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\6\6b\n\6\r\6\16\6c\3\7\3\7\3\b\3\b\3\b\6\bk\n\b\r\b\16\bl\3\b\3\b\5\b"+
		"q\n\b\3\t\3\t\3\t\5\tv\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0080"+
		"\n\13\3\f\5\f\u0083\n\f\3\f\6\f\u0086\n\f\r\f\16\f\u0087\3\f\3\f\6\f\u008c"+
		"\n\f\r\f\16\f\u008d\5\f\u0090\n\f\3\r\3\r\5\r\u0094\n\r\3\16\3\16\7\16"+
		"\u0098\n\16\f\16\16\16\u009b\13\16\3\17\3\17\5\17\u009f\n\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u00ad\n\24\3\24"+
		"\3\24\3\24\5\24\u00b2\n\24\7\24\u00b4\n\24\f\24\16\24\u00b7\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u00be\n\25\f\25\16\25\u00c1\13\25\3\25\3\25"+
		"\3\26\3\26\5\26\u00c7\n\26\3\26\3\26\3\26\5\26\u00cc\n\26\7\26\u00ce\n"+
		"\26\f\26\16\26\u00d1\13\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00d9\n"+
		"\30\3\31\3\31\3\31\5\31\u00de\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\5\34\u00eb\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668\2\4\3\2\25\26\5\2\3\3\16\17\21\21\u00f7\2=\3\2\2\2\4G\3"+
		"\2\2\2\6Z\3\2\2\2\b^\3\2\2\2\na\3\2\2\2\fe\3\2\2\2\16p\3\2\2\2\20u\3\2"+
		"\2\2\22w\3\2\2\2\24\177\3\2\2\2\26\u0082\3\2\2\2\30\u0093\3\2\2\2\32\u0095"+
		"\3\2\2\2\34\u009e\3\2\2\2\36\u00a0\3\2\2\2 \u00a2\3\2\2\2\"\u00a4\3\2"+
		"\2\2$\u00a8\3\2\2\2&\u00ac\3\2\2\2(\u00b8\3\2\2\2*\u00c6\3\2\2\2,\u00d2"+
		"\3\2\2\2.\u00d8\3\2\2\2\60\u00da\3\2\2\2\62\u00df\3\2\2\2\64\u00e1\3\2"+
		"\2\2\66\u00e6\3\2\2\28\u00ee\3\2\2\2:<\5\4\3\2;:\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\5\6\4\2AC\5\4\3\2BA\3\2\2\2CF\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2E\3\3\2\2\2FD\3\2\2\2GH\7\23\2\2HV\5\n\6\2I"+
		"S\7\f\2\2JK\5\f\7\2KL\7\20\2\2LN\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RT\5\f\7\2SO\3\2\2\2ST\3\2\2\2TU\3\2\2\2"+
		"UW\7\r\2\2VI\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\5\b\5\2Y\5\3\2\2\2Z[\7\23\2"+
		"\2[\\\7\24\2\2\\]\5\b\5\2]\7\3\2\2\2^_\5\16\b\2_\t\3\2\2\2`b\7\25\2\2"+
		"a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3\2\2\2ef\5\32\16\2f\r\3"+
		"\2\2\2gq\5\20\t\2hj\7\6\2\2ik\5\20\t\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2l"+
		"m\3\2\2\2mn\3\2\2\2no\7\n\2\2oq\3\2\2\2pg\3\2\2\2ph\3\2\2\2q\17\3\2\2"+
		"\2rv\5\22\n\2sv\5\34\17\2tv\5\"\22\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\21"+
		"\3\2\2\2wx\5\32\16\2xy\7\t\2\2yz\5\24\13\2z\23\3\2\2\2{\u0080\5.\30\2"+
		"|\u0080\5\60\31\2}\u0080\5*\26\2~\u0080\5,\27\2\177{\3\2\2\2\177|\3\2"+
		"\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\25\3\2\2\2\u0081\u0083\7\21\2\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\7\26"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008f\3\2\2\2\u0089\u008b\7\22\2\2\u008a\u008c\7"+
		"\26\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\27\3\2\2\2\u0091\u0094\5.\30\2\u0092\u0094\5\62\32\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\31\3\2\2\2\u0095\u0099\7\25\2"+
		"\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\33\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009f\5\64\33\2\u009d\u009f\5\66\34\2\u009e\u009c\3\2\2\2\u009e\u009d"+
		"\3\2\2\2\u009f\35\3\2\2\2\u00a0\u00a1\5 \21\2\u00a1\37\3\2\2\2\u00a2\u00a3"+
		"\58\35\2\u00a3!\3\2\2\2\u00a4\u00a5\5\62\32\2\u00a5\u00a6\7\22\2\2\u00a6"+
		"\u00a7\5\36\20\2\u00a7#\3\2\2\2\u00a8\u00a9\t\3\2\2\u00a9%\3\2\2\2\u00aa"+
		"\u00ad\5\26\f\2\u00ab\u00ad\5\62\32\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00b5\3\2\2\2\u00ae\u00b1\5$\23\2\u00af\u00b2\5\26\f\2"+
		"\u00b0\u00b2\5\62\32\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\'\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\f\2\2"+
		"\u00b9\u00bf\5&\24\2\u00ba\u00bb\5$\23\2\u00bb\u00bc\5(\25\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\r"+
		"\2\2\u00c3)\3\2\2\2\u00c4\u00c7\5&\24\2\u00c5\u00c7\5(\25\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00cf\3\2\2\2\u00c8\u00cb\5$\23\2\u00c9"+
		"\u00cc\5&\24\2\u00ca\u00cc\5(\25\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0+\3\2\2\2\u00d1\u00cf\3\2\2\2"+
		"\u00d2\u00d3\5\30\r\2\u00d3\u00d4\7\7\2\2\u00d4\u00d5\5\30\r\2\u00d5-"+
		"\3\2\2\2\u00d6\u00d9\5\26\f\2\u00d7\u00d9\7\32\2\2\u00d8\u00d6\3\2\2\2"+
		"\u00d8\u00d7\3\2\2\2\u00d9/\3\2\2\2\u00da\u00dd\7\33\2\2\u00db\u00dc\7"+
		"\22\2\2\u00dc\u00de\5 \21\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\61\3\2\2\2\u00df\u00e0\5\32\16\2\u00e0\63\3\2\2\2\u00e1\u00e2\7\13\2"+
		"\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\5\30\r\2\u00e4\u00e5\7\r\2\2\u00e5"+
		"\65\3\2\2\2\u00e6\u00e7\7\b\2\2\u00e7\u00ea\7\f\2\2\u00e8\u00eb\5,\27"+
		"\2\u00e9\u00eb\5\62\32\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\7\r\2\2\u00ed\67\3\2\2\2\u00ee\u00ef\7\5\2"+
		"\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\5\32\16\2\u00f1\u00f2\7\4\2\2\u00f2"+
		"\u00f3\5\16\b\2\u00f3\u00f4\7\n\2\2\u00f49\3\2\2\2\35=DOSVclpu\177\u0082"+
		"\u0087\u008d\u008f\u0093\u0099\u009e\u00ac\u00b1\u00b5\u00bf\u00c6\u00cb"+
		"\u00cf\u00d8\u00dd\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}