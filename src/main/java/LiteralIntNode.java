public class LiteralIntNode extends IntNode {
    private int value = 0;

    public LiteralIntNode(int value) {
        this.value = value;
    }

    @Override
    public int execute() {
        return value;
    }
}
