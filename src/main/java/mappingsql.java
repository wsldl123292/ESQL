import com.elasticsearch.mapping.MappingLexer;
import com.elasticsearch.mapping.MappingParser;
import com.elasticsearch.search.SearchLexer;
import com.elasticsearch.search.SelectParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * 说明:
 * 作者: LDL
 * 日期: 2016/6/15.
 */
public class mappingsql {

//    private static final Settings settings = ImmutableSettings.settingsBuilder()
//            .put("client.transport.sniff", true).put("cluster.name", "es").build();
//    private static Client client = new TransportClient(settings).addTransportAddress
//            (new InetSocketTransportAddress("192.168.1.212", 9300));

    public static void main(String[] args) throws Exception {

        String sql = "add mapping a type aa {}";


        MappingLexer mappingLexer = new MappingLexer(new ANTLRInputStream(sql));
        mappingLexer.removeErrorListeners();

        MappingParser parser = new MappingParser(new CommonTokenStream(mappingLexer));
        ParseTree tree = parser.mapping_clause();
        System.out.println(tree.toStringTree(parser));
    }


}