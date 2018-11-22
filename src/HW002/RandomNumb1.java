package HW002;

import java.util.Random;
import java.util.Arrays;
/**
 * Created by user on 07.11.18.
 */
public class RandomNumb1 implements RandomNumbers {

    int length = 30;
   public int[] creator(){
       int [] arrRandom = new int [length];
       Random r = new Random ();
       for (int i = 0; i < arrRandom.length; i++) {
           arrRandom[i] = r.nextInt(200);
         //  System.out.println(arrRandom[i]+", ");
       }
       return arrRandom;
   }

    public static void main(String[] args) {

       int[] arr= new RandomNumb1().creator();
        System.out.println(Arrays.toString(arr));
    }
}
