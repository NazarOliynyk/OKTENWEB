package Topics;

public class BuubleSortArray {

    public static double [] bubleSort(double [] arr){
        for(int i = arr.length - 1; i > 0; --i) {
            for(int j = 0; j < i; ++j) {
                if(arr[j] > arr[j + 1]) {
                    double tmp = arr[j]; System.out.println("tmp = arr[j]; "+arr[j]);

                    arr[j] = arr[j + 1]; System.out.println("arr[j] = arr[j + 1]; "+arr[j]);
                    arr[j + 1] = tmp; System.out.println("arr[j + 1] = tmp; "+tmp);
                }
            } // {10, 12, 6, 3, 13, 14, 7, 15, 21, 5};
        } return arr;

    }
    public static void main(String[] args) {

        double[] arrDouble;
        arrDouble = new double[]{10, 12, 6, 3, 13, 14, 7, 15, 21, 5}; // do not specify double[10] here!!
        double[] arrDoubleSorted = new  double[10];
        arrDoubleSorted = bubleSort(arrDouble);
        for (int i=0; i<arrDoubleSorted.length; i++){
            System.out.print(arrDoubleSorted[i]+", ");
        }


    }
}
