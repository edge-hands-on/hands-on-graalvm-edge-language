import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.junit.jupiter.api.Test;

class EdgeLanguageTest {

    @Test
    public void runs_EdgeLanguage() {
        Context context = Context.newBuilder("el").build();
        Value result = context.eval(
            "el",
            ""
        );

        System.out.println(result);
    }
}
