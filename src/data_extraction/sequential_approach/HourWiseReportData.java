package data_extraction.sequential_approach;

import java.util.Objects;

public class HourWiseReportData {

    public String hourOfDay;
    public int avgNumOfActiveSessions;
    public int avgNumOfItemPurchased;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourWiseReportData that = (HourWiseReportData) o;
        return hourOfDay.equals(that.hourOfDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hourOfDay);
    }

    public String getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(String hourOfDay) {
        this.hourOfDay = hourOfDay;
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
                "hourOfPurchaseEvents=" + hourOfDay +
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
