package words_frequency.threadpoool_concept;

import words_frequency.LineParser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ThreadPoolMainExecutor {

    public static void main(String[] args) throws IOException, InterruptedException {
        LineParser lineParser = new LineParser();
        List<String> lines = lineParser.parse();
        int sizeOfBuffer = 100;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(lines, sizeOfBuffer);
        Map<String, Integer> wordFrequencyThreadPool = threadPoolExecutor.calculateFrequency();
        System.out.println("ThreadPool Concept :" + wordFrequencyThreadPool);
    }
}
