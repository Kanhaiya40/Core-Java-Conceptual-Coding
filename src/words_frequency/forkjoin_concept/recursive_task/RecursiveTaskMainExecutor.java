package words_frequency.forkjoin_concept.recursive_task;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RecursiveTaskMainExecutor {

    public static void main(String[] args) throws IOException {
        LineParser lineParser = new LineParser();
        List<String> lines = lineParser.parse();
        RecursiveTaskExecutor recursiveTaskExecutor = new RecursiveTaskExecutor(lines);
        Map<String, Integer> wordFrequencies = recursiveTaskExecutor.calculateWordFrequency();
        System.out.println("Recursive Task:" + wordFrequencies);
    }
}
