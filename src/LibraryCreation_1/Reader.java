package LibraryCreation_1;


import javax.swing.*;
/**
 * Created by user on 15.11.18.
 */
public class Reader {

    String name, author;
    String year;

    void insert(int i, String genre){
        name = JOptionPane.showInputDialog("Set the name of a book # "+(i+1)+" of "+genre);
        author = JOptionPane.showInputDialog("Set the author of a book # "+(i+1)+" of "+genre);
        year = JOptionPane.showInputDialog("Set the year of a book # "+(i+1)+" of "+genre);
    }

    int responseInnerMenu;

    void innerMenu(){
        responseInnerMenu = JOptionPane.showConfirmDialog (null, "Get back to the main menu?");}

    String menu = "Select the number of option \n" +
            "1 - CREATE a Library \n" +
            "2 - ADD a book of genre For Kids \n" +
            "3 - ADD a book of genre Novels \n" +
            "4 - ADD a book of genre Poetry \n" +
            "5 - Select a book by the name  \n" +
            "6 - Select a book by the author  \n" +
            "7 - Select a book by the year of publishing  \n" +
            "8 - Print all library  \n" +
            "9 - Print the books of  genre For Kids \n" +
            "10 - Print the books of  genre Novels \n" +
            "11 - Print the books of  genre Poetry \n" +
            "12 - Exit";

    String response;

    void menu(){response = JOptionPane.showInputDialog(menu);}

    String quantity;

    void quantity(){
        quantity = JOptionPane.showInputDialog("You have to establish a library of 3 genres: \n" +
                "Set the quantity of books");
    }

    String answerName;
    String answerAuthor;
    String answerYear;


    void answerName(){
        answerName = JOptionPane.showInputDialog("Select a name");
    }
    void answerAuthor(){
        answerAuthor = JOptionPane.showInputDialog("Select an autror");
    }
    void answerYear(){
        answerYear = JOptionPane.showInputDialog("Select a year of publishing");
    }

    String increase;
    void increase(){
        increase = JOptionPane.showInputDialog("Do you want to increase the number of books?\n Set the number of books you want to add.");
    }

    void reply(String reply){
        JOptionPane.showMessageDialog(null, reply);
// null puts your text in the middle of the table
    }

}
