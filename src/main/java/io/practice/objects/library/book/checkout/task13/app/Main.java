package io.practice.objects.library.book.checkout.task13.app;

import io.practice.objects.library.book.checkout.task13.model.Book;
import io.practice.objects.library.book.checkout.task13.service.Library;

public class Main {

    static void main() {

        Book[] books = {
                new Book(1, "Преступление и наказание", "Фёдор Достоевский", 1866),
                new Book(2, "Идиот", "Фёдор Достоевский", 1869),
                new Book(3, "Война и мир", "Лев Толстой", 1869),
                new Book(4, "Анна Каренина", "Лев Толстой", 1877),
                new Book(5, "Мастер и Маргарита", "Михаил Булгаков", 1967),
                new Book(6, "1984", "Джордж Оруэлл", 1949),
                new Book(7, "Хоббит", "Дж. Р. Р. Толкин", 1937)
        };

        Library library = new Library("Городская библиотека", books);

        library.borrowBook(3);
        System.out.println();
        library.borrowBook(3);
        System.out.println();

        library.returnBook(3);
        System.out.println();
        library.returnBook(1);
        System.out.println();

        library.printBooksByAuthor("Лев Толстой");
        System.out.println();

        library.printBooksPublishedInRange(1860, 1870);
        System.out.println();

        System.out.println("Доступных книг: " + library.countAvailableBooks());
        System.out.println();

        library.printAllBooks();
    }
}
