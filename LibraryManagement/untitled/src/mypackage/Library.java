package mypackage;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<History> histories;

    public Library(){
        books = new ArrayList<>();
        histories = new ArrayList<>();
    }

    public Library(List<Book> books, List<History> histories) {
        this.books = books;
        this.histories = histories;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<History> getHistories() {
        return histories;
    }

    public void setHistories(List<History> histories) {
        this.histories = histories;
    }

    public void listAllBooks(boolean haveStockInfo) {

        // method one, old one
        /*
        for (int i = 0; i < books.size(); i++) {
            Book nextBook = books.get(i)
        }
        */


        // foreach, new one
        for (Book book : books) {

            if(haveStockInfo){
                System.out.println("Next book id: " + book.getID() + "  Book name: " + book.getName() + "  Stock: " + book.getStock());
            }
            else {
                System.out.println("Next book id: " + book.getID() + "  Book name: " + book.getName());
            }
        }
        System.out.println("---------");
    } // done

    public void listAllHistory(Date fromDate, Date toDate) {

        // method one, old one
        /*
        for (int i = 0; i < books.size(); i++) {
            Book nextBook = books.get(i)
        }
        */


        // foreach, new one
        for (History history: histories) {
            if (history.getDate().getTime() > fromDate.getTime() && history.getDate().getTime() < toDate.getTime()) {

                if(history.getBook() != null){
                    System.out.println("Next history is for Book: " + history.getBook().getName() +
                            "  Operation Type: " + history.getOperationType() +
                            "  The date history is created: " + history.getDate().toString());
                }

                else{
                    System.out.println("Next history is a generic one: " +
                            "  Operation Type: " + history.getOperationType() +
                            "  The date history is created: " + history.getDate().toString());
                }

            }

        }
    } // done

    public void updateBookStock(String name, int newStock) {

        // method one, old one
        /*
        for (int i = 0; i < books.size(); i++) {
            Book nextBook = books.get(i)
        }
        */

        boolean isTheBookFound = false;
        // foreach, new one
        for (Book book: books) {
                if(book.getName().equals(name)){
                    book.setStock(newStock);
                    isTheBookFound = true;
                    break;
            }
        }

        if (!isTheBookFound){
            // add new book to the Book class
            int newRandomNumber = (int) new Date().getTime();
            Book newBook = new Book(newRandomNumber, name, newStock);

            books.add(newBook);
        }
    } // done

    public Book borrowBook(String name){
        boolean isTheBookFound = false;

        for (Book book : books){
            if (book.getName().equals(name)){
                // Update stock, since we borrow one
                book.setStock(book.getStock() - 1);
                isTheBookFound = true;
                return book;
            }
        }

        if(!isTheBookFound){
            History newHistory = History.reportMissing(new Book(-1, name, -1), new Date());
            histories.add(newHistory);
        }

        return null;
    } // done

    public Book returnBook(String name){
        boolean isTheBookFound = false;

        for (Book book : books){
            if (book.getName().equals(name)){
                // Update stock, since we borrow one
                book.setStock(book.getStock() + 1);
                isTheBookFound = true;
                return book;
            }
        }

        if(!isTheBookFound){
            History newHistory = History.reportMissing(new Book(-1, name, -1), new Date());
            histories.add(newHistory);
        }

        return null;
    } // done
}
