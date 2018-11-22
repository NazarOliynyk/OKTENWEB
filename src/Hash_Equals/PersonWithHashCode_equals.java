package Hash_Equals;

/**
 * Created by user on 09.11.18.
 */
public class PersonWithHashCode_equals extends Person {

    public PersonWithHashCode_equals(int id, String name) {
        super(id, name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
