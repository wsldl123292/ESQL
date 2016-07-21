package antlr4.create;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import static antlr4.create.CreateParser.*;
/**
 * 功能:
 * 作者: ldl
 * 时间: 2016-07-21 22:33
 */
public class CreateVisitor extends CreateParserBaseVisitor<CreateIndexRequestBuilder> {
    @Override
    public CreateIndexRequestBuilder visitIndex_name(Index_nameContext ctx) {
        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }
    @Override
    public CreateIndexRequestBuilder visitShards(ShardsContext ctx) {
        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }
    @Override
    public CreateIndexRequestBuilder visitReplicas(ReplicasContext ctx) {
        System.out.println(ctx.getText());
        return visitChildren(ctx);
    }

}
