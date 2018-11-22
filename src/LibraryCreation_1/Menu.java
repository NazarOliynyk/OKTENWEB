package LibraryCreation_1;

/**
 * Created by user on 15.11.18.
 */

public class Menu {

    public static  Book [][] createLibrary(){
        Reader r = new Reader ();
        r.quantity ();
        if(r.quantity==null){
            menu(books);
        }

        int quantity = Integer.parseInt(r.quantity);

        Book[] forKids = new Book[quantity];
        Book[] novels = new Book[quantity];
        Book[] poetry = new Book[quantity];

        Book[][] library = new Book[][]{forKids, novels, poetry};
        return library;
    }

    public static  Book [][] addBook(Book [][] library, String genre){

        Reader r = new Reader ();

        switch (genre){
            case "For Kids":{

                int iterator =0;
                for (int i = 0; i < library[0].length; i++) {
                    if(!(library[0][i]==null)){
                        iterator++;
                    }
                }
                if(library[0].length==0){
                    r.reply("You have not created a library yet!");
                    break;
                }
                else if(iterator>=library[0].length){
                    r.reply("The genre- "+genre+" is full");
                    r.increase();
                    if(r.increase==null){
                        menu(books);
                    }else {
                        int increase = Integer.parseInt(r.increase);
                        books= increaseArray(books, increase);
                        menu(books);}
                }else {
                    r.insert(iterator, genre);
                    if ((r.name == null) || (r.author == null)) {
                        menu(books);
                    } else {
                        String name = r.name;
                        String author = r.author;
                        int year = Integer.parseInt(r.year);
                        library[0][iterator] = new Book();
                        library[0][iterator].setId(iterator + 101);
                        library[0][iterator].setName(name);
                        library[0][iterator].setAuthor(author);
                        library[0][iterator].setYear(year);
                    }
                    break;
                }
            }
            case "Novels":{
                int iterator =0;
                for (int i = 0; i < library[1].length; i++) {
                    if(!(library[1][i]==null)){
                        iterator++;
                    }
                }if(library[1].length==0){
                    r.reply("You have not created a library yet!");
                    break;
                }

                else if(iterator>=library[1].length){
                    r.reply("The genre- "+genre+" is full");
                    r.increase();
                    if(r.increase==null){
                        menu(books);
                    }else {
                        int increase = Integer.parseInt(r.increase);
                        books= increaseArray(books, increase);
                        menu(books);}
                }else {
                    r.insert(iterator, genre);
                    if ((r.name == null) || (r.author == null)) {
                        menu(books);
                    } else {
                        String name = r.name;
                        String author = r.author;
                        int year = Integer.parseInt(r.year);
                        library[1][iterator] = new Book();
                        library[1][iterator].setId(iterator + 201);
                        library[1][iterator].setName(name);
                        library[1][iterator].setAuthor(author);
                        library[1][iterator].setYear(year);
                    }
                    break;
                }
            }
            case "Poetry":{
                int iterator =0;
                for (int i = 0; i < library[2].length; i++) {
                    if(!(library[2][i]==null)){
                        iterator++;
                    }
                }

                if(library[2].length==0){
                    r.reply("You have not created a library yet!");
                    break;
                }
                else if(iterator>=library[2].length){
                    r.reply("The genre- "+genre+" is full");
                    r.increase();
                    if(r.increase==null){
                        menu(books);
                    }else {
                        int increase = Integer.parseInt(r.increase);
                        books= increaseArray(books, increase);
                        menu(books);}
                }else {
                    r.insert(iterator, genre);
                    if ((r.name == null) || (r.author == null)) {
                        menu(books);
                    } else {
                        String name = r.name;
                        String author = r.author;
                        int year = Integer.parseInt(r.year);
                        library[2][iterator] = new Book();
                        library[2][iterator].setId(iterator + 301);
                        library[2][iterator].setName(name);
                        library[2][iterator].setAuthor(author);
                        library[2][iterator].setYear(year);
                    }
                    break;
                }
            }
        }

        return library;
    }

