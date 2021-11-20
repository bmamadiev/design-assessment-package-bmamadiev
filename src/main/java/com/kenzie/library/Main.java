package com.kenzie.library;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //Write a public static method returnBookList() in Main.java
    //      a. the method takes in 5 formatted Strings
    //      b. within the method, instantiate the LibraryBook objects
    //      c. Add the LibraryBook objects to an ArrayList<LibraryBook>
    //      d. return the Arraylist<LibraryBook>
    public static ArrayList<LibraryBook> returnBookList(String book1, String book2, String book3, String book4, String book5) {
        ArrayList<LibraryBook> list = new ArrayList<>();

        LibraryBook bookOne = new LibraryBook();
        bookOne.setBookInfo(book1);
        list.add(bookOne);

        LibraryBook bookTwo = new LibraryBook();
        bookTwo.setBookInfo(book2);
        list.add(bookTwo);

        LibraryBook bookThree = new LibraryBook();
        bookThree.setBookInfo(book3);
        list.add(bookThree);

        LibraryBook bookFour = new LibraryBook();
        bookFour.setBookInfo(book4);
        list.add(bookFour);

        LibraryBook bookFive = new LibraryBook();
        bookFive.setBookInfo(book5);
        list.add(bookFive);

        return list;
    }

    public static void main(String[] args) {
        final String BOOK_1 = "The Hobbit|J.R.R. Tolkien||";
        final String BOOK_2 = "Dune|Frank Herbert||";
        final String BOOK_3 = "The Nonsense Book|Mr. Myzlplk||";
        final String BOOK_4 = "The Cat in the Hat|Dr. Seuss||";
        final String BOOK_5 = "The Art of War|Sun Tzu||";

        try {
            //Write code inside this try/catch block
            //1. Instantiate Singleton Logger object to log: "Process starting"
            //2. Repeat for all five books listed (you do not need to loop):
            //      a. Call BookRequest.sendGET()
            //      b. Get the String response as the return value
            //      c. Use Logger to log each response string

            Logger log = Logger.getInstance();

            log.logMessage("Process starting");

            String responseOne = BookRequest.sendGET(BOOK_1);
            log.logMessage(responseOne);
            String responseTwo = BookRequest.sendGET(BOOK_2);
            log.logMessage(responseTwo);
            String responseThree = BookRequest.sendGET(BOOK_3);
            log.logMessage(responseThree);
            String responseFour = BookRequest.sendGET(BOOK_4);
            log.logMessage(responseFour);
            String responseFive = BookRequest.sendGET(BOOK_5);
            log.logMessage(responseFive);

            //4. Call the returnBookList() and print the results with System.out.println()
            //        to make sure the method works and toString() is overridden.
            System.out.println(returnBookList(BOOK_1, BOOK_2, BOOK_3, BOOK_4, BOOK_5));
            //5. User Logger to log: "Process complete"
            log.logMessage("Process complete");
            //6. Unit Test your code with LibraryBookTest.java and MainTest.java
    }
        catch (Exception e){
            System.out.println("Error occurred: unable to request book info");
        }
    }

}
