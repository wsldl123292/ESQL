package test;

import antlr4.search.SearchLexer;
import antlr4.search.SelectParser;
import antlr4.search.SelectVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 功能:
 * 作者: ldl
 * 时间: 2016-07-02 20:28
 */
public class Test {

    public static void main(String[] args) {

        String sql = "select name,age from ttt3.ttt3 where name='test' and name = 3";

        LibExprLexer libExprLexer = new LibExprLexer(new ANTLRInputStream
                (sql));
        libExprLexer.removeErrorListeners();
        LibExprParser parser = new LibExprParser(new
                CommonTokenStream(libExprLexer));
        ParseTree tree = parser.stat();

        LibVIsitor libVIsitor = new LibVIsitor();
        libVIsitor.visit(tree);
        System.out.println(tree.toStringTree(parser));
    }
}
