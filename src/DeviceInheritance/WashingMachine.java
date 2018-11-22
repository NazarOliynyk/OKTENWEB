package DeviceInheritance;

import java.util.Objects;

public class WashingMachine extends HouseholdAppliances {

    private int rev;
    private boolean digitalScreen;

    public WashingMachine() {} // there must be an empty Constructor in all parental classes!!!

    public WashingMachine(int vin, String waranty, double electricityConsupmtion, int rev, boolean digitalScreen) {
        super(vin, waranty, electricityConsupmtion);
        this.rev = rev;
        this.digitalScreen = digitalScreen;
    }

    public int getRev() {
        return rev;
    }

    public void setRev(int rev) {
        this.rev = rev;
    }

    public boolean isDigitalScreen() {
        return digitalScreen;
    }

    public void setDigitalScreen(boolean digitalScreen) {
        this.digitalScreen = digitalScreen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WashingMachine that = (WashingMachine) o;
        return rev == that.rev &&
                digitalScreen == that.digitalScreen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rev, digitalScreen);
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "rev=" + rev +
                ", digitalScreen=" + digitalScreen +
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
        System.out.println("I wash clothes");
    }
}
