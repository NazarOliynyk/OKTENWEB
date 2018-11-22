package LibraryCreation;

import javax.swing.*;

/**
 * Created by user on 06.11.18.
 */

class Reader {

    String quantity; String year;
    String name, author;
    int request;
    String answerName;
    String answerAuthor;

    void answer(){
        answerName = JOptionPane.showInputDialog("Select a name");
        answerAuthor = JOptionPane.showInputDialog("Select an autror");
    }

    void request(String question){
        request = JOptionPane.showConfirmDialog (null, question);
    }
    void quantity(){
        quantity = JOptionPane.showInputDialog("You have to establish a library of 3 genres: \n" +
                "Set the quantity of books");
    }
    void insert(int i, String genre){
        name = JOptionPane.showInputDialog("Set the name of a book # "+(i+1)+" of "+genre);
        author = JOptionPane.showInputDialog("Set the author of a book # "+(i+1)+" of "+genre);
        year = JOptionPane.showInputDialog("Set the year of a book # "+(i+1)+" of "+genre);
    }

    void reply(String reply){
        JOptionPane.showMessageDialog(null, reply);
// null puts your text in the middle of the table
    }
}

class Book {
    private int id;
    private String name;
    private String author;
    private int year;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}


public class Library {

    Reader r = new Reader ();


    public static  Book [][] createLibrary(int quantity){
        Reader r = new Reader ();

        Book[] forKids = new Book[quantity];
        Book[] novels = new Book[quantity];
        Book[] poetry = new Book[quantity];


        for (int i = 0; i < forKids.length; i++) {

            r.insert(i, "For Kids");

            String name = r.name;
            String author = r.author;
            int year = Integer.parseInt(r.year);

            forKids[i] = new Book();
            forKids[i].setId (i+101);
            forKids[i].setName (name);
            forKids[i].setAuthor (author);
            forKids[i].setYear (year);

        }

        for (int i = 0; i < novels.length; i++) {

            r.insert(i, "Novels");

            String name = r.name;
            String author = r.author;
            int year = Integer.parseInt(r.year);

            novels[i] = new Book();
            novels[i].setId (i+201);
            novels[i].setName (name);
            novels[i].setAuthor (author);
            novels[i].setYear (year);
        }

        for (int i = 0; i < poetry.length; i++) {

            r.insert(i, "Poetry");

            String name = r.name;
            String author = r.author;
            int year = Integer.parseInt(r.year);

            poetry[i] = new Book();
            poetry[i].setId (i+301);
            poetry[i].setName (name);
            poetry[i].setAuthor (author);
            poetry[i].setYear (year);
        }

        Book[][] library = new Book[][]{forKids, novels, poetry};
        return library;
    }

    public static void printLibrary(Book [][] library){
        Reader r = new Reader ();
        String reply ="These are the books in your library: \n";
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {

                reply += "The book # " + library[i][j].getId () + " is- " + library[i][j].getName () + ", written by " + library[i][j].getAuthor () + ", published in " + library[i][j].getYear ()+ ". \n";

            }
        }
        r.reply (reply);

    }

    public static Book findBook(Book [][] library, String name, String autror){
        Book book = new Book();
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++){
                if((library[i][j].getName ().equals (name))||(library[i][j].getAuthor ().equals (autror)) ){
                    book = library[i][j];
                }
            }
        }
        return book;
    }
    public static Book [][] increaseArray(Book[][] book, int increase){

        int[] lengthOfSubarrays = new int[book.length];

        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < book[i].length; j++) {
                lengthOfSubarrays[i]=book[i].length;

            }

        }
// System.out.println("lengthOfSubarrays= "+lengthOfSubarrays[0]);


        Book increasedArray [][] = new Book[book.length][];

        for (int i = 0; i < increasedArray.length; i++) {

            increasedArray[i] = new Book[lengthOfSubarrays[i]+increase];
        }

        for (int i = 0; i < book.length; i++) {
            for (int j = 0; j < book[i].length; j++) {
                increasedArray[i][j] = book[i][j];
// System.out.println(increasedArray[i].length);
            }

        }

        return increasedArray;
    }




    public static void main(String[] args) {

        Reader r = new Reader ();
        r.quantity ();
        int quantity = Integer.parseInt(r.quantity);
        Book[][] library = createLibrary(quantity);
        printLibrary(library);
        r.request ("Do you want to select a book");
        int request = r.request;
        Book selected = new Book ();
        if(request ==0){
            r.answer ();
            String name = r.answerName;
            String author = r.answerAuthor;
            selected = findBook (library, name, author);
        }
        r.reply ("You have selected a book- "+selected.getName ()+", by "+selected.getAuthor ()+", published in "+selected.getYear ());

        Book[][] increasedLibrary = increaseArray(library, 3);

        for (int i = 0; i < increasedLibrary.length; i++) {
            for (int j = 0; j < increasedLibrary.length; j++) {
                System.out.println(increasedLibrary[i][j]);

            }

        }




    }
}