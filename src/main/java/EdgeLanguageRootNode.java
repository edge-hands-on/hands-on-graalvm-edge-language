import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

class EdgeLanguageRootNode extends RootNode {
    private IntNode rootNode;

    protected EdgeLanguageRootNode(TruffleLanguage<?> language, IntNode node) {
        super(language);

        this.rootNode = node;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return rootNode.execute();
    }
}
