package Topics;

/**
 * Created by user on 05.11.18.
 */
public class RemoveElement {

    // this method works only with positive numbers either int or double
    public static double[] removeElement(double [] arr, double element, int number){

        double [] arrWithoutElement = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=element){                   // comment these 2 rows in case you want to delete an element
                arrWithoutElement[i]=arr[i];       // by it-s number with ensuing if
            }
            //if (arr[i] != arr[number]) {       // uncomment it in case you want to delete an element by it-s number
            // arrWithoutElement[i]=arr[i];   //
            //}
        }

        for(int i = arrWithoutElement.length - 1; i > 0; --i) {
            for(int j = 0; j < i; ++j) {
                if(arrWithoutElement[j] > arrWithoutElement[j + 1]) {
                    double tmp = arrWithoutElement[j];

                    arrWithoutElement[j] = arrWithoutElement[j + 1];
                    arrWithoutElement[j + 1] = tmp;
                }
            }
        }
        double[] arrayFinal = new double[arr.length-1];
        System.arraycopy (arrWithoutElement, 1, arrayFinal, 0, arr.length-1);

        return arrayFinal;
    }
    public static void main(String[] args) {

        double[] array = new double[]{22.54, 88.8768, 9, 45.45, 8, 456654.5645, 7987, 564.4565};

        double[] arrayFinal = removeElement (array, 456654.5645, 6);
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.println (arrayFinal[i]+", ");
        }
    }
}

