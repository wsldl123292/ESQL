package test;

/**
 * 功能:
 * 作者: ldl
 * 时间: 2016-07-03 15:44
 */
public class LibVIsitor extends LibExprBaseVisitor<String> {


    @Override
    public String visitWhere_clause(LibExprParser.Where_clauseContext ctx)
    {
        System.out.println(ctx.getText());
        return visitChildren(ctx);

    }


    @Override
    public String visitRight_element(LibExprParser.Right_elementContext ctx) {
        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }
}
