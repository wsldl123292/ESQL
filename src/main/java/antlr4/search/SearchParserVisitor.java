// Generated from F:/GitHub/ESQL/src/main/java/antlr4/g4\SearchParser.g4 by ANTLR 4.5.3
package antlr4.search;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SearchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SearchParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SearchParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SearchParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(SearchParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SearchParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#table_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type(SearchParser.Table_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#limit_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_case(SearchParser.Limit_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#limitexpre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitexpre(SearchParser.LimitexpreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#limitNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitNum(SearchParser.LimitNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SearchParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#column_list_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list_clause(SearchParser.Column_list_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SearchParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(SearchParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(SearchParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(SearchParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(SearchParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(SearchParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#right_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_element(SearchParser.Right_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#left_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_element(SearchParser.Left_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#target_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_element(SearchParser.Target_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#between_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_op(SearchParser.Between_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#is_or_is_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_or_is_not(SearchParser.Is_or_is_notContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SearchParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExp(SearchParser.BaseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenExp}
	 * labeled alternative in {@link SearchParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenExp(SearchParser.BetweenExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExp}
	 * labeled alternative in {@link SearchParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExp(SearchParser.IsExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchParser#table_references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_references(SearchParser.Table_referencesContext ctx);
}