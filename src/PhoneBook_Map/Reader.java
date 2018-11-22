package PhoneBook_Map;

import javax.swing.*;
/**
 * Created by user on 16.11.18.
 */
public class Reader {
//    int responseInnerMenu;
//
//    void innerMenu(){
//        responseInnerMenu = JOptionPane.showConfirmDialog (null, "Get back to the main menu?");}

    String name, surName;

    void getUser(){
        name = JOptionPane.showInputDialog("Set the name of a user");
        surName = JOptionPane.showInputDialog("Set the surname of a user");
    }

    String name1, surName1, typeOfNumber1;

    void getNumber(){
        name1 = JOptionPane.showInputDialog("Set the name of a user");
        surName1 = JOptionPane.showInputDialog("Set the surname of a user");
        typeOfNumber1 = JOptionPane.showInputDialog("Set the type of a number");
    }

    String name2, surName2, typeOfNumber2, number;

    void setNumber(){
        name2 = JOptionPane.showInputDialog("Set the name of a user");
        surName2 = JOptionPane.showInputDialog("Set the surname of a user");
        typeOfNumber2 = JOptionPane.showInputDialog("Set the type of a number");
        number = JOptionPane.showInputDialog("Set the number");
    }
    String name3, surName3, typeOfNumber3, number3;

    void changeNumber(){
        name3 = JOptionPane.showInputDialog("Set the name of a user");
        surName3 = JOptionPane.showInputDialog("Set the surname of a user");
        typeOfNumber3 = JOptionPane.showInputDialog("Set the type of a number you want to change");
        number3 = JOptionPane.showInputDialog("Set the new number");
    }

    String menu = "Select the number of option \n" +
            "1 - ADD a new user \n" +
            "2 - ADD a phone number to the user's phone book \n" +
            "3 - Delete a user \n" +
            "4 - Delete all numbers of the user \n" +
            "5 - Delete a number  \n" +
            "6 - Change a number  \n" +
            "7 - Print all phone book  \n" +
            "8 - Print all the numbers of the user  \n" +
            "9 - Exit";

    String response;

    void menu(){response = JOptionPane.showInputDialog(menu);}

    void reply(String reply){JOptionPane.showMessageDialog(null, reply);  }

}
