package data_extraction.sequential_approach;

import data_extraction.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.List;

public class SequentialLogMain {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/shubh/Desktop/sample1.txt";
        Parser parser = new Parser(filePath);
        List<PurchaseEvent> purchaseEvents = parser.getPurchaseEvents();
        SequentialLog<Long> itemIdVsBuyCount = new ItemIdVsBuyCount();
        System.out.println("ItemId vs BuyCount:");
        System.out.println(itemIdVsBuyCount.getData(purchaseEvents) + "\n");
        SequentialLog<Long> itemIdVsNumberOfSessions = new ItemIdVsNumberOfSessions();
        System.out.println("ItemId vs Number Of Sessions:");
        System.out.println(itemIdVsNumberOfSessions.getData(purchaseEvents) + "\n");
        SequentialLog<Double> itemIdVsAverageQuantityPerSession = new ItemIdVsAverageQuantityPerSession();
        System.out.println("ItemId vs AverageQuantityPerSession:");
        System.out.println(itemIdVsAverageQuantityPerSession.getData(purchaseEvents));
    }
}