package com.elasticsearch.mapping;

/**
 * 说明:
 * 作者: LDL
 * 日期: 2016/7/26.
 */
public class MappingVisitor extends MappingParserBaseVisitor<String> {
    @Override public String visitIndex_name(MappingParser.Index_nameContext ctx) { return visitChildren(ctx); }
}