    public static void selectByName(Book [][] library, String name){
        String print = "There is a book (or books) named "+name+" in your library: \n";
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {

                if(!(library[i][j]==null)) {
                    if (library[i][j].getName().equals(name)) {
                        print += library[i][j].toString()+"\n";
                    }
                }
            }
        }
        Reader r = new Reader ();
        r.reply(print);
    }

    public static void selectByAuthor(Book [][] library, String author){
        String print = "There is a book (or books) written by "+author+" in your library: \n";
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                if(!(library[i][j]==null)) {
                    if (library[i][j].getAuthor().equals(author)) {
                        print += library[i][j].toString()+"\n";
                    }
                }
            }
        }
        Reader r = new Reader ();
        r.reply(print);
    }

    public static void selectByYear(Book [][] library, int year) {
        String print = "There is a book (or books) published in " + year + " in your library: \n";
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                if(!(library[i][j]==null)) {
                    if (library[i][j].getYear()==year) {
                        print += library[i][j].toString()+"\n";
                    }
                }
            }
        }
        Reader r = new Reader ();
        r.reply(print);
    }

    public static void printAllBooks(Book [][] library){
        String print = "There are ensuing books in your library: \n";
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                if(!(library[i][j]==null)) {
                    print += library[i][j].toString()+"\n";
                }
            }
        }
        Reader r = new Reader ();
        r.reply(print);
    }

    public static void printForKids(Book [][] library){
        String print = "There are ensuing books in your librry of genre For Kids: \n";
        for (int i = 0; i < library[0].length; i++) {
            if(!(library[0][i]==null)) {
                print += library[0][i].toString()+"\n";
            }
        }
        Reader r = new Reader ();
        r.reply(print);
    }

    public static void printNovels(Book [][] library){
        String print = "There are ensuing books in your librry of genre Novels: \n";
        for (int i = 0; i < library[1].length; i++) {
            if(!(library[1][i]==null)) {
                print += library[1][i].toString()+"\n";
            }
        }
        Reader r = new Reader ();
        r.reply(print);
    }

    public static void printPoetry(Book [][] library){
        String print = "There are ensuing books in your librry of genre Poetry: \n";
        for (int i = 0; i < library[2].length; i++) {
            if(!(library[2][i]==null)) {
                print += library[2][i].toString()+"\n";
            }
        }
        Reader r = new Reader ();
        r.reply(print);
    }

    public static void isEmpty(Book [][] booksInitial){
        Reader r = new Reader();
        for (int i = 0; i < booksInitial.length; i++) {
            if(booksInitial[i].length==0){
                r.reply("You have not created a library yet!!");
                r.innerMenu();
                if (r.responseInnerMenu == 0) {
                    menu(books);
                } else {
                    System.exit(0);

                }
            }
        }
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
                //  System.out.println("length of increased subarays= "+increasedArray[i].length);
            }
        }
        return increasedArray;
    }


    public static void menu(Book [][] booksInitial) {

        Reader r = new Reader();
        r.menu();
        if(r.response==null){
            System.exit(0);
        }
        else {
            switch (Integer.parseInt(r.response)) {

                case 1: {
                    //booksInitial = createLibrary();
                    //books = booksInitial;
                    books = createLibrary();
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);

                    }
                }
                case 2: {
                    books = addBook(books, "For Kids");
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 3: {
                    books = addBook(books, "Novels");
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 4: {
                    books = addBook(books, "Poetry");
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 5: {
                    isEmpty(books);
                    r.answerName();
                    String name = r.answerName;
                    if(name==null){
                        menu(books);
                    }else {
                        selectByName(books, name);}
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 6: {
                    isEmpty(books);
                    r.answerAuthor();
                    String author = r.answerAuthor;
                    if(author==null){
                        menu(books);
                    }else {
                        selectByAuthor(books, author);}
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 7: {
                    isEmpty(books);
                    r.answerYear();
                    int year = Integer.parseInt(r.answerYear);
                    if(r.answerYear==null){
                        menu(books);
                    }else {
                        selectByYear(books, year);}
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 8: {
                    printAllBooks(books);
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 9: {
                    printForKids(books);
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 10: {
                    printNovels(books);
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 11: {
                    printPoetry(books);
                    r.innerMenu();
                    if (r.responseInnerMenu == 0) {
                        menu(books);
                    } else {
                        System.exit(0);
                    }
                }
                case 12: {
                    System.exit(0);
                }
            }
        }

    }

    static Book [][] books = new Book[3][0];

    public static void main(String[] args) {

        menu(books);
    }
}

