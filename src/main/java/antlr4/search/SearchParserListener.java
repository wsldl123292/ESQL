// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/antlr4/search/SearchParser.g4 by ANTLR 4.5.3
package antlr4.search;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SearchParser}.
 */
public interface SearchParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SearchParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SearchParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SearchParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(SearchParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(SearchParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SearchParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SearchParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#table_type}.
	 * @param ctx the parse tree
	 */
	void enterTable_type(SearchParser.Table_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#table_type}.
	 * @param ctx the parse tree
	 */
	void exitTable_type(SearchParser.Table_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#limit_case}.
	 * @param ctx the parse tree
	 */
	void enterLimit_case(SearchParser.Limit_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#limit_case}.
	 * @param ctx the parse tree
	 */
	void exitLimit_case(SearchParser.Limit_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#limit_expr}.
	 * @param ctx the parse tree
	 */
	void enterLimit_expr(SearchParser.Limit_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#limit_expr}.
	 * @param ctx the parse tree
	 */
	void exitLimit_expr(SearchParser.Limit_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SearchParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SearchParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#column_list_clause}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list_clause(SearchParser.Column_list_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#column_list_clause}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list_clause(SearchParser.Column_list_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SearchParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SearchParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(SearchParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(SearchParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExp(SearchParser.ParenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExp(SearchParser.ParenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(SearchParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(SearchParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExp(SearchParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link SearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExp(SearchParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(SearchParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(SearchParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#right_element}.
	 * @param ctx the parse tree
	 */
	void enterRight_element(SearchParser.Right_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#right_element}.
	 * @param ctx the parse tree
	 */
	void exitRight_element(SearchParser.Right_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#left_element}.
	 * @param ctx the parse tree
	 */
	void enterLeft_element(SearchParser.Left_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#left_element}.
	 * @param ctx the parse tree
	 */
	void exitLeft_element(SearchParser.Left_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#target_element}.
	 * @param ctx the parse tree
	 */
	void enterTarget_element(SearchParser.Target_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#target_element}.
	 * @param ctx the parse tree
	 */
	void exitTarget_element(SearchParser.Target_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#between_op}.
	 * @param ctx the parse tree
	 */
	void enterBetween_op(SearchParser.Between_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#between_op}.
	 * @param ctx the parse tree
	 */
	void exitBetween_op(SearchParser.Between_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#is_or_is_not}.
	 * @param ctx the parse tree
	 */
	void enterIs_or_is_not(SearchParser.Is_or_is_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#is_or_is_not}.
	 * @param ctx the parse tree
	 */
	void exitIs_or_is_not(SearchParser.Is_or_is_notContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SearchParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterBaseExp(SearchParser.BaseExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseExp}
	 * labeled alternative in {@link SearchParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitBaseExp(SearchParser.BaseExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenExp}
	 * labeled alternative in {@link SearchParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterBetweenExp(SearchParser.BetweenExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenExp}
	 * labeled alternative in {@link SearchParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitBetweenExp(SearchParser.BetweenExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExp}
	 * labeled alternative in {@link SearchParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExp(SearchParser.IsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExp}
	 * labeled alternative in {@link SearchParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExp(SearchParser.IsExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchParser#table_references}.
	 * @param ctx the parse tree
	 */
	void enterTable_references(SearchParser.Table_referencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchParser#table_references}.
	 * @param ctx the parse tree
	 */
	void exitTable_references(SearchParser.Table_referencesContext ctx);
}