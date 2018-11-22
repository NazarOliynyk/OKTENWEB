package Generics;

public class Car<T, N> {

    public T number1;
    public N number2;


    public <R> void some(R r){
        System.out.println(r);
    }

    @Override
    public String toString() {
        return "Car{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
