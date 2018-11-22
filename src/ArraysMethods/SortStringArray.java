package ArraysMethods;

import java.util.Arrays;

/**
 * Created by user on 07.11.18.
 */
public class SortStringArray {

    public static void main(String[] args) {
        String [] names = {"Zorro", "Nana", "Luba", "Andrew", "Goblin", "Zorro", "Xena"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
    }
}
