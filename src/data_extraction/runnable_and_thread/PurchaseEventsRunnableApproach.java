package data_extraction.runnable_and_thread;

import data_extraction.sequential_approach.Parser;
import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PurchaseEventsRunnableApproach {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/kanhaiya/Desktop/sample1.txt";
        Parser parser = new Parser(filePath);
        List<PurchaseEvent> purchaseEvents = parser.getPurchaseEvents();
        Report itemIdBuysCount=new ItemIdVsBuyCount();
        Report itemIdVsNumberOfSession=new ItemIdVsNumberOfSessions();
        Report itemIdVsAvgQuantityPerSession=new ItemIdVsAverageQuantityPerSession();
        List<Report> reports=new ArrayList<>();


    }
}
