package DeviceInheritance;

import java.util.Objects;

abstract public class PC extends Device {

    private double batteryCapacity;
    private double screenSize;
    private String operationSystem;

    public PC() {
    }

    public PC(int vin, String waranty, double batteryCapacity, double screenSize, String operationSystem) {
        super(vin, waranty);
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
        this.operationSystem = operationSystem;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PC pc = (PC) o;
        return Double.compare(pc.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(pc.screenSize, screenSize) == 0 &&
                Objects.equals(operationSystem, pc.operationSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity, screenSize, operationSystem);
    }

    @Override
    public String toString() {
        return "PC{" +
                "batteryCapacity=" + batteryCapacity +
                ", screenSize=" + screenSize +
                ", operationSystem='" + operationSystem + '\'' +
                "} " + super.toString();
    }
}
