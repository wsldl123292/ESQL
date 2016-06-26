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
}