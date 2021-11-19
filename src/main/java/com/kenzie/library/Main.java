package com.kenzie.library;



public class Main {

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
            //3. Write a public static method returnBookList() in Main.java
            //      a. the method takes in 5 formatted Strings
            //      b. within the method, instantiate the LibraryBook objects
            //      c. Add the LibraryBook objects to an ArrayList<LibraryBook>
            //      d. return the Arraylist<LibraryBook>
            //4. Call the returnBookList() and print the results with System.out.println()
            //        to make sure the method works and toString() is overridden.
            //5. User Logger to log: "Process complete"
            //6. Unit Test your code with LibraryBookTest.java and MainTest.java

    }
        catch (Exception e){
            System.out.println("Error occurred: unable to request book info");
        }
    }

}
