package io.practice.objects.market.task15.app;

import io.practice.objects.market.task15.model.Product;
import io.practice.objects.market.task15.service.ShoppingCart;
import io.practice.objects.market.task15.service.Store;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Клавиатура", 2500.0, 10),
                new Product(2, "Мышь", 1500.0, 5),
                new Product(3, "Монитор", 18000.0, 2),
                new Product(4, "Коврик", 500.0, 20),
                new Product(5, "Наушники", 3000.0, 0),
        };

        Store store = new Store("Test Store", products);

        ShoppingCart shoppingCart = new ShoppingCart(5);

        shoppingCart.addProduct(store.findProduct(1), 2);
        shoppingCart.addProduct(store.findProduct(2), 3);
        shoppingCart.addProduct(store.findProduct(3), 4);
        shoppingCart.printReceipt();
    }
}
