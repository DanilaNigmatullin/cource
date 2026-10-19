package io.practice.objects.product.task3;

public class Product {

    String name;
    double price;
    int quantity;

    Product(String name, double price) {

        if (price < 0) {
            throw new RuntimeException("Ошибка: цена не может быть отрицательной");
        }

        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    Product(String name, double price, int quantity) {

        if (price < 0) {
            throw new RuntimeException("Ошибка: цена не может быть отрицательной");
        }

        if (quantity < 0) {
            throw new RuntimeException("Ошибка: количество не может быть отрицательным");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void addQuantity(int amount) {

        if (amount < 0) {
            throw new RuntimeException("Ошибка: количество не может быть отрицательным");
        }
        quantity += amount;
    }

    boolean sell(int amount) {

        if (amount < 0) {
            throw new RuntimeException("Ошибка: количество не может быть отрицательным");
        }
        quantity -= amount;
        return true;
    }

    void applyDiscount(double percent) {

        if (percent < 0 || percent > 100) {
            throw new RuntimeException("Скидка должна находиться в диапазоне от 0 до 100");
        }
        price = price - (price * percent) / 100;
    }

    void printInfo() {
        System.out.println("Товар: " + name);
        System.out.printf("Цена после скидки: %.2f%n", price);
        System.out.println("Количество: " + quantity);
        System.out.printf("Общая стоимость: %.2f%n", calculateTotalCost());
    }
}
