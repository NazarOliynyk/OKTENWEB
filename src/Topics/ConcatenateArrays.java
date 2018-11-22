package Topics;

/**
 * Created by user on 05.11.18.
 */
public class ConcatenateArrays {

    public static double [] concatenateArrays(double[] arr1, double[] arr2){


        double[] arrConcatenated = new double[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arrConcatenated[i] = arr1[i];
        }

        int j = arr1.length;

        for (int i = 0; i < arr2.length; i++) {
            arrConcatenated[j] = arr2[i];
            j++;
        }
        return arrConcatenated;
    }
    public static void main(String[] args) {

        System.out.println ();
        double [] arr1= new double[]{55, 8, 9, 6, 7};
        double [] arr2= new double[]{454, 1314, 135};
        double [] arr = concatenateArrays (arr1 , arr2);

        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i]+", ");
        }
    }
}
