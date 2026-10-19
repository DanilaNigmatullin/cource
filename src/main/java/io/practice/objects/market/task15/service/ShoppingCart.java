package io.practice.objects.market.task15.service;

import io.practice.objects.market.task15.model.CartItem;
import io.practice.objects.market.task15.model.Product;

public class ShoppingCart {

    public CartItem[] items;
    public int itemCount;

    public ShoppingCart(int itemCount) {
        this.items = new CartItem[itemCount];
        this.itemCount = 0;
    }

    public boolean addProduct(Product product, int quantity) {

        if (!product.decreaseStock(quantity)) {
            return false;
        }
        for (CartItem cartItem : this.items) {
            if (cartItem != null) {
                if (cartItem.product.id == product.id) {
                    cartItem.quantity += quantity;
                    return true;
                }
            }
        }

        if (itemCount < items.length) {
            items[itemCount] = new CartItem(product, quantity);
            itemCount++;
            return true;
        }
        System.out.println("Ошибка: корзина переполнена! Не удалось добавить товар");
        return false;
    }

    public boolean removeProduct(int productId) {

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].product.id == productId) {
                items[i].product.increaseStock(items[i].quantity);
                items[i] = null;
                this.itemCount--;
                return true;
            }
        }
        System.out.println("Ошибка: товар с ID " + productId + " не найден в корзине");
        return false;
    }

    public double calculateTotalCost() {

        double total = 0;

        for (CartItem cartItem : this.items) {
            if (cartItem != null) {
                cartItem.calculateCost();
                total += cartItem.calculateCost();
            }
        }
        return total;
    }

    public double calculateDiscount() {

        double total = calculateTotalCost();

        if (total >= 5000 && total <= 9999.99) {
            return total * 0.05;
        } else if (total >= 10000 && total <= 19999.99) {
            return total * 0.10;
        } else if (total >= 20000) {
            return total * 0.15;
        }
        return 0;
    }

    public double calculateFinalCost() {
        return calculateTotalCost() - calculateDiscount();
    }

    public CartItem findMostExpensiveItem() {

        CartItem mostExpensiveItem = null;

        for (CartItem cartItem : this.items) {
            if (cartItem != null && (mostExpensiveItem == null || cartItem.calculateCost() > mostExpensiveItem.calculateCost())) {
                mostExpensiveItem = cartItem;
            }
        }
        return mostExpensiveItem;
    }

    public void printReceipt() {
        System.out.println("ЧЕК:");
        for (CartItem cartItem : this.items) {
            if (cartItem != null) {
                System.out.println(cartItem.product.name + ": " + cartItem.quantity + " x " + cartItem.product.price + " = " + cartItem.calculateCost());
            }
        }
        System.out.println("Сумма без скидки: " + calculateTotalCost());
        System.out.println("Скидка: " + calculateDiscount());
        System.out.println("Итоговая сумма: " + calculateFinalCost());
    }
}
