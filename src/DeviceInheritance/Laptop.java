package DeviceInheritance;

import java.util.Objects;

public class Laptop extends PC {

    private int processor;
    private int RAM;

    public Laptop() {
    }

    public Laptop(int vin, String waranty, double batteryCapacity, double screenSize, String operationSystem, int processor, int RAM) {
        super(vin, waranty, batteryCapacity, screenSize, operationSystem);
        this.processor = processor;
        this.RAM = RAM;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return processor == laptop.processor &&
                RAM == laptop.RAM;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), processor, RAM);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor=" + processor +
                ", RAM=" + RAM +
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
        System.out.println("I am almost as adult computer ");
    }
}
