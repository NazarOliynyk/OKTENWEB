package Enum;

/**
 * Created by user on 21.11.18.
 */
public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(1999, Type.PICKUP);
        Car car2 = new Car(2005, Type.SEDAN);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.type.equals(car2.type));
        System.out.println(!(car1.type.seats==car2.type.seats));

        car1.type.seats = 55;
        car2.type.seats = 55;
        System.out.println(!(car1.type.seats==car2.type.seats));
    }
}
class Car{

    public int year;
    public Type type;

    public Car(int year, Type type) {
        this.year = year;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", type=" + type +
                '}';
    }

}