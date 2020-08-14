package words_frequency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineParser {

    String filePath;

    public LineParser(String filePath) {
        this.filePath = filePath;
    }

    public List<String> parse() throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/kanhaiya/Desktop/samp.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        }
        return lines;
    }
}

