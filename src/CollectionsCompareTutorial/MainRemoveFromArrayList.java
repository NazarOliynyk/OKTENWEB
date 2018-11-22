package CollectionsCompareTutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 14.11.18.
 */
public class MainRemoveFromArrayList {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(105, "Ivan"));
        users.add(new User(103, "Petro"));
        users.add(new User(101, "Danulo"));
        users.add(new User(102, "Yura"));
        users.add(new User(104, "Andriy"));

        System.out.println(users);
        Iterator<User> iterator = users.iterator(); // iterator works only one time!!
        // for every next actions create new iterator!!!

        while (iterator.hasNext()){
            User next = iterator.next();
            if (next.name.equals("Danulo")){
                iterator.remove();
            }
        }

        System.out.println(users);
    }
  }
