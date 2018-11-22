package HW004Composition;

import java.util.TreeSet;

/**
 * Created by user on 19.11.18.
 */
public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private int age;

    TreeSet<Email> emails;
    TreeSet<Pet> pets;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TreeSet<Email> getEmails() {
        return emails;
    }

    public void setEmails(TreeSet<Email> emails) {
        this.emails = emails;
    }

    public TreeSet<Pet> getPets() {
        return pets;
    }

    public void setPets(TreeSet<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        if (emails != null ? !emails.equals(person.emails) : person.emails != null) return false;
        return pets != null ? pets.equals(person.pets) : person.pets == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (emails != null ? emails.hashCode() : 0);
        result = 31 * result + (pets != null ? pets.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", emails=" + emails +
                ", pets=" + pets +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.getSurname().compareTo(o.getSurname());
    }

}
