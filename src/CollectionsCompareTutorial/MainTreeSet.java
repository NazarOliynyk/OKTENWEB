package CollectionsCompareTutorial;

import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by user on 14.11.18.
 */
public class MainTreeSet {

    public static void main(String[] args) {

        TreeSet<User> users = new TreeSet<>();

        users.add(new User(105, "Ivan"));
        users.add(new User(103, "Petro"));
        users.add(new User(101, "Danulo"));
        users.add(new User(102, "Yura"));
        users.add(new User(104, "Andriy"));
        users.add(new User(104, "TheSameNumber1"));
        users.add(new User(106, "Andriy"));

        System.out.println(users); // sorts and deletes elements with the same id

        ComparatorUserNameArr comparatorUserNameArr = new ComparatorUserNameArr();

       // Collections.sort(users, comparatorUserNameArr);

        System.out.println("Sorting Set by names using Comparator as an argument");

        TreeSet<User> users1 = new TreeSet<>(new ComparatorUserNameArr());

        users1.add(new User(105, "Ivan"));
        users1.add(new User(103, "Petro"));
        users1.add(new User(101, "Danulo"));
        users1.add(new User(102, "Yura"));
        users1.add(new User(104, "Andriy"));
        users1.add(new User(104, "TheSameNumber1"));
        users1.add(new User(106, "Andriy"));

        System.out.println(users1);
    }
}
