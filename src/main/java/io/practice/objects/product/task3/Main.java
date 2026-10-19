package io.practice.objects.product.task3;

public class Main {

    static void main() {
        Product product = new Product(
                "Клавиатура",
                2500,
                6
        );

        product.applyDiscount(10);
        product.sell(2);
        product.printInfo();
    }
}
