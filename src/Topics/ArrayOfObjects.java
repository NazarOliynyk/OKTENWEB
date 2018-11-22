package Topics;

/**
 * Created by user on 02.11.18.
 */
public class ArrayOfObjects {

    public static void main(String[] args) {
        Fighter[] fighters = new Fighter[3]; // only this sintax!!
        fighters[0] = new Fighter (100, "misha");
        fighters[1] = new Fighter (200, "boria");
        fighters[2] = new Fighter (300, "luba");
        //fighters[3] = new Fighter (400, "nazik");  // out of bounds!!
        //fighters[4] = new Fighter (500, "seruy");

        for (Fighter f: fighters){
            System.out.println (f);
        }

    }
}
