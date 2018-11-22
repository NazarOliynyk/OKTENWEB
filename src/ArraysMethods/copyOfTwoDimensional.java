package ArraysMethods;

import java.util.Arrays;
/**
 * Created by user on 07.11.18.
 */
public class copyOfTwoDimensional {

    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] numbersCopy = Arrays.copyOf(numbers, numbers.length);

        System.out.println("Равны ли эти двумерные массивы между собой?");
        System.out.println(Arrays.deepEquals(numbers, numbersCopy));

        System.out.println(Arrays.deepToString(numbersCopy));
    }
}

