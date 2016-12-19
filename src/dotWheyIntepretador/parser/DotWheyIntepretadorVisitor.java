// Generated from C:\Users\ProBook\Desktop\dotWheyIntepretador\src\dotWheyIntepretador\parser\DotWheyIntepretador.g4 by ANTLR 4.1

package dotWheyIntepretador.parser;
import java.util.Scanner;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DotWheyIntepretadorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DotWheyIntepretadorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DotWheyIntepretadorParser#atribuir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuir(@NotNull DotWheyIntepretadorParser.AtribuirContext ctx);

	/**
	 * Visit a parse tree produced by {@link DotWheyIntepretadorParser#imprime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprime(@NotNull DotWheyIntepretadorParser.ImprimeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DotWheyIntepretadorParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull DotWheyIntepretadorParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link DotWheyIntepretadorParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeitura(@NotNull DotWheyIntepretadorParser.LeituraContext ctx);

	/**
	 * Visit a parse tree produced by {@link DotWheyIntepretadorParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(@NotNull DotWheyIntepretadorParser.ExpressaoContext ctx);

	/**
	 * Visit a parse tree produced by {@link DotWheyIntepretadorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull DotWheyIntepretadorParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link DotWheyIntepretadorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(@NotNull DotWheyIntepretadorParser.AtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link DotWheyIntepretadorParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(@NotNull DotWheyIntepretadorParser.MultExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DotWheyIntepretadorParser#valorint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorint(@NotNull DotWheyIntepretadorParser.ValorintContext ctx);
}