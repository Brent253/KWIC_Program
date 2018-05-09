import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Brent Taylor 5/7/2018
 */
public class WordShifter implements WordShift {
    private List<String> lines;

    public WordShifter(List<String> lines) {
        this.lines = shiftWords(lines);
    }

    public WordShifter() {
        this.lines = new LinkedList<>();
    }

    private List<String> shiftWords(List<String> lines){
        List<String> result = new LinkedList<>();
        for (String line: lines) {
            List<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));
            int lastIndex = words.size() - 1;
            for (int i = 0; i < words.size() ; ++i) {
                words.add(0,words.remove(lastIndex));
                result.add(arrToString(words));
            }
        }
        return result;
    }

    private String arrToString(List<String> arr){
        StringBuilder sb = new StringBuilder();
        for (String node: arr) {
            sb.append(node);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override
    public List<String> getShiftedLines() {
        return lines;
    }
}