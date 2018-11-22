package Vehicles_Inheritance;

public class Freight extends Regular {

    private double maxPayload;
    private double costPerKm;

    public double getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(double maxPayload) {
        this.maxPayload = maxPayload;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public void setCostPerKm(double costPerKm) {
        this.costPerKm = costPerKm;
    }
}
