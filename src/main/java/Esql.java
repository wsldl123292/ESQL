import antlr4.search.SearchLexer;
import antlr4.search.SearchParser;
import antlr4.search.SearchWhereParserVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 说明:
 * 作者: LDL
 * 日期: 2016/6/15.
 */
public class Esql {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream
                ("SELECT Aa FROM dE-5.f where cD = a and (dd=c or c=t)");
        SearchLexer lexer = new SearchLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SearchParser parser = new SearchParser(tokens);
        ParseTree tree = parser.stat();
        SearchWhereParserVisitor whereVisitor = new SearchWhereParserVisitor();
        System.out.println(whereVisitor.visit(tree));
        //System.out.println(tree.toStringTree(parser)); // print tree as text

    }
}
