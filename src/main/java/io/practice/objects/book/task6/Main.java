package io.practice.objects.book.task6;

public class Main {

    static void main() {

        Book[] books = {
                new Book("Чистый код",
                        "Роберт Мартин",
                        2008,
                        3200.00
                ),
                new Book("Прагматичный программист",
                        "Дэвид Томас",
                        2019,
                        2800.00
                ),
                new Book("Паттерны проектирования",
                        "Эрих Гамма",
                        1994,
                        1900.00
                ),
                new Book("Идеальный программист",
                        "Роберт Мартин",
                        2011,
                        2100.00
                ),
                new Book("Совершенный код",
                        "Стив Макконнелл",
                        2004,
                        2500.00
                )
        };

        System.out.println("Все книги:");
        System.out.println();

        for (Book book : books) {
            book.printInfo();
            System.out.println();
        }

        Book mostExpensive =  books[0];

        for (Book book : books) {
            if (book.price > mostExpensive.price) {
                mostExpensive = book;
            }
        }

        System.out.println("Самая дорогая книга:");
        System.out.println();
        mostExpensive.printInfo();
        System.out.println();

        String author = "Роберт Мартин";
        boolean found = false;

        System.out.println("Книги автора " + author + ":");
        System.out.println();

        for (Book book : books) {
            if (book.isWrittenBy(author)) {
                book.printInfo();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книг данного автора нет");
        }

        int year = 2010;
        int counter = 0;

        for (Book book : books) {
            if (book.isPublishedAfter(year)) {
                counter++;
            }
        }
        System.out.println("Книг, изданных после " + year + " года: " + counter);
    }
}
