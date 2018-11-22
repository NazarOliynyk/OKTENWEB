package DeviceInheritance;

import java.util.Objects;

abstract public class HouseholdAppliances extends Device {

    private double electricityConsupmtion;

    public HouseholdAppliances() {
    }

    public HouseholdAppliances(int vin, String waranty, double electricityConsupmtion) {
        super(vin, waranty);
        this.electricityConsupmtion = electricityConsupmtion;
    }

    public double getElectricityConsupmtion() {
        return electricityConsupmtion;
    }

    public void setElectricityConsupmtion(double electricityConsupmtion) {
        this.electricityConsupmtion = electricityConsupmtion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HouseholdAppliances that = (HouseholdAppliances) o;
        return Double.compare(that.electricityConsupmtion, electricityConsupmtion) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), electricityConsupmtion);
    }

    @Override
    public String toString() {
        return "HouseholdAppliances{" +
                "electricityConsupmtion=" + electricityConsupmtion +
                "} " + super.toString();
    }
}

