package com.elasticsearch.create;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.client.IndicesAdminClient;

import java.util.HashMap;

/**
 * 功能: create语句
 * 作者: ldl
 * 时间: 2016-07-21 22:33
 */
public class CreateVisitor extends CreateParserBaseVisitor<CreateIndexRequestBuilder> {

    private CreateIndexRequestBuilder createIndexRequestBuilder;
    private IndicesAdminClient indicesAdminClient;
    private HashMap<String, Object> settings = new HashMap<>();

    public CreateVisitor(IndicesAdminClient indicesAdminClient) {
        this.indicesAdminClient = indicesAdminClient;
    }


    @Override
    public CreateIndexRequestBuilder visitShards(CreateParser.ShardsContext ctx) {
        settings.put(ctx.getChild(0).getText(), ctx.getChild(1).getText());
        return createIndexRequestBuilder;
    }

    @Override
    public CreateIndexRequestBuilder visitReplicas(CreateParser.ReplicasContext ctx) {
        settings.put(ctx.getChild(0).getText(), ctx.getChild(1).getText());
        return createIndexRequestBuilder;
    }

    @Override
    public CreateIndexRequestBuilder visitIndex_name(CreateParser.Index_nameContext ctx) {
        createIndexRequestBuilder = indicesAdminClient.prepareCreate(ctx.getText());
        return createIndexRequestBuilder;
    }

    public HashMap<String, Object> getSettings() {
        return settings;
    }

}
