package Topics;

/**
 * Created by user on 06.11.18.
 */


public class SquareShape {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (i == 0 || i == 9 || j == 5) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
        int a = 11;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((j == 0) || (j == a - 1) || (i == 0) || (i == a - 1) || (i == j) || (j == a - 1 - i)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}