package DeviceInheritance;

public class Main {

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        WashingMachine wm1 = new WashingMachine(123, "full", 220.0, 2000, true);

        wm.start();
        wm.stop();
        wm.process();

        System.out.println(wm1.toString());

        TV tv = new TV();

        tv.start();
        tv.stop();
        tv.process();

        SmartPhone smartPhone = new SmartPhone(234, "partial", 1050.0, 5.5, "Android", 20, true);

        smartPhone.start();
        smartPhone.stop();
        smartPhone.process();

        System.out.println(smartPhone.toString());
    }
}

