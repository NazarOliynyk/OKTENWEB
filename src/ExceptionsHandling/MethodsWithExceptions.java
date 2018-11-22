package ExceptionsHandling;

public class MethodsWithExceptions {

    public static void some(int i, int y) throws ArithmeticException{
        System.out.println(i/y);
    }

    public static void main(String[] args) {

        // some(10, 0).  try <- appears automatically

        try {
            some(10, 0);
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println(e);
        }

    }
}
