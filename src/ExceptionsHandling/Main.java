package ExceptionsHandling;

public class Main {

    public static void main(String[] args) {

        int i = 0;

        int[] arr = new int[5];

        System.out.println("---------------1--------------------");
        try {
            //System.out.println(arr[10]);
            System.out.println(10/i);
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            i++;
            System.out.println("result 10/i  "+10/i);
        }
        System.out.println("---------------2--------------------");
        try {
            System.out.println(arr[10]);
            System.out.println(10/i);
            //System.out.println(arr[10]);
        }catch (ArithmeticException e){
            i++;
            System.out.println(10/i);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arr[3]  "+arr[3]);
        }

        System.out.println("---------------3--------------------");
        try {
            System.out.println(arr[10]);
            System.out.println(10/i);
            //System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            i++;  //result 10/i  5 because i was iterated twice
            System.out.println("result 10/i  "+10/i);
        }catch (Exception e){
            // parent exception allways goes last
        }

        System.out.println("---------------4--------------------");

        try {
            System.out.println(arr[10]);
            System.out.println(10/i);
            //System.out.println(arr[10]);
        }catch (Exception e){
            System.out.println("This code always prints because Exceptions\n catches both Arithmetic and ArrayoutOfBounds");
        }

        System.out.println("---------------5--------------------");

        try {
            System.out.println(arr[10]);
            System.out.println(10/i);

        }catch (ArithmeticException e){
            System.out.println("This code always prints because Exceptions\n catches both Arithmetic and ArrayoutOfBounds");
        }finally {
            System.out.println("This code works always because of finally! \n Although we got an exception notification ");
        }


    }
}
