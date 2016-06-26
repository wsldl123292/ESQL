// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/antlr4/search/WhereParser.g4 by ANTLR 4.5.3
package antlr4.search;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WhereParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WhereParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WhereParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(WhereParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhereParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(WhereParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link WhereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(WhereParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link WhereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(WhereParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link WhereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(WhereParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link WhereParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(WhereParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhereParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(WhereParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhereParser#right_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_element(WhereParser.Right_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhereParser#left_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_element(WhereParser.Left_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhereParser#target_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_element(WhereParser.Target_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhereParser#between_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_op(WhereParser.Between_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhereParser#is_or_is_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_or_is_not(WhereParser.Is_or_is_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link WhereParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExp(WhereParser.BaseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenExp}
	 * labeled alternative in {@link WhereParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenExp(WhereParser.BetweenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExp}
	 * labeled alternative in {@link WhereParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExp(WhereParser.IsExpContext ctx);
}