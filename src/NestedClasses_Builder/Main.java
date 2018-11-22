package NestedClasses_Builder;

/**
 * Created by user on 21.11.18.
 */
public class Main {

    public static void main(String[] args) {


        Person person = Person.builder().name("Ivan").surname("Petrenko").mail("emaill").build();

        Person person1 = Person.builder().name("Petro").surname("Pavlenko").mail("emailllll").person;

        System.out.println(person);
        System.out.println(person1);

        // it is possible to not to fill all fields

        Person person2 = Person.builder().name("Oleg").build();

        System.out.println(person2);
    }
}

class Person{

    private String name;
    private String surname;
    private String mail;

    // in case if there are a few fields of the same type  -
    //  it is not possible to create a few constructors to fill each field
    // java will not know which arg is being given to a constructor


    static PersonBuilder builder(){
        return new PersonBuilder();
    }

    static class PersonBuilder{

        Person person = new Person();

        public PersonBuilder name(String name){
                    person.name = name;
                    return this;  // returns an object
                }
        public PersonBuilder surname(String surname){
                    person.surname = surname;
                    return this;  // returns an object
                }
        public PersonBuilder mail(String mail){
                    person.mail = mail;
                    return this;  // returns an object
                }

        public Person build(){
                    return person;
                }


    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}