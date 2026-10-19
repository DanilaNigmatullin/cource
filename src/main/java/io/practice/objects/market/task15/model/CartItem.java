package io.practice.objects.market.task15.model;

public class CartItem {

    public Product product;
    public int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateCost() {
        return product.price * quantity;
    }

    public boolean increaseQuantity(int amount) {

        if (product.decreaseStock(amount)) {
            quantity += amount;
            return true;
        }
        return false;
    }

    public boolean decreaseQuantity(int amount) {

        product.increaseStock(amount);
        quantity -= amount;
        return true;
    }

    public void printInfo() {
        System.out.println("Продукт: " + product.name);
        System.out.println("Количество: " + quantity);
    }
}
