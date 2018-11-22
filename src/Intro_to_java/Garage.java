package Intro_to_java;

import java.util.*;

import javax.swing.*;
/**
 * Created by user on 01.11.18.
 */

class Reader {

    int i, k; //variables can be given in one string
    String items, number, make, model, color, year, engineCapacity, electroDrivetrain;
    public void scanTheNumberOfVehicles(){
        items = JOptionPane.showInputDialog("Set the number of vehicles in your Garage");
    }

    public void scanEachCar(int iterator){

        //items = JOptionPane.showInputDialog("Set the number of vehicles in your Garage");
        number = JOptionPane.showInputDialog("Set the id-number of a vehicle # "+iterator);
        make = JOptionPane.showInputDialog("Set the producent(make) of a vehicle # "+iterator);
        model = JOptionPane.showInputDialog("Set the model of a vehicle # "+iterator);
        color = JOptionPane.showInputDialog("Set the color of a vehicle# "+iterator);
        year = JOptionPane.showInputDialog("Set the year when a vehicle was made # "+iterator);
        engineCapacity = JOptionPane.showInputDialog("Set the engine capacity of a vehicle # "+iterator);
        electroDrivetrain = JOptionPane.showInputDialog("Set if a vehicle # "+iterator+" has an electro Drivetrain: type yes or no");
        // the method JOptionPane.showInputDialog accepts string only

    }
    public void reply(String reply){
        JOptionPane.showMessageDialog(null, reply);
        // null puts your text in the middle of the table
    }
}


class Car{
    int number;
    String make;
    String model;
    String color;
    int year;
    double engineCapacity;
    boolean electroDrivetrain;


    public Car(int number, String make, String model, String color, int year, double engineCapacity, boolean electroDrivetrain) {
        this.number = number;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.electroDrivetrain = electroDrivetrain;
    }


    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", electroDrivetrain=" + electroDrivetrain +
                '}';
    }

}


public class Garage {


    public  static boolean electro  (String electroDrivetrain) {

        if(electroDrivetrain.equals("yes")){
            return true;
        }else return false;

    }

    public static String redCars(ArrayList<Car> cars){
        String reply=null;
        for(Car car: cars){
            if (car.color.equals("red")){
                reply= "There are  red cars in your Garage";
                break;
            }else {reply = "There are no red cars";}
        }
        return reply;
    }

    public static String electroCars(ArrayList<Car> cars){
        String reply=null;

        for(Car car: cars){

            if (car.electroDrivetrain == true){
                reply= "There are  electro-cars in your Garage";
                break;
            }else {reply = "There are no electro-cars";}
        }
        return reply;
    }

    public static String averageAge(ArrayList<Car> cars){
        double age = 0;
        double totalAge =0;
        for(Car car: cars){
            age = 2018-car.year;
            totalAge +=age;
        }
        return "The avarage age of your cars is: "+totalAge/cars.size ();
    }


    public static void main (String [] args){

        ArrayList<Car> cars = new ArrayList<Car> ();

        Reader r = new Reader ();
        r.scanTheNumberOfVehicles ();
        int numberOfVehicles =  Integer.parseInt(r.items);

        for(int i=1; i <= numberOfVehicles; i++){

            r.scanEachCar (i);

            String make, model, color;
            int number, year;
            double engineCapacity;
            boolean electro;

            number = Integer.parseInt(r.number);
            make= r.make;
            model= r.model;
            color= r.color;
            year= Integer.parseInt(r.year);
            engineCapacity= Double.parseDouble (r.engineCapacity);
            electro = electro(r.electroDrivetrain);


            cars.add (new Car (number, make, model, color, year, engineCapacity,electro));
        }
        r.reply("These are your cars");
        for (Car c: cars){
            r.reply("Make-"+c.make+ ", model- "+c.model+", color- "+c.color);
            System.out.printf (c.number+", "+c.make+", "+c.model+", "+c.color+", "+c.year+", "+c.engineCapacity+", "+c.electroDrivetrain);

        }


        String redCars = redCars (cars);
        String electroCars = electroCars (cars);
        String avarageAge = averageAge (cars);
        r.reply (redCars);
        r.reply (electroCars);
        r.reply (avarageAge);
        r.reply ("Thank you!");
    }
}
