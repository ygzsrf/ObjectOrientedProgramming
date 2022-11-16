import java.util.Objects;
import java.util.Scanner;

public class History {
    public String book;
    public int operationType; // ( Get a book(1), Return a book(2), Update the stock(3) ):
    public int date; // books release date


    public History(String book, int operationType, int date) {
        this.book = book;
        this.operationType = operationType;
        this.date = date;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    Scanner sc = new Scanner(System.in);
    // Take methods from library and then export these libraries to testlibrary

    int n;
    Library booksToHistory[] = new Library[n];

    History(){

    }

    public void logReturnBook(){
        Library returnBooks = new Library();
        String[] booksOfChoice = returnBooks.getBooks();

        System.out.println("1 - " + booksOfChoice[0] + "    Current stock: " + returnBooks.stkBk0);
        System.out.println("2 - " + booksOfChoice[1] + "    Current stock: " + returnBooks.stkBk1);
        System.out.println("3 - " + booksOfChoice[2] + "    Current stock: " + returnBooks.stkBk2);
        System.out.println("4 - " + booksOfChoice[3] + "    Current stock: " + returnBooks.stkBk3);
        System.out.print("What book do you want to return? ( 1, 2, 3, 4 ): ");
        int choiceOfBooks = sc.nextInt();

        System.out.print("Please enter the amount: ");
        int amountOfBooks = sc.nextInt();

        if (choiceOfBooks == 1){
         int firstBookStock = returnBooks.stkBk0 + amountOfBooks;
         System.out.println("Thank you for returning the book.");
         System.out.println("New stock for the " + booksOfChoice[0] + ": " + firstBookStock);
            System.out.println("\n1. " + booksOfChoice[0] + "    Updated stock: " + firstBookStock);
            System.out.println("2. " + booksOfChoice[1] + "    Updated stock: " + returnBooks.stkBk1);
            System.out.println("3. " + booksOfChoice[2] + "    Updated stock: " + returnBooks.stkBk2);
            System.out.println("4. " + booksOfChoice[3] + "    Updated stock: " + returnBooks.stkBk3);
        }
        else if (choiceOfBooks == 2){
            int secondBookStock = returnBooks.stkBk1 + amountOfBooks;
            System.out.println("Thank you for returning the book.");
            System.out.println("New stock for the " + booksOfChoice[1] + ": " + secondBookStock);
            System.out.println("\n1. " + booksOfChoice[0] + "    Updated stock: " + returnBooks.stkBk0);
            System.out.println("2. " + booksOfChoice[1] + "    Updated stock: " + secondBookStock);
            System.out.println("3. " + booksOfChoice[2] + "    Updated stock: " + returnBooks.stkBk2);
            System.out.println("4. " + booksOfChoice[3] + "    Updated stock: " + returnBooks.stkBk3);
        }
        else if (choiceOfBooks == 3){
            int thirdBookStock = returnBooks.stkBk2 + amountOfBooks;
            System.out.println("Thank you for returning the book.");
            System.out.println("New stock for the " + booksOfChoice[2] + ": " + thirdBookStock);
            System.out.println("\n1. " + booksOfChoice[0] + "    Updated stock: " + returnBooks.stkBk0);
            System.out.println("2. " + booksOfChoice[1] + "    Updated stock: " + returnBooks.stkBk1);
            System.out.println("3. " + booksOfChoice[2] + "    Updated stock: " + thirdBookStock);
            System.out.println("4. " + booksOfChoice[3] + "    Updated stock: " + returnBooks.stkBk3);
        }
        else if (choiceOfBooks == 4){
            int fourthBookStock = returnBooks.stkBk3 + amountOfBooks;
            System.out.println("Thank you for returning the book.");
            System.out.println("New stock for the " + booksOfChoice[3] + ": " + fourthBookStock);
            System.out.println("\n1. " + booksOfChoice[0] + "    Updated stock: " + returnBooks.stkBk0);
            System.out.println("2. " + booksOfChoice[1] + "    Updated stock: " + returnBooks.stkBk1);
            System.out.println("3. " + booksOfChoice[2] + "    Updated stock: " + returnBooks.stkBk2);
            System.out.println("4. " + booksOfChoice[3] + "    Updated stock: " + fourthBookStock);
        }
        else{
            System.out.println("Wrong Choice.\n");
        }

    } //done

    public void logGetBook(){
        Library getBooks = new Library();
        String[] booksGetOfChoice = getBooks.getBooks();

        System.out.println("1 - " + booksGetOfChoice[0] + "    Current stock: " + getBooks.stkBk0);
        System.out.println("2 - " + booksGetOfChoice[1] + "    Current stock: " + getBooks.stkBk1);
        System.out.println("3 - " + booksGetOfChoice[2] + "    Current stock: " + getBooks.stkBk2);
        System.out.println("4 - " + booksGetOfChoice[3] + "    Current stock: " + getBooks.stkBk3);
        System.out.print("What book do you want to get? ( 1, 2, 3, 4 ): ");
        int choiceOfBooks = sc.nextInt();

        if (choiceOfBooks > 4 || choiceOfBooks < 1){
            System.out.println("Unfortunately, we only have four books right now, please come back later.");
        }
        else{
            System.out.print("Please enter the amount: ");
            int amountOfBooks = sc.nextInt();


            if (choiceOfBooks == 1){
                if (amountOfBooks > getBooks.stkBk0){
                    System.out.println("There is not enough stock for " + booksGetOfChoice[0] + ", please come back later.");
                }
                else{
                    int getZerBookStock = getBooks.stkBk0 - amountOfBooks;
                    System.out.println("Please don't forget to return the book.");
                    System.out.println("New stock for the " + booksGetOfChoice[0] + ": " + getZerBookStock);
                    System.out.println("\n1. " + booksGetOfChoice[0] + "    Current stock: " + getZerBookStock);
                    System.out.println("2. " + booksGetOfChoice[1] + "    Current stock: " + getBooks.stkBk1);
                    System.out.println("3. " + booksGetOfChoice[2] + "    Current stock: " + getBooks.stkBk2);
                    System.out.println("4. " + booksGetOfChoice[3] + "    Current stock: " + getBooks.stkBk3);
                }

            }
            else if (choiceOfBooks == 2){
                if (amountOfBooks > getBooks.stkBk1){
                    System.out.println("There is not enough stock for " + booksGetOfChoice[1] + ", please come back later.");
                }
                else{
                    int getFirstBookStock = getBooks.stkBk1 - amountOfBooks;
                    System.out.println("Please don't forget to return the book.");
                    System.out.println("New stock for the " + booksGetOfChoice[1] + ": " + getFirstBookStock);
                    System.out.println("\n1. " + booksGetOfChoice[0] + "    Current stock: " + getBooks.stkBk0);
                    System.out.println("2. " + booksGetOfChoice[1] + "    Current stock: " + getFirstBookStock);
                    System.out.println("3. " + booksGetOfChoice[2] + "    Current stock: " + getBooks.stkBk2);
                    System.out.println("4. " + booksGetOfChoice[3] + "    Current stock: " + getBooks.stkBk3);
                }
            }
            else if (choiceOfBooks == 3){
                if (amountOfBooks > getBooks.stkBk2){
                    System.out.println("There is not enough stock for " + booksGetOfChoice[2] + ", please come back later.");
                }
                else{
                    int getSecBookStock = getBooks.stkBk2 - amountOfBooks;
                    System.out.println("Please don't forget to return the book.");
                    System.out.println("New stock for the " + booksGetOfChoice[2] + ": " + getSecBookStock);
                    System.out.println("\n1. " + booksGetOfChoice[0] + "    Current stock: " + getBooks.stkBk0);
                    System.out.println("2. " + booksGetOfChoice[1] + "    Current stock: " + getBooks.stkBk1);
                    System.out.println("3. " + booksGetOfChoice[2] + "    Current stock: " + getSecBookStock);
                    System.out.println("4. " + booksGetOfChoice[3] + "    Current stock: " + getBooks.stkBk3);
                }
            }
            else if (choiceOfBooks == 4){
                if (amountOfBooks > getBooks.stkBk3){
                    System.out.println("There is not enough stock for " + booksGetOfChoice[3] + ", please come back later.");
                }
                else{
                    int getThrdBookStock = getBooks.stkBk3 - amountOfBooks;
                    System.out.println("Please don't forget to return the book.");
                    System.out.println("New stock for the " + booksGetOfChoice[3] + ": " + getThrdBookStock);
                    System.out.println("\n1. " + booksGetOfChoice[0] + "    Current stock: " + getBooks.stkBk0);
                    System.out.println("2. " + booksGetOfChoice[1] + "    Current stock: " + getBooks.stkBk1);
                    System.out.println("3. " + booksGetOfChoice[2] + "    Current stock: " + getBooks.stkBk2);
                    System.out.println("4. " + booksGetOfChoice[3] + "    Current stock: " + getThrdBookStock);
                }
            }
            else{
                System.out.println("Wrong Choice.\n");
            }
        }


    } //done

    public void reportMissing(){
        Library missingBook = new Library();
        String[] reportMissingBooks = missingBook.getBooks();

        /*System.out.println("1 - " + reportMissingBooks[0] + "    Current stock: " + missingBook.stkBk0);
        System.out.println("2 - " + reportMissingBooks[1] + "    Current stock: " + missingBook.stkBk1);
        System.out.println("3 - " + reportMissingBooks[2] + "    Current stock: " + missingBook.stkBk2);
        System.out.println("4 - " + reportMissingBooks[3] + "    Current stock: " + missingBook.stkBk3);*/ // current books
        System.out.print("Please enter the book name: ");
        String bookNameMissing = sc.nextLine();

        if (Objects.equals(bookNameMissing, reportMissingBooks[0])){
            System.out.println("We currently have " + missingBook.stkBk0 + " of " + reportMissingBooks[0] + ".");
        }

        else if (Objects.equals(bookNameMissing, reportMissingBooks[1])){
            System.out.println("We currently have " + missingBook.stkBk1 + " of " + reportMissingBooks[1] + ".");
        }

        else if (Objects.equals(bookNameMissing, reportMissingBooks[2])){
            System.out.println("We currently have " + missingBook.stkBk2 + " of " + reportMissingBooks[2] + ".");
        }

        else if (Objects.equals(bookNameMissing, reportMissingBooks[3])){
            System.out.println("We currently have " + missingBook.stkBk3 + " of " + reportMissingBooks[3] + ".");
        }
        else{
            System.out.println(bookNameMissing + " is out of stock, please come back later.");
        }

    } //done

    public void logStockUpdate(){
        Library updatedStocks = new Library();
        updatedStocks.updateBookStock();
    } //done

    public void log(){
        // this will show all the books with dates and current stocks.
        Library bookName = new Library();
        String[] logBookName = bookName.getBooks();
        int[] logBookDate = bookName.getHistoryBooks();
        int logBookStock0 = bookName.stkBk0;
        int logBookStock1 = bookName.stkBk1;
        int logBookStock2 = bookName.stkBk2;
        int logBookStock3 = bookName.stkBk3;

        System.out.println(logBookName[0] + " - " + logBookDate[0] + "   Stock: " + logBookStock0 + "\n");
        System.out.println(logBookName[1] + " - " + logBookDate[1] + "   Stock: " + logBookStock1 + "\n");
        System.out.println(logBookName[2] + " - " + logBookDate[2] + "   Stock: " + logBookStock2 + "\n");
        System.out.println(logBookName[3] + " - " + logBookDate[3] + "   Stock: " + logBookStock3 + "\n");
    } //done

    /*
    ◦ History logReturnBook(Book book, date)
    ◦ History logGetBook(Book book, date)
    ◦ History reportMissing(Book book, date)
    ◦ History logStockUpdate(Book book, date)
    ◦ History log(String description, date)
    */


}
