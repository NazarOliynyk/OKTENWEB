package StepByStep;

import javax.swing.*;
/**
 * Created by user on 08.11.18.
 */

class Reader{
    int answer;
    String length;
    String name, profession;

    //цей метод приймає стрінг з питанням і виводить його на екран в меню з 3-ма кнопками
    // при натисканні кнопок повертає int у змінну answer

    void request(String question){
        answer = JOptionPane.showConfirmDialog (null, question);
    }

    // цей метод приймає стрінг з питанням і повертає відповідь внесену юзером у змінну length
    void insertLength(String request){
        length = JOptionPane.showInputDialog(request);
    }
    // цей метод приймає порядковий номер у масиві, видає питання що треба внести і повертає у змінні
    void insertData( int iterator){

        name = JOptionPane.showInputDialog("Set the name of a person # "+(iterator+101));
        profession = JOptionPane.showInputDialog("Set the profession of a person # "+(iterator+101));
    }
    void reply(String reply){
        JOptionPane.showMessageDialog(null, reply);
// null puts your text in the middle of the table
    }

}



public class BuildArrayWithReader {

    public static Person [] buildArray(){

        Reader r = new Reader ();

        r.insertLength("Set the number of workers");

        int length = Integer.parseInt(r.length);

        Person [] personsInsideArray = new Person[length];

        for (int i = 0; i < personsInsideArray.length; i++) {
            personsInsideArray[i]= new Person(i+101);

            r.insertData(i);

            String nameInsideCycle = r.name;
            String professionInsideCycle = r.profession;

            personsInsideArray[i].setName(nameInsideCycle);
            personsInsideArray[i].setProfession(professionInsideCycle);

        }
        return personsInsideArray;
    }

    public static String depictArray(Person [] persons){
        Reader r = new Reader ();
        String reply ="These are your workers in your library: \n";

        for (int i = 0; i < persons.length; i++) {

            reply+=persons[i].toString()+"\n";

        }
        return reply;
    }

    public static void main(String[] args) {
        Reader r = new Reader ();
        r.request("Do you want to establish the staff of your company?");

        Person [] workers ;
        if (r.answer==0){
             workers = buildArray();
            for (int i = 0; i < workers.length; i++) {
                System.out.println(workers[i].toString());
            }
            String reply = depictArray(workers);
                r.reply(reply);

        }

    }

}
