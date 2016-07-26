package com.elasticsearch.search;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * 说明: sql语句中的where条件转换为QueryBuilder,
 * 类似cD = a and (dd=c or c=t),不包括limit,group by,order by等
 * 作者: LDL
 * 日期: 2016/6/15.
 */
public class WhereVisitor extends WhereParserBaseVisitor<QueryBuilder> {

    /**
     * 遍历括号表达式
     *
     * @param ctx 带括号的表达式
     * @return QueryBuilder
     */
    @Override
    public QueryBuilder visitParenExp(WhereParser.ParenExpContext ctx) {
        return visit(ctx.expression());
    }

    /**
     * and 条件转换
     *
     * @param ctx and 表达式
     * @return QueryBuilder
     */
    @Override
    public QueryBuilder visitAndExp(WhereParser.AndExpContext ctx) {
        QueryBuilder left = visit(ctx.expression(0));
        QueryBuilder right = visit(ctx.expression(1));
        return QueryBuilders.boolQuery()
                .must(left)
                .must(right);

    }

    /**
     * or 条件转换
     *
     * @param ctx or 表达式
     * @return QueryBuilder
     */
    @Override
    public QueryBuilder visitOrExp(WhereParser.OrExpContext ctx) {
        QueryBuilder left = visit(ctx.expression(0));
        QueryBuilder right = visit(ctx.expression(1));
        return QueryBuilders.boolQuery()
                .should(left)
                .should(right);
    }

    /**
     * 基本表达式转换
     * a=b a>b a<b...
     *
     * @param ctx 基本表达式
     * @return QueryBuilder
     */
    @Override
    public QueryBuilder visitExp(WhereParser.ExpContext ctx) {
        WhereParser.Simple_expressionContext simple_expressionContext = ctx.simple_expression();
        if (simple_expressionContext instanceof WhereParser.BaseExpContext) {
            WhereParser.BaseExpContext baseExpContext = (WhereParser.BaseExpContext) simple_expressionContext;
            switch (baseExpContext.relational_op.getType()) {
                case WhereParser.EQ:
                    return QueryBuilders.matchPhraseQuery(baseExpContext.left_element().getText(),
                            baseExpContext.right_element().getText());
                default:
                    return null;
            }
        }
        return visitChildren(ctx);
    }
}
