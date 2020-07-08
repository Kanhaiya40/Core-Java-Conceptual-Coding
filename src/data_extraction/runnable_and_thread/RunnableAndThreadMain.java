package data_extraction.runnable_and_thread;

import java.io.IOException;

public class RunnableAndThreadMain {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/kanhaiya/Desktop/sample1.txt";
        ItemIdVsBuyCount itemIdVsBuyCount = new ItemIdVsBuyCount(filePath);
        Thread itemIdVsBuyCountThread = new Thread(itemIdVsBuyCount);
        itemIdVsBuyCountThread.start();
        ItemIdVsNumberOfSessions itemIdVsNumberOfSessions = new ItemIdVsNumberOfSessions(filePath);
        Thread itemIdVsNumberOfSessionsThread = new Thread(itemIdVsNumberOfSessions);
        itemIdVsNumberOfSessionsThread.start();
        ItemIdVsAverageQuantityPerSession itemIdVsAverageQuantityPerSession = new ItemIdVsAverageQuantityPerSession(filePath);
        Thread averageQuantityThread = new Thread(itemIdVsAverageQuantityPerSession);
        averageQuantityThread.start();
    }
}
