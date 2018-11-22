package CollectionsCompareTutorial;

/**
 * Created by user on 14.11.18.
 */
public class User implements Comparable<User>{

    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {  // compare with 1 argument
        //return 0;

        return this.id - o.id;
    }
}
