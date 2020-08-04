package words_frequency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class WordParser {

    public WordParser() throws IOException {
        parse();
    }

    public Stream<String> parse() throws IOException {
        return Files.lines(Paths.get("/home/shubh/Desktop/rough.txt"));
    }
}
