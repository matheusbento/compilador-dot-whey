grammar DotWheyIntepretador;
@header{
package dotWheyIntepretador.parser;
import java.util.Scanner;
}
@members {
    Scanner tec = new Scanner(System.in);      
          
    void readInt(String str) {}
    void readStr(String str) {}
    void readFloat(String str){}
    void readBool(String str){}
    
    void printAll(String str){}
    void print(String str){}
    void add(String var, Object value){} 
    
    Integer getInt(String str){return null;}
    
    
}

program         : (line END_CMD)+;
                catch [RecognitionException exc] {}
line            : imprime | leitura | atribuir; 

atribuir        : FLOAT BEGIN_VAR ID VAL {add($ID.text, Float.parseFloat($VAL.text));}
                | BEGIN_VAR ID VAL {add($ID.text, Float.parseFloat($VAL.text));}
                | FLOAT BEGIN_VAR ID {add($ID.text, Float.parseFloat("0"));}
                | INTEGER BEGIN_VAR ID expressao {add($ID.text, $expressao.v);}
                | BEGIN_VAR ID expressao {add($ID.text, $expressao.v);}
                | INTEGER BEGIN_VAR ID {add($ID.text, Integer.parseInt("0"));}
                | BEGIN_VAR ID {add($ID.text, Integer.parseInt("0"));}
                | BOOL BEGIN_VAR ID VALBOOL {add($ID.text, new Boolean($VALBOOL.text));}
                | BEGIN_VAR ID VALBOOL {add($ID.text, new Boolean($VALBOOL.text));}
                | BOOL BEGIN_VAR ID {add($ID.text, new Boolean(null));} 
                | BEGIN_VAR ID {add($ID.text, new Boolean(null));} 
                | STRING BEGIN_VAR ID VALSTRING {add($ID.text, $VALSTRING.text);}
                | BEGIN_VAR ID VALSTRING {add($ID.text, $VALSTRING.text);}
                | STRING BEGIN_VAR ID {add($ID.text, new String());}
| BEGIN_VAR ID {add($ID.text, new String());};
                catch [RecognitionException exc] {}


multExpr        returns [Integer v ]
                :    e=atom { $v = $e.v; } ('*' e=atom { $v *= $e.v; } | '/' e=atom { $v /= $e.v; })*;
                catch [RecognitionException exc] { }


valorint        returns [Integer value]
                : BEGIN_VAR ID {$value = getInt($ID.text);}
                | VAL {$value = Integer.parseInt($VAL.text);};
                catch [RecognitionException exc] { }

expressao       returns [Integer v ]
                :    e=multExpr { $v = $e.v; } ( 
                 '+' e=multExpr { $v += $e.v; }
                | '-' e=multExpr { $v -= $e.v; }  
                )*;
                catch [RecognitionException exc] {}

atom            returns [Integer v ]
                :   valorint {$v = $valorint.value;}
                |    '(' expressao ')' {$v = $expressao.v;};
                catch [RecognitionException exc] { }

imprime         : WRITE BEGIN_VAR ID{printAll($ID.text);} 
                | WRITE VALSTRING {print($VALSTRING.text);};
                catch [RecognitionException exc] { }

leitura         : READ_FLOAT BEGIN_VAR ID {readFloat($ID.text);} 
                | READ_INTEIRO BEGIN_VAR ID {readInt($ID.text);}
                | READ_BOOLEANO BEGIN_VAR ID {readBool($ID.text);}
                | READ_STRING BEGIN_VAR ID {readStr($ID.text);};
                catch [RecognitionException exc] { }


READ_FLOAT      : 'f.>>';
READ_INTEIRO    : 'i.>>';
READ_BOOLEANO   : 'b.>>';
READ_STRING     : 's.>>';
BEGIN_VAR       : '@';
FLOAT           : 'Float';
INTEGER         : 'Int';
BOOL            : 'Bool';
STRING          : 'String';
WRITE           : 'w.<<' ;
VAL             : [0-9]+ 
                | [0-9]+('.'[0-9]+)?;
VALSTRING       : '"'.*?'"';
VALBOOL         : 'true' |'false';
ID              : [a-zA-Z][a-zA-Z0-9_]*;
END_CMD         : '\n'; 
EQUALS          : '=';
OB              : '(';
CB              : ')';
MAIS            : '+';
MENOS           : '-';
MULT            : '*';
DIV             : '/';
WS              : [ \t\n\r]+ -> skip;