package io.practice.objects.book.task6;

public class Book {

    String title;    // название
    String author;   // автор
    int year;        // год издания
    double price;    // цена

    Book(String title, String author, int year, double price) {

        if (year < 0) {
            throw new RuntimeException("Ошибка: год должен быть положительным");
        }

        if (price <= 0) {
            throw new RuntimeException("Ошибка: цена должна быть больше 0");
        }

        this.year = year;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    boolean isWrittenBy(String author) {            //проверяет автора
        return author.equals(this.author);
    }

    boolean isPublishedAfter(int year) {            //проверяет год издания
        return this.year > year;
    }

    void printInfo() {                              //выводит информацию о книге
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год: " + year);
        System.out.println("Цена: " + price);
    }
}
