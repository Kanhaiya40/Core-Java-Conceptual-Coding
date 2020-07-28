package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DayWiseReport implements StreamReport {


    Set<DayWiseReportData> dayWiseReportData = new HashSet<>();
    Map<Integer, Integer> itemIdWithQuantityPurchased = new HashMap<>();

    int noOfOccurrence = 0;

    @Override
    public void process(PurchaseEvent purchaseEvent) {
        if (dayWiseReportData.isEmpty()) {
            noOfOccurrence++;
            DayWiseReportData newDayWiseReportData = new DayWiseReportData();
            newDayWiseReportData.setDayOfWeek(purchaseEvent.getDayOfWeek());
            newDayWiseReportData.setItemId(purchaseEvent.getItemId());
            newDayWiseReportData.setAvgQuantityPurchased(purchaseEvent.getQuantity());
            itemIdWithQuantityPurchased.put(purchaseEvent.getItemId(), purchaseEvent.getQuantity());
            dayWiseReportData.add(newDayWiseReportData);
        } else {
            DayWiseReportData tempData = new DayWiseReportData();
            tempData.setDayOfWeek(purchaseEvent.getDayOfWeek());
            tempData.setItemId(purchaseEvent.getItemId());
            tempData.setAvgQuantityPurchased(purchaseEvent.getQuantity());
            if (dayWiseReportData.contains(tempData)) {
                noOfOccurrence++;
                double avg = (double) (itemIdWithQuantityPurchased.get(purchaseEvent.getItemId()) + purchaseEvent.getQuantity()) / noOfOccurrence;
                tempData.setAvgQuantityPurchased(avg);
                dayWiseReportData.add(tempData);
                itemIdWithQuantityPurchased.put(purchaseEvent.getItemId(),
                        itemIdWithQuantityPurchased.get(purchaseEvent.getItemId())
                                + purchaseEvent.getQuantity());
            } else {
                noOfOccurrence = 0;
                itemIdWithQuantityPurchased.clear();
                DayWiseReportData newDayWiseReportData = new DayWiseReportData();
                newDayWiseReportData.setDayOfWeek(purchaseEvent.getDayOfWeek());
                newDayWiseReportData.setItemId(purchaseEvent.getItemId());
                newDayWiseReportData.setAvgQuantityPurchased(purchaseEvent.getQuantity());
                itemIdWithQuantityPurchased.put(purchaseEvent.getItemId(), purchaseEvent.getQuantity());
                dayWiseReportData.add(newDayWiseReportData);
                noOfOccurrence++;
            }
        }
    }

    @Override
    public void printReport(PrintWriter printWriter) {
        printWriter.println("");
        printWriter.println("DayOfWeek\t" + "ItemId\t" + "AvgQuantityPurchased\t");
        for (DayWiseReportData dayWiseReport : dayWiseReportData) {
            printWriter.println(dayWiseReport.getDayOfWeek() + "\t" + dayWiseReport.getItemId() + "\t"
                    + dayWiseReport.getAvgQuantityPurchased());
            printWriter.flush();
        }
    }
}
