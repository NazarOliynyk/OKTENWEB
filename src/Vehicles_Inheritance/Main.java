package Vehicles_Inheritance;

/**
 * Created by user on 09.11.18.
 */
public class Main {

    public static void main(String[] args) {

        Bus bus = new Bus();

        bus.setFuelConsumption(15);

        double spentFuelBus = bus.countFuelConsumption(1500);

        TIR tir = new TIR();

        tir.setFuelConsumption(37);

        double spentFuelTIR = tir.countFuelConsumption(1500);

        bus.setVin(3453);

        F1 f1 = new F1();

        // f1.setPilotname(); // does not work because setter is not defined in F1
        f1.setVin(4532453); // setter from parent class works
        f1.setAd("Rotmans"); // we have to generate super toString(); SEE CONSOLE

        System.out.println(spentFuelBus+", "+ spentFuelTIR);

        System.out.println("bus.toString()  "+bus.toString()); // prints only fields from parent class Car

        System.out.println("tir.toString()  "+tir.toString());

        System.out.println("f1.toString()  "+f1.toString());

        System.out.println("bus.equals(tir)  "+bus.equals(tir));

        System.out.println("tir.hashCode()  "+tir.hashCode());
    }
}

