// Generated from ScruxLanguage.g4 by ANTLR 4.2.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScruxLanguageParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, ALPHA_IDENTIFIER=8, 
		WS=9, NEWLINE=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'func'", "'return'", "'('", "')'", "'{'", "','", "'}'", 
		"ALPHA_IDENTIFIER", "WS", "NEWLINE"
	};
	public static final int
		RULE_functionEx = 0, RULE_functionBodyEx = 1, RULE_codeEx = 2, RULE_programmingConstruct = 3, 
		RULE_varEx = 4, RULE_varNameEx = 5, RULE_functionNameEx = 6, RULE_parameterEx = 7, 
		RULE_variableNameEx = 8, RULE_funcKw = 9, RULE_returnKw = 10;
	public static final String[] ruleNames = {
		"functionEx", "functionBodyEx", "codeEx", "programmingConstruct", "varEx", 
		"varNameEx", "functionNameEx", "parameterEx", "variableNameEx", "funcKw", 
		"returnKw"
	};

	@Override
	public String getGrammarFileName() { return "ScruxLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScruxLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterFunctionEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitFunctionEx(this);
		}
	}

	public final FunctionExContext functionEx() throws RecognitionException {
		FunctionExContext _localctx = new FunctionExContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_functionEx);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22); funcKw();
			setState(23); functionNameEx();
			setState(37);
			_la = _input.LA(1);
			if (_la==3) {
				{
				setState(24); match(3);
				setState(34);
				_la = _input.LA(1);
				if (_la==ALPHA_IDENTIFIER) {
					{
					setState(30);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(25); parameterEx();
							setState(26); match(6);
							}
							} 
						}
						setState(32);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					}
					setState(33); parameterEx();
					}
				}

				setState(36); match(4);
				}
			}

			setState(40);
			_la = _input.LA(1);
			if (_la==5 || _la==ALPHA_IDENTIFIER) {
				{
				setState(39); functionBodyEx();
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
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterFunctionBodyEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitFunctionBodyEx(this);
		}
	}

	public final FunctionBodyExContext functionBodyEx() throws RecognitionException {
		FunctionBodyExContext _localctx = new FunctionBodyExContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionBodyEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); codeEx();
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
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterCodeEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitCodeEx(this);
		}
	}

	public final CodeExContext codeEx() throws RecognitionException {
		CodeExContext _localctx = new CodeExContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_codeEx);
		int _la;
		try {
			setState(53);
			switch (_input.LA(1)) {
			case ALPHA_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); programmingConstruct();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); match(5);
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(46); programmingConstruct();
					}
					}
					setState(49); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA_IDENTIFIER );
				setState(51); match(7);
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
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterProgrammingConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitProgrammingConstruct(this);
		}
	}

	public final ProgrammingConstructContext programmingConstruct() throws RecognitionException {
		ProgrammingConstructContext _localctx = new ProgrammingConstructContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programmingConstruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); varEx();
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
		public VarNameExContext varNameEx() {
			return getRuleContext(VarNameExContext.class,0);
		}
		public VarExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterVarEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitVarEx(this);
		}
	}

	public final VarExContext varEx() throws RecognitionException {
		VarExContext _localctx = new VarExContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); varNameEx();
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
		public TerminalNode ALPHA_IDENTIFIER() { return getToken(ScruxLanguageParser.ALPHA_IDENTIFIER, 0); }
		public VarNameExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varNameEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterVarNameEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitVarNameEx(this);
		}
	}

	public final VarNameExContext varNameEx() throws RecognitionException {
		VarNameExContext _localctx = new VarNameExContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varNameEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(ALPHA_IDENTIFIER);
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
		public TerminalNode ALPHA_IDENTIFIER() { return getToken(ScruxLanguageParser.ALPHA_IDENTIFIER, 0); }
		public FunctionNameExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNameEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterFunctionNameEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitFunctionNameEx(this);
		}
	}

	public final FunctionNameExContext functionNameEx() throws RecognitionException {
		FunctionNameExContext _localctx = new FunctionNameExContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionNameEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(ALPHA_IDENTIFIER);
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
		public VariableNameExContext variableNameEx() {
			return getRuleContext(VariableNameExContext.class,0);
		}
		public ParameterExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterParameterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitParameterEx(this);
		}
	}

	public final ParameterExContext parameterEx() throws RecognitionException {
		ParameterExContext _localctx = new ParameterExContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameterEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); variableNameEx();
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

	public static class VariableNameExContext extends ParserRuleContext {
		public TerminalNode ALPHA_IDENTIFIER() { return getToken(ScruxLanguageParser.ALPHA_IDENTIFIER, 0); }
		public VariableNameExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableNameEx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterVariableNameEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitVariableNameEx(this);
		}
	}

	public final VariableNameExContext variableNameEx() throws RecognitionException {
		VariableNameExContext _localctx = new VariableNameExContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableNameEx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(ALPHA_IDENTIFIER);
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
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterFuncKw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitFuncKw(this);
		}
	}

	public final FuncKwContext funcKw() throws RecognitionException {
		FuncKwContext _localctx = new FuncKwContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcKw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(1);
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
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).enterReturnKw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScruxLanguageListener ) ((ScruxLanguageListener)listener).exitReturnKw(this);
		}
	}

	public final ReturnKwContext returnKw() throws RecognitionException {
		ReturnKwContext _localctx = new ReturnKwContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnKw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(2);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fJ\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\5\2%\n\2"+
		"\3\2\5\2(\n\2\3\2\5\2+\n\2\3\3\3\3\3\4\3\4\3\4\6\4\62\n\4\r\4\16\4\63"+
		"\3\4\3\4\5\48\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2D\2\30\3\2\2\2\4"+
		",\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\n;\3\2\2\2\f=\3\2\2\2\16?\3\2\2\2\20"+
		"A\3\2\2\2\22C\3\2\2\2\24E\3\2\2\2\26G\3\2\2\2\30\31\5\24\13\2\31\'\5\16"+
		"\b\2\32$\7\5\2\2\33\34\5\20\t\2\34\35\7\b\2\2\35\37\3\2\2\2\36\33\3\2"+
		"\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#%\5\20\t"+
		"\2$ \3\2\2\2$%\3\2\2\2%&\3\2\2\2&(\7\6\2\2\'\32\3\2\2\2\'(\3\2\2\2(*\3"+
		"\2\2\2)+\5\4\3\2*)\3\2\2\2*+\3\2\2\2+\3\3\2\2\2,-\5\6\4\2-\5\3\2\2\2."+
		"8\5\b\5\2/\61\7\7\2\2\60\62\5\b\5\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\t\2\2\668\3\2\2\2\67.\3\2"+
		"\2\2\67/\3\2\2\28\7\3\2\2\29:\5\n\6\2:\t\3\2\2\2;<\5\f\7\2<\13\3\2\2\2"+
		"=>\7\n\2\2>\r\3\2\2\2?@\7\n\2\2@\17\3\2\2\2AB\5\22\n\2B\21\3\2\2\2CD\7"+
		"\n\2\2D\23\3\2\2\2EF\7\3\2\2F\25\3\2\2\2GH\7\4\2\2H\27\3\2\2\2\b $\'*"+
		"\63\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}