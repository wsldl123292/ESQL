import antlr4.search.SearchLexer;
import antlr4.search.SearchParser;
import antlr4.search.SearchSelectParserVisitor;
import antlr4.search.SearchWhereParserVisitor;
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
        ANTLRInputStream input = new ANTLRInputStream
                ("SELECT a FROM dE-5.f where a=b and d=c ");
        SearchLexer lexer = new SearchLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SearchParser parser = new SearchParser(tokens);
        ParseTree tree = parser.stat();
        ParseTree d = parser.where_clause();
        System.out.println(d.toStringTree(parser));
        System.out.println(tree.getText());

        /*SearchSelectParserVisitor searchSelectParserVisitor = new SearchSelectParserVisitor();
        SearchRequestBuilder searchRequestBuilder = searchSelectParserVisitor.visit(tree);
        System.out.println(searchRequestBuilder);*/
        /*SearchWhereParserVisitor whereParserVisitor = new SearchWhereParserVisitor();
        QueryBuilder queryBuilder = whereParserVisitor.visit(tree);

        searchRequestBuilder.setQuery(queryBuilder);
        System.out.println(queryBuilder);*/



        //System.out.println(tree.toStringTree(parser)); // print tree as text

    }
}
