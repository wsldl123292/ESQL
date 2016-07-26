package com.elasticsearch.search;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelect;
import com.alibaba.druid.sql.ast.statement.SQLSelectItem;
import com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlOutputVisitor;
import com.alibaba.druid.sql.visitor.SQLASTOutputVisitor;
import com.alibaba.druid.util.JdbcUtils;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.util.List;

/**
 * 功能:
 * 作者: ldl
 * 时间: 2016-06-26 17:39
 */
public class Test {

    public static void main(String[] args) {
        final Settings settings = ImmutableSettings.settingsBuilder()
                .put("client.transport.sniff", true).put("cluster.name", "es").build();
        Client client = new TransportClient(settings).addTransportAddress(new InetSocketTransportAddress("192.168.1.212", 9300));;

        SearchRequestBuilder searchRequestBuilder = client.prepareSearch("ttt3").setTypes("ttt3")
                .setFetchSource("name",null);

        System.out.println(searchRequestBuilder);

        System.out.println(searchRequestBuilder.execute().actionGet());
    }

}
