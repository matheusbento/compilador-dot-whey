// Generated from C:\Users\ProBook\Desktop\dotWheyIntepretador\src\dotWheyIntepretador\parser\DotWheyIntepretador.g4 by ANTLR 4.1

package dotWheyIntepretador.parser;
import java.util.Scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DotWheyIntepretadorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		READ_FLOAT=1, READ_INTEIRO=2, READ_BOOLEANO=3, READ_STRING=4, BEGIN_VAR=5, 
		FLOAT=6, INTEGER=7, BOOL=8, STRING=9, WRITE=10, VAL=11, VALSTRING=12, 
		VALBOOL=13, ID=14, END_CMD=15, EQUALS=16, OB=17, CB=18, MAIS=19, MENOS=20, 
		MULT=21, DIV=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'f.>>'", "'i.>>'", "'b.>>'", "'s.>>'", "'@'", "'Float'", "'Int'", "'Bool'", 
		"'String'", "'w.<<'", "VAL", "VALSTRING", "VALBOOL", "ID", "'\n'", "'='", 
		"'('", "')'", "'+'", "'-'", "'*'", "'/'", "WS"
	};
	public static final String[] ruleNames = {
		"READ_FLOAT", "READ_INTEIRO", "READ_BOOLEANO", "READ_STRING", "BEGIN_VAR", 
		"FLOAT", "INTEGER", "BOOL", "STRING", "WRITE", "VAL", "VALSTRING", "VALBOOL", 
		"ID", "END_CMD", "EQUALS", "OB", "CB", "MAIS", "MENOS", "MULT", "DIV", 
		"WS"
	};


	    Scanner tec = new Scanner(System.in);      
	          
	    void readInt(String str) {}
	    void readStr(String str) {}
	    void readFloat(String str){}
	    void readBool(String str){}
	    
	    void printAll(String str){}
	    void print(String str){}
	    void add(String var, Object value){} 
	    
	    Integer getInt(String str){return null;}
	    
	    


	public DotWheyIntepretadorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DotWheyIntepretador.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 22: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\31\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\6\fd\n\f"+
		"\r\f\16\fe\3\f\6\fi\n\f\r\f\16\fj\3\f\3\f\6\fo\n\f\r\f\16\fp\5\fs\n\f"+
		"\5\fu\n\f\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\7\17\u008d\n\17\f"+
		"\17\16\17\u0090\13\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\6\30\u00a3\n\30\r\30\16\30\u00a4\3"+
		"\30\3\30\3z\31\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\2\3\2\6\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3\2\2\2\7;\3\2\2\2\t@\3\2\2\2\13E"+
		"\3\2\2\2\rG\3\2\2\2\17M\3\2\2\2\21Q\3\2\2\2\23V\3\2\2\2\25]\3\2\2\2\27"+
		"t\3\2\2\2\31v\3\2\2\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37\u0091\3\2\2"+
		"\2!\u0093\3\2\2\2#\u0095\3\2\2\2%\u0097\3\2\2\2\'\u0099\3\2\2\2)\u009b"+
		"\3\2\2\2+\u009d\3\2\2\2-\u009f\3\2\2\2/\u00a2\3\2\2\2\61\62\7h\2\2\62"+
		"\63\7\60\2\2\63\64\7@\2\2\64\65\7@\2\2\65\4\3\2\2\2\66\67\7k\2\2\678\7"+
		"\60\2\289\7@\2\29:\7@\2\2:\6\3\2\2\2;<\7d\2\2<=\7\60\2\2=>\7@\2\2>?\7"+
		"@\2\2?\b\3\2\2\2@A\7u\2\2AB\7\60\2\2BC\7@\2\2CD\7@\2\2D\n\3\2\2\2EF\7"+
		"B\2\2F\f\3\2\2\2GH\7H\2\2HI\7n\2\2IJ\7q\2\2JK\7c\2\2KL\7v\2\2L\16\3\2"+
		"\2\2MN\7K\2\2NO\7p\2\2OP\7v\2\2P\20\3\2\2\2QR\7D\2\2RS\7q\2\2ST\7q\2\2"+
		"TU\7n\2\2U\22\3\2\2\2VW\7U\2\2WX\7v\2\2XY\7t\2\2YZ\7k\2\2Z[\7p\2\2[\\"+
		"\7i\2\2\\\24\3\2\2\2]^\7y\2\2^_\7\60\2\2_`\7>\2\2`a\7>\2\2a\26\3\2\2\2"+
		"bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fu\3\2\2\2gi\t\2\2\2"+
		"hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kr\3\2\2\2ln\7\60\2\2mo\t\2\2"+
		"\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rl\3\2\2\2rs\3\2\2"+
		"\2su\3\2\2\2tc\3\2\2\2th\3\2\2\2u\30\3\2\2\2vz\7$\2\2wy\13\2\2\2xw\3\2"+
		"\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7$\2\2~\32\3"+
		"\2\2\2\177\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082\7w\2\2\u0082\u0089"+
		"\7g\2\2\u0083\u0084\7h\2\2\u0084\u0085\7c\2\2\u0085\u0086\7n\2\2\u0086"+
		"\u0087\7u\2\2\u0087\u0089\7g\2\2\u0088\177\3\2\2\2\u0088\u0083\3\2\2\2"+
		"\u0089\34\3\2\2\2\u008a\u008e\t\3\2\2\u008b\u008d\t\4\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\36\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\f\2\2\u0092 \3\2\2\2\u0093"+
		"\u0094\7?\2\2\u0094\"\3\2\2\2\u0095\u0096\7*\2\2\u0096$\3\2\2\2\u0097"+
		"\u0098\7+\2\2\u0098&\3\2\2\2\u0099\u009a\7-\2\2\u009a(\3\2\2\2\u009b\u009c"+
		"\7/\2\2\u009c*\3\2\2\2\u009d\u009e\7,\2\2\u009e,\3\2\2\2\u009f\u00a0\7"+
		"\61\2\2\u00a0.\3\2\2\2\u00a1\u00a3\t\5\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\b\30\2\2\u00a7\60\3\2\2\2\f\2ejprtz\u0088\u008e\u00a4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}