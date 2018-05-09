import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Brent Taylor 5/7/2018
 */
public class InputFile implements ReadInput {
    private String fName;

    public InputFile(String fileName) throws FileNotFoundException {
        fName =  fileName;
    }

    @Override
    public List<String> readAll() throws IOException {
        return Files.readAllLines(Paths.get(fName));
    }
}