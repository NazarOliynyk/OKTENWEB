package StepByStep;

/**
 * Created by user on 08.11.18.
 */
public class Person {

    private int id;             // obligatory
    private String name;        // optional
    private String profession;  // optional

    public Person(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}

