package Generics;

public class CarRestricted<T extends Number> {

    public T number;

    @Override
    public String toString() {
        return "CarRestricted{" +
                "number=" + number +
                '}';
    }
}
