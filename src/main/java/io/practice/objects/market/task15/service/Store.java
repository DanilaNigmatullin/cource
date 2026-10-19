package io.practice.objects.market.task15.service;

import io.practice.objects.market.task15.model.Product;

public class Store {

    public String name;
    public Product[] products;


    public Store(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public Product findProduct(int id) {

        for (Product product : this.products) {
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }

    public Product findCheapestAvailableProduct() {

        Product cheapest = null;

        for (Product product : this.products) {
            if (product.stockQuantity > 0 && (cheapest == null || product.price < cheapest.price)) {
                cheapest = product;
            }
        }
        return cheapest;
    }


    public int countOutOfStockProducts() {

        int count = 0;

        for (Product product : this.products) {
            if (product.stockQuantity == 0) {
                count++;
            }
        }
        return count;
    }

    public void printAvailableProducts() {

        for (Product product : this.products) {
            if (product.stockQuantity > 0) {
                product.printInfo();
            }
        }
    }
}
