package Topics;

/**
 * Created by user on 05.11.18.
 */
public class DeleteNonUniqueElements {

    public static double [] deleteNonUniqueElements(double[] arr){
        double newArr [] = new double[arr.length];

        for(int i = arr.length - 1; i > 0; --i) {
            for(int j = 0; j < i; ++j) {
                if(arr[j] > arr[j + 1]) {
                    double tmp = arr[j];

                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        // deleting non-unique elements, there will be 0-elements instead of deleted

        for (int i =0; i < arr.length-1; i++) {
            if (arr[i] != arr[i + 1]) {
                newArr[i]= arr[i];
            }else {
                newArr[i]=0;
            }
        }
        System.out.println ();
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+", ");
        }

        // sorting an array in ascending order so that all 0-elements were at the beginning
        for(int i = newArr.length - 1; i > 0; --i) {
            for(int j = 0; j < i; ++j) {
                if(newArr[j] > newArr[j + 1]) {
                    double tmp = newArr[j];

                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = tmp;
                }
            }
        }
        System.out.println ();
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+", ");
        }
        // calculating the quantity of 0-elements
        int iterator =0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i]!=0){
                iterator++;
            }
        }
        System.out.println ();
        System.out.println (iterator);

        double [] arrFinal= new double[iterator];

        // using System.arraycopy to fill arrFinal with non-unique elements of initial array
        System.arraycopy(newArr, (newArr.length-iterator), arrFinal, 0, (iterator));

        return arrFinal;
    }

    public static void main(String[] args) {

        double [] arr1 = new double[]{54, 7, 9, 6, 3, 8, 54, 8, 546, 12, 4564, 6, 78, 546, 66, 8, 6};
        double [] arr2 ;
        arr2 = deleteNonUniqueElements(arr1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print((int)arr2[i]+", ");
        }

    }
}

