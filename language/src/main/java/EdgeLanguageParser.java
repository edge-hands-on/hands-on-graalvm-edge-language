import java.util.Objects;

public class EdgeLanguageParser {
    private String[] lines;
    private int currentLine = 0;

    public EdgeLanguageParser(String sourceCode) {
        this.lines = sourceCode.split("\n");
    }

    public String getNext() {
        if (currentLine >= lines.length) {
            return null;
        }

        return lines[currentLine++];
    }

    public IntNode parse() {
        return parseLine(getNext());
    }

    private IntNode parseLine(String line) {
        if (Objects.equals(line, "+")) {
            return parseAdd();
        } else if (Objects.equals(line, "-")) {
            return parseSubtract();
        } else if (Objects.equals(line, "*")) {
            return parseMutiply();
        } else if (Objects.equals(line, "/")) {
            return parseDivide();
        }

        return parseLiteral(line);
    }

    private IntNode parseAdd() {
        String op1 = getNext();
        IntNode node1 = parseLine(op1);

        String op2 = getNext();
        IntNode node2 = parseLine(op2);

        return new AddIntNode(node1, node2);
    }

    private IntNode parseSubtract() {
        String op1 = getNext();
        IntNode node1 = parseLine(op1);

        String op2 = getNext();
        IntNode node2 = parseLine(op2);

        return new SubtractIntNode(node1, node2);
    }

    private IntNode parseMutiply() {
        String op1 = getNext();
        IntNode node1 = parseLine(op1);

        String op2 = getNext();
        IntNode node2 = parseLine(op2);

        return new MultiplyIntNode(node1, node2);
    }

    private IntNode parseDivide() {
        String op1 = getNext();
        IntNode node1 = parseLine(op1);

        String op2 = getNext();
        IntNode node2 = parseLine(op2);

        return new DivideIntNode(node1, node2);
    }

    private IntNode parseLiteral(String line) {
        return new LiteralIntNode(Integer.parseInt(line));
    }
}
