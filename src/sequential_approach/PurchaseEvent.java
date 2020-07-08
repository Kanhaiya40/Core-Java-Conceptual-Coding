package sequential_approach;

public class PurchaseEvent {

    private int sessionId;
    private String currentTimePeriod;
    private int itemId;
    private int price;
    private int quantity;

    public PurchaseEvent(int sessionId, String currentTimePeriod, int itemId, int price, int quantity) {
        this.sessionId = sessionId;
        this.currentTimePeriod = currentTimePeriod;
        this.itemId = itemId;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemId(){
        return itemId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public int getQuantity() {
        return quantity;
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
