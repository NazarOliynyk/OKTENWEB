package Agregation_Composition;

public  class Composition {

    static class User{

        String name;
        String surname;
        Contact contact = new Contact();

        // contact belongs to User only!!

        public User(String name, String surname, String type, int number) {
            this.name = name;
            this.surname = surname;
            this.contact.setType(type);
            this.contact.setNumber(number);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", contact=" + contact +
                    '}';
        }
    }

    static class Contact{
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
    }
    static User user = new User("Nazar", "Oliynyk", "cell", 144);
    public static void main(String[] args) {

        System.out.println(user);
        System.out.println(user.contact.getNumber());
    }
}
