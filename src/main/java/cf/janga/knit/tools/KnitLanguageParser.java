// Generated from KnitLanguage.g4 by ANTLR 4.2.2
package cf.janga.knit.tools;
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
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, ALPHA_CHARACTER=13, DIGIT=14, DECIMAL=15, MISC_CHARACTER=16, 
		NEWLINE=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "'func'", "'main'", "'\"'", "'return'", "'('", "')'", "'['", 
		"'{'", "','", "']'", "'='", "'}'", "ALPHA_CHARACTER", "DIGIT", "DECIMAL", 
		"MISC_CHARACTER", "NEWLINE", "WS"
	};
	public static final int
		RULE_knitProgram = 0, RULE_functionEx = 1, RULE_mainFunctionEx = 2, RULE_functionBodyEx = 3, 
		RULE_functionNameEx = 4, RULE_parameter = 5, RULE_parameterName = 6, RULE_codeEx = 7, 
		RULE_programmingConstruct = 8, RULE_variableDeclaration = 9, RULE_varNameEx = 10, 
		RULE_varValueEx = 11, RULE_commandVarEx = 12, RULE_constantVarValueEx = 13, 
		RULE_numberVarValue = 14, RULE_stringVarValue = 15, RULE_number = 16, 
		RULE_string = 17, RULE_charSequence = 18, RULE_commandEx = 19, RULE_funcKw = 20, 
		RULE_returnKw = 21;
	public static final String[] ruleNames = {
		"knitProgram", "functionEx", "mainFunctionEx", "functionBodyEx", "functionNameEx", 
		"parameter", "parameterName", "codeEx", "programmingConstruct", "variableDeclaration", 
		"varNameEx", "varValueEx", "commandVarEx", "constantVarValueEx", "numberVarValue", 
		"stringVarValue", "number", "string", "charSequence", "commandEx", "funcKw", 
		"returnKw"
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
		public List<FunctionExContext> functionEx() {
			return getRuleContexts(FunctionExContext.class);
		}
		public FunctionExContext functionEx(int i) {
			return getRuleContext(FunctionExContext.class,i);
		}
		public MainFunctionExContext mainFunctionEx() {
			return getRuleContext(MainFunctionExContext.class,0);
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
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44); functionEx();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(50); mainFunctionEx();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1) {
				{
				{
				setState(51); functionEx();
				}
				}
				setState(56);
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

	public static class FunctionExContext extends ParserRuleContext {
		public FunctionBodyExContext functionBodyEx() {
			return getRuleContext(FunctionBodyExContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public FuncKwContext funcKw() {
			return getRuleContext(FuncKwContext.class,0);
		}
		public FunctionNameExContext functionNameEx() {
			return getRuleContext(FunctionNameExContext.class,0);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FunctionExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterFunctionEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitFunctionEx(this);
		}
	}

	public final FunctionExContext functionEx() throws RecognitionException {
		FunctionExContext _localctx = new FunctionExContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionEx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57); funcKw();
			setState(58); functionNameEx();
			setState(72);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(59); match(5);
				setState(69);
				_la = _input.LA(1);
				if (_la==ALPHA_CHARACTER) {
					{
					setState(65);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(60); parameter();
							setState(61); match(9);
							}
							} 
						}
						setState(67);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(68); parameter();
					}
				}

				setState(71); match(6);
				}
			}

			setState(74); functionBodyEx();
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

	public static class MainFunctionExContext extends ParserRuleContext {
		public FunctionBodyExContext functionBodyEx() {
			return getRuleContext(FunctionBodyExContext.class,0);
		}
		public FuncKwContext funcKw() {
			return getRuleContext(FuncKwContext.class,0);
		}
		public MainFunctionExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunctionEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterMainFunctionEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitMainFunctionEx(this);
		}
	}

	public final MainFunctionExContext mainFunctionEx() throws RecognitionException {
		MainFunctionExContext _localctx = new MainFunctionExContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunctionEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); funcKw();
			setState(77); match(2);
			setState(78); functionBodyEx();
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

	public static class FunctionBodyExContext extends ParserRuleContext {
		public CodeExContext codeEx() {
			return getRuleContext(CodeExContext.class,0);
		}
		public FunctionBodyExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBodyEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterFunctionBodyEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitFunctionBodyEx(this);
		}
	}

	public final FunctionBodyExContext functionBodyEx() throws RecognitionException {
		FunctionBodyExContext _localctx = new FunctionBodyExContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionBodyEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); codeEx();
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

	public static class FunctionNameExContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_CHARACTER() { return getTokens(KnitLanguageParser.ALPHA_CHARACTER); }
		public TerminalNode ALPHA_CHARACTER(int i) {
			return getToken(KnitLanguageParser.ALPHA_CHARACTER, i);
		}
		public FunctionNameExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNameEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterFunctionNameEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitFunctionNameEx(this);
		}
	}

	public final FunctionNameExContext functionNameEx() throws RecognitionException {
		FunctionNameExContext _localctx = new FunctionNameExContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionNameEx);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(82); match(ALPHA_CHARACTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(85); 
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
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
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
			setState(87); parameterName();
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

	public static class ParameterNameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_CHARACTER() { return getTokens(KnitLanguageParser.ALPHA_CHARACTER); }
		public TerminalNode ALPHA_CHARACTER(int i) {
			return getToken(KnitLanguageParser.ALPHA_CHARACTER, i);
		}
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitParameterName(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89); match(ALPHA_CHARACTER);
				}
				}
				setState(92); 
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

	public static class CodeExContext extends ParserRuleContext {
		public ProgrammingConstructContext programmingConstruct(int i) {
			return getRuleContext(ProgrammingConstructContext.class,i);
		}
		public List<ProgrammingConstructContext> programmingConstruct() {
			return getRuleContexts(ProgrammingConstructContext.class);
		}
		public CodeExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterCodeEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitCodeEx(this);
		}
	}

	public final CodeExContext codeEx() throws RecognitionException {
		CodeExContext _localctx = new CodeExContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_codeEx);
		int _la;
		try {
			setState(103);
			switch (_input.LA(1)) {
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); programmingConstruct();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(8);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96); programmingConstruct();
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA_CHARACTER );
				setState(101); match(12);
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
		enterRule(_localctx, 16, RULE_programmingConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); variableDeclaration();
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
		public VarValueExContext varValueEx() {
			return getRuleContext(VarValueExContext.class,0);
		}
		public VarNameExContext varNameEx() {
			return getRuleContext(VarNameExContext.class,0);
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
		enterRule(_localctx, 18, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); varNameEx();
			setState(108); match(11);
			setState(109); varValueEx();
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

	public static class VarNameExContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_CHARACTER() { return getTokens(KnitLanguageParser.ALPHA_CHARACTER); }
		public TerminalNode ALPHA_CHARACTER(int i) {
			return getToken(KnitLanguageParser.ALPHA_CHARACTER, i);
		}
		public VarNameExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNameEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterVarNameEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitVarNameEx(this);
		}
	}

	public final VarNameExContext varNameEx() throws RecognitionException {
		VarNameExContext _localctx = new VarNameExContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varNameEx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111); match(ALPHA_CHARACTER);
				}
				}
				setState(114); 
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

	public static class VarValueExContext extends ParserRuleContext {
		public CommandVarExContext commandVarEx() {
			return getRuleContext(CommandVarExContext.class,0);
		}
		public ConstantVarValueExContext constantVarValueEx() {
			return getRuleContext(ConstantVarValueExContext.class,0);
		}
		public VarValueExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varValueEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterVarValueEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitVarValueEx(this);
		}
	}

	public final VarValueExContext varValueEx() throws RecognitionException {
		VarValueExContext _localctx = new VarValueExContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varValueEx);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case 3:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); constantVarValueEx();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); commandVarEx();
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

	public static class CommandVarExContext extends ParserRuleContext {
		public CommandExContext commandEx() {
			return getRuleContext(CommandExContext.class,0);
		}
		public CommandVarExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandVarEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterCommandVarEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitCommandVarEx(this);
		}
	}

	public final CommandVarExContext commandVarEx() throws RecognitionException {
		CommandVarExContext _localctx = new CommandVarExContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commandVarEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); commandEx();
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

	public static class ConstantVarValueExContext extends ParserRuleContext {
		public NumberVarValueContext numberVarValue() {
			return getRuleContext(NumberVarValueContext.class,0);
		}
		public StringVarValueContext stringVarValue() {
			return getRuleContext(StringVarValueContext.class,0);
		}
		public ConstantVarValueExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantVarValueEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterConstantVarValueEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitConstantVarValueEx(this);
		}
	}

	public final ConstantVarValueExContext constantVarValueEx() throws RecognitionException {
		ConstantVarValueExContext _localctx = new ConstantVarValueExContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constantVarValueEx);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); numberVarValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); stringVarValue();
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

	public static class NumberVarValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberVarValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberVarValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterNumberVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitNumberVarValue(this);
		}
	}

	public final NumberVarValueContext numberVarValue() throws RecognitionException {
		NumberVarValueContext _localctx = new NumberVarValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numberVarValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); number();
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

	public static class StringVarValueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringVarValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringVarValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterStringVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitStringVarValue(this);
		}
	}

	public final StringVarValueContext stringVarValue() throws RecognitionException {
		StringVarValueContext _localctx = new StringVarValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stringVarValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); string();
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
		enterRule(_localctx, 32, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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

	public static class StringContext extends ParserRuleContext {
		public CharSequenceContext charSequence() {
			return getRuleContext(CharSequenceContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(3);
			setState(136); charSequence();
			setState(137); match(3);
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

	public static class CharSequenceContext extends ParserRuleContext {
		public List<TerminalNode> MISC_CHARACTER() { return getTokens(KnitLanguageParser.MISC_CHARACTER); }
		public List<TerminalNode> ALPHA_CHARACTER() { return getTokens(KnitLanguageParser.ALPHA_CHARACTER); }
		public TerminalNode DIGIT(int i) {
			return getToken(KnitLanguageParser.DIGIT, i);
		}
		public TerminalNode ALPHA_CHARACTER(int i) {
			return getToken(KnitLanguageParser.ALPHA_CHARACTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(KnitLanguageParser.DIGIT); }
		public TerminalNode MISC_CHARACTER(int i) {
			return getToken(KnitLanguageParser.MISC_CHARACTER, i);
		}
		public CharSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterCharSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitCharSequence(this);
		}
	}

	public final CharSequenceContext charSequence() throws RecognitionException {
		CharSequenceContext _localctx = new CharSequenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_charSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA_CHARACTER) | (1L << DIGIT) | (1L << MISC_CHARACTER))) != 0)) {
				{
				{
				setState(139);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA_CHARACTER) | (1L << DIGIT) | (1L << MISC_CHARACTER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(144);
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

	public static class CommandExContext extends ParserRuleContext {
		public CharSequenceContext charSequence() {
			return getRuleContext(CharSequenceContext.class,0);
		}
		public CommandExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterCommandEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitCommandEx(this);
		}
	}

	public final CommandExContext commandEx() throws RecognitionException {
		CommandExContext _localctx = new CommandExContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_commandEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(7);
			setState(146); charSequence();
			setState(147); match(10);
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

	public static class FuncKwContext extends ParserRuleContext {
		public FuncKwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcKw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterFuncKw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitFuncKw(this);
		}
	}

	public final FuncKwContext funcKw() throws RecognitionException {
		FuncKwContext _localctx = new FuncKwContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcKw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(1);
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

	public static class ReturnKwContext extends ParserRuleContext {
		public ReturnKwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnKw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterReturnKw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitReturnKw(this);
		}
	}

	public final ReturnKwContext returnKw() throws RecognitionException {
		ReturnKwContext _localctx = new ReturnKwContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnKw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u009c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3B\n\3\f\3\16\3E\13\3\3\3\5\3H\n\3\3\3\5\3K\n\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\6\6V\n\6\r\6\16\6W\3\7\3\7\3\b\6\b]\n\b\r\b\16\b^\3"+
		"\t\3\t\3\t\6\td\n\t\r\t\16\te\3\t\3\t\5\tj\n\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\f\6\fs\n\f\r\f\16\ft\3\r\3\r\5\ry\n\r\3\16\3\16\3\17\3\17\5\17"+
		"\177\n\17\3\20\3\20\3\21\3\21\3\22\6\22\u0086\n\22\r\22\16\22\u0087\3"+
		"\23\3\23\3\23\3\23\3\24\7\24\u008f\n\24\f\24\16\24\u0092\13\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,\2\3\4\2\17\20\22\22\u0093\2\61\3\2\2\2\4;\3\2"+
		"\2\2\6N\3\2\2\2\bR\3\2\2\2\nU\3\2\2\2\fY\3\2\2\2\16\\\3\2\2\2\20i\3\2"+
		"\2\2\22k\3\2\2\2\24m\3\2\2\2\26r\3\2\2\2\30x\3\2\2\2\32z\3\2\2\2\34~\3"+
		"\2\2\2\36\u0080\3\2\2\2 \u0082\3\2\2\2\"\u0085\3\2\2\2$\u0089\3\2\2\2"+
		"&\u0090\3\2\2\2(\u0093\3\2\2\2*\u0097\3\2\2\2,\u0099\3\2\2\2.\60\5\4\3"+
		"\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\648\5\6\4\2\65\67\5\4\3\2\66\65\3\2\2\2\67:\3\2\2\28\66\3"+
		"\2\2\289\3\2\2\29\3\3\2\2\2:8\3\2\2\2;<\5*\26\2<J\5\n\6\2=G\7\7\2\2>?"+
		"\5\f\7\2?@\7\13\2\2@B\3\2\2\2A>\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2"+
		"DF\3\2\2\2EC\3\2\2\2FH\5\f\7\2GC\3\2\2\2GH\3\2\2\2HI\3\2\2\2IK\7\b\2\2"+
		"J=\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\5\b\5\2M\5\3\2\2\2NO\5*\26\2OP\7\4\2"+
		"\2PQ\5\b\5\2Q\7\3\2\2\2RS\5\20\t\2S\t\3\2\2\2TV\7\17\2\2UT\3\2\2\2VW\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X\13\3\2\2\2YZ\5\16\b\2Z\r\3\2\2\2[]\7\17\2"+
		"\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\17\3\2\2\2`j\5\22\n\2ac"+
		"\7\n\2\2bd\5\22\n\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2"+
		"gh\7\16\2\2hj\3\2\2\2i`\3\2\2\2ia\3\2\2\2j\21\3\2\2\2kl\5\24\13\2l\23"+
		"\3\2\2\2mn\5\26\f\2no\7\r\2\2op\5\30\r\2p\25\3\2\2\2qs\7\17\2\2rq\3\2"+
		"\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\27\3\2\2\2vy\5\34\17\2wy\5\32\16\2"+
		"xv\3\2\2\2xw\3\2\2\2y\31\3\2\2\2z{\5(\25\2{\33\3\2\2\2|\177\5\36\20\2"+
		"}\177\5 \21\2~|\3\2\2\2~}\3\2\2\2\177\35\3\2\2\2\u0080\u0081\5\"\22\2"+
		"\u0081\37\3\2\2\2\u0082\u0083\5$\23\2\u0083!\3\2\2\2\u0084\u0086\7\20"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088#\3\2\2\2\u0089\u008a\7\5\2\2\u008a\u008b\5&\24\2"+
		"\u008b\u008c\7\5\2\2\u008c%\3\2\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\'\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\t\2\2\u0094\u0095\5&\24\2"+
		"\u0095\u0096\7\f\2\2\u0096)\3\2\2\2\u0097\u0098\7\3\2\2\u0098+\3\2\2\2"+
		"\u0099\u009a\7\6\2\2\u009a-\3\2\2\2\20\618CGJW^eitx~\u0087\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}