package Hash_Equals;

/**
 * Created by user on 09.11.18.
 */
public class Main {

    public static void main(String[] args) {

        PersonSimple ps1 = new PersonSimple(100, "Ivan");
        PersonSimple ps2 = new PersonSimple(100, "Ivan");

        System.out.println("ps1.equals(ps2)  "+ps1.equals(ps2));

        PersonWithHashCode_equals pshe1 = new PersonWithHashCode_equals(100, "Ivan");
        PersonWithHashCode_equals pshe2 = new PersonWithHashCode_equals(100, "Ivan");

        System.out.println("pshe1.equals(pshe2)  "+pshe1.equals(pshe2));

    }
}
