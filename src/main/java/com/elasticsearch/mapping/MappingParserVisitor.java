// Generated from F:/GitHub/ESQL/src/main/java/com/elasticsearch/mapping\MappingParser.g4 by ANTLR 4.5.3
package com.elasticsearch.mapping;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MappingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MappingParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MappingParser#mapping_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping_clause(MappingParser.Mapping_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_clause(MappingParser.Index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_clause(MappingParser.Type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(MappingParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingParser#source_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_clause(MappingParser.Source_clauseContext ctx);
}