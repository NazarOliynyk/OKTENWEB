package StepByStep;

/**
 * Created by user on 08.11.18.
 */
public class BuildObject {

    // обидва методи повертають обєкт класу Person
    public static Person buidObligatoryField(int idInput){

        Person personInsideMethod = new Person(idInput); // можна без цього personInsideMethod ниписати
                                                        // але то щоби зрозуміти що personInsideMethod живе тільки всередині методу
        return personInsideMethod;                      // і метод його повертає назовні як обєкт класу Person

        // return new Person(idInput); // можна і так писати
    }

    public static Person buildOptionalField(Person personInput, String nameInput, String professionInput){

        Person personInsideMethod = personInput;

        personInsideMethod.setName(nameInput);
        personInsideMethod.setProfession(professionInput);

        return personInsideMethod;  // тут вже конче треба внутрішній обєкт створити і на ньому викликати сетери

//        return personInput.setProfession(professionInput); // так нехоче працювати
//        return personInput.setName(nameInput);
    }



    public static void main(String[] args) {

        // тепер створимо обєкт -

        Person person = buidObligatoryField(101);

        System.out.println("Person with an obligatory field- "+person.toString());

        // наповнимо його додатковими даними

        Person person1 = buildOptionalField(person, "Ivan", "Driver");

        System.out.println("Person with all fields- "+person1.toString());

        // створити обєкт і наповнити його можна і без методів. То просто щоб зрозуміти
        // як метод приймає обєкт, щось з ним робить і повертає.
    }

}
