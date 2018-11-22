package Vehicles_Inheritance;

public class Sport extends Car{

    private double acceleration;
    private String ad;

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "acceleration=" + acceleration +
                ", ad='" + ad + '\'' +
                "} " + super.toString();
    }
}
