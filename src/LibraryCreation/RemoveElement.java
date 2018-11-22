package LibraryCreation;

import java.util.Arrays;

/**
 * Created by user on 07.11.18.
 */
public class RemoveElement {

    public static Book [] removeElement(Book [] books, String name){

        Book booksWithoutElement [] ;

        for (int i = 0; i < books.length; i++) {
            if(books[i].getName().equals(name)){
                books[i].setId(99999999);
            }
        }

        Book tmp = new Book();
        for(int i = books.length - 1; i > 0; --i) {
            for(int j = 0; j < i; ++j) {
                if(books[j].getId() > books[j + 1].getId()) {
                     tmp = books[j];

                    books[j] = books[j + 1];
                    books[j + 1] = tmp;
                }
            }
        }

        booksWithoutElement= Arrays.copyOf(books,  books.length-1);

        return booksWithoutElement;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        b1.setId(101);
        b1.setName("FirsFirst");
        b1.setAuthor("FirstFirstAuthor");
        b1.setYear(2001);

        b2.setId(102);
        b2.setName("FirsSecond");
        b2.setAuthor("FirstSecondAuthor");
        b2.setYear(2002);

        b3.setId(201);
        b3.setName("SecondFirst");
        b3.setAuthor("SecondFirstAuthor");
        b3.setYear(2003);

        b4.setId(202);
        b4.setName("SecondSecond");
        b4.setAuthor("SecondSecondAuthor");
        b4.setYear(2004);

        Book [] books = new Book[]{b1, b2, b3, b4};
        System.out.println("Array before removal");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);

        }
        Book booksWithoutElement []=  removeElement(books,"SecondFirst");
        System.out.println("Array without removed element");
        for (int i = 0; i < booksWithoutElement.length; i++) {
            System.out.println(books[i]);

        }

    }
}
