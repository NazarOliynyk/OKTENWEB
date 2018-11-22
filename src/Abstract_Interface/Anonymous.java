package Abstract_Interface;

/**
 * Created by user on 07.11.18.
 */
public class Anonymous {

    public static void main(String[] args) {

        //creating an object from interface


        Inter1 i1 = new Inter1() {
            @Override
            public void inter1() {
                System.out.println("void inter1() from inside anonymous class");
            }
        };
        i1.inter1();

        Creature creature = new Creature() {
            @Override  // has to override an abstract method
            public void sound() {
                System.out.println("void sound() from inside anonymous class");
            }
        };
        creature.sound();
        //can not use an object of anonymous class outside of this class
    }
}
