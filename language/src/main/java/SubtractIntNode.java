public class SubtractIntNode extends IntNode {
    private IntNode leftNode;
    private IntNode rightNode;

    public SubtractIntNode(IntNode leftNode, IntNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public int execute() {
        return leftNode.execute() - rightNode.execute();
    }
}