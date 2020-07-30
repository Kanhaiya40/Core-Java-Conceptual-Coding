package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DayWiseReport implements StreamReport {

    private final Map<DayWiseReportData, Integer> totalQuantities = new HashMap<>();
    private final Map<DayWiseReportData, Integer> dayWiseCount = new HashMap<>();
    private final Set<DayWiseReportData> dayWiseReportData = new HashSet<>();

    @Override
    public void process(PurchaseEvent purchaseEvent) {
        DayWiseReportData tempData = new DayWiseReportData();
        tempData.setDayOfWeek(purchaseEvent.getDayOfWeek());
        tempData.setItemId(purchaseEvent.getItemId());
        if (totalQuantities.containsKey(tempData) && dayWiseCount.containsKey(tempData)) {
            dayWiseCount.put(tempData, dayWiseCount.get(tempData) + 1);
            totalQuantities.put(tempData, totalQuantities.get(tempData) + purchaseEvent.getQuantity());
            tempData.setAvgQuantityPurchased((double)totalQuantities.get(tempData) / dayWiseCount.get(tempData));
            dayWiseReportData.remove(tempData);
        } else {
            dayWiseCount.put(tempData, 1);
            totalQuantities.put(tempData,  purchaseEvent.getQuantity());
            tempData.setAvgQuantityPurchased((double) totalQuantities.get(tempData) / dayWiseCount.get(tempData));
        }
        dayWiseReportData.add(tempData);
    }

    @Override
    public void printReport(PrintWriter printWriter) {
        System.out.println(dayWiseReportData);
        printWriter.println("");
        printWriter.println("DayOfWeek\t" + "ItemId\t" + "AvgQuantityPurchased\t");
        for (DayWiseReportData dayWiseReport : dayWiseReportData) {
            printWriter.println(dayWiseReport.getDayOfWeek() + "\t" + dayWiseReport.getItemId() + "\t"
                    + dayWiseReport.getAvgQuantityPurchased());
            printWriter.flush();
        }
    }
}
