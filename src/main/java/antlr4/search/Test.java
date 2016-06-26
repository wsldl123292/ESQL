package antlr4.search;

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

import java.util.List;

/**
 * 功能:
 * 作者: ldl
 * 时间: 2016-06-26 17:39
 */
public class Test {

    public static void main(String[] args) {
        String sql = " select eventId,eventKey,eventName,flag from event.f,ee.wa where a";
        //使用mysql解析
        MySqlStatementParser sqlStatementParser = new MySqlStatementParser(sql) ;
        //解析select查询
        SQLSelectStatement sqlStatement = (SQLSelectStatement) sqlStatementParser.parseSelect();
        SQLSelect sqlSelect = sqlStatement.getSelect() ;
        //获取sql查询块
        SQLSelectQueryBlock sqlSelectQuery = (SQLSelectQueryBlock)sqlSelect.getQuery() ;
        sqlSelectQuery.getWhere();
        System.out.println(sqlSelectQuery.getWhere().toString());

    }

}
