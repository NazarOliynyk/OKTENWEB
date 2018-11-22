package BookFromTelegram;

public class Helper {

    public static Book CreateNewBook(int i, String type) {
        Book newBook = new Book(i, "Book " + i, "Author " + i, 2000 + i, type);
        return newBook;
    }
}

