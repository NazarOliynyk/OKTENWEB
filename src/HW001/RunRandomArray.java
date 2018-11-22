package HW001;
import java.util.Random;

public class RunRandomArray {

    public static void main(String[] args) {
        int [] arrRandom = new int [88];
        Random r = new Random (88);
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = r.nextInt(100);
            System.out.print(arrRandom[i]+", ");
        }

        System.out.println("Every third element");
        for (int i = 1; i < arrRandom.length; i++) {
            if(i%3==0){
                System.out.print(arrRandom[i]+", ");
            }

        }

        System.out.println();
        System.out.println("Every third even element in an new array");
        int[] newArrETEE = new int[88];
        for (int i = 1; i < arrRandom.length; i++) {
            if((i%3==0)&&(arrRandom[i]%2==0)){
                System.out.print(arrRandom[i]+", ");
                newArrETEE[i] = arrRandom[i];
                //System.out.println(newArrETEE[i]);
            }
        }
        // this array contains to many '0'
        System.out.println();
        System.out.println("newArrETEE.length- "+ newArrETEE.length);
        int iterator =0;
        for (int i = 0; i < newArrETEE.length; i++) {
            System.out.print(newArrETEE[i]+", ");
        }
        for (int i = 0; i < newArrETEE.length; i++) {
            if (newArrETEE[i]!=0){
                iterator++;
            }
            //System.out.println("iterator- "+iterator);
        }
        System.out.println();
        System.out.println("iterator- "+iterator);
//
//        int [] newArrETEE_Cut= new int[iterator-2];
//
//        for (int i = 0; i < newArrETEE.length; i++) {
//            if (newArrETEE[i]!=0){
//                newArrETEE_Cut[i]=newArrETEE[i];
//               // System.out.print(newArrETEE_Cut[i]+", ");
//            }
//        }



    }
}

