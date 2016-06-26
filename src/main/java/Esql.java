import antlr4.search.*;
import com.alibaba.druid.sql.ast.statement.SQLSelect;
import com.alibaba.druid.sql.ast.statement.SQLSelectQuery;
import com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import com.sun.org.apache.xml.internal.utils.StringBufferPool;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.index.query.QueryBuilder;

/**
 * 说明:
 * 作者: LDL
 * 日期: 2016/6/15.
 */
public class Esql {
    public static void main(String[] args) throws Exception {

        String sql = "select a from b.e where  a=  b   and d=c ".toLowerCase();

        String whereSql = getWhereSql(sql).toLowerCase();
//        String sqlWithOutWhere = deleteWhereSql(sql,whereSql);
//
//        System.out.println(whereSql);
//        System.out.println(sqlWithOutWhere);
        ANTLRInputStream input = new ANTLRInputStream
                ("where "+whereSql);
        SearchLexer lexer = new SearchLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

//        SelectParser parser = new SelectParser(tokens);
//        ParseTree tree = parser.stat();
        //System.out.println(tree.getText());

        WhereParser whereParser = new WhereParser(tokens);
        ParseTree wtree = whereParser.stat();
        System.out.println(wtree.getText());

//        SelectVisitor searchSelectParserVisitor = new SelectVisitor();
//        SearchRequestBuilder searchRequestBuilder = searchSelectParserVisitor.visit(tree);
//        System.out.println(searchRequestBuilder);
        WhereVisitor whereParserVisitor = new WhereVisitor();
        QueryBuilder queryBuilder = whereParserVisitor.visit(wtree);

        //searchRequestBuilder.setQuery(queryBuilder);
        System.out.println(queryBuilder);




        //System.out.println(tree.toStringTree(parser)); // print tree as text

    }


    public static String getWhereSql(String sql){
        //使用mysql解析
        MySqlStatementParser sqlStatementParser = new MySqlStatementParser(sql) ;
        //解析select查询
        SQLSelectStatement sqlStatement = (SQLSelectStatement) sqlStatementParser.parseSelect();
        SQLSelect sqlSelect = sqlStatement.getSelect() ;
        //获取sql查询块
        SQLSelectQueryBlock sqlSelectQuery = (SQLSelectQueryBlock)sqlSelect.getQuery() ;
        return sqlSelectQuery.getWhere().toString();
    }


    public static String deleteWhereSql(String sql,String whereSql){
        String regex = "where\\S+";

        sql = sql.replaceAll(regex,"");

        return sql;
    }
}