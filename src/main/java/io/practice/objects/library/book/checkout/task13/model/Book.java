package io.practice.objects.library.book.checkout.task13.model;

public class Book {

    public int id;
    public String title;
    public String author;
    public int year;
    public boolean available;

    public Book(int id, String title, String author, int year) {

        if (id < 0  || id == this.id) {
            throw new RuntimeException("Ошибка: ID книги должны быть положительными и уникальными");
        }

        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }

    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println("Книга '" + title + "' успешно выдана");
            return true;
        } else {
            System.out.println("Книга '" + title + "' уже выдана другому читателю");
            return false;
        }
    }

    public boolean returnBook() {
        if (!available) {
            System.out.println("Вы вернули книгу: '" + title + "'");
            available = true;
            return true;
        } else {
            System.out.println("Книга '" + title + "' уже находится в библиотеке");
            return false;
        }
    }

    public boolean isWrittenBy(String author) {
        return author.equals(this.author);
    }

    public boolean isPublishedInRange(int startYear, int endYear) {
        if (startYear > endYear) {
            return false;
        }
        return startYear <= year && year <= endYear;
    }

    public void printInfo() {
        System.out.println("ID книги: " + id);
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
    }
}
