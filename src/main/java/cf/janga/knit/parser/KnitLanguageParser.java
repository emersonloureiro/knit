// Generated from KnitLanguage.g4 by ANTLR 4.2.2
package cf.janga.knit.parser;
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
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		FUNCTION_KEYWORD=10, MAIN_KEYWORD=11, ALPHA_CHARACTER=12, DIGIT=13, SPACE=14, 
		NEWLINE=15, TAB=16, STRING=17, COMMAND=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'print('", "'->'", "'('", "')'", "'{'", "','", "'='", "'}'", 
		"'.'", "'func'", "'main'", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", 
		"TAB", "STRING", "COMMAND"
	};
	public static final int
		RULE_knitProgram = 0, RULE_function = 1, RULE_mainFunction = 2, RULE_functionBody = 3, 
		RULE_functionName = 4, RULE_parameter = 5, RULE_code = 6, RULE_programmingConstruct = 7, 
		RULE_variableDeclaration = 8, RULE_variableValue = 9, RULE_number = 10, 
		RULE_argument = 11, RULE_identifier = 12, RULE_methodCall = 13, RULE_chainedCall = 14, 
		RULE_systemFunctions = 15, RULE_print = 16;
	public static final String[] ruleNames = {
		"knitProgram", "function", "mainFunction", "functionBody", "functionName", 
		"parameter", "code", "programmingConstruct", "variableDeclaration", "variableValue", 
		"number", "argument", "identifier", "methodCall", "chainedCall", "systemFunctions", 
		"print"
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
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34); function();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(40); mainFunction();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_KEYWORD) {
				{
				{
				setState(41); function();
				}
				}
				setState(46);
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
			setState(47); match(FUNCTION_KEYWORD);
			setState(48); functionName();
			setState(62);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(49); match(3);
				setState(59);
				_la = _input.LA(1);
				if (_la==ALPHA_CHARACTER) {
					{
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(50); parameter();
							setState(51); match(6);
							}
							} 
						}
						setState(57);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(58); parameter();
					}
				}

				setState(61); match(4);
				}
			}

			setState(64); functionBody();
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
			setState(66); match(FUNCTION_KEYWORD);
			setState(67); match(MAIN_KEYWORD);
			setState(68); functionBody();
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
			setState(70); code();
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
			setState(73); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(72); match(ALPHA_CHARACTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75); 
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
			setState(77); identifier();
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
			setState(88);
			switch (_input.LA(1)) {
			case 1:
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); programmingConstruct();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); match(5);
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81); programmingConstruct();
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==1 || _la==ALPHA_CHARACTER );
				setState(86); match(8);
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
			setState(92);
			switch (_input.LA(1)) {
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); variableDeclaration();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); systemFunctions();
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
			setState(94); identifier();
			setState(95); match(7);
			setState(96); variableValue();
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ChainedCallContext chainedCall() {
			return getRuleContext(ChainedCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KnitLanguageParser.STRING, 0); }
		public TerminalNode COMMAND() { return getToken(KnitLanguageParser.COMMAND, 0); }
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
		int _la;
		try {
			setState(104);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(99); match(STRING);
				}
				break;
			case COMMAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(100); match(COMMAND);
				setState(102);
				_la = _input.LA(1);
				if (_la==9) {
					{
					setState(101); chainedCall();
					}
				}

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
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106); match(DIGIT);
				}
				}
				setState(109); 
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(KnitLanguageParser.STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			setState(114);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(STRING);
				}
				break;
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(113); identifier();
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
		public TerminalNode ALPHA_CHARACTER(int i) {
			return getToken(KnitLanguageParser.ALPHA_CHARACTER, i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116); match(ALPHA_CHARACTER);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALPHA_CHARACTER );
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
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
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
		enterRule(_localctx, 26, RULE_methodCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(9);
			setState(122); functionName();
			setState(135);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(123); match(3);
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124); argument();
						setState(125); match(6);
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(132); argument();
				setState(133); match(4);
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

	public static class ChainedCallContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ChainedCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainedCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterChainedCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitChainedCall(this);
		}
	}

	public final ChainedCallContext chainedCall() throws RecognitionException {
		ChainedCallContext _localctx = new ChainedCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_chainedCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); methodCall();
			setState(138); match(5);
			setState(139); identifier();
			setState(140); match(2);
			setState(141); code();
			setState(142); match(8);
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
		enterRule(_localctx, 30, RULE_systemFunctions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); print();
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
		enterRule(_localctx, 32, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(1);
			setState(147); argument();
			setState(148); match(4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\5\3>\n\3\3\3\5\3A\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6L\n\6\r\6\16\6M\3\7\3\7\3\b\3\b\3"+
		"\b\6\bU\n\b\r\b\16\bV\3\b\3\b\5\b[\n\b\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\5\13i\n\13\5\13k\n\13\3\f\6\fn\n\f\r\f\16\fo\3"+
		"\r\3\r\3\r\5\ru\n\r\3\16\6\16x\n\16\r\16\16\16y\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\7\17\u0082\n\17\f\17\16\17\u0085\13\17\3\17\3\17\3\17\5\17\u008a"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\u0099\2\'\3"+
		"\2\2\2\4\61\3\2\2\2\6D\3\2\2\2\bH\3\2\2\2\nK\3\2\2\2\fO\3\2\2\2\16Z\3"+
		"\2\2\2\20^\3\2\2\2\22`\3\2\2\2\24j\3\2\2\2\26m\3\2\2\2\30t\3\2\2\2\32"+
		"w\3\2\2\2\34{\3\2\2\2\36\u008b\3\2\2\2 \u0092\3\2\2\2\"\u0094\3\2\2\2"+
		"$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2"+
		"\2\2*.\5\6\4\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3"+
		"\3\2\2\2\60.\3\2\2\2\61\62\7\f\2\2\62@\5\n\6\2\63=\7\5\2\2\64\65\5\f\7"+
		"\2\65\66\7\b\2\2\668\3\2\2\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2"+
		"\2\2:<\3\2\2\2;9\3\2\2\2<>\5\f\7\2=9\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\7\6"+
		"\2\2@\63\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\5\b\5\2C\5\3\2\2\2DE\7\f\2\2EF"+
		"\7\r\2\2FG\5\b\5\2G\7\3\2\2\2HI\5\16\b\2I\t\3\2\2\2JL\7\16\2\2KJ\3\2\2"+
		"\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\13\3\2\2\2OP\5\32\16\2P\r\3\2\2\2Q["+
		"\5\20\t\2RT\7\7\2\2SU\5\20\t\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2"+
		"WX\3\2\2\2XY\7\n\2\2Y[\3\2\2\2ZQ\3\2\2\2ZR\3\2\2\2[\17\3\2\2\2\\_\5\22"+
		"\n\2]_\5 \21\2^\\\3\2\2\2^]\3\2\2\2_\21\3\2\2\2`a\5\32\16\2ab\7\t\2\2"+
		"bc\5\24\13\2c\23\3\2\2\2dk\5\26\f\2ek\7\23\2\2fh\7\24\2\2gi\5\36\20\2"+
		"hg\3\2\2\2hi\3\2\2\2ik\3\2\2\2jd\3\2\2\2je\3\2\2\2jf\3\2\2\2k\25\3\2\2"+
		"\2ln\7\17\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\27\3\2\2\2qu\5"+
		"\26\f\2ru\7\23\2\2su\5\32\16\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\31\3\2\2"+
		"\2vx\7\16\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\33\3\2\2\2{|\7"+
		"\13\2\2|\u0089\5\n\6\2}\u0083\7\5\2\2~\177\5\30\r\2\177\u0080\7\b\2\2"+
		"\u0080\u0082\3\2\2\2\u0081~\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"\u0087\5\30\r\2\u0087\u0088\7\6\2\2\u0088\u008a\3\2\2\2\u0089}\3\2\2\2"+
		"\u0089\u008a\3\2\2\2\u008a\35\3\2\2\2\u008b\u008c\5\34\17\2\u008c\u008d"+
		"\7\7\2\2\u008d\u008e\5\32\16\2\u008e\u008f\7\4\2\2\u008f\u0090\5\16\b"+
		"\2\u0090\u0091\7\n\2\2\u0091\37\3\2\2\2\u0092\u0093\5\"\22\2\u0093!\3"+
		"\2\2\2\u0094\u0095\7\3\2\2\u0095\u0096\5\30\r\2\u0096\u0097\7\6\2\2\u0097"+
		"#\3\2\2\2\22\'.9=@MVZ^hjoty\u0083\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}