package JobAdds;

import javax.swing.*;
/**
 * Created by user on 20.11.18.
 */
public class Reader {

    String name1, phoneNumber, email;

    void createUser(){
        name1 = JOptionPane.showInputDialog("Set the name of a user");
        phoneNumber = JOptionPane.showInputDialog("Set the phone number of a user");
        email = JOptionPane.showInputDialog("Set the e-mail of a user");
    }

    String country1, city1;

    void createLocation(){
        country1= JOptionPane.showInputDialog("Set the country");
        city1= JOptionPane.showInputDialog("Set the city");
    }

    String name2, typeOfAd2, title2, description2, country2, city2;

    void placeAd(){
        name2 = JOptionPane.showInputDialog("Set the name of a user");
        typeOfAd2 = JOptionPane.showInputDialog("Set the type of an ad: 1 in case you are an employer, 2 in case you are an employee");
        title2 = JOptionPane.showInputDialog("Set the title of an ad");
        description2 = JOptionPane.showInputDialog("Set the description of an ad");
        country2 = JOptionPane.showInputDialog("Set the country of a workplace");
        city2 = JOptionPane.showInputDialog("Set the city of a workplace");
    }

    String name3, title3;

    void deleteAd(){
        name3 = JOptionPane.showInputDialog("Set the name of a user");
        title3 = JOptionPane.showInputDialog("Set the title of an ad you want to delete");
    }

    String typeOfAd3;

    void selectByType(){
        typeOfAd3 = JOptionPane.showInputDialog("Set the type of an ad: 1 in case you are an employer, 2 in case you are an employee");
    }

    String typeOfAd4, city4;

    void selectByTypeAndLocation(){
        typeOfAd4 = JOptionPane.showInputDialog("Set the type of an ad: 1 in case you are an employer, 2 in case you are an employee");
        city4 = JOptionPane.showInputDialog("Set the city of a workplace");
    }

    String menu = "Select the number of option \n" +
            "1 - ADD a new user \n" +
            "2 - ADD a new location of a workplace \n" +
            "3 - Place a new ad \n" +
            "4 - Delete an add \n" +
            "5 - Print all ads  \n" +
            "6 - Print all ads of a certain type  \n" +
            "7 - Print all ads of a certain type and location \n" +
            "8 - Exit";

    String response;

    void menu(){
        response = JOptionPane.showInputDialog(menu);
    }

    void reply(String reply){
        JOptionPane.showMessageDialog(null, reply);
    }
}
