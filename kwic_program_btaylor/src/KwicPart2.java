import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class KwicPart2 implements WordShift{

    /**
     * Created by Brent Taylor 5/7/2018
     */

    private List<String> lines;

    public KwicPart2(List<String> lines) {
        this.lines = wordShift(lines);
    }

    public KwicPart2() {
        this.lines = new LinkedList<>();
    }

    private List<String> wordShift(List<String> lines){

        List<String> result = new LinkedList<>();
        for (String line: lines) {
            List<String> words = new ArrayList<>(Arrays.asList(line.split(" ")));
            int lastArrayIndex = words.size() - 1;
            for (int i = 0; i < words.size() ; ++i) {
                words.add(0,words.remove(lastArrayIndex));
                result.add(arrayToString(words));
            }
        }
        return result;
    }

    private String arrayToString(List<String> arr){
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
