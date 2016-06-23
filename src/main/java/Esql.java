import antlr4.SQLLexer;
import antlr4.SQLParser;
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
        SQLLexer lexer = new SQLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(tokens);
        ParseTree tree = parser.stat();
        EsqlVisitor eval = new EsqlVisitor();
        System.out.println(eval.visit(tree));
        //System.out.println(tree.toStringTree(parser)); // print tree as text

    }
}
