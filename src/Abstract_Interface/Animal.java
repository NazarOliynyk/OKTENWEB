package Abstract_Interface;

/**
 * Created by user on 07.11.18.
 */

abstract class Cat extends Animal implements Inter1, Inter2{

    //abstract class might not implement methods from interfaces

    public void sound(){
        System.out.println("Sound from Cat");
    }
    public void soundParent(){
        super.sound();
    }
}

final class Dog extends Animal implements Inter1, Inter2{

    public void sound(){
        System.out.println("Sound from Dog");
    }
    public void soundParent(){
        super.sound();
    }

    @Override
    public void inter1() {
        System.out.println("variable from "+X1);
    }

    @Override
    public void inter2() {
        System.out.println("variable from "+X2);
       // X1="Dog"; // ca not assign the value of final variable
    }

}

   // class Puppy extends Dog{} // can not inherit from final class Dog

public class Animal extends Creature {

   // void finalVoid(){}; // can not override final method!!


    @Override
    public void sound() {
        System.out.println("Sound of creature");
    }

    public static void main(String[] args) {
        // Creature c = new Creature();  // can not be instatiated!!
       // Cat c = new Cat(); // can not be instatiated!!
        Dog d = new Dog();

        d.sound();
        d.soundParent();
        d.inter1();
        d.inter2();

       // creature.sound(); // can not use an object of anonymous class
    }

}
