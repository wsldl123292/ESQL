import antlr4.search.*;
import com.alibaba.druid.sql.ast.statement.*;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.sun.org.apache.xml.internal.utils.StringBufferPool;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * 说明:
 * 作者: LDL
 * 日期: 2016/6/15.
 */
public class Esql {

    private static final Settings settings = ImmutableSettings.settingsBuilder()
            .put("client.transport.sniff", true).put("cluster.name", "es").build();
    private static Client client = new TransportClient(settings).addTransportAddress(new InetSocketTransportAddress("192.168.1.212", 9300));

    public static void main(String[] args) throws Exception {

        String sql = "select name,age from ttt3.ttt3 where name='eee'";

        SQLSelectQueryBlock sqlSelectQuery = getSelectBlock(sql);

        SearchRequestBuilder searchRequestBuilder = generateSearchRequestBuilder(sqlSelectQuery);

        String whereSql = getWhereSql(sqlSelectQuery);

        SelectParser parser = new SelectParser(new CommonTokenStream(new SearchLexer(new ANTLRInputStream
                (sql))));
        ParseTree tree = parser.stat();
        SelectVisitor searchSelectParserVisitor = new SelectVisitor(searchRequestBuilder);
        searchRequestBuilder = searchSelectParserVisitor.visit(tree);

        if (whereSql != null) {
            WhereParser whereParser = new WhereParser(new CommonTokenStream(new SearchLexer(new ANTLRInputStream
                    ("where " + whereSql))));
            ParseTree wtree = whereParser.stat();
            WhereVisitor whereParserVisitor = new WhereVisitor();
            QueryBuilder queryBuilder = whereParserVisitor.visit(wtree);

            searchRequestBuilder.setQuery(queryBuilder);
        }else{
            searchRequestBuilder.setQuery(QueryBuilders.matchAllQuery());
        }

        System.out.println(searchRequestBuilder);
        System.out.println(searchRequestBuilder.execute().actionGet());
    }


    private static SQLSelectQueryBlock getSelectBlock(String sql) {
        //使用mysql解析
        MySqlStatementParser sqlStatementParser = new MySqlStatementParser(sql);
        //解析select查询
        SQLSelectStatement sqlStatement = (SQLSelectStatement) sqlStatementParser.parseSelect();
        SQLSelect sqlSelect = sqlStatement.getSelect();
        //获取sql查询块

        return (SQLSelectQueryBlock) sqlSelect.getQuery();
    }

    private static String getWhereSql(SQLSelectQueryBlock sqlSelectQuery) {


        return sqlSelectQuery.getWhere() == null ? null : sqlSelectQuery.getWhere().toString();
    }


    private static SearchRequestBuilder generateSearchRequestBuilder(SQLSelectQueryBlock sqlSelectQuery) {

        SQLTableSource table = sqlSelectQuery.getFrom();

        String[] tables;
        String[] types;
        if (table != null) {
            String[] tableTypeArr = table.toString().split(",");
            tables = new String[tableTypeArr.length];
            types = new String[tableTypeArr.length];
            for (int i = 0; i < tableTypeArr.length; i++) {
                String[] tableType = tableTypeArr[i].split("\\.");
                tables[i] = tableType[0];
                types[i] = tableType[1];
            }
        } else {
            return null;
        }

        return client.prepareSearch(tables).setTypes(types);
    }
}