package com.kenzie.library;
import java.util.ArrayList;
import java.util.Arrays;

public class LibraryBook implements Book {
    private String title;
    private String author;
    private String isbn;
    private ArrayList<String> subjectList;

    public LibraryBook() {
    }

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void setBookInfo(String detailString) {
        String[] bookArray = detailString.split("\\|");

        if (bookArray.length == 1) {
            this.title = bookArray[0];
        } else if (bookArray.length == 2) {
            this.title = bookArray[0];
            this.author = bookArray[1];
        } else if (bookArray.length == 3) {
            this.title = bookArray[0];
            this.author = bookArray[1];
            this.isbn = bookArray[2];
        } else if (bookArray.length == 4) {
            this.title = bookArray[0];
            this.author = bookArray[1];
            this.isbn = bookArray[2];
            bookArray[3] = bookArray[3].replace("[", "").replace("]", "");
            this.subjectList = new ArrayList<>(Arrays.asList(bookArray[3].split(",")));
        }
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", subjectList=" + getSubjectList() +
                '}';
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public ArrayList<String> getSubjectList() {
        return this.subjectList;
    }
}
