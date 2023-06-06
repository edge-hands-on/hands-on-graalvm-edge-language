public class MultiplyIntNode extends IntNode {
    private IntNode leftNode;
    private IntNode rightNode;

    public MultiplyIntNode(IntNode leftNode, IntNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public int execute() {
        return leftNode.execute() * rightNode.execute();
    }
}
