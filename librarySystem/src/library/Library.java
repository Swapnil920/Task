/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import Book.Book;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title) {
        Book newBook = new Book(title);
        books.add(newBook);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book.getTitle() + (book.isBorrowed() ? " (Borrowed)" : " (Available)"));
            }
        }
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle() + (book.isBorrowed() ? " (Borrowed)" : " (Available)"));
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    System.out.println("This book is already borrowed.");
                } else {
                    book.borrow();
                    System.out.println("Book checked out successfully.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("This book is already available.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

