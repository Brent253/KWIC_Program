import java.util.List;

/**
 * Created by mejty on 20.3.16.
 */
public interface ReadOutput {
    public void writeLines(List<String> lines);
    public void close();
}