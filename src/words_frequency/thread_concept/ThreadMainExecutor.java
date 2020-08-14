package words_frequency.thread_concept;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ThreadMainExecutor {

    public static void main(String[] args) throws IOException, InterruptedException {
        String filePath="/home/kanhaiya/Desktop/samp.txt";
        LineParser lineParser = new LineParser(filePath);
        List<String> lines = lineParser.parse();
        int sizeOfBuffer = 100;
        ThreadExecutor threadExecutor = new ThreadExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequenciesThread = threadExecutor.calculateFrequency();
        System.out.println("Thread Concept :" + wordFrequenciesThread);
    }
}
