package StepByStep;

/**
 * Created by user on 08.11.18.
 */
public class BuildArray {


    // для того щоб заповнити масив задаєм його довжину і передаєм в метод два масива примітивів з іменами і проіесіями
    // метод поверне заповнений масив
    public static Person [] buildArray( int length, String [] nameInput, String [] professionInput){

        Person [] arrInsideMenhod = new Person[length];

        for (int i = 0; i < arrInsideMenhod.length; i++) {
           arrInsideMenhod[i]= new Person(i+101); // щоб id гарно виглядали
            arrInsideMenhod[i].setName(nameInput[i]);
            arrInsideMenhod[i].setProfession(professionInput[i]);
        }
        return arrInsideMenhod;
    }

    // цей метод void немає повертаючого типу - тільки виконує дію над масивом

    public static void printArr(Person[] arrInput){
        for (int i = 0; i < arrInput.length; i++) {
            System.out.println(arrInput[i].toString());
        }
    }

    // цей метод приймає масив, номер в масиві і нове імя і повертає змінений масив
    public static Person[] changeArr(Person [] arrInput, int number, String newNameInput){

        for (int i = 0; i < arrInput.length; i++) {
            if(i==number){
                arrInput[i].setName(newNameInput);
            }
        }
        return arrInput;
    }

    public static void main(String[] args) {

        // створюємо 2 масива стрінгів
        String [] names = new String[]{"Ivan", "Petro", "Mukola", "Yura", "Pavlo"};
        String [] professions = new String[]{"baker", "hairdresser", "engineer", "blacksmith", "shoemaker"};


        Person [] arr = buildArray(5, names, professions);
        printArr(arr);

        System.out.println("----------------------------------------");
        Person [] arrWithNewName = changeArr(arr, 3, "Valentyn");
        printArr(arrWithNewName);
    }
}
