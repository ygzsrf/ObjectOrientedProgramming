package mypackage;
import java.util.Date;

public class History {
    private Book book;
    private String operationType;
    private Date date;

    public History(Book book, String operationType, Date date) {
        // super();      -> used in inheritance
        this.book = book;
        this.operationType = operationType;
        this.date = date;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public History logReturnBook(Book book, Date returnDate) {
        History newHistoryRecord = new History(book, "Return a book", returnDate);
        return newHistoryRecord;
    }

    public History logGetBook(Book book, Date missingDate) {
        History newHistoryRecord = new History(book, "Get a book", missingDate);
        return newHistoryRecord;
    }

    public static History reportMissing(Book book, Date borrowDate) {
        History newHistoryRecord = new History(book, "Book is missing", borrowDate);
        return newHistoryRecord;
    }

    public History logStockUpdate(Book book, Date updateDate) {
        History newHistoryRecord = new History(book, "Stock is updated", updateDate);
        return newHistoryRecord;
    }

    public History log(String generalLog, Date generalLogDate) {
        History newHistoryRecord = new History(null, generalLog, generalLogDate);
        return newHistoryRecord;
    }

}
