// Generated from /Users/ldl/Documents/develop/project/github/ESQL/src/main/java/antlr4/create/CreateParser.g4 by ANTLR 4.5.3
package antlr4.create;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CreateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CreateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CreateParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CreateParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateParser#create_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_clause(CreateParser.Create_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(CreateParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateParser#shards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShards(CreateParser.ShardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CreateParser#replicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicas(CreateParser.ReplicasContext ctx);
}