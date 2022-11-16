import java.util.Objects;
import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);
    // fields books(Array of books), and history(array)

    // Stephen Hawking's 3 books and Cosmos from Carl Sagan

    // stock info ->   books[0] = 4,    books[1] = 6,   books[2] = 3,   books[3] = 9

    int stkBk0 = 4;
    int stkBk1 = 6;
    int stkBk2 = 3;
    int stkBk3 = 9;
    // stock info about books

    public String[] books = {  "A Brief History Of Time", "The Grand Design", "The Theory Of Everything", "Cosmos" };
    //                                  [0]                     [1]                     [2]                 [3]

    private int[] history_books = { 1988 , 2010, 2022, 1980 };
    // date chronologically 1988, 2010, 2002, 1980

    public String[] getBooks(){ // this method makes arrays to be able to use arrays in other classes
        return books.clone();
    } //done

    public int[] getHistoryBooks(){
        return history_books.clone();
    } //done

    public void updateBookStock(){
        int newStockValue;
        System.out.print("Do you want to add books or remove books? ( (1) add / (2) remove ): ");
        int updateStock = sc.nextInt();

        if (updateStock == 1){
            System.out.println("\n1 - " + books[0] + "    Current stock: " + stkBk0);
            System.out.println("2 - " + books[1] + "    Current stock: " + stkBk1);
            System.out.println("3 - " + books[2] + "    Current stock: " + stkBk2);
            System.out.println("4 - " + books[3] + "    Current stock: " + stkBk3);
            System.out.print("Please choose a book: ");
            int choiceOfBooks = sc.nextInt();

            if(choiceOfBooks == 1){
                System.out.println("Please enter the amount you want to add: ");
                newStockValue = sc.nextInt();
                int lastStockValue0 = stkBk0 + newStockValue;
                System.out.println("New stock for the " + books[0] + ": " + lastStockValue0);
                System.out.println("\n1.- " + books[0] + "    Updated stock: " + lastStockValue0);
                System.out.println("2. " + books[1] + "    Updated stock: " + stkBk1);
                System.out.println("3. " + books[2] + "    Updated stock: " + stkBk2);
                System.out.println("4. " + books[3] + "    Updated stock: " + stkBk3);
            }
            else if(choiceOfBooks == 2){
                System.out.println("Please enter the amount you want to add: ");
                newStockValue = sc.nextInt();
                int lastStockValue1 = stkBk1 + newStockValue;
                System.out.println("New stock for the " + books[1] + ": " + lastStockValue1);
                System.out.println("\n1. " + books[0] + "    Updated stock: " + stkBk0);
                System.out.println("2. " + books[1] + "    Updated stock: " + lastStockValue1);
                System.out.println("3. " + books[2] + "    Updated stock: " + stkBk2);
                System.out.println("4. " + books[3] + "    Updated stock: " + stkBk3);
            }
            else if(choiceOfBooks == 3){
                System.out.println("Please enter the amount you want to add: ");
                newStockValue = sc.nextInt();
                int lastStockValue2 = stkBk2 + newStockValue;
                System.out.println("New stock for the " + books[2] + ": " + lastStockValue2);
                System.out.println("\n1. " + books[0] + "    Updated stock: " + stkBk0);
                System.out.println("2.- " + books[1] + "    Updated stock: " + stkBk1);
                System.out.println("3. " + books[2] + "    Updated stock: " + lastStockValue2);
                System.out.println("4. " + books[3] + "    Updated stock: " + stkBk3);
            }
            else if(choiceOfBooks == 4){
                System.out.println("Please enter the amount you want to add: ");
                newStockValue = sc.nextInt();
                int lastStockValue3 = stkBk3 + newStockValue;
                System.out.println("New stock for the " + books[3] + ": " + lastStockValue3);
                System.out.println("\n1. " + books[0] + "    Updated stock: " + stkBk0);
                System.out.println("2. " + books[1] + "    Updated stock: " + stkBk1);
                System.out.println("3. " + books[2] + "    Updated stock: " + stkBk2);
                System.out.println("4. " + books[3] + "    Updated stock: " + lastStockValue3);
            }
            else{
                System.out.println("Wrong Input.");
            }

        }

        else if (updateStock == 2){
            System.out.println("\n1 - " + books[0] + "    Current stock: " + stkBk0);
            System.out.println("2 - " + books[1] + "    Current stock: " + stkBk1);
            System.out.println("3 - " + books[2] + "    Current stock: " + stkBk2);
            System.out.println("4 - " + books[3] + "    Current stock: " + stkBk3);
            System.out.print("Please choose a book: ");
            int choiceOfBooks = sc.nextInt();

            if(choiceOfBooks == 1){
                System.out.println("Please enter the amount you want to remove: ");
                int newStockValueQ2 = sc.nextInt();
                int lastStockValue0 = stkBk0 - newStockValueQ2;

                if (newStockValueQ2 > stkBk0){
                    System.out.println("There are not that many books in the store.");
                }

                else {
                    System.out.println("New stock for the " + books[0] + ": " + lastStockValue0);
                    System.out.println("\n1. " + books[0] + "    Updated stock: " + lastStockValue0);
                    System.out.println("2. " + books[1] + "    Updated stock: " + stkBk1);
                    System.out.println("3. " + books[2] + "    Updated stock: " + stkBk2);
                    System.out.println("4. " + books[3] + "    Updated stock: " + stkBk3);
                }
            }
            else if(choiceOfBooks == 2){
                System.out.println("Please enter the amount you want to remove: ");
                int newStockValueQ2 = sc.nextInt();
                int lastStockValue1 = stkBk1 - newStockValueQ2;

                if (newStockValueQ2 > stkBk1){
                    System.out.println("There are not that many books in the store.");
                }

                else {
                    System.out.println("New stock for the " + books[1] + ": " + lastStockValue1);
                    System.out.println("\n1. " + books[0] + "    Updated stock: " + stkBk0);
                    System.out.println("2. " + books[1] + "    Updated stock: " + lastStockValue1);
                    System.out.println("3. " + books[2] + "    Updated stock: " + stkBk2);
                    System.out.println("4. " + books[3] + "    Updated stock: " + stkBk3);
                }
            }
            else if(choiceOfBooks == 3){
                System.out.println("Please enter the amount you want to remove: ");
                int newStockValueQ2 = sc.nextInt();
                int lastStockValue2 = stkBk2 - newStockValueQ2;

                if (newStockValueQ2 > stkBk2){
                    System.out.println("There are not that many books in the store.");
                }

                else {
                    System.out.println("New stock for the " + books[2] + ": " + lastStockValue2);
                    System.out.println("\n1. " + books[0] + "    Updated stock: " + stkBk0);
                    System.out.println("2. " + books[1] + "    Updated stock: " + stkBk1);
                    System.out.println("3. " + books[2] + "    Updated stock: " + lastStockValue2);
                    System.out.println("4. " + books[3] + "    Updated stock: " + stkBk3);
                }
            }
            else if(choiceOfBooks == 4){
                System.out.println("Please enter the amount you want to remove: ");
                int newStockValueQ2 = sc.nextInt();
                int lastStockValue3 = stkBk3 - newStockValueQ2;

                if (newStockValueQ2 > stkBk3){
                    System.out.println("There are not that many books in the store.");
                }

                else {
                    System.out.println("New stock for the " + books[3] + ": " + lastStockValue3);
                    System.out.println("\n1. " + books[0] + "    Updated stock: " + stkBk0);
                    System.out.println("2. " + books[1] + "    Updated stock: " + stkBk1);
                    System.out.println("3. " + books[2] + "    Updated stock: " + stkBk2);
                    System.out.println("4. " + books[3] + "    Updated stock: " + lastStockValue3);
                }
            }
            else{
                System.out.println("Wrong Input.");
            }
        }

        else
            System.out.println("Wrong Input.");
    } //done

    public void listAllBooks(){
        History currentStock = new History();
        // show all the books with its stock information
        System.out.println("Book name: " + books[0] + "    Stock: " + stkBk0);
        System.out.println("Book name: " + books[1] + "    Stock: " + stkBk1);
        System.out.println("Book name: " + books[2] + "    Stock: " + stkBk2);
        System.out.println("Book name: " + books[3] + "    Stock: " + stkBk3);
    } //done

    public void listAllHistory(){
        // show all the books with its date information
        System.out.println("Book name: " + books[0] + "    Release date: " + history_books[0]);
        System.out.println("Book name: " + books[1] + "    Release date: " + history_books[1]);
        System.out.println("Book name: " + books[2] + "    Release date: " + history_books[2]);
        System.out.println("Book name: " + books[3] + "    Release date: " + history_books[3]);
    } //done

    public void borrowBook(){
        History missingReport = new History();
        History logForBorrow = new History();
        String borrowAsk;
        System.out.println("Please consider that we only have books from Stephen Hawking and Carl Sagan");
        System.out.print("Please enter the name of the book to borrow: ");
        borrowAsk = sc.nextLine();

        if (Objects.equals(borrowAsk, books[0])){
            System.out.println(books[0] + "(" + + history_books[0] + ")" + " - Stephen Hawking ");
        }

        else if (Objects.equals(borrowAsk, books[1])){
            System.out.println(books[1] + "(" + + history_books[1] + ")" + " - Stephen Hawking ");
        }

        else if (Objects.equals(borrowAsk, books[2])){
            System.out.println(books[2] + "(" + + history_books[2] + ")" + " - Stephen Hawking ");
        }

        else if (Objects.equals(borrowAsk, books[3])){
            System.out.println(books[3] + "(" + + history_books[3] + ")" + " - Carl Sagan ");
        }

        else {
            missingReport.reportMissing();
        }
    } //done

    public void returnBook(){
        History logLibrary = new History();
        logLibrary.log();;
    } //done
}
