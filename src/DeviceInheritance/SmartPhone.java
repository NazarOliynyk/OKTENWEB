package DeviceInheritance;

import java.util.Objects;

public class SmartPhone extends PC {


    private int resolutionMegaPix;
    private boolean twoSlotSIM;

    public SmartPhone() {
    }

    public SmartPhone(int vin, String waranty, double batteryCapacity, double screenSize, String operationSystem, int resolutionMegaPix, boolean twoSlotSIM) {
        super(vin, waranty, batteryCapacity, screenSize, operationSystem);
        this.resolutionMegaPix = resolutionMegaPix;
        this.twoSlotSIM = twoSlotSIM;
    }

    public int getResolutionMegaPix() {
        return resolutionMegaPix;
    }

    public void setResolutionMegaPix(int resolutionMegaPix) {
        this.resolutionMegaPix = resolutionMegaPix;
    }

    public boolean isTwoSlotSIM() {
        return twoSlotSIM;
    }

    public void setTwoSlotSIM(boolean twoSlotSIM) {
        this.twoSlotSIM = twoSlotSIM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartPhone that = (SmartPhone) o;
        return resolutionMegaPix == that.resolutionMegaPix &&
                twoSlotSIM == that.twoSlotSIM;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionMegaPix, twoSlotSIM);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "resolutionMegaPix=" + resolutionMegaPix +
                ", twoSlotSIM=" + twoSlotSIM +
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
        System.out.println("I make phone calls");
    }
}
