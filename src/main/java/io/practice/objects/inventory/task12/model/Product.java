package io.practice.objects.inventory.task12.model;

public class Product {

    public int id;
    public String name;
    public double price;
    public int quantity;

    public Product(int id, String name, double price, int quantity) {

        if (id <= 0) {
            throw new RuntimeException("Ошибка: ID должен быть положительным");
        }

        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Ошибка: название не может быть пустым");
        }

        if (price <= 0) {
            throw new RuntimeException("Ошибка: цена должна быть больше 0");
        }

        if (quantity < 0) {
            throw new RuntimeException("Ошибка: количество не может быть отрицательным");
        }

        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalCost() {
        return  price * quantity;
    }

    public void addQuantity(int amount) {

        if (amount <= 0) {
            throw new RuntimeException("Ошибка: количество не может быть отрицательным");
        }
        quantity += amount;
        System.out.println("Остаток товара: " + quantity);
    }

    public boolean removeQuantity(int amount) {

        if (amount <= 0 || amount > quantity ) {
            return false;
        }
        quantity -= amount;
        System.out.println("Остаток товара: " + quantity);
        return true;
    }

    public void changePrice(double newPrice) {

        if (newPrice <= 0) {
            throw new RuntimeException("Ошибка: цена не может быть отрицательной");
        }
        price = newPrice;
        System.out.println("Новая цена: " + price);
    }

    public boolean isOutOfStock() {
        if (quantity == 0) {
            System.out.println("Товар: " + name + " закончился");
            return true;
        }
        return false;
    }

    public void printInfo() {
        System.out.println("ID товара: " + id);
        System.out.println("Название: " + name);
        System.out.println("Стоимость: " + price);
        System.out.println("Количество: " + quantity);
    }
}
