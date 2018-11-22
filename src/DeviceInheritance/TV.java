package DeviceInheritance;

import java.util.Objects;

public class TV extends HouseholdAppliances {

    private double screenSize;
    private boolean smartTV;

    public TV() {
    }

    public TV(int vin, String waranty, double electricityConsupmtion, double screenSize, boolean smartTV) {
        super(vin, waranty, electricityConsupmtion);
        this.screenSize = screenSize;
        this.smartTV = smartTV;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TV tv = (TV) o;
        return Double.compare(tv.screenSize, screenSize) == 0 &&
                smartTV == tv.smartTV;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screenSize, smartTV);
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    @Override
    public String toString() {
        return "TV{" +
                "screenSize=" + screenSize +
                ", smartTV=" + smartTV +
                "} " + super.toString();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void process() {
        System.out.println("I show movies");
    }
}
