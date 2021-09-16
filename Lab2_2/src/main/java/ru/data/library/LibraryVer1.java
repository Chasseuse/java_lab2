package ru.data.library;
import ru.data.Book;

import java.util.List;

public class LibraryVer1 {
    public LibraryVer1(Book[] b) {
       books = b;
    }
    public void printList() {
        System.out.println("Lib1");
        for (int i = 0; i < books.length; ++i) {
            System.out.println(books[i].about());
        }
    }
    private Book[] books;
}
