package PhoneBook_Agregation;

import java.util.Objects;
import java.util.TreeSet;

public class User implements Comparable<User>{

    private String name;
    private String surname;

    private TreeSet<PhoneNumber> numberTreeSet;

    public User() {
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TreeSet<PhoneNumber> getNumberTreeSet() {
        return numberTreeSet;
    }

    public void setNumberTreeSet(TreeSet<PhoneNumber> numberTreeSet) {
        this.numberTreeSet = numberTreeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(numberTreeSet, user.numberTreeSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, numberTreeSet);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberTreeSet=" + numberTreeSet +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.getSurname().compareTo(o.getSurname());
    }
}
