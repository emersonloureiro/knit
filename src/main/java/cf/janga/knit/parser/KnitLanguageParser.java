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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, STRING=7, COMMAND=8, FUNCTION_KEYWORD=9, 
		MAIN_KEYWORD=10, ALPHA_CHARACTER=11, DIGIT=12, SPACE=13, NEWLINE=14, TAB=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'{'", "','", "'='", "'}'", "STRING", "COMMAND", 
		"'func'", "'main'", "ALPHA_CHARACTER", "DIGIT", "SPACE", "NEWLINE", "TAB"
	};
	public static final int
		RULE_knitProgram = 0, RULE_functionEx = 1, RULE_mainFunctionEx = 2, RULE_functionBodyEx = 3, 
		RULE_functionNameEx = 4, RULE_parameter = 5, RULE_parameterName = 6, RULE_codeEx = 7, 
		RULE_programmingConstruct = 8, RULE_variableDeclaration = 9, RULE_varNameEx = 10, 
		RULE_varValueEx = 11, RULE_commandVariableValue = 12, RULE_constantVarValueEx = 13, 
		RULE_numberVarValue = 14, RULE_stringVarValue = 15, RULE_number = 16;
	public static final String[] ruleNames = {
		"knitProgram", "functionEx", "mainFunctionEx", "functionBodyEx", "functionNameEx", 
		"parameter", "parameterName", "codeEx", "programmingConstruct", "variableDeclaration", 
		"varNameEx", "varValueEx", "commandVariableValue", "constantVarValueEx", 
		"numberVarValue", "stringVarValue", "number"
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
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34); functionEx();
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(40); mainFunctionEx();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_KEYWORD) {
				{
				{
				setState(41); functionEx();
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

	public static class FunctionExContext extends ParserRuleContext {
		public FunctionBodyExContext functionBodyEx() {
			return getRuleContext(FunctionBodyExContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public TerminalNode FUNCTION_KEYWORD() { return getToken(KnitLanguageParser.FUNCTION_KEYWORD, 0); }
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
			setState(47); match(FUNCTION_KEYWORD);
			setState(48); functionNameEx();
			setState(62);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(49); match(1);
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
							setState(51); match(4);
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

				setState(61); match(2);
				}
			}

			setState(64); functionBodyEx();
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
		public TerminalNode MAIN_KEYWORD() { return getToken(KnitLanguageParser.MAIN_KEYWORD, 0); }
		public TerminalNode FUNCTION_KEYWORD() { return getToken(KnitLanguageParser.FUNCTION_KEYWORD, 0); }
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
			setState(66); match(FUNCTION_KEYWORD);
			setState(67); match(MAIN_KEYWORD);
			setState(68); functionBodyEx();
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
			setState(70); codeEx();
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
			setState(77); parameterName();
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
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79); match(ALPHA_CHARACTER);
				}
				}
				setState(82); 
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
			setState(93);
			switch (_input.LA(1)) {
			case ALPHA_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); programmingConstruct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); match(3);
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86); programmingConstruct();
					}
					}
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA_CHARACTER );
				setState(91); match(6);
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
			setState(95); variableDeclaration();
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
			setState(97); varNameEx();
			setState(98); match(5);
			setState(99); varValueEx();
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
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101); match(ALPHA_CHARACTER);
				}
				}
				setState(104); 
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
		public CommandVariableValueContext commandVariableValue() {
			return getRuleContext(CommandVariableValueContext.class,0);
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
			setState(108);
			switch (_input.LA(1)) {
			case STRING:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); constantVarValueEx();
				}
				break;
			case COMMAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); commandVariableValue();
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

	public static class CommandVariableValueContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(KnitLanguageParser.COMMAND, 0); }
		public CommandVariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandVariableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).enterCommandVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KnitLanguageListener ) ((KnitLanguageListener)listener).exitCommandVariableValue(this);
		}
	}

	public final CommandVariableValueContext commandVariableValue() throws RecognitionException {
		CommandVariableValueContext _localctx = new CommandVariableValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commandVariableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(COMMAND);
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
			setState(114);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); numberVarValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); stringVarValue();
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
			setState(116); number();
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
		public TerminalNode STRING() { return getToken(KnitLanguageParser.STRING, 0); }
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
			setState(118); match(STRING);
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
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120); match(DIGIT);
				}
				}
				setState(123); 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\5\3>\n\3\3\3\5\3A\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6L\n\6\r\6\16\6M\3\7\3\7\3\b\6\bS\n"+
		"\b\r\b\16\bT\3\t\3\t\3\t\6\tZ\n\t\r\t\16\t[\3\t\3\t\5\t`\n\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\f\6\fi\n\f\r\f\16\fj\3\r\3\r\5\ro\n\r\3\16\3\16\3"+
		"\17\3\17\5\17u\n\17\3\20\3\20\3\21\3\21\3\22\6\22|\n\22\r\22\16\22}\3"+
		"\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2{\2\'\3\2\2\2"+
		"\4\61\3\2\2\2\6D\3\2\2\2\bH\3\2\2\2\nK\3\2\2\2\fO\3\2\2\2\16R\3\2\2\2"+
		"\20_\3\2\2\2\22a\3\2\2\2\24c\3\2\2\2\26h\3\2\2\2\30n\3\2\2\2\32p\3\2\2"+
		"\2\34t\3\2\2\2\36v\3\2\2\2 x\3\2\2\2\"{\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)"+
		"\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*.\5\6\4\2+-\5\4\3"+
		"\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60.\3\2\2\2\61"+
		"\62\7\13\2\2\62@\5\n\6\2\63=\7\3\2\2\64\65\5\f\7\2\65\66\7\6\2\2\668\3"+
		"\2\2\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2"+
		"\2<>\5\f\7\2=9\3\2\2\2=>\3\2\2\2>?\3\2\2\2?A\7\4\2\2@\63\3\2\2\2@A\3\2"+
		"\2\2AB\3\2\2\2BC\5\b\5\2C\5\3\2\2\2DE\7\13\2\2EF\7\f\2\2FG\5\b\5\2G\7"+
		"\3\2\2\2HI\5\20\t\2I\t\3\2\2\2JL\7\r\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2N\13\3\2\2\2OP\5\16\b\2P\r\3\2\2\2QS\7\r\2\2RQ\3\2\2\2ST\3\2"+
		"\2\2TR\3\2\2\2TU\3\2\2\2U\17\3\2\2\2V`\5\22\n\2WY\7\5\2\2XZ\5\22\n\2Y"+
		"X\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\b\2\2^`\3\2\2"+
		"\2_V\3\2\2\2_W\3\2\2\2`\21\3\2\2\2ab\5\24\13\2b\23\3\2\2\2cd\5\26\f\2"+
		"de\7\7\2\2ef\5\30\r\2f\25\3\2\2\2gi\7\r\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2"+
		"\2\2jk\3\2\2\2k\27\3\2\2\2lo\5\34\17\2mo\5\32\16\2nl\3\2\2\2nm\3\2\2\2"+
		"o\31\3\2\2\2pq\7\n\2\2q\33\3\2\2\2ru\5\36\20\2su\5 \21\2tr\3\2\2\2ts\3"+
		"\2\2\2u\35\3\2\2\2vw\5\"\22\2w\37\3\2\2\2xy\7\t\2\2y!\3\2\2\2z|\7\16\2"+
		"\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~#\3\2\2\2\17\'.9=@MT[_jnt}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}