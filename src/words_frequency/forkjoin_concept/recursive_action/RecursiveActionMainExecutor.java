package words_frequency.forkjoin_concept.recursive_action;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RecursiveActionMainExecutor {

    public static void main(String[] args) throws IOException {
        LineParser lineParser = new LineParser();
        List<String> lines = lineParser.parse();
        RecursiveActionExecutor recursiveActionExecutor = new RecursiveActionExecutor(lines);
        Map<String, Integer> wordFrequencies = recursiveActionExecutor.calculateWordFrequencies();
        System.out.println("Recursive Action: " + wordFrequencies);
    }
}
