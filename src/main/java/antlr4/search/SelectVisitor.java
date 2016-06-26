package antlr4.search;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import static antlr4.search.SelectParser.*;

/**
 * 说明:
 * 作者: LDL
 * 日期: 2016/6/15.
 */
public class SelectVisitor extends SelectParserBaseVisitor<SearchRequestBuilder> {

    Client client = new TransportClient().addTransportAddress(new InetSocketTransportAddress("192.168.99.100", 9300));;
    private SearchRequestBuilder searchRequestBuilder;
    @Override
    public SearchRequestBuilder visitTable_name(Table_nameContext ctx) {
        searchRequestBuilder = client.prepareSearch(ctx.getText());
        return searchRequestBuilder;
    }

    @Override
    public SearchRequestBuilder visitTable_type(Table_typeContext ctx) {
        return searchRequestBuilder.setTypes(ctx.getText());
    }

    @Override
    public SearchRequestBuilder visitLimit_expr(Limit_exprContext ctx) {
        int begin = Integer.parseInt(ctx.getText().split(",")[0]);
        int size = Integer.parseInt(ctx.getText().split(",")[1]);
        return searchRequestBuilder.setFrom(begin).setSize(size);
    }


}
