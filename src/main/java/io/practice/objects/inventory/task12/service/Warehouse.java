package io.practice.objects.inventory.task12.service;

import io.practice.objects.inventory.task12.model.Product;

public class Warehouse {

    String name;
    Product[] products;

    public Warehouse(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public Product findById(int id) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].id == id) {
                return products[i];
            }
        }
        return null;
    }

    public Product findMostExpensiveProduct() {

        Product max = products[0];

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > max.price) {
                max = products[i];
            }
        }
        return max;
    }

    public Product findProductWithLargestStockValue() {

        Product max = products[0];

        for (int i = 1; i < products.length; i++) {
            if (products[i].calculateTotalCost() > max.calculateTotalCost()) {
                max = products[i];
            }
        }
        return max;
    }

    public double calculateWarehouseValue() {

        double sum = 0;

        for (int i = 0; i < products.length; i++) {
            sum += products[i].calculateTotalCost();
        }
        return sum;
    }

    public int countOutOfStockProducts() {

        int count = 0;

        for (int i = 0; i < products.length; i++)
            if (products[i].isOutOfStock()) {
                count++;
            }
        return count;
    }

    public boolean sellProduct(int id, int amount) {

        Product product = findById(id);

        if (product == null) {
            System.out.println("Товар с ID: " + id + " не найден");
            return false;
        }
        if (!product.removeQuantity(amount)) {
            System.out.println("Ошибка: проверьте количество");
            return false;
        }
        System.out.println("Продажа выполнена");
        return true;
    }

    public void printProductsBelowQuantity(int limit) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].quantity < limit) {
                products[i].printInfo();
            }
        }
    }

    public void printReport() {
        System.out.println("Общая стоимость склада: " + calculateWarehouseValue());
        System.out.println("Товаров с нулевым остатком: " + countOutOfStockProducts());
        System.out.println("Самый дорогой товар: " + findMostExpensiveProduct().name);
    }

}