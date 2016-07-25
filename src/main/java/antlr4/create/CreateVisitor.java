package antlr4.create;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.client.IndicesAdminClient;

import static antlr4.create.CreateParser.*;
/**
 * 功能:
 * 作者: ldl
 * 时间: 2016-07-21 22:33
 */
public class CreateVisitor extends CreateParserBaseVisitor<CreateIndexRequestBuilder> {

    private CreateIndexRequestBuilder createIndexRequestBuilder;
    private IndicesAdminClient indicesAdminClient;

    public CreateVisitor(IndicesAdminClient indicesAdminClient){
        this.indicesAdminClient = indicesAdminClient;
    }

    @Override
    public CreateIndexRequestBuilder visitShards(ShardsContext ctx) {
        return createIndexRequestBuilder.setSettings("number_of_shards 1");
    }
    @Override
    public CreateIndexRequestBuilder visitReplicas(ReplicasContext ctx) {
        return createIndexRequestBuilder.setSettings("number_of_replicas 1");
    }

    @Override
    public CreateIndexRequestBuilder visitIndex_name(Index_nameContext ctx) {
        createIndexRequestBuilder = indicesAdminClient.prepareCreate(ctx.getText());
        return createIndexRequestBuilder;
    }
}
