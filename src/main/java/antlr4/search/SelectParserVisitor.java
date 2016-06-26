// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/antlr4/search/SelectParser.g4 by ANTLR 4.5.3
package antlr4.search;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SelectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SelectParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SelectParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SelectParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(SelectParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SelectParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#table_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type(SelectParser.Table_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#limit_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_case(SelectParser.Limit_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#limit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_expr(SelectParser.Limit_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SelectParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#column_list_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list_clause(SelectParser.Column_list_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#table_references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_references(SelectParser.Table_referencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SelectParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link SelectParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(SelectParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link SelectParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(SelectParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link SelectParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(SelectParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link SelectParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(SelectParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(SelectParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#right_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_element(SelectParser.Right_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#left_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_element(SelectParser.Left_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#target_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_element(SelectParser.Target_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#between_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_op(SelectParser.Between_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SelectParser#is_or_is_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_or_is_not(SelectParser.Is_or_is_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SelectParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExp(SelectParser.BaseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenExp}
	 * labeled alternative in {@link SelectParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenExp(SelectParser.BetweenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExp}
	 * labeled alternative in {@link SelectParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExp(SelectParser.IsExpContext ctx);
}