import java.util.List;

/**
 * Created by Brent Taylor 5/7/2018
 */
public class Characters implements Chars {
    private List<String> lines;

    public Characters(List<String> lines) {
        this.lines = lines;
    }

    public Characters() {
    }

    @Override
    public void setChar(List<String> characters) {
        lines = characters;
    }

    @Override
    public List<String> getLines() {
        return lines;
    }
}