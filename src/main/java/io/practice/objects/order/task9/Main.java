package io.practice.objects.order.task9;

public class Main {

    static void main() {

        Order order = new Order(
                101,
                "Монитор",
                20000,
                6
        );

        order.pay();
        order.printInfo();
    }
}
