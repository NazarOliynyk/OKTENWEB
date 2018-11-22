package Topics;

import java.util.Random;

/**
 * Created by user on 02.11.18.
 */
public class RandomMultiArray {

    public static void main(String[] args){
        int [][] arr ={{1, 2},{3,4,5},{6,7,8,9},{10,11,12,13,14}};
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print (arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("the next array");

        int [][] arrRandom = new int [3][6];
        Random r = new Random (12);
        for (int i = 0; i < arrRandom.length; i++) {
            for (int j = 0; j < arrRandom[i].length; j++) {
                arrRandom[i][j] = r.nextInt (100);
                System.out.print (arrRandom[i][j]+" ");
            }
            System.out.println();

        }
    }
}
