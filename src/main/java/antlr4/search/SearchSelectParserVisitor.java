package antlr4.search;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.Client;

import static antlr4.search.SearchParser.*;

/**
 * 说明:
 * 作者: LDL
 * 日期: 2016/6/15.
 */
public class SearchSelectParserVisitor extends SearchParserBaseVisitor<SearchRequestBuilder> {

    Client client;
    @Override
    public SearchRequestBuilder visitTable_name(Table_nameContext ctx) {
        SearchRequestBuilder searchRequestBuilder = visit(ctx);
        return client.prepareSearch(ctx.getText());
    }

    @Override
    public SearchRequestBuilder visitTable_type(Table_typeContext ctx) {
        SearchRequestBuilder searchRequestBuilder = visit(ctx);
        return searchRequestBuilder.setTypes(ctx.getText());
    }

    @Override
    public SearchRequestBuilder visitLimit_expr(Limit_exprContext ctx) {
        SearchRequestBuilder searchRequestBuilder = visit(ctx);
        int begin = Integer.parseInt(ctx.getText().split(",")[0]);
        int size = Integer.parseInt(ctx.getText().split(",")[1]);
        return searchRequestBuilder.setFrom(begin).setSize(size);
    }


}
