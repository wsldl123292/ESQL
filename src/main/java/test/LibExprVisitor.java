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
	 * Visit a parse tree produced by {@link LibExprParser#create_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_clause(LibExprParser.Create_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(LibExprParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#shards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShards(LibExprParser.ShardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#replicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicas(LibExprParser.ReplicasContext ctx);
}