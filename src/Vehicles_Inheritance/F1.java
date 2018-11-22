package Vehicles_Inheritance;

/**
 * Created by user on 09.11.18.
 */
public class F1 extends Sport {

    private String pilotName;

    @Override
    public String toString() {
        return "F1{" +
                "pilotName='" + pilotName + '\'' +
                "} " + super.toString();
    }
}
