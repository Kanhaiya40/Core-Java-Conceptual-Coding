package data_extraction;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class PurchaseEvent {

    private final int sessionId;
    private final LocalDateTime currentTimePeriod;
    private final int itemId;
    private final int price;
    private final int quantity;

    public PurchaseEvent(int sessionId, LocalDateTime currentTimePeriod, int itemId, int price, int quantity) {
        this.sessionId = sessionId;
        this.currentTimePeriod = currentTimePeriod;
        this.itemId = itemId;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemId() {
        return itemId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getCurrentTimePeriod() {
        return currentTimePeriod;
    }

    public DayOfWeek getDayOfWeek() {
        return getCurrentTimePeriod().getDayOfWeek();
    }

    public String getHourOfPurchaseEvent() {
        return getCurrentTimePeriod().getDayOfWeek() + "_" + getCurrentTimePeriod().getHour() + "-" + (getCurrentTimePeriod().getHour() + 1)+"  ";
    }

    @Override
    public String toString() {
        return "PurchaseEvent{" +
                "sessionId=" + sessionId +
                ", currentTimePeriod=" + currentTimePeriod +
                ", itemId=" + itemId +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


}
