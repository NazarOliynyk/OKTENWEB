package Topics;

/**
 * Created by user on 05.11.18.
 */
public class DeleteNonUnique {

    public static double [] deleteNonUnique(double[]arr) {
        double newArr [] = new double[arr.length];
        for (int i =0; i < arr.length-1; i++) { // arr.length-1  because of the next row of code - arr[i] != arr[i + 1]
            if (arr[i] != arr[i + 1]) {
                newArr[i]= arr[i];
            }else {
                newArr[i]=0;
            }
        }return newArr;

    }
    public static double [] bubleSort(double [] arr){
        for(int i = arr.length - 1; i > 0; --i) {
            for(int j = 0; j < i; ++j) {
                if(arr[j] > arr[j + 1]) {
                    double tmp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        } return arr;

    }

    public static void main(String[] args) {
        // creating an array with non-unique elements

        double [] arrWithNonUnique = new double[]{22.2, 6.12, 78.41, 22.2, 90.0, 18.33, 78.41, 90.0, 78.41, 120.12, 6.12 };
        System.out.println ("The initial look of an array with non-unique elements");
        for (int i = 0; i < arrWithNonUnique.length; i++) {
            System.out.print (arrWithNonUnique[i]+", ");
        }
        System.out.println ();
        double [] arrWithNonUniqueSorted ;
        // before deleting non-unique elements it is necessary to sort an array in ascending order
        System.out.println ("Sorted array with non-unique members");
        arrWithNonUniqueSorted = bubleSort (arrWithNonUnique);
        for (int i = 0; i < arrWithNonUniqueSorted.length; i++) {
            System.out.print (arrWithNonUniqueSorted[i]+", ");
        }
        // now deleting non unique elements, their empty places=0 and stay in the array
        System.out.println ();
        System.out.println ("Array without non-unique members");
        double [] arrWithoutNonUnique;
        arrWithoutNonUnique = deleteNonUnique (arrWithNonUniqueSorted);
        for (int i = 0; i < arrWithoutNonUnique.length; i++) {
            System.out.print (arrWithoutNonUnique[i]+", ");
        }
        // now sorting it again to place all empty members in the beginning
        System.out.println ();
        System.out.println ("Sorted Array without non-unique members - all 0-elements are at the beginning ");
        double [] arrWithoutNonUniqueSorted;
        arrWithoutNonUniqueSorted = bubleSort (arrWithoutNonUnique);
        for (int i = 0; i < arrWithoutNonUniqueSorted.length; i++) {
            System.out.print (arrWithoutNonUniqueSorted[i]+", ");
        }
        //counting how many 0-elements are in the array
        int iterator =0;
        for (int i = 0; i < arrWithoutNonUniqueSorted.length; i++) {
            if (arrWithoutNonUniqueSorted[i]!=0){
                iterator++;
            }
            //System.out.println("iterator- "+iterator);
        }
        System.out.println();
        System.out.println("There are "+iterator+" '0-elements' in the array");
        // using System.arraycopy method to create a new array from a certain part of bigger array
        double [] arrFinal = new double[arrWithoutNonUniqueSorted.length-iterator-1];
        System.arraycopy (arrWithoutNonUniqueSorted, (arrWithoutNonUniqueSorted.length-iterator), arrFinal, 0, (arrWithoutNonUniqueSorted.length-iterator-1));
        System.out.println ();
        System.out.println ("The final look at the array without non-unique members and 0-elements");
        for (int i = 0; i < arrFinal.length; i++) {
            System.out.print (arrFinal[i]+", ");
        }
    }
}
