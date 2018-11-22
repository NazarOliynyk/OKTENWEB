package Vehicles_Inheritance;

abstract public class Car {

    private int vin;
    private int speed;

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", speed=" + speed +
                '}';
    }
}
