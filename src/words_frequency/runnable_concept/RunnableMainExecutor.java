package words_frequency.runnable_concept;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RunnableMainExecutor {

    public static void main(String[] args) throws IOException, InterruptedException {
        String filePath="/home/kanhaiya/Desktop/samp.txt";
        LineParser lineParser = new LineParser(filePath);
        List<String> lines = lineParser.parse();
        int sizeOfBuffer = 100;
        RunnableExecutor runnableExecutor = new RunnableExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequenciesRunnable = runnableExecutor.calculateFrequency();
        System.out.println("Runnable Concept :" + wordFrequenciesRunnable);
    }
}
