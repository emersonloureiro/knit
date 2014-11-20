// Generated from KnitLanguage.g4 by ANTLR 4.2.2
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
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, ALPHA_CHARACTER=12, DIGIT=13, DECIMAL=14, MISC_CHARACTER=15, 
		NEWLINE=16, WS=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'func'", "'\"'", "'return'", "'('", "')'", "'['", "'{'", 
		"','", "']'", "'='", "'}'", "ALPHA_CHARACTER", "DIGIT", "DECIMAL", "MISC_CHARACTER", 
		"NEWLINE", "WS"
	};
	public static final int
		RULE_knitProgram = 0, RULE_functionEx = 1, RULE_functionBodyEx = 2, RULE_functionNameEx = 3, 
		RULE_parameterEx = 4, RULE_codeEx = 5, RULE_programmingConstruct = 6, 
		RULE_varEx = 7, RULE_varNameEx = 8, RULE_valueEx = 9, RULE_constantEx = 10, 
		RULE_numberEx = 11, RULE_stringEx = 12, RULE_commandEx = 13, RULE_funcKw = 14, 
		RULE_returnKw = 15;
	public static final String[] ruleNames = {
		"knitProgram", "functionEx", "functionBodyEx", "functionNameEx", "parameterEx", 
		"codeEx", "programmingConstruct", "varEx", "varNameEx", "valueEx", "constantEx", 
		"numberEx", "stringEx", "commandEx", "funcKw", "returnKw"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32); functionEx();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==1 );
			}
		}
		catch (RecognitionException re) {
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
			setState(37); funcKw();
			setState(38); functionNameEx();
			setState(52);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(39); match(4);
				setState(49);
				_la = _input.LA(1);
				if (_la==ALPHA_CHARACTER) {
					{
					setState(45);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(40); parameterEx();
							setState(41); match(8);
							}
							} 
						}
						setState(47);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					setState(48); parameterEx();
					}
				}

				setState(51); match(5);
				}
			}

			setState(54); functionBodyEx();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 4, RULE_functionBodyEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); codeEx();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 6, RULE_functionNameEx);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(58); match(ALPHA_CHARACTER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(61); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 8, RULE_parameterEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); varNameEx();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 10, RULE_codeEx);
		int _la;
		try {
			setState(74);
			switch (_input.LA(1)) {
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); programmingConstruct();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); match(7);
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67); programmingConstruct();
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA_CHARACTER );
				setState(72); match(11);
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
		enterRule(_localctx, 12, RULE_programmingConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); varEx();
			}
		}
		catch (RecognitionException re) {
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
		public ValueExContext valueEx() {
			return getRuleContext(ValueExContext.class,0);
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
		enterRule(_localctx, 14, RULE_varEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); varNameEx();
			setState(79); match(10);
			setState(80); valueEx();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_varNameEx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82); match(ALPHA_CHARACTER);
				}
				}
				setState(85); 
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

	public static class ValueExContext extends ParserRuleContext {
		public ConstantExContext constantEx() {
			return getRuleContext(ConstantExContext.class,0);
		}
		public CommandExContext commandEx() {
			return getRuleContext(CommandExContext.class,0);
		}
		public ValueExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterValueEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitValueEx(this);
		}
	}

	public final ValueExContext valueEx() throws RecognitionException {
		ValueExContext _localctx = new ValueExContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valueEx);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case 2:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); constantEx();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); commandEx();
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

	public static class ConstantExContext extends ParserRuleContext {
		public NumberExContext numberEx() {
			return getRuleContext(NumberExContext.class,0);
		}
		public StringExContext stringEx() {
			return getRuleContext(StringExContext.class,0);
		}
		public ConstantExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterConstantEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitConstantEx(this);
		}
	}

	public final ConstantExContext constantEx() throws RecognitionException {
		ConstantExContext _localctx = new ConstantExContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constantEx);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); numberEx();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); match(2);
				setState(93); stringEx();
				setState(94); match(2);
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
		enterRule(_localctx, 22, RULE_numberEx);
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
				setState(98); match(DIGIT);
				}
				}
				setState(101); 
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

	public static class StringExContext extends ParserRuleContext {
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
		public StringExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterStringEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitStringEx(this);
		}
	}

	public final StringExContext stringEx() throws RecognitionException {
		StringExContext _localctx = new StringExContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringEx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA_CHARACTER) | (1L << DIGIT) | (1L << MISC_CHARACTER))) != 0)) {
				{
				{
				setState(103);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA_CHARACTER) | (1L << DIGIT) | (1L << MISC_CHARACTER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(108);
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
		public StringExContext stringEx() {
			return getRuleContext(StringExContext.class,0);
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
		enterRule(_localctx, 26, RULE_commandEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(6);
			setState(110); stringEx();
			setState(111); match(9);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_funcKw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(1);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_returnKw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(3);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23x\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n\2\r"+
		"\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\3\5\3\64"+
		"\n\3\3\3\5\3\67\n\3\3\3\3\3\3\4\3\4\3\5\6\5>\n\5\r\5\16\5?\3\6\3\6\3\7"+
		"\3\7\3\7\6\7G\n\7\r\7\16\7H\3\7\3\7\5\7M\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\6\nV\n\n\r\n\16\nW\3\13\3\13\5\13\\\n\13\3\f\3\f\3\f\3\f\3\f\5\fc\n"+
		"\f\3\r\6\rf\n\r\r\r\16\rg\3\16\7\16k\n\16\f\16\16\16n\13\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \2\3\4\2\16\17\21\21s\2#\3\2\2\2\4\'\3\2\2\2\6:\3\2\2\2\b"+
		"=\3\2\2\2\nA\3\2\2\2\fL\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22U\3\2\2\2\24"+
		"[\3\2\2\2\26b\3\2\2\2\30e\3\2\2\2\32l\3\2\2\2\34o\3\2\2\2\36s\3\2\2\2"+
		" u\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2"+
		"\2\2\'(\5\36\20\2(\66\5\b\5\2)\63\7\6\2\2*+\5\n\6\2+,\7\n\2\2,.\3\2\2"+
		"\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2"+
		"\2\62\64\5\n\6\2\63/\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\7\7\2\2"+
		"\66)\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\5\6\4\29\5\3\2\2\2:;\5\f\7\2"+
		";\7\3\2\2\2<>\7\16\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2"+
		"\2\2AB\5\22\n\2B\13\3\2\2\2CM\5\16\b\2DF\7\t\2\2EG\5\16\b\2FE\3\2\2\2"+
		"GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\r\2\2KM\3\2\2\2LC\3\2\2\2"+
		"LD\3\2\2\2M\r\3\2\2\2NO\5\20\t\2O\17\3\2\2\2PQ\5\22\n\2QR\7\f\2\2RS\5"+
		"\24\13\2S\21\3\2\2\2TV\7\16\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2X\23\3\2\2\2Y\\\5\26\f\2Z\\\5\34\17\2[Y\3\2\2\2[Z\3\2\2\2\\\25\3\2\2"+
		"\2]c\5\30\r\2^_\7\4\2\2_`\5\32\16\2`a\7\4\2\2ac\3\2\2\2b]\3\2\2\2b^\3"+
		"\2\2\2c\27\3\2\2\2df\7\17\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"h\31\3\2\2\2ik\t\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\33\3\2"+
		"\2\2nl\3\2\2\2op\7\b\2\2pq\5\32\16\2qr\7\13\2\2r\35\3\2\2\2st\7\3\2\2"+
		"t\37\3\2\2\2uv\7\5\2\2v!\3\2\2\2\16%/\63\66?HLW[bgl";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}