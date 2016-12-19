package dotWheyIntepretador.main;

import dotWheyIntepretador.parser.DotWheyIntepretadorLexer;
import dotWheyIntepretador.parser.DotWheyIntepretadorParserConsole;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;

public class DotWheyIntepretador {

    public static void main(String[] args) {
        try {

            ANTLRInputStream stream = new ANTLRFileStream("C:\\Users\\ProBook\\Desktop\\dotWheyIntepretador\\src\\dotWheyIntepretador\\parser\\input");
            DotWheyIntepretadorLexer lexer = new DotWheyIntepretadorLexer(stream);
            TokenStream ts = new BufferedTokenStream(lexer);
            DotWheyIntepretadorParserConsole parser = new DotWheyIntepretadorParserConsole(ts);
            parser.program();
        } catch (IOException | RecognitionException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
