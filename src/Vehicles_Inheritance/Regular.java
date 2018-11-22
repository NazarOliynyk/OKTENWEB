package Vehicles_Inheritance;

public class Regular extends Car {

    private int fuelCapacity;
    private double fuelConsumption;

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    double countFuelConsumption(int mileage){

        return (mileage*fuelConsumption)/100;
    }

}
