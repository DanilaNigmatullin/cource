package io.practice.objects.market.task15.model;

public class Product {

    public int id;
    public String name;
    public double price;
    public int stockQuantity;

    public Product(int id, String name, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public boolean decreaseStock(int amount) {

        if (this.stockQuantity == 0) {
            System.out.println("Ошибка: недостаточно товара " + name + " на складе");
            return false;
        }
        if (amount <= this.stockQuantity) {
            this.stockQuantity -= amount;
            return true;
        }
        System.out.println("Ошибка: недостаточно товара " + name + " на складе");
        return false;
    }

    public void increaseStock(int amount) {

        if (this.stockQuantity < 0) {
            return;
        }
        if (amount > 0) {
            this.stockQuantity += amount;
        }
    }

    public void printInfo() {
        System.out.println("ID товара: " + id);
        System.out.println("Название товара: " + name);
        System.out.println("Цена товара: " + price);
        System.out.println("Количество на складе: " + stockQuantity);
    }
}
