package HW001;

public class CopyArray {

    public static void main(String[] args) {
        int [] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] destArr = new int[5];
        System.arraycopy (sourceArr, 5, destArr, 0, 5);
        for (int i=0; i < destArr.length; i++) {
            System.out.print(destArr[i] + " ");
        }
    }
}
