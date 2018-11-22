package DeviceInheritance;

import java.util.Objects;

abstract public class Device implements DeviceInterface{

    private int vin;
    private String waranty;

    public Device() {
    }

    public Device(int vin, String waranty) {
        this.vin = vin;
        this.waranty = waranty;
    }

    // getters and setters must be defined in parental class to be visible in ancestors!!
    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getWaranty() {
        return waranty;
    }

    public void setWaranty(String waranty) {
        this.waranty = waranty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return vin == device.vin &&
                Objects.equals(waranty, device.waranty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, waranty);
    }

    @Override
    public String toString() {
        return "Device{" +
                "vin=" + vin +
                ", waranty='" + waranty + '\'' +
                '}';
    }

    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }


}
