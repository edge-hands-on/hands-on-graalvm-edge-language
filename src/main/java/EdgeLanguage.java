import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.TruffleLanguage;

@TruffleLanguage.Registration(id = "el", name = "Edge language")
class EdgeLanguage extends TruffleLanguage {

    @Override
    protected Object createContext(Env env) {
        return null;
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        return new EdgeLanguageRootNode(this, buildTree()).getCallTarget();
    }

    private IntNode buildTree() {
        return new AddIntNode(
                new LiteralIntNode(5),
                new LiteralIntNode(5)
        );
    }
}

// +
// 4
// 5