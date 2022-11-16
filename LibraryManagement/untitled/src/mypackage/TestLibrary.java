package mypackage;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;

public class TestLibrary {
    public static void main(String[] args){

        List<Book> myBooks = new ArrayList<>();
        List<History> myHistories = new ArrayList<>();

        myBooks.add(new Book(12, "AAA", 60));
        myBooks.add(new Book(16, "BBB", 25));
        myBooks.add(new Book(26, "CCC", 13));
        myBooks.add(new Book(21, "DDD", 48));
        myBooks.add(new Book(18, "EEE", 76));

        Library myLibrary = new Library(myBooks, myHistories);

        myLibrary.listAllBooks(true);

        myLibrary.borrowBook("CCC");
        myLibrary.borrowBook("DLA");
        myLibrary.borrowBook("EEE");
        myLibrary.borrowBook("EEE");


        // reprint to check stocks
        myLibrary.listAllBooks(true);
    }
}
