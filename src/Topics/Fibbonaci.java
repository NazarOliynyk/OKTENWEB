package Topics;

public class Fibbonaci {

    public static int[] fibNumbers(int size){

        int[] arr= new int[size];
       arr[0]=0;
       arr[1]=1;

        for (int i = 2; i < size; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr =fibNumbers(20);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
