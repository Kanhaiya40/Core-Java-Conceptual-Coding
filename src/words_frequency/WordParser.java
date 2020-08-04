package words_frequency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordParser {
    private final String filePath;
    private List<String> lines = new ArrayList<>();

    public WordParser(String filePath) throws IOException {
        this.filePath = filePath;
        parse();
    }

    public static void main(String[] args) throws IOException {
        String filePath = "home/shubh/Desktop/rough.txt";
        WordParser wordParser = new WordParser(filePath);
        System.out.println(wordParser.getLines());
    }

    public List<String> getLines() {
        return lines;
    }

    public void parse() throws IOException {
        lines = Files.readAllLines(Paths.get(filePath));
    }
}
