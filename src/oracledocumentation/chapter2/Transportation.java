package oracledocumentation.chapter2;

/**
 * This Class represent Real world Entity
 */
public class Transportation {
    protected int id;
    protected String vehicle;
    protected int noOfWheel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public int getNoOfWheel() {
        return noOfWheel;
    }

    public void setNoOfWheel(int noOfWheel) {
        this.noOfWheel = noOfWheel;
    }
}

