package Topics;
import java.util.Scanner;
/**
 * Created by user on 02.11.18.
 */
class Fighter{
    int id;
    String name;

    public Fighter(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Switch_Scanner {

    public static void main(String[] args) {
        Fighter fighter = null;
        System.out.printf ("Chose your fighter");
        //System.out.printf (fighter);
        String key = new Scanner(System.in).nextLine();

        switch (key){
            case "one": fighter = new Fighter (100, "subZero");
                break;
            case "two": fighter = new Fighter (200, "nightmare");
                break;
            default: fighter = new Fighter (300, "zombie");
                //System.out.printf ("Wrong input");
        }
        System.out.printf (fighter.name+fighter.id);
    }

}

