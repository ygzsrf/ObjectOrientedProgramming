import java.util.Scanner;

public class TestLibrary {
    public static void main(String[] args){

        /*
        Library bookNames = new Library(); // to show array of books
        String[] allBookNames = bookNames.getBooks();

        System.out.println(allBookNames[0] + " - " + allBookNames[1] + " - " + allBookNames[2] + " - " + allBookNames[3]);


        allBookNames[] -> we need to enter the position of array to call it
        for instance:
            allBookNames[0] -> A Brief History Of Time
            allBookNames[1] -> The Grand Design
            .
            .
            .
        */

        Scanner sc = new Scanner(System.in);

        System.out.println(" ♪ ♫ Welcome to the Library ♫ ♪");
        System.out.println("1. Show all the books");
        System.out.println("2. Get a book");
        System.out.println("3. Return a book");
        System.out.println("4. Show the stocks of the books");
        System.out.println("5. Change the stocks of the books");
        System.out.println("6. Report missing");
        System.out.println("7. Exit");
        System.out.print("Please choose ( 1, 2, 3, 4, 5, 6, 7 ): ");
        int mainChoice = sc.nextInt();

        if (mainChoice == 1){
            System.out.print("\nDo you want to see the release dates as well ? ( Yes(1), No(2) ): ");
            int m1c1 = sc.nextInt(); // mainChoice statement 1 - choice 1

            if (m1c1 == 1){
                Library showBookDates = new Library(); // all info about books and dates
                showBookDates.listAllHistory();
                System.out.println("");
            }

            else if (m1c1 == 2){
                Library onlyBooks = new Library();  // all info about only books
                String[] newOnlyBooks = onlyBooks.getBooks();
                System.out.println("1 - " + newOnlyBooks[0]);
                System.out.println("2 - " + newOnlyBooks[1]);
                System.out.println("3 - " + newOnlyBooks[2]);
                System.out.println("4 - " + newOnlyBooks[3]);
                System.out.println("");
            }

            else{
                System.out.println("\nWrong Input.\n");
            }
        } // book information page

        else if (mainChoice == 2){
            System.out.println("");
            History getBook = new History(); // this method gets a book from the store (it takes how much did the user want to get)
            getBook.logGetBook();
            System.out.println("");
        } // user can get book and any amount, but the user cannot get a book more than the stock amount

        else if (mainChoice == 3){
            System.out.println("");
            History returnBook = new History(); // this method return a book from the store (it adds how much did the user got)
            returnBook.logReturnBook();
            System.out.println("");
        } // user can return book and its amount

        else if (mainChoice == 4){
            System.out.println("");
            Library showBookInfo = new Library(); // all info about books with stock info
            showBookInfo.listAllBooks();
            System.out.println("");
        } // user can see all the stock information about the books

        else if (mainChoice == 5){
            System.out.println("");
            History stockUpdate = new History();
            stockUpdate.logStockUpdate();
            System.out.println("");
        } // user can change all the stock amounts

        else if (mainChoice == 6){
            System.out.println("");
            History missingBookChoice = new History();
            missingBookChoice.reportMissing();
            System.out.println("");
        } // asks for missing book names

        else if (mainChoice == 7){
            System.out.println("Thanks for your time.");
            System.out.println("Have a nice day!\n");

        } // question to exit

        else{
            System.out.println("Wrong Choice!");
        }
    }
}