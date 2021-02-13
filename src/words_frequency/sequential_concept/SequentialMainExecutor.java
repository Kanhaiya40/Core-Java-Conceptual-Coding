package words_frequency.sequential_concept;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SequentialMainExecutor {

    public static void main(String[] args) throws IOException {
        String filePath="/home/kanhaiya/Desktop/samp.txt";
        LineParser lineParser = new LineParser(filePath);
        List<String> lines = lineParser.parse();
        WordFrequencyCalculator wordFrequencyCalculator = new WordFrequencyCalculator(lines);
        Map<String, Integer> wordFrequencies = wordFrequencyCalculator.wordVsCount();
        System.out.println("Sequential Approach :" + wordFrequencies);
    }
}
