// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/test/LibExpr.g4 by ANTLR 4.5.3
package test;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LibExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LibExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LibExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(LibExprParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(LibExprParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#table_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type(LibExprParser.Table_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#limit_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_case(LibExprParser.Limit_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#limit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_expr(LibExprParser.Limit_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(LibExprParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#column_list_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list_clause(LibExprParser.Column_list_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#table_references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_references(LibExprParser.Table_referencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#orderby_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_case(LibExprParser.Orderby_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(LibExprParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link LibExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(LibExprParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link LibExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(LibExprParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link LibExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(LibExprParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LibExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LibExprParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#right_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_element(LibExprParser.Right_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#left_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_element(LibExprParser.Left_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#between_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_element(LibExprParser.Between_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#is_or_is_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_or_is_not(LibExprParser.Is_or_is_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link LibExprParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExp(LibExprParser.BaseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenExp}
	 * labeled alternative in {@link LibExprParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenExp(LibExprParser.BetweenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExp}
	 * labeled alternative in {@link LibExprParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExp(LibExprParser.IsExpContext ctx);
}