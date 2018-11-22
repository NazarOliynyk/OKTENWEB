package BookFromTelegram;

import java.util.Objects;

public class Book {
    int id;
    String title;
    String author;
    int year;
    String type;

    public Book() {
    }

    public Book(int id, String title, String author, int year, String type) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.type = type;
    }

//    public Book CreateNewBook(int i, String type) {
//        Book newBook = new Book(i, "Book " + i, "Author " + i, 2000 + i, type);
//        return newBook;
//    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(type, book.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, year, type);
    }
}



