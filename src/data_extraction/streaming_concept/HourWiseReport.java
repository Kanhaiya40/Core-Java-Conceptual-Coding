package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HourWiseReport implements StreamReport {

    private final Set<HourWiseReportData> hourWiseReports = new HashSet<>();
    private final Map<HourWiseReportData, Set<Integer>> hourOfDayVsSessionIds = new HashMap<>();
    private final Map<HourWiseReportData, Set<Integer>> hourOfDayVsItemIds = new HashMap<>();
    private final Map<HourWiseReportData, Integer> hourWiseWithCount = new HashMap<>();

    @Override
    public void process(PurchaseEvent purchaseEvent) {
        HourWiseReportData tempData = new HourWiseReportData();
        tempData.setHourOfDay(purchaseEvent.getHourOfPurchaseEvent());
        if (hourWiseWithCount.containsKey(tempData)) {
            hourWiseWithCount.put(tempData, hourWiseWithCount.get(tempData) + 1);
            hourOfDayVsSessionIds.get(tempData).add(purchaseEvent.getSessionId());
            hourOfDayVsItemIds.get(tempData).add(purchaseEvent.getItemId());
            tempData.setAvgActiveSessionId(((double) hourOfDayVsSessionIds.get(tempData).size())
                    / hourWiseWithCount.get(tempData));
            tempData.setAvgItemIdPurchased(((double) hourOfDayVsItemIds.get(tempData).size())
                    / hourWiseWithCount.get(tempData));
            hourWiseReports.remove(tempData);
        } else {
            hourWiseWithCount.put(tempData, 1);
            Set<Integer> sessionIds = new HashSet<>();
            Set<Integer> itemIds = new HashSet<>();
            sessionIds.add(purchaseEvent.getSessionId());
            itemIds.add(purchaseEvent.getItemId());
            hourOfDayVsSessionIds.put(tempData, sessionIds);
            hourOfDayVsItemIds.put(tempData, itemIds);
            tempData.setAvgActiveSessionId(((double) hourOfDayVsSessionIds.get(tempData).size())
                    / hourWiseWithCount.get(tempData));
            tempData.setAvgItemIdPurchased(((double) hourOfDayVsItemIds.get(tempData).size())
                    / hourWiseWithCount.get(tempData));
        }
        hourWiseReports.add(tempData);
    }

    @Override
    public void printReport(PrintWriter printWriter) {
        System.out.println(hourWiseReports);
        printWriter.println("");
        printWriter.println("HourOfDay\t" + "AvgActiveSession\t" + "AvgItemPurchased\t");
        for (HourWiseReportData hourWiseReport : hourWiseReports) {
            printWriter.println(hourWiseReport.getHourOfDay() + "\t" + hourWiseReport.getAvgActiveSessionId() +
                    "\t\t\t\t" + hourWiseReport.getAvgItemIdPurchased());
            printWriter.flush();
        }
    }
}
