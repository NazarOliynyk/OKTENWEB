package ArraysMethods;

import java.util.Arrays;
/**
 * Created by user on 07.11.18.
 */
public class Sort {
    public static void main(String[] args) {

        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        String [] names = {"Zorro", "Nana", "Luba", "Andrew", "Goblin", "Zorro", "Xena"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

    }
}
