package com.kenzie.library;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LibraryBookTest {
	public static final boolean TEST_SUCCESS = true;


	public static LibraryBook getLibraryBook() {
		LibraryBook book = new LibraryBook();
		return book;
	}

	public static LibraryBook getLibraryBook(String title, String author) {
		LibraryBook book = new LibraryBook(title,author);
		return book;
	}


	@Test
	void canCreateLibraryBookDefault() {
		LibraryBook book = getLibraryBook();
		assertTrue(book instanceof Book, "LibraryBook is instance of Book" );

	}

	@Test
	void canCreateLibraryBookTitleAuthor() {
		LibraryBook book = getLibraryBook("The Invisible Man","H.G. Wells");
		assertTrue(book instanceof Book, "LibraryBook is instance of Book" );
		assertEquals("H.G. Wells",book.getAuthor());
		assertEquals("The Invisible Man",book.getTitle());
		assertEquals(null,book.getIsbn());
		assertEquals(null,book.getSubjectList());

	}


	@Test
	void testToString() {
		String testString1 = "LibraryBook{title='The Hobbit', author='J.R.R. Tolkien', isbn='0871294273', subjectList=[Juvenile fiction]}";
		String testString2 = "LibraryBook{title='The Nonsense Book', author='Mr. Myzlplk', isbn='', subjectList=[]}";
		String bookDetails1 = "The Hobbit|J.R.R. Tolkien|0871294273|[Juvenile fiction]";
		String bookDetails2 = "The Nonsense Book|Mr. Myzlplk||[]";
		LibraryBook book = getLibraryBook();
		assertTrue(book instanceof Book, "LibraryBook is instance of Book" );
		book.setBookInfo(bookDetails1);
		assertEquals(testString1,book.toString());
		book.setBookInfo(bookDetails2);
		assertEquals(testString2,book.toString());
	}

	@Test
	void setBookInfo() {
		String bookDetails1 = "The Hobbit|J.R.R. Tolkien|0871294273|[Juvenile fiction," +
				              "Middle Earth (Imaginary place),Fiction]";
		String bookDetails2 = "The Nonsense Book|Mr. Myzlplk||[]";
		String[] subjectArray1 = {"Juvenile fiction","Middle Earth (Imaginary place)", "Fiction"};
		String[] subjectArray2 = {""};
		ArrayList<String> subjectList1 =
				new ArrayList<>(Arrays.asList(subjectArray1));
		ArrayList<String> subjectList2 =
				new ArrayList<>(Arrays.asList(subjectArray2));
		LibraryBook book = getLibraryBook();
		assertTrue(book instanceof Book, "LibraryBook is instance of Book" );
		book.setBookInfo(bookDetails1);
		assertEquals("The Hobbit",book.getTitle());
		assertEquals("J.R.R. Tolkien",book.getAuthor());
		assertEquals("0871294273",book.getIsbn());
		assertEquals(subjectList1,book.getSubjectList());
		book.setBookInfo(bookDetails2);
		assertEquals("The Nonsense Book",book.getTitle());
		assertEquals("Mr. Myzlplk",book.getAuthor());
		assertEquals("",book.getIsbn());
		assertEquals(subjectList2,book.getSubjectList());

	}
}
