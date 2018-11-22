package Generics;

public class Main {

    // this does not work! try again

//    public void add(Car<?> car){
//
//    }


    public static void main(String[] args) {

        Car<String, Double> car1= new Car();

        // only for Integer, Double, String... Does not work with int, double etc.

        //car1.number1=123;
        car1.number1="GDSHG";
        //car1.number2="snsdnvc";
        car1.number2=324.999;

        Car<Integer, Float> car2= new Car();

        //car2.number1 = "bakdnb";
        car2.number1 = 12434;
        //car2.number2 = 3145.635;
        car2.number2 = 3145.635f;

        Car car3 = new Car();

        car3.some("Variable String");
        car3.some(12526);
        car3.some(2354.547928367);


        // we may even not set the type beforehand

        car3.number1= 123;
        car3.number2= "Some String";

        System.out.println(car3.number1);
        System.out.println(car3.number2);

        //car2.number2 = "ashg";

        CarRestricted restricted = new CarRestricted();
        //restricted.number="String";
        restricted.number=114;
        restricted.number=4556.347;
        restricted.number=362.64F;
    }
}
