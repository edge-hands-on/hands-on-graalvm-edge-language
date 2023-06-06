import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;
import java.io.IOException;

public class ELMain {

    private static final String LANGUAGE = "el";
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Missing the source code file");
        }

        Source source = Source.newBuilder(LANGUAGE, new File(args[0])).build();

        Context context = Context.newBuilder(LANGUAGE).build();
        Value result = context.eval(source);

        System.out.println(result);
    }
}
