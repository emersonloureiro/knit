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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		FUNCTION_KEYWORD=18, MAIN_KEYWORD=19, ALPHA_CHARACTER=20, DIGIT=21, SPACE=22, 
		NEWLINE=23, TAB=24, STRING=25, COMMAND=26, IDENTIFIER=27, COMMENT=28;
	public static final int
		RULE_knitProgram = 0, RULE_function = 1, RULE_mainFunction = 2, RULE_functionBody = 3, 
		RULE_parameter = 4, RULE_code = 5, RULE_programmingConstruct = 6, RULE_variableDeclaration = 7, 
		RULE_variableValue = 8, RULE_number = 9, RULE_argument = 10, RULE_identifier = 11, 
		RULE_systemFunctions = 12, RULE_systemMethod = 13, RULE_listMethods = 14, 
		RULE_methodCall = 15, RULE_mathOperator = 16, RULE_simpleMathExpression = 17, 
		RULE_enclosedMathExpression = 18, RULE_complexMathExpression = 19, RULE_booleanExpression = 20, 
		RULE_constant = 21, RULE_commandExpression = 22, RULE_plainCommand = 23, 
		RULE_asListCommand = 24, RULE_variableReference = 25, RULE_print = 26, 
		RULE_assertion = 27, RULE_foreach = 28;
	public static final String[] ruleNames = {
		"knitProgram", "function", "mainFunction", "functionBody", "parameter", 
		"code", "programmingConstruct", "variableDeclaration", "variableValue", 
		"number", "argument", "identifier", "systemFunctions", "systemMethod", 
		"listMethods", "methodCall", "mathOperator", "simpleMathExpression", "enclosedMathExpression", 
		"complexMathExpression", "booleanExpression", "constant", "commandExpression", 
		"plainCommand", "asListCommand", "variableReference", "print", "assertion", 
		"foreach"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'{'", "'}'", "'='", "'-'", "'.'", "'+'", "'*'", 
		"'/'", "'=='", "'asList'", "'print'", "'assert'", "'foreach'", "'->'", 
		"'func'", "'main'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "FUNCTION_KEYWORD", "MAIN_KEYWORD", 
		"ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB", "STRING", "COMMAND", 
		"IDENTIFIER", "COMMENT"
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
			setState(71);
			match(FUNCTION_KEYWORD);
			setState(72);
			identifier();
			setState(86);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(73);
				match(T__0);
				setState(83);
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
			setState(90);
			match(FUNCTION_KEYWORD);
			setState(91);
			match(MAIN_KEYWORD);
			setState(92);
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
			setState(94);
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
			setState(96);
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
			setState(107);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case COMMAND:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				programmingConstruct();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__3);
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					programmingConstruct();
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << COMMAND) | (1L << IDENTIFIER))) != 0) );
				setState(105);
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
		enterRule(_localctx, 12, RULE_programmingConstruct);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				systemFunctions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				methodCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				commandExpression();
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
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
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
			setState(115);
			identifier();
			setState(116);
			match(T__5);
			setState(117);
			variableValue();
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
		public CommandExpressionContext commandExpression() {
			return getRuleContext(CommandExpressionContext.class,0);
		}
		public ComplexMathExpressionContext complexMathExpression() {
			return getRuleContext(ComplexMathExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		enterRule(_localctx, 16, RULE_variableValue);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				commandExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				complexMathExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
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
		enterRule(_localctx, 18, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(125);
				match(T__6);
				}
			}

			{
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				match(DIGIT);
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
			setState(139);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(133);
				match(T__7);
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					match(DIGIT);
					}
					}
					setState(137); 
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
		enterRule(_localctx, 20, RULE_argument);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case T__6:
			case DIGIT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				constant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
		enterRule(_localctx, 22, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		enterRule(_localctx, 24, RULE_systemFunctions);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				print();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
		enterRule(_localctx, 26, RULE_systemMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			listMethods();
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
		enterRule(_localctx, 28, RULE_listMethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			foreach();
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
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public SystemMethodContext systemMethod() {
			return getRuleContext(SystemMethodContext.class,0);
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
		enterRule(_localctx, 30, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			variableReference();
			setState(156);
			match(T__7);
			setState(157);
			systemMethod();
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
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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
			setState(163);
			switch (_input.LA(1)) {
			case T__6:
			case DIGIT:
				{
				setState(161);
				number();
				}
				break;
			case IDENTIFIER:
				{
				setState(162);
				variableReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					mathOperator();
					setState(168);
					switch (_input.LA(1)) {
					case T__6:
					case DIGIT:
						{
						setState(166);
						number();
						}
						break;
					case IDENTIFIER:
						{
						setState(167);
						variableReference();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
			setState(175);
			match(T__0);
			setState(176);
			simpleMathExpression();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(177);
				mathOperator();
				setState(178);
				enclosedMathExpression();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
			setState(189);
			switch (_input.LA(1)) {
			case T__6:
			case DIGIT:
			case IDENTIFIER:
				{
				setState(187);
				simpleMathExpression();
				}
				break;
			case T__0:
				{
				setState(188);
				enclosedMathExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(191);
				mathOperator();
				setState(194);
				switch (_input.LA(1)) {
				case T__6:
				case DIGIT:
				case IDENTIFIER:
					{
					setState(192);
					simpleMathExpression();
					}
					break;
				case T__0:
					{
					setState(193);
					enclosedMathExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(200);
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
		enterRule(_localctx, 40, RULE_booleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			argument();
			setState(202);
			match(T__11);
			setState(203);
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
			setState(207);
			switch (_input.LA(1)) {
			case T__6:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
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
		public PlainCommandContext plainCommand() {
			return getRuleContext(PlainCommandContext.class,0);
		}
		public AsListCommandContext asListCommand() {
			return getRuleContext(AsListCommandContext.class,0);
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
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				plainCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				asListCommand();
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
		enterRule(_localctx, 46, RULE_plainCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(COMMAND);
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
		public TerminalNode COMMAND() { return getToken(KnitLanguageParser.COMMAND, 0); }
		public ListMethodsContext listMethods() {
			return getRuleContext(ListMethodsContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_asListCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(COMMAND);
			setState(216);
			match(T__7);
			setState(217);
			match(T__12);
			setState(220);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(218);
				match(T__7);
				setState(219);
				listMethods();
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
		enterRule(_localctx, 50, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
			setState(224);
			match(T__13);
			setState(225);
			match(T__0);
			setState(226);
			argument();
			setState(227);
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
			setState(229);
			match(T__14);
			setState(230);
			match(T__0);
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(231);
				booleanExpression();
				}
				break;
			case 2:
				{
				setState(232);
				variableReference();
				}
				break;
			}
			setState(235);
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

	public static class ForeachContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
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
		enterRule(_localctx, 56, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__15);
			setState(238);
			match(T__3);
			setState(239);
			identifier();
			setState(240);
			match(T__16);
			setState(241);
			functionBody();
			setState(242);
			match(T__4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u00f7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3P"+
		"\n\3\f\3\16\3S\13\3\3\3\5\3V\n\3\3\3\5\3Y\n\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\6\7h\n\7\r\7\16\7i\3\7\3\7\5\7n\n\7\3\b\3"+
		"\b\3\b\3\b\5\bt\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\5\13"+
		"\u0081\n\13\3\13\6\13\u0084\n\13\r\13\16\13\u0085\3\13\3\13\6\13\u008a"+
		"\n\13\r\13\16\13\u008b\5\13\u008e\n\13\3\f\3\f\5\f\u0092\n\f\3\r\3\r\3"+
		"\16\3\16\5\16\u0098\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\5\23\u00a6\n\23\3\23\3\23\3\23\5\23\u00ab\n\23\7\23\u00ad"+
		"\n\23\f\23\16\23\u00b0\13\23\3\24\3\24\3\24\3\24\3\24\7\24\u00b7\n\24"+
		"\f\24\16\24\u00ba\13\24\3\24\3\24\3\25\3\25\5\25\u00c0\n\25\3\25\3\25"+
		"\3\25\5\25\u00c5\n\25\7\25\u00c7\n\25\f\25\16\25\u00ca\13\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\5\27\u00d2\n\27\3\30\3\30\5\30\u00d6\n\30\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\5\32\u00df\n\32\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u00ec\n\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\3\4\2\t\t\13\r\u00f7\2?\3\2\2\2\4I\3\2\2\2\6"+
		"\\\3\2\2\2\b`\3\2\2\2\nb\3\2\2\2\fm\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2\22"+
		"}\3\2\2\2\24\u0080\3\2\2\2\26\u0091\3\2\2\2\30\u0093\3\2\2\2\32\u0097"+
		"\3\2\2\2\34\u0099\3\2\2\2\36\u009b\3\2\2\2 \u009d\3\2\2\2\"\u00a1\3\2"+
		"\2\2$\u00a5\3\2\2\2&\u00b1\3\2\2\2(\u00bf\3\2\2\2*\u00cb\3\2\2\2,\u00d1"+
		"\3\2\2\2.\u00d5\3\2\2\2\60\u00d7\3\2\2\2\62\u00d9\3\2\2\2\64\u00e0\3\2"+
		"\2\2\66\u00e2\3\2\2\28\u00e7\3\2\2\2:\u00ef\3\2\2\2<>\5\4\3\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BF\5\6\4\2CE\5\4\3"+
		"\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\3\3\2\2\2HF\3\2\2\2IJ\7\24"+
		"\2\2JX\5\30\r\2KU\7\3\2\2LM\5\n\6\2MN\7\4\2\2NP\3\2\2\2OL\3\2\2\2PS\3"+
		"\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TV\5\n\6\2UQ\3\2\2\2UV\3"+
		"\2\2\2VW\3\2\2\2WY\7\5\2\2XK\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\5\b\5\2[\5"+
		"\3\2\2\2\\]\7\24\2\2]^\7\25\2\2^_\5\b\5\2_\7\3\2\2\2`a\5\f\7\2a\t\3\2"+
		"\2\2bc\5\30\r\2c\13\3\2\2\2dn\5\16\b\2eg\7\6\2\2fh\5\16\b\2gf\3\2\2\2"+
		"hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\7\2\2ln\3\2\2\2md\3\2\2\2"+
		"me\3\2\2\2n\r\3\2\2\2ot\5\20\t\2pt\5\32\16\2qt\5 \21\2rt\5.\30\2so\3\2"+
		"\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\17\3\2\2\2uv\5\30\r\2vw\7\b\2\2wx"+
		"\5\22\n\2x\21\3\2\2\2y~\5,\27\2z~\5.\30\2{~\5(\25\2|~\5*\26\2}y\3\2\2"+
		"\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\23\3\2\2\2\177\u0081\7\t\2\2\u0080\177"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0084\7\27\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u008d\3\2\2\2\u0087\u0089\7\n\2\2\u0088\u008a\7\27\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\25\3\2\2\2\u008f\u0092\5,\27\2\u0090\u0092\5\64\33\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0090\3\2\2\2\u0092\27\3\2\2\2\u0093\u0094\7\35\2\2\u0094\31"+
		"\3\2\2\2\u0095\u0098\5\66\34\2\u0096\u0098\58\35\2\u0097\u0095\3\2\2\2"+
		"\u0097\u0096\3\2\2\2\u0098\33\3\2\2\2\u0099\u009a\5\36\20\2\u009a\35\3"+
		"\2\2\2\u009b\u009c\5:\36\2\u009c\37\3\2\2\2\u009d\u009e\5\64\33\2\u009e"+
		"\u009f\7\n\2\2\u009f\u00a0\5\34\17\2\u00a0!\3\2\2\2\u00a1\u00a2\t\2\2"+
		"\2\u00a2#\3\2\2\2\u00a3\u00a6\5\24\13\2\u00a4\u00a6\5\64\33\2\u00a5\u00a3"+
		"\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00ae\3\2\2\2\u00a7\u00aa\5\"\22\2"+
		"\u00a8\u00ab\5\24\13\2\u00a9\u00ab\5\64\33\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af%\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b2\7\3\2\2\u00b2\u00b8\5$\23\2\u00b3\u00b4\5\"\22\2"+
		"\u00b4\u00b5\5&\24\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\u00ba"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\7\5\2\2\u00bc\'\3\2\2\2\u00bd\u00c0\5$\23\2"+
		"\u00be\u00c0\5&\24\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c8"+
		"\3\2\2\2\u00c1\u00c4\5\"\22\2\u00c2\u00c5\5$\23\2\u00c3\u00c5\5&\24\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		")\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd\7\16\2"+
		"\2\u00cd\u00ce\5\26\f\2\u00ce+\3\2\2\2\u00cf\u00d2\5\24\13\2\u00d0\u00d2"+
		"\7\33\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2-\3\2\2\2\u00d3"+
		"\u00d6\5\60\31\2\u00d4\u00d6\5\62\32\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6/\3\2\2\2\u00d7\u00d8\7\34\2\2\u00d8\61\3\2\2\2\u00d9\u00da"+
		"\7\34\2\2\u00da\u00db\7\n\2\2\u00db\u00de\7\17\2\2\u00dc\u00dd\7\n\2\2"+
		"\u00dd\u00df\5\36\20\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\63"+
		"\3\2\2\2\u00e0\u00e1\5\30\r\2\u00e1\65\3\2\2\2\u00e2\u00e3\7\20\2\2\u00e3"+
		"\u00e4\7\3\2\2\u00e4\u00e5\5\26\f\2\u00e5\u00e6\7\5\2\2\u00e6\67\3\2\2"+
		"\2\u00e7\u00e8\7\21\2\2\u00e8\u00eb\7\3\2\2\u00e9\u00ec\5*\26\2\u00ea"+
		"\u00ec\5\64\33\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3"+
		"\2\2\2\u00ed\u00ee\7\5\2\2\u00ee9\3\2\2\2\u00ef\u00f0\7\22\2\2\u00f0\u00f1"+
		"\7\6\2\2\u00f1\u00f2\5\30\r\2\u00f2\u00f3\7\23\2\2\u00f3\u00f4\5\b\5\2"+
		"\u00f4\u00f5\7\7\2\2\u00f5;\3\2\2\2\34?FQUXims}\u0080\u0085\u008b\u008d"+
		"\u0091\u0097\u00a5\u00aa\u00ae\u00b8\u00bf\u00c4\u00c8\u00d1\u00d5\u00de"+
		"\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}