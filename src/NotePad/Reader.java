package NotePad;

import javax.swing.*;
/**
 * Created by user on 23.11.18.
 */
public class Reader {

    // logination

    String login, password;

    public void authorization(){
        login = JOptionPane.showInputDialog("Set the login of a user");
        password = JOptionPane.showInputDialog("Set the password of a user");
    }

    // authorization

    String menuAuthorization = "Select the number of option \n" +
            "1 - Create a new account \n" +
            "2 - LOG in \n"+
            "3 - go to the notes \n"+
            "4 - exit";

    String responseAuthorization;

    void menuAuthorization() {
        responseAuthorization = JOptionPane.showInputDialog(menuAuthorization);
    }

    // menu in case there are no notes yet

    String subMenu1 = "Select the number of option \n" +
            "1 - add a new note \n" +
            "inactive - print all notes \n"+
            "inactive - print notes by type \n"+
            "4 - exit";

    String responsesubMenu1;

    void subMenu1() {
        responsesubMenu1 = JOptionPane.showInputDialog(subMenu1);
    }

    // menu in case there is at least one note
    String subMenu2 = "Select the number of option \n" +
            "1 - add a new note \n" +
            "2 - print all notes \n"+
            "3 - print notes by type \n"+
            "4 - exit";

    String responsesubMenu2;

    void subMenu2() {
        responsesubMenu2 = JOptionPane.showInputDialog(subMenu2);
    }


    // creating a note

     String name;
     String text;
     String date;
     String place;
     String contact;
     String type;
     String typeRequest = "Set the name of a note: \n"+
                            "1 - case EVENT \n"+
                            "2 - case MEETING \n"+
                            "3 - case NOTE \n"+
                            "4 - case BIRTDAY \n";

    void addNote(){
        name = JOptionPane.showInputDialog("Set the name of a note");
        text = JOptionPane.showInputDialog("Set the description of a note");
        date = JOptionPane.showInputDialog("Set the date of a note");
        place = JOptionPane.showInputDialog("Set the place of a note");
        contact = JOptionPane.showInputDialog("Set the contact of a note");
        type = JOptionPane.showInputDialog(typeRequest);
    }

    String typeRequest1 = "Set the name of a note: \n"+
            "1 - case EVENT \n"+
            "2 - case MEETING \n"+
            "3 - case NOTE \n"+
            "4 - case BIRTDAY \n";
    String selectType;

    void selectType(){

        selectType = JOptionPane.showInputDialog(typeRequest1);
    }
    // reply

    void reply(String reply){
        JOptionPane.showMessageDialog(null, reply);
    }
}
