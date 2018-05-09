
import java.io.IOException;
public class main {


    /**
     * Created by Brent Taylor 5/7/2018
     */

            public static void main(String[] args) throws IOException {
                ReadInput in = new InputFile("input.txt");
                Chars characters = new Characters(in.readAll());
                WordShift shifter = new WordShifter(characters.getLines());
                Alphabetize alphabetizer = new Alphabetizer(shifter.getShiftedLines());
                ReadOutput output = new OutputFile("out.txt");
                output.writeLines(alphabetizer.getLines());

                output.close();

            }


}
