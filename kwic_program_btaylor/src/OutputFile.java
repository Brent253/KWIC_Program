import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Brent Taylor 5/7/2018
 */
public class OutputFile implements ReadOutput {

    private PrintWriter out;

    public OutputFile(String filename) throws FileNotFoundException {
        out = new PrintWriter(filename);
    }

    @Override
    public void writeLines(List<String> lines) {
        lines.forEach(out::println);
    }

    @Override
    public void close() {
        out.close();
    }
}
