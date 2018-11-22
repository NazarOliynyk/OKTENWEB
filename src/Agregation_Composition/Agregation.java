package Agregation_Composition;

import java.util.TreeSet;

public class Agregation {

    static class User{
        String name;
        String surname;

        TreeSet<Contact> phoneBook;

        public User() {
        }

        public User(String name, String surname, TreeSet<Contact> phoneBook) {
            this.name = name;
            this.surname = surname;
            this.phoneBook = phoneBook;
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

        public TreeSet<Contact> getPhoneBook() {
            return phoneBook;
        }

        public void setPhoneBook(TreeSet<Contact> phoneBook) {
            this.phoneBook = phoneBook;
        }
    }
    static class Contact implements Comparable<Contact>{
        String type;
        int number;

        public Contact() {
        }

        public Contact(String type, int number) {
            this.type = type;
            this.number = number;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "type='" + type + '\'' +
                    ", number=" + number +
                    '}';
        }

        @Override
        public int compareTo(Contact o) {
            return this.getType().compareTo(o.getType());
        }
    }


    public static void main(String[] args) {

        User user1 = new User();

        Contact contact1 = new Contact("cell", 12234);
        Contact contact2 = new Contact("home", 54245);
        //user1.setPhoneBook(new TreeSet<Contact>().add(contact1));
        TreeSet<Contact> contacts = new TreeSet<>();
        contacts.add(contact1);
        contacts.add(contact2);
        user1.setPhoneBook(contacts);
        System.out.println(user1.getPhoneBook());

    }
}
