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
		RULE_functionNameEx = 4, RULE_parameterEx = 5, RULE_codeEx = 6, RULE_programmingConstruct = 7, 
		RULE_varEx = 8, RULE_varNameEx = 9, RULE_varValueEx = 10, RULE_constantVarValueEx = 11, 
		RULE_numberEx = 12, RULE_string = 13, RULE_charSequence = 14, RULE_commandEx = 15, 
		RULE_funcKw = 16, RULE_returnKw = 17;
	public static final String[] ruleNames = {
		"knitProgram", "functionEx", "mainFunctionEx", "functionBodyEx", "functionNameEx", 
		"parameterEx", "codeEx", "programmingConstruct", "varEx", "varNameEx", 
		"varValueEx", "constantVarValueEx", "numberEx", "string", "charSequence", 
		"commandEx", "funcKw", "returnKw"
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
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36); functionEx();
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(42); mainFunctionEx();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==1) {
				{
				{
				setState(43); functionEx();
				}
				}
				setState(48);
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
		public ParameterExContext parameterEx(int i) {
			return getRuleContext(ParameterExContext.class,i);
		}
		public FuncKwContext funcKw() {
			return getRuleContext(FuncKwContext.class,0);
		}
		public FunctionNameExContext functionNameEx() {
			return getRuleContext(FunctionNameExContext.class,0);
		}
		public List<ParameterExContext> parameterEx() {
			return getRuleContexts(ParameterExContext.class);
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
			setState(49); funcKw();
			setState(50); functionNameEx();
			setState(64);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(51); match(5);
				setState(61);
				_la = _input.LA(1);
				if (_la==ALPHA_CHARACTER) {
					{
					setState(57);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(52); parameterEx();
							setState(53); match(9);
							}
							} 
						}
						setState(59);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					}
					setState(60); parameterEx();
					}
				}

				setState(63); match(6);
				}
			}

			setState(66); functionBodyEx();
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
			setState(68); funcKw();
			setState(69); match(2);
			setState(70); functionBodyEx();
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
			setState(72); codeEx();
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
			setState(75); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74); match(ALPHA_CHARACTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(77); 
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

	public static class ParameterExContext extends ParserRuleContext {
		public VarNameExContext varNameEx() {
			return getRuleContext(VarNameExContext.class,0);
		}
		public ParameterExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterParameterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitParameterEx(this);
		}
	}

	public final ParameterExContext parameterEx() throws RecognitionException {
		ParameterExContext _localctx = new ParameterExContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); varNameEx();
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
		enterRule(_localctx, 12, RULE_codeEx);
		int _la;
		try {
			setState(90);
			switch (_input.LA(1)) {
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); programmingConstruct();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(8);
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83); programmingConstruct();
					}
					}
					setState(86); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA_CHARACTER );
				setState(88); match(12);
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
		public VarExContext varEx() {
			return getRuleContext(VarExContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(92); varEx();
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

	public static class VarExContext extends ParserRuleContext {
		public VarValueExContext varValueEx() {
			return getRuleContext(VarValueExContext.class,0);
		}
		public VarNameExContext varNameEx() {
			return getRuleContext(VarNameExContext.class,0);
		}
		public VarExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterVarEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitVarEx(this);
		}
	}

	public final VarExContext varEx() throws RecognitionException {
		VarExContext _localctx = new VarExContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); varNameEx();
			setState(95); match(11);
			setState(96); varValueEx();
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
		enterRule(_localctx, 18, RULE_varNameEx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98); match(ALPHA_CHARACTER);
				}
				}
				setState(101); 
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
		public ConstantVarValueExContext constantVarValueEx() {
			return getRuleContext(ConstantVarValueExContext.class,0);
		}
		public CommandExContext commandEx() {
			return getRuleContext(CommandExContext.class,0);
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
		enterRule(_localctx, 20, RULE_varValueEx);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case 3:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); constantVarValueEx();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); commandEx();
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

	public static class ConstantVarValueExContext extends ParserRuleContext {
		public NumberExContext numberEx() {
			return getRuleContext(NumberExContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 22, RULE_constantVarValueEx);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); numberEx();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); string();
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

	public static class NumberExContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(KnitLanguageParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(KnitLanguageParser.DIGIT); }
		public NumberExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterNumberEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitNumberEx(this);
		}
	}

	public final NumberExContext numberEx() throws RecognitionException {
		NumberExContext _localctx = new NumberExContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numberEx);
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
				setState(111); match(DIGIT);
				}
				}
				setState(114); 
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
		enterRule(_localctx, 26, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(3);
			setState(117); charSequence();
			setState(118); match(3);
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
		enterRule(_localctx, 28, RULE_charSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA_CHARACTER) | (1L << DIGIT) | (1L << MISC_CHARACTER))) != 0)) {
				{
				{
				setState(120);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA_CHARACTER) | (1L << DIGIT) | (1L << MISC_CHARACTER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(125);
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
		enterRule(_localctx, 30, RULE_commandEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(7);
			setState(127); charSequence();
			setState(128); match(10);
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
		enterRule(_localctx, 32, RULE_funcKw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(1);
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
		enterRule(_localctx, 34, RULE_returnKw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\5\3@\n\3\3\3\5"+
		"\3C\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6N\n\6\r\6\16\6O\3\7\3\7"+
		"\3\b\3\b\3\b\6\bW\n\b\r\b\16\bX\3\b\3\b\5\b]\n\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\6\13f\n\13\r\13\16\13g\3\f\3\f\5\fl\n\f\3\r\3\r\5\rp\n\r\3\16"+
		"\6\16s\n\16\r\16\16\16t\3\17\3\17\3\17\3\17\3\20\7\20|\n\20\f\20\16\20"+
		"\177\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\4\2\17\20\22\22\u0083\2)\3\2\2"+
		"\2\4\63\3\2\2\2\6F\3\2\2\2\bJ\3\2\2\2\nM\3\2\2\2\fQ\3\2\2\2\16\\\3\2\2"+
		"\2\20^\3\2\2\2\22`\3\2\2\2\24e\3\2\2\2\26k\3\2\2\2\30o\3\2\2\2\32r\3\2"+
		"\2\2\34v\3\2\2\2\36}\3\2\2\2 \u0080\3\2\2\2\"\u0084\3\2\2\2$\u0086\3\2"+
		"\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3"+
		"\2\2\2,\60\5\6\4\2-/\5\4\3\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3"+
		"\2\2\2\61\3\3\2\2\2\62\60\3\2\2\2\63\64\5\"\22\2\64B\5\n\6\2\65?\7\7\2"+
		"\2\66\67\5\f\7\2\678\7\13\2\28:\3\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2"+
		"\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>@\5\f\7\2?;\3\2\2\2?@\3\2\2\2@A\3\2\2"+
		"\2AC\7\b\2\2B\65\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\5\b\5\2E\5\3\2\2\2FG\5"+
		"\"\22\2GH\7\4\2\2HI\5\b\5\2I\7\3\2\2\2JK\5\16\b\2K\t\3\2\2\2LN\7\17\2"+
		"\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\13\3\2\2\2QR\5\24\13\2R\r"+
		"\3\2\2\2S]\5\20\t\2TV\7\n\2\2UW\5\20\t\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2YZ\3\2\2\2Z[\7\16\2\2[]\3\2\2\2\\S\3\2\2\2\\T\3\2\2\2]\17\3"+
		"\2\2\2^_\5\22\n\2_\21\3\2\2\2`a\5\24\13\2ab\7\r\2\2bc\5\26\f\2c\23\3\2"+
		"\2\2df\7\17\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\25\3\2\2\2il"+
		"\5\30\r\2jl\5 \21\2ki\3\2\2\2kj\3\2\2\2l\27\3\2\2\2mp\5\32\16\2np\5\34"+
		"\17\2om\3\2\2\2on\3\2\2\2p\31\3\2\2\2qs\7\20\2\2rq\3\2\2\2st\3\2\2\2t"+
		"r\3\2\2\2tu\3\2\2\2u\33\3\2\2\2vw\7\5\2\2wx\5\36\20\2xy\7\5\2\2y\35\3"+
		"\2\2\2z|\t\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\37\3\2\2"+
		"\2\177}\3\2\2\2\u0080\u0081\7\t\2\2\u0081\u0082\5\36\20\2\u0082\u0083"+
		"\7\f\2\2\u0083!\3\2\2\2\u0084\u0085\7\3\2\2\u0085#\3\2\2\2\u0086\u0087"+
		"\7\6\2\2\u0087%\3\2\2\2\17)\60;?BOX\\gkot}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}