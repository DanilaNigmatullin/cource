package io.practice.objects.library.book.checkout.task13.service;

import io.practice.objects.library.book.checkout.task13.model.Book;

public class Library {

    public String name;
    public Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }

    public Book findById(int id) {
        for (Book book : books) {
            if (book.id == id) {
                return book;
            }
        }
        return null;
    }

    public boolean borrowBook(int id) {

        Book result = findById(id);

        if (result == null) {
            return false;
        }
        return result.borrowBook();
    }

    public boolean returnBook(int id) {

        Book result = findById(id);

        if (result == null) {
            return false;
        }
        return result.returnBook();
    }

    public int countAvailableBooks() {

        int count = 0;

        for (Book book : books) {
            if (book.available) {
                count++;
            }
        }
        return count;
    }

    public void printBooksByAuthor(String author) {

        System.out.println("Все книги автора: " + author);
        System.out.println();

        for (Book book : books) {
            if (book.author.equals(author)) {
                book.printInfo();
                System.out.println();
            }
        }
    }

    public void printBooksPublishedInRange(int startYear, int endYear) {

        System.out.println("Все книги c " + startYear + " до " + endYear + ":");
        System.out.println();

        for (Book book : books) {
            if (book.isPublishedInRange(startYear, endYear)) {
                book.printInfo();
                System.out.println();
            }
        }
    }

    public void printAllBooks() {

        System.out.println("Все книги: ");
        System.out.println();

        for (Book book : books) {
            book.printInfo();
            System.out.println();
        }
    }
}
