package ArraysMethods;

import java.util.Arrays;
/**
 * Created by user on 07.11.18.
 */
public class copyOfRange {
    public static void main(String[] args) {

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        int[] numbersCopy = Arrays.copyOfRange(numbers, 2, 6);
        System.out.println(Arrays.toString(numbersCopy));

    }
}