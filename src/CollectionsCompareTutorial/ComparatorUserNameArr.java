package CollectionsCompareTutorial;

import java.util.Comparator;

/**
 * Created by user on 14.11.18.
 */
public class ComparatorUserNameArr implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {  // compare with 2 arguments
        return o1.name.compareTo(o2.name);
    }
}
