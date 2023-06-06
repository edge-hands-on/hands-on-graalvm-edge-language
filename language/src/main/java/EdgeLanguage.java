import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.source.Source;

import java.util.stream.Stream;

@TruffleLanguage.Registration(id = "el", name = "Edge language")
class EdgeLanguage extends TruffleLanguage {

    @Override
    protected Object createContext(Env env) {
        return null;
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        Source source = request.getSource();
        String sourceText = source.getCharacters().toString();

        return new EdgeLanguageRootNode(this, parseSource(sourceText)).getCallTarget();
    }

    private IntNode parseSource(String sourceText) {
        return new EdgeLanguageParser(sourceText).parse();
    }

    private IntNode buildTree() {
        return new AddIntNode(
                new LiteralIntNode(5),
                new LiteralIntNode(5)
        );
    }
}
