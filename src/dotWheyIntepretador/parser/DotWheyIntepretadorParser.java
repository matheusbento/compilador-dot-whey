// Generated from C:\Users\ProBook\Desktop\dotWheyIntepretador\src\dotWheyIntepretador\parser\DotWheyIntepretador.g4 by ANTLR 4.1

package dotWheyIntepretador.parser;
import java.util.Scanner;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DotWheyIntepretadorParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ_FLOAT=1, READ_INTEIRO=2, READ_BOOLEANO=3, READ_STRING=4, BEGIN_VAR=5, 
		FLOAT=6, INTEGER=7, BOOL=8, STRING=9, WRITE=10, VAL=11, VALSTRING=12, 
		VALBOOL=13, ID=14, END_CMD=15, EQUALS=16, OB=17, CB=18, MAIS=19, MENOS=20, 
		MULT=21, DIV=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'f.>>'", "'i.>>'", "'b.>>'", "'s.>>'", "'@'", "'Float'", 
		"'Int'", "'Bool'", "'String'", "'w.<<'", "VAL", "VALSTRING", "VALBOOL", 
		"ID", "'\n'", "'='", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_atribuir = 2, RULE_expressao = 3, 
		RULE_multExpr = 4, RULE_atom = 5, RULE_valorint = 6, RULE_imprime = 7, 
		RULE_leitura = 8;
	public static final String[] ruleNames = {
		"program", "line", "atribuir", "expressao", "multExpr", "atom", "valorint", 
		"imprime", "leitura"
	};

	@Override
	public String getGrammarFileName() { return "DotWheyIntepretador.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    Scanner tec = new Scanner(System.in);      
	          
	    void readInt(String str) {}
	    void readStr(String str) {}
	    void readFloat(String str){}
	    void readBool(String str){}
	    
	    void printAll(String str){}
	    void print(String str){}
	    void add(String var, Object value){} 
	    
	    Integer getInt(String str){return null;}
	    
	    

	public DotWheyIntepretadorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TerminalNode END_CMD(int i) {
			return getToken(DotWheyIntepretadorParser.END_CMD, i);
		}
		public List<TerminalNode> END_CMD() { return getTokens(DotWheyIntepretadorParser.END_CMD); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotWheyIntepretadorVisitor ) return ((DotWheyIntepretadorVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(18); line();
					setState(19); match(END_CMD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException exc) {
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public ImprimeContext imprime() {
			return getRuleContext(ImprimeContext.class,0);
		}
		public AtribuirContext atribuir() {
			return getRuleContext(AtribuirContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotWheyIntepretadorVisitor ) return ((DotWheyIntepretadorVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); imprime();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); leitura();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(27); atribuir();
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

	public static class AtribuirContext extends ParserRuleContext {
		public Token ID;
		public Token VAL;
		public ExpressaoContext expressao;
		public Token VALBOOL;
		public Token VALSTRING;
		public TerminalNode ID() { return getToken(DotWheyIntepretadorParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(DotWheyIntepretadorParser.BOOL, 0); }
		public TerminalNode INTEGER() { return getToken(DotWheyIntepretadorParser.INTEGER, 0); }
		public TerminalNode BEGIN_VAR() { return getToken(DotWheyIntepretadorParser.BEGIN_VAR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode VALBOOL() { return getToken(DotWheyIntepretadorParser.VALBOOL, 0); }
		public TerminalNode VAL() { return getToken(DotWheyIntepretadorParser.VAL, 0); }
		public TerminalNode VALSTRING() { return getToken(DotWheyIntepretadorParser.VALSTRING, 0); }
		public TerminalNode STRING() { return getToken(DotWheyIntepretadorParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(DotWheyIntepretadorParser.FLOAT, 0); }
		public AtribuirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).enterAtribuir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).exitAtribuir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotWheyIntepretadorVisitor ) return ((DotWheyIntepretadorVisitor<? extends T>)visitor).visitAtribuir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuirContext atribuir() throws RecognitionException {
		AtribuirContext _localctx = new AtribuirContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atribuir);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); match(FLOAT);
				setState(31); match(BEGIN_VAR);
				setState(32); ((AtribuirContext)_localctx).ID = match(ID);
				setState(33); ((AtribuirContext)_localctx).VAL = match(VAL);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), Float.parseFloat((((AtribuirContext)_localctx).VAL!=null?((AtribuirContext)_localctx).VAL.getText():null)));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); match(BEGIN_VAR);
				setState(36); ((AtribuirContext)_localctx).ID = match(ID);
				setState(37); ((AtribuirContext)_localctx).VAL = match(VAL);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), Float.parseFloat((((AtribuirContext)_localctx).VAL!=null?((AtribuirContext)_localctx).VAL.getText():null)));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); match(FLOAT);
				setState(40); match(BEGIN_VAR);
				setState(41); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), Float.parseFloat("0"));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43); match(INTEGER);
				setState(44); match(BEGIN_VAR);
				setState(45); ((AtribuirContext)_localctx).ID = match(ID);
				setState(46); ((AtribuirContext)_localctx).expressao = expressao();
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), ((AtribuirContext)_localctx).expressao.v);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49); match(BEGIN_VAR);
				setState(50); ((AtribuirContext)_localctx).ID = match(ID);
				setState(51); ((AtribuirContext)_localctx).expressao = expressao();
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), ((AtribuirContext)_localctx).expressao.v);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54); match(INTEGER);
				setState(55); match(BEGIN_VAR);
				setState(56); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), Integer.parseInt("0"));
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58); match(BEGIN_VAR);
				setState(59); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), Integer.parseInt("0"));
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61); match(BOOL);
				setState(62); match(BEGIN_VAR);
				setState(63); ((AtribuirContext)_localctx).ID = match(ID);
				setState(64); ((AtribuirContext)_localctx).VALBOOL = match(VALBOOL);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), new Boolean((((AtribuirContext)_localctx).VALBOOL!=null?((AtribuirContext)_localctx).VALBOOL.getText():null)));
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(66); match(BEGIN_VAR);
				setState(67); ((AtribuirContext)_localctx).ID = match(ID);
				setState(68); ((AtribuirContext)_localctx).VALBOOL = match(VALBOOL);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), new Boolean((((AtribuirContext)_localctx).VALBOOL!=null?((AtribuirContext)_localctx).VALBOOL.getText():null)));
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(70); match(BOOL);
				setState(71); match(BEGIN_VAR);
				setState(72); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), new Boolean(null));
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(74); match(BEGIN_VAR);
				setState(75); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), new Boolean(null));
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(77); match(STRING);
				setState(78); match(BEGIN_VAR);
				setState(79); ((AtribuirContext)_localctx).ID = match(ID);
				setState(80); ((AtribuirContext)_localctx).VALSTRING = match(VALSTRING);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), (((AtribuirContext)_localctx).VALSTRING!=null?((AtribuirContext)_localctx).VALSTRING.getText():null));
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(82); match(BEGIN_VAR);
				setState(83); ((AtribuirContext)_localctx).ID = match(ID);
				setState(84); ((AtribuirContext)_localctx).VALSTRING = match(VALSTRING);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), (((AtribuirContext)_localctx).VALSTRING!=null?((AtribuirContext)_localctx).VALSTRING.getText():null));
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(86); match(STRING);
				setState(87); match(BEGIN_VAR);
				setState(88); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), new String());
				}
				break;

			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(90); match(BEGIN_VAR);
				setState(91); ((AtribuirContext)_localctx).ID = match(ID);
				add((((AtribuirContext)_localctx).ID!=null?((AtribuirContext)_localctx).ID.getText():null), new String());
				}
				break;
			}
		}
		catch (RecognitionException exc) {
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public Integer v;
		public MultExprContext e;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotWheyIntepretadorVisitor ) return ((DotWheyIntepretadorVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95); ((ExpressaoContext)_localctx).e = multExpr();
			 ((ExpressaoContext)_localctx).v =  ((ExpressaoContext)_localctx).e.v; 
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(105);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(97); match(MAIS);
						setState(98); ((ExpressaoContext)_localctx).e = multExpr();
						 _localctx.v += ((ExpressaoContext)_localctx).e.v; 
						}
						break;

					case 2:
						{
						setState(101); match(MENOS);
						setState(102); ((ExpressaoContext)_localctx).e = multExpr();
						 _localctx.v -= ((ExpressaoContext)_localctx).e.v; 
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException exc) {
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultExprContext extends ParserRuleContext {
		public Integer v;
		public AtomContext e;
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotWheyIntepretadorVisitor ) return ((DotWheyIntepretadorVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110); ((MultExprContext)_localctx).e = atom();
			 ((MultExprContext)_localctx).v =  ((MultExprContext)_localctx).e.v; 
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(120);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(112); match(MULT);
						setState(113); ((MultExprContext)_localctx).e = atom();
						 _localctx.v *= ((MultExprContext)_localctx).e.v; 
						}
						break;

					case 2:
						{
						setState(116); match(DIV);
						setState(117); ((MultExprContext)_localctx).e = atom();
						 _localctx.v /= ((MultExprContext)_localctx).e.v; 
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public Integer v;
		public ValorintContext valorint;
		public ExpressaoContext expressao;
		public ValorintContext valorint() {
			return getRuleContext(ValorintContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotWheyIntepretadorVisitor ) return ((DotWheyIntepretadorVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); ((AtomContext)_localctx).valorint = valorint();
				((AtomContext)_localctx).v =  ((AtomContext)_localctx).valorint.value;
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); match(OB);
				setState(129); ((AtomContext)_localctx).expressao = expressao();
				setState(130); match(CB);
				((AtomContext)_localctx).v =  ((AtomContext)_localctx).expressao.v;
				}
				break;
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorintContext extends ParserRuleContext {
		public Integer value;
		public Token ID;
		public Token VAL;
		public TerminalNode ID() { return getToken(DotWheyIntepretadorParser.ID, 0); }
		public TerminalNode BEGIN_VAR() { return getToken(DotWheyIntepretadorParser.BEGIN_VAR, 0); }
		public TerminalNode VAL() { return getToken(DotWheyIntepretadorParser.VAL, 0); }
		public ValorintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).enterValorint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).exitValorint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotWheyIntepretadorVisitor ) return ((DotWheyIntepretadorVisitor<? extends T>)visitor).visitValorint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorintContext valorint() throws RecognitionException {
		ValorintContext _localctx = new ValorintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valorint);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); match(BEGIN_VAR);
				setState(136); ((ValorintContext)_localctx).ID = match(ID);
				((ValorintContext)_localctx).value =  getInt((((ValorintContext)_localctx).ID!=null?((ValorintContext)_localctx).ID.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); ((ValorintContext)_localctx).VAL = match(VAL);
				((ValorintContext)_localctx).value =  Integer.parseInt((((ValorintContext)_localctx).VAL!=null?((ValorintContext)_localctx).VAL.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimeContext extends ParserRuleContext {
		public Token ID;
		public Token VALSTRING;
		public TerminalNode ID() { return getToken(DotWheyIntepretadorParser.ID, 0); }
		public TerminalNode BEGIN_VAR() { return getToken(DotWheyIntepretadorParser.BEGIN_VAR, 0); }
		public TerminalNode WRITE() { return getToken(DotWheyIntepretadorParser.WRITE, 0); }
		public TerminalNode VALSTRING() { return getToken(DotWheyIntepretadorParser.VALSTRING, 0); }
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).enterImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).exitImprime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotWheyIntepretadorVisitor ) return ((DotWheyIntepretadorVisitor<? extends T>)visitor).visitImprime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_imprime);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); match(WRITE);
				setState(143); match(BEGIN_VAR);
				setState(144); ((ImprimeContext)_localctx).ID = match(ID);
				printAll((((ImprimeContext)_localctx).ID!=null?((ImprimeContext)_localctx).ID.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); match(WRITE);
				setState(147); ((ImprimeContext)_localctx).VALSTRING = match(VALSTRING);
				print((((ImprimeContext)_localctx).VALSTRING!=null?((ImprimeContext)_localctx).VALSTRING.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeituraContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(DotWheyIntepretadorParser.ID, 0); }
		public TerminalNode READ_FLOAT() { return getToken(DotWheyIntepretadorParser.READ_FLOAT, 0); }
		public TerminalNode BEGIN_VAR() { return getToken(DotWheyIntepretadorParser.BEGIN_VAR, 0); }
		public TerminalNode READ_INTEIRO() { return getToken(DotWheyIntepretadorParser.READ_INTEIRO, 0); }
		public TerminalNode READ_BOOLEANO() { return getToken(DotWheyIntepretadorParser.READ_BOOLEANO, 0); }
		public TerminalNode READ_STRING() { return getToken(DotWheyIntepretadorParser.READ_STRING, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotWheyIntepretadorListener ) ((DotWheyIntepretadorListener)listener).exitLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DotWheyIntepretadorVisitor ) return ((DotWheyIntepretadorVisitor<? extends T>)visitor).visitLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_leitura);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); match(READ_FLOAT);
				setState(152); match(BEGIN_VAR);
				setState(153); ((LeituraContext)_localctx).ID = match(ID);
				readFloat((((LeituraContext)_localctx).ID!=null?((LeituraContext)_localctx).ID.getText():null));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(READ_INTEIRO);
				setState(156); match(BEGIN_VAR);
				setState(157); ((LeituraContext)_localctx).ID = match(ID);
				readInt((((LeituraContext)_localctx).ID!=null?((LeituraContext)_localctx).ID.getText():null));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); match(READ_BOOLEANO);
				setState(160); match(BEGIN_VAR);
				setState(161); ((LeituraContext)_localctx).ID = match(ID);
				readBool((((LeituraContext)_localctx).ID!=null?((LeituraContext)_localctx).ID.getText():null));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163); match(READ_STRING);
				setState(164); match(BEGIN_VAR);
				setState(165); ((LeituraContext)_localctx).ID = match(ID);
				readStr((((LeituraContext)_localctx).ID!=null?((LeituraContext)_localctx).ID.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException exc) {
			 
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\31\u00ac\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5l\n\5\f\5\16\5o\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6{\n\6\f\6\16\6~\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0088\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0098"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u00aa\n\n\3\n\2\13\2\4\6\b\n\f\16\20\22\2\2\u00bd\2\27\3\2\2\2\4\36"+
		"\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\np\3\2\2\2\f\u0087\3\2\2\2\16\u008e\3\2"+
		"\2\2\20\u0097\3\2\2\2\22\u00a9\3\2\2\2\24\25\5\4\3\2\25\26\7\21\2\2\26"+
		"\30\3\2\2\2\27\24\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\3\3\2\2\2\33\37\5\20\t\2\34\37\5\22\n\2\35\37\5\6\4\2\36\33\3\2\2\2\36"+
		"\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7\b\2\2!\"\7\7\2\2\"#\7\20\2"+
		"\2#$\7\r\2\2$`\b\4\1\2%&\7\7\2\2&\'\7\20\2\2\'(\7\r\2\2(`\b\4\1\2)*\7"+
		"\b\2\2*+\7\7\2\2+,\7\20\2\2,`\b\4\1\2-.\7\t\2\2./\7\7\2\2/\60\7\20\2\2"+
		"\60\61\5\b\5\2\61\62\b\4\1\2\62`\3\2\2\2\63\64\7\7\2\2\64\65\7\20\2\2"+
		"\65\66\5\b\5\2\66\67\b\4\1\2\67`\3\2\2\289\7\t\2\29:\7\7\2\2:;\7\20\2"+
		"\2;`\b\4\1\2<=\7\7\2\2=>\7\20\2\2>`\b\4\1\2?@\7\n\2\2@A\7\7\2\2AB\7\20"+
		"\2\2BC\7\17\2\2C`\b\4\1\2DE\7\7\2\2EF\7\20\2\2FG\7\17\2\2G`\b\4\1\2HI"+
		"\7\n\2\2IJ\7\7\2\2JK\7\20\2\2K`\b\4\1\2LM\7\7\2\2MN\7\20\2\2N`\b\4\1\2"+
		"OP\7\13\2\2PQ\7\7\2\2QR\7\20\2\2RS\7\16\2\2S`\b\4\1\2TU\7\7\2\2UV\7\20"+
		"\2\2VW\7\16\2\2W`\b\4\1\2XY\7\13\2\2YZ\7\7\2\2Z[\7\20\2\2[`\b\4\1\2\\"+
		"]\7\7\2\2]^\7\20\2\2^`\b\4\1\2_ \3\2\2\2_%\3\2\2\2_)\3\2\2\2_-\3\2\2\2"+
		"_\63\3\2\2\2_8\3\2\2\2_<\3\2\2\2_?\3\2\2\2_D\3\2\2\2_H\3\2\2\2_L\3\2\2"+
		"\2_O\3\2\2\2_T\3\2\2\2_X\3\2\2\2_\\\3\2\2\2`\7\3\2\2\2ab\5\n\6\2bm\b\5"+
		"\1\2cd\7\25\2\2de\5\n\6\2ef\b\5\1\2fl\3\2\2\2gh\7\26\2\2hi\5\n\6\2ij\b"+
		"\5\1\2jl\3\2\2\2kc\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\t"+
		"\3\2\2\2om\3\2\2\2pq\5\f\7\2q|\b\6\1\2rs\7\27\2\2st\5\f\7\2tu\b\6\1\2"+
		"u{\3\2\2\2vw\7\30\2\2wx\5\f\7\2xy\b\6\1\2y{\3\2\2\2zr\3\2\2\2zv\3\2\2"+
		"\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\13\3\2\2\2~|\3\2\2\2\177\u0080\5\16"+
		"\b\2\u0080\u0081\b\7\1\2\u0081\u0088\3\2\2\2\u0082\u0083\7\23\2\2\u0083"+
		"\u0084\5\b\5\2\u0084\u0085\7\24\2\2\u0085\u0086\b\7\1\2\u0086\u0088\3"+
		"\2\2\2\u0087\177\3\2\2\2\u0087\u0082\3\2\2\2\u0088\r\3\2\2\2\u0089\u008a"+
		"\7\7\2\2\u008a\u008b\7\20\2\2\u008b\u008f\b\b\1\2\u008c\u008d\7\r\2\2"+
		"\u008d\u008f\b\b\1\2\u008e\u0089\3\2\2\2\u008e\u008c\3\2\2\2\u008f\17"+
		"\3\2\2\2\u0090\u0091\7\f\2\2\u0091\u0092\7\7\2\2\u0092\u0093\7\20\2\2"+
		"\u0093\u0098\b\t\1\2\u0094\u0095\7\f\2\2\u0095\u0096\7\16\2\2\u0096\u0098"+
		"\b\t\1\2\u0097\u0090\3\2\2\2\u0097\u0094\3\2\2\2\u0098\21\3\2\2\2\u0099"+
		"\u009a\7\3\2\2\u009a\u009b\7\7\2\2\u009b\u009c\7\20\2\2\u009c\u00aa\b"+
		"\n\1\2\u009d\u009e\7\4\2\2\u009e\u009f\7\7\2\2\u009f\u00a0\7\20\2\2\u00a0"+
		"\u00aa\b\n\1\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7\20"+
		"\2\2\u00a4\u00aa\b\n\1\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7\7\2\2\u00a7"+
		"\u00a8\7\20\2\2\u00a8\u00aa\b\n\1\2\u00a9\u0099\3\2\2\2\u00a9\u009d\3"+
		"\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\23\3\2\2\2\r\31\36"+
		"_kmz|\u0087\u008e\u0097\u00a9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}