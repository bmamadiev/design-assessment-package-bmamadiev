package com.kenzie.library;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class MainTest {

    @Test
    void returnBookList() {
        final String TESTBOOK_1 = "The Hobbit|J.R.R. Tolkien|123456|[Fiction]";
        final String TESTBOOK_2 = "Dune|Frank Herbert|234567|[Science fiction, movie]";
        final String TESTBOOK_3 = "The Nonsense Book|Mr. Myzlplk||[]";
        final String TESTBOOK_4 = "The Cat in the Hat|Dr. Seuss|00000|[childrens, illustrated, award-winning]";
        final String TESTBOOK_5 = "The Art of War|Sun Tzu|999999|[historical, Chinese, Asian culture]";

        ArrayList<LibraryBook> bookList = Main.returnBookList(TESTBOOK_1,TESTBOOK_2,TESTBOOK_3,TESTBOOK_4,TESTBOOK_5);
        assertEquals(5, bookList.size());
        assertTrue(bookList.get(0) instanceof LibraryBook);
        assertEquals("The Hobbit",bookList.get(0).getTitle());

        assertTrue(bookList.get(1) instanceof LibraryBook);
        assertEquals("Dune",bookList.get(1).getTitle());

        assertTrue(bookList.get(2) instanceof LibraryBook);
        assertEquals("The Nonsense Book",bookList.get(2).getTitle());

        assertTrue(bookList.get(3) instanceof LibraryBook);
        assertEquals("The Cat in the Hat",bookList.get(3).getTitle());

        assertTrue(bookList.get(4) instanceof LibraryBook);
        assertEquals("The Art of War",bookList.get(4).getTitle());

    }
}