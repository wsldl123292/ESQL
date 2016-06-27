package antlr4.search;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import static antlr4.search.SelectParser.*;

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
    public SearchRequestBuilder visitTable_type(Table_typeContext ctx) {
        return searchRequestBuilder;
    }

    @Override
    public SearchRequestBuilder visitLimit_expr(Limit_exprContext ctx) {
        int begin = Integer.parseInt(ctx.getText().split(",")[0]);
        int size = Integer.parseInt(ctx.getText().split(",")[1]);
        return searchRequestBuilder.setFrom(begin).setSize(size);
    }

    @Override
    public SearchRequestBuilder visitWhere_clause(Where_clauseContext ctx) {
        return searchRequestBuilder;
    }

    @Override
    public SearchRequestBuilder visitColumn_list_clause(Column_list_clauseContext ctx) {
        return searchRequestBuilder.setFetchSource(ctx.getText(), null);
    }

}
