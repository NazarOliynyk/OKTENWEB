package Topics;

/**
 * Created by user on 02.11.18.
 */


public class Recursion {

    static int i =1;

    public  static void sum(){

        System.out.println ("start");

        if(i==5){
            return;
        }
        i++;
        sum();
        System.out.println ("stop");
    }
    public static void main(String[] args){
        sum();
        // start works 5 times whereas stop only 4.
    }
}
