// Generated from C:\Users\ProBook\Desktop\dotWheyIntepretador\src\dotWheyIntepretador\parser\DotWheyIntepretador.g4 by ANTLR 4.1

package dotWheyIntepretador.parser;
import java.util.Scanner;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DotWheyIntepretadorParser}.
 */
public interface DotWheyIntepretadorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DotWheyIntepretadorParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void enterAtribuir(@NotNull DotWheyIntepretadorParser.AtribuirContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotWheyIntepretadorParser#atribuir}.
	 * @param ctx the parse tree
	 */
	void exitAtribuir(@NotNull DotWheyIntepretadorParser.AtribuirContext ctx);

	/**
	 * Enter a parse tree produced by {@link DotWheyIntepretadorParser#imprime}.
	 * @param ctx the parse tree
	 */
	void enterImprime(@NotNull DotWheyIntepretadorParser.ImprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotWheyIntepretadorParser#imprime}.
	 * @param ctx the parse tree
	 */
	void exitImprime(@NotNull DotWheyIntepretadorParser.ImprimeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DotWheyIntepretadorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull DotWheyIntepretadorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotWheyIntepretadorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull DotWheyIntepretadorParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link DotWheyIntepretadorParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(@NotNull DotWheyIntepretadorParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotWheyIntepretadorParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(@NotNull DotWheyIntepretadorParser.LeituraContext ctx);

	/**
	 * Enter a parse tree produced by {@link DotWheyIntepretadorParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull DotWheyIntepretadorParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotWheyIntepretadorParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull DotWheyIntepretadorParser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DotWheyIntepretadorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull DotWheyIntepretadorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotWheyIntepretadorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull DotWheyIntepretadorParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link DotWheyIntepretadorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull DotWheyIntepretadorParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotWheyIntepretadorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull DotWheyIntepretadorParser.AtomContext ctx);

	/**
	 * Enter a parse tree produced by {@link DotWheyIntepretadorParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(@NotNull DotWheyIntepretadorParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotWheyIntepretadorParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(@NotNull DotWheyIntepretadorParser.MultExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link DotWheyIntepretadorParser#valorint}.
	 * @param ctx the parse tree
	 */
	void enterValorint(@NotNull DotWheyIntepretadorParser.ValorintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DotWheyIntepretadorParser#valorint}.
	 * @param ctx the parse tree
	 */
	void exitValorint(@NotNull DotWheyIntepretadorParser.ValorintContext ctx);
}