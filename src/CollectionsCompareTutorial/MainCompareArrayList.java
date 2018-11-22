package CollectionsCompareTutorial;



import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 14.11.18.
 */
public class MainCompareArrayList {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(105, "Ivan"));
        users.add(new User(103, "Petro"));
        users.add(new User(101, "Danulo"));
        users.add(new User(102, "Yura"));
        users.add(new User(104, "Andriy"));

        System.out.println("Sorting with User Comparable ");
        System.out.println(users);

        Collections.sort(users);

        System.out.println(users);

        System.out.println("Sorting with an outer class Comparator ");

        ComparatorUserNameArr comparatorUserNameArr = new ComparatorUserNameArr();

       // users.sort(comparatorUserNameArr);

        Collections.sort(users, comparatorUserNameArr);

        System.out.println(users);
    }
}
