package BookFromTelegram;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Book[] booksForChildren = new Book[3];
        Book[] booksRomance = new Book[3];
        Book[] booksPoesy = new Book[3];
        Book[][] library = new Book[3][3];

        for (int i = 0; i < 3; i++) {
            booksForChildren[i] = Helper.CreateNewBook(i + 1, "for children");
            library[0][i] = booksForChildren[i];
        }
        for (int i = 0; i < 3; i++) {
            booksRomance[i] = Helper.CreateNewBook(i + 4, "romance");
            library[1][i] = booksRomance[i];
        }
        for (int i = 0; i < 3; i++) {
            booksPoesy[i] = Helper.CreateNewBook(i + 7, "poesy");
            library[2][i] = booksPoesy[i];
        }

        String choice = "";
        while (choice.equals("0") == false) {
            System.out.println("1 - Create a book");
            System.out.println("2 - Show all");
            System.out.println("3 - Show for kids");
            System.out.println("4 - Show romance");
            System.out.println("5 - Show poetry");
            System.out.println("6 - Show by authors");
            System.out.println("7 - Show by years");
            System.out.println("0 - EXIT");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    createBook(library);
                    break;
                case "2":
                    printArrayByType(library, "all");
                    break;
                case "3":
                    printArrayByType(library, "booksForChildren");
                    break;
                case "4":
                    printArrayByType(library, "booksRomance");
                    break;
                case "5":
                    printArrayByType(library, "booksPoesy");
                    break;
                case "6":
                    System.out.println("Insert author:");
                    String inpChoice1 = scan.nextLine();
                    printArrayByAuthorYear(library, inpChoice1, "author");
                    break;
                case "7":
                    System.out.println("Insert year:");
                    String inpChoice2 = scan.nextLine();
                    if (isDigit(inpChoice2) == true) {
                        printArrayByAuthorYear(library, inpChoice2, "year");
                    }
                    break;
                case "0":
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Goodbye !!!");
                    System.out.println("--------------------------------------------------------");
                    break;
                default:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("You inserted a wrong symbol !!!");
                    System.out.println("--------------------------------------------------------");
                    break;
            }
        }
//        biggerArray(library);
    }


    public static void printArrayByType(Book[][] arr, String type) {
        System.out.println("--------------------------------------------------------");

        switch (type) {
            case "all":
                for (Book[] books : arr) {
                    for (Book book : books) {
                        System.out.println(book);
                    }
                }
                break;
            case "booksForChildren":
                for (int i = 0; i < 3; i++) {
                    System.out.println(arr[0][i]);
                }
                break;
            case "booksRomance":
                for (int i = 0; i < 3; i++) {
                    System.out.println(arr[1][i]);
                }
                break;
            case "booksPoesy":
                for (int i = 0; i < 3; i++) {
                    System.out.println(arr[2][i]);
                }
                break;
            default:
                System.out.println("switch >>>>> default");
                break;
        }
        System.out.println("--------------------------------------------------------");
    }


    public static void printArrayByAuthorYear(Book[][] arr, String inpChoice, String byWhat) {
        System.out.println("--------------------------------------------------------");
        boolean found = false;
        switch (byWhat) {
            case "author":
                for (Book[] books : arr) {
                    for (Book book : books) {
                        if (book.author.equals(inpChoice)) {
                            System.out.println(book);
                            found = true;
                        }
                    }
                }
                break;
            case "year":
                for (Book[] books : arr) {
                    for (Book book : books) {
                        if (book.year == Integer.parseInt(inpChoice)) {
                            System.out.println(book);
                            found = true;
                        }
                    }
                }
                break;
            default:
                System.out.println("switch >>>>> default");
                break;
        }
        if (found == false) {
            System.out.println("This book does not exist !");
        }
        System.out.println("--------------------------------------------------------");
    }


    public static void createBook(Book[][] arr) {

        int choiceInt = 0;
        String choiceStr = "";
        int id;
        String idStr = "";
        String title;
        String author;
        int year;
        String yearStr = "";
        String type = "";

        System.out.println("--------------------------------------------------------");
        System.out.println("Select genre:");
        System.out.println("1 - for kids");
        System.out.println("2 - romance");
        System.out.println("3 - poetry");
        System.out.println("0 - CANCEL");

        Scanner scan = new Scanner(System.in);
        choiceStr = scan.nextLine();

        if (isDigit(choiceStr) == false) {
            return;
        } else {
            choiceInt = Integer.parseInt(choiceStr);
        }

        if (choiceInt == 0) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Creating of a book canceled !");
            System.out.println("--------------------------------------------------------");
            return;
        }

        if (choiceInt != 1 && choiceInt != 2 && choiceInt != 3) {
            System.out.println("--------------------------------------------------------");
            System.out.println("You incertsed a wrong symbol!");
            System.out.println("--------------------------------------------------------");
            return;
        }

        if (choiceInt == 1) {
            type = "for children";
        }
        if (choiceInt == 2) {
            type = "romance";
        }
        if (choiceInt == 3) {
            type = "poesy";
        }

        System.out.println("Insert ID of the book (number):");
        idStr = scan.nextLine();
        if (isDigit(idStr) == false) {
            return;
        } else {
            id = Integer.parseInt(idStr); //можна без else
        }

        System.out.println("Insert name af a book:");
        title = scan.nextLine();
        System.out.println("Insert name of an author:");
        author = scan.nextLine();

        System.out.println("Введіть рік видання:");
        yearStr = scan.nextLine();
        if (isDigit(yearStr) == false) {
            return;
        } else {
            year = Integer.parseInt(yearStr);
        }

        Book newBook = new Book(id, title, author, year, type);
        for (Book[] books : arr) {
            for (Book book : books) {
                if (book.equals(newBook) == true) {
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Error, this book already exists !");
                    System.out.println("--------------------------------------------------------");
                    return;
                }
            }
        }

        arr[choiceInt - 1] = Arrays.copyOf(arr[choiceInt - 1], arr[choiceInt - 1].length + 1);
        arr[choiceInt - 1][arr[choiceInt - 1].length - 1] = newBook;
        System.out.println("--------------------------------------------------------");
        System.out.println("Book created:");
        System.out.println(newBook);
        System.out.println("--------------------------------------------------------");
    }


    public static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Error, you inserted wrong format of number !");
            System.out.println("--------------------------------------------------------");
            return false;
        }
    }



    public static void biggerArray(Book[][] arr) {

        arr[0] = Arrays.copyOf(arr[0], arr[0].length + 1);
        arr[1] = Arrays.copyOf(arr[1], arr[1].length + 1);
        arr[2] = Arrays.copyOf(arr[2], arr[2].length + 1);

        for (Book[] books : arr) {
            for (Book book : books) {
                System.out.println(book);
            }
        }
        System.out.println("--------------------------------------------------------");
    }

}
