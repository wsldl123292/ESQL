package test;

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

        String sql = "create index a number_of_shards 1 number_of_replicas 1";

        LibExprLexer libExprLexer = new LibExprLexer(new ANTLRInputStream
                (sql));
        libExprLexer.removeErrorListeners();
        LibExprParser parser = new LibExprParser(new
                CommonTokenStream(libExprLexer));
        ParseTree tree = parser.stat();
        System.out.println(tree.toStringTree(parser));
    }
}
