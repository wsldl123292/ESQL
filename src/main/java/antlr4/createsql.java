package antlr4;

import antlr4.create.CreateLexer;
import antlr4.create.CreateParser;
import antlr4.create.CreateVisitor;
import com.sun.org.apache.bcel.internal.generic.IFNE;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.FilterClient;
import org.elasticsearch.client.IndicesAdminClient;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import java.util.HashMap;

/**
 * 功能:
 * 作者: ldl
 * 时间: 2016-07-21 22:24
 */
public class createsql {

    private static final Settings settings = ImmutableSettings.settingsBuilder()
                .put("client.transport.sniff", true).put("cluster.name", "es").build();
    private static Client client = new TransportClient(settings).addTransportAddress
            (new InetSocketTransportAddress("192.168.1.212", 9300));

    public static void main(String[] args) {
        String sql = "create index a number_of_shards 1 number_of_replicas 1";

        CreateLexer createLexer = new CreateLexer(new ANTLRInputStream(sql));
        createLexer.removeErrorListeners();

        CreateParser parser = new CreateParser(new CommonTokenStream(createLexer));
        parser.removeErrorListeners();

        ParseTree tree = parser.stat();

        IndicesAdminClient indicesAdminClient = client.admin().indices();
        CreateVisitor visitor = new CreateVisitor(indicesAdminClient);
        CreateIndexRequestBuilder createIndexRequestBuilder = visitor.visit(tree);
        createIndexRequestBuilder.setSettings(visitor.getSettings());
        createIndexRequestBuilder.execute().actionGet();
    }
}
