package data_extraction.sequential_approach;

import java.io.IOException;

public class SequentialLogMain {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/kanhaiya/Desktop/sample1.txt";
        ItemIdVsBuyCount itemIdVsBuyCount = new ItemIdVsBuyCount(filePath);
        System.out.println("ItemId vs BuyCount:");
        System.out.println(itemIdVsBuyCount.getData() + "\n");
        ItemIdVsNumberOfSessions itemIdVsNumberOfSessions = new ItemIdVsNumberOfSessions(filePath);
        System.out.println("ItemId vs Number Of Sessions:");
        System.out.println(itemIdVsNumberOfSessions.getData() + "\n");
        ItemIdVsAverageQuantityPerSession itemIdVsAverageQuantityPerSession = new ItemIdVsAverageQuantityPerSession(filePath);
        System.out.println("ItemId vs AverageQuantityPerSession:");
        System.out.println(itemIdVsAverageQuantityPerSession.getAverageQuantityPerSession());
    }
}