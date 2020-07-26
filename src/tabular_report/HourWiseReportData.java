package tabular_report;

import java.util.Objects;

public class HourWiseReportData {

    public int hourOfPurchaseEvents;
    public int avgNumOfActiveSessions;
    public int avgNumOfItemPurchased;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourWiseReportData that = (HourWiseReportData) o;
        return hourOfPurchaseEvents == that.hourOfPurchaseEvents;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourOfPurchaseEvents);
    }

    public int getHourOfPurchaseEvents() {
        return hourOfPurchaseEvents;
    }

    public void setHourOfPurchaseEvents(int hourOfPurchaseEvents) {
        this.hourOfPurchaseEvents = hourOfPurchaseEvents;
    }

    public int getAvgNumOfActiveSession() {
        return avgNumOfActiveSessions;
    }

    public void setAvgNumOfActiveSession(int avgNumOfActiveSession) {
        this.avgNumOfActiveSessions = avgNumOfActiveSession;
    }

    @Override
    public String toString() {
        return "HourWiseReportData{" +
                "hourOfPurchaseEvents=" + hourOfPurchaseEvents +
                ", avgNumOfActiveSession=" + avgNumOfActiveSessions +
                ", avgNumOfItemPurchased=" + avgNumOfItemPurchased +
                '}';
    }

    public int getAvgNumOfItemPurchased() {
        return avgNumOfItemPurchased;
    }

    public void setAvgNumOfItemPurchased(int avgNumOfItemPurchased) {
        this.avgNumOfItemPurchased = avgNumOfItemPurchased;
    }
}
