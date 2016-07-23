package antlr4;

import antlr4.create.CreateLexer;
import antlr4.create.CreateParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 功能:
 * 作者: ldl
 * 时间: 2016-07-21 22:24
 */
public class createsql {

//    private static final Settings settings = ImmutableSettings.settingsBuilder()
//                .put("client.transport.sniff", true).put("cluster.name", "es").build();
//    private static Client client = new TransportClient(settings).addTransportAddress
//            (new InetSocketTransportAddress("192.168.1.212", 9300));
    public static void main(String[] args) {
        String sql = "create index a number_of_shards 1 number_of_replicas 1";
        //client.admin().indices().prepareCreate().setSettings().execute().actionGet();
        CreateLexer createLexer = new CreateLexer(new ANTLRInputStream(sql));
        createLexer.removeErrorListeners();

        CreateParser parser = new CreateParser(new CommonTokenStream(createLexer));
        ParseTree tree = parser.stat();
        System.out.println(tree.toStringTree(parser));
    }
}
