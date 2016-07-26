package com.elasticsearch.search;

import org.elasticsearch.action.search.SearchRequestBuilder;

/**
 * 说明:
 * 作者: LDL
 * 日期: 2016/6/15.
 */
public class SelectVisitor extends SelectParserBaseVisitor<SearchRequestBuilder> {

    private SearchRequestBuilder searchRequestBuilder;

    public SelectVisitor(SearchRequestBuilder searchRequestBuilder){
        this.searchRequestBuilder = searchRequestBuilder;
    }

    @Override
    public SearchRequestBuilder visitTable_type(SelectParser.Table_typeContext ctx) {
        return searchRequestBuilder;
    }

    @Override
    public SearchRequestBuilder visitLimit_expr(SelectParser.Limit_exprContext ctx) {
        int begin = Integer.parseInt(ctx.getText().split(",")[0]);
        int size = Integer.parseInt(ctx.getText().split(",")[1]);
        return searchRequestBuilder.setFrom(begin).setSize(size);
    }

    @Override
    public SearchRequestBuilder visitWhere_clause(SelectParser.Where_clauseContext ctx) {
        return searchRequestBuilder;
    }

    @Override
    public SearchRequestBuilder visitColumn_list_clause(SelectParser.Column_list_clauseContext ctx) {
        String[] columns = ctx.getText().split(",");
        return searchRequestBuilder.setFetchSource(columns, null);
    }

    /*@Override
    public SearchRequestBuilder visitOrderby_case(Orderby_caseContext ctx) {
        if(ctx.order.getType() == ASC){
            return searchRequestBuilder.addSort(ctx.column_name().getText(), SortOrder.ASC);
        }
        return searchRequestBuilder.addSort(ctx.column_name().getText(),SortOrder.DESC);
    }*/

}
