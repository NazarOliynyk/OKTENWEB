package ArraysMethods;

import java.util.Arrays;
/**
 * Created by user on 07.11.18.
 */
public class copyOf {
    public static void main(String[] args) {

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        int [] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("numbersCopy - "+Arrays.toString(numbersCopy));

        System.out.println();

        int [] numbersIncreased = Arrays.copyOf(numbers, numbers.length+3);
        System.out.println("numbersIncreased - "+Arrays.toString(numbersIncreased));

        System.out.println();
        int [] numbersDecreased = Arrays.copyOf(numbers, numbers.length-3);
        System.out.println("numbersDecreased - "+Arrays.toString(numbersDecreased));

    }
}
