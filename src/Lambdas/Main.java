package Lambdas;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("E", 25));
        users.add(new User("A", 21));
        users.add(new User("C", 23));
        users.add(new User("B", 22));
        users.add(new User("D", 24));

        users.forEach(user -> System.out.println(user)); // object Consumer

        System.out.println("--------------------------------------");
        users.forEach(user -> {
            if (user.getAge()%2==0){
                System.out.println(user);
            }
        });

        System.out.println("--------------------------------------");
        boolean remove = users.removeIf(user -> {
            if (user.getAge()>30){
                System.out.println(user);
                return true;
            }
            else {
                return false;}
        });
        System.out.println(remove);

        System.out.println("--------------------------------------");
        users.replaceAll(user -> {
            if (user.getName().equals("A")){
                user.setName("AAAAA");}
            return user;
        });
        System.out.println(users);

        System.out.println("--------------------------------------");
        users.replaceAll(user -> {
            user.setAge(user.getAge()*2);
            return user;
        });
        System.out.println("users aged twice - " +users);

        System.out.println("--------------------------------------");
//        // this sorts ArrayList in descending order
        users.sort((o1, o2) -> o2.getAge()-o1.getAge());
        System.out.println(users);

        System.out.println("--------------------------------------");
//        // this sorts ArrayList in ascending order with calling a method by a link
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);

    }
}
