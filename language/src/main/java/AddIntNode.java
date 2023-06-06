import com.oracle.truffle.api.nodes.Node;

public class AddIntNode extends IntNode {
    private IntNode leftNode;
    private IntNode rightNode;

    public AddIntNode(IntNode leftNode, IntNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public int execute() {
        return leftNode.execute() + rightNode.execute();
    }
}
