package words_frequency.sequential_concept;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SequentialMainExecutor {

    public static void main(String[] args) throws IOException {
        LineParser lineParser = new LineParser();
        List<String> lines = lineParser.parse();
        WordFrequencyCalculator wordFrequencyCalculator = new WordFrequencyCalculator(lines);
        Map<String, Integer> wordFrequencySequential = wordFrequencyCalculator.wordVsCount();
        System.out.println("Sequential Approach :" + wordFrequencySequential);


    }
}
