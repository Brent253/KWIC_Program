import java.util.Collections;
import java.util.List;

/**
 * Created by Brent Taylor 5/7/2018
 */

public class Alphabetizer implements Alphabetize {
    private List<String> lines;

    public Alphabetizer() {
    }

    public Alphabetizer(List<String> lines) {
        this.lines = alfabetize(lines);
    }


    private List<String> alfabetize(List<String> lines){
        Collections.sort(lines);
        return lines;
    }

    @Override
    public List<String> getLines() {
        return lines;
    }
}