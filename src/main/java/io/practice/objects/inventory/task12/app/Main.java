package io.practice.objects.inventory.task12.app;

import io.practice.objects.inventory.task12.model.Product;
import io.practice.objects.inventory.task12.service.Warehouse;

public class Main {

    static void main() {

        Product[] products = {
                new Product(101, "Мышь", 1200.00, 20),
                new Product(102, "Ноутбук", 15000.00, 10),
                new Product(103, "Клавиатура", 2500.00, 15),
                new Product(104, "Монитор", 12000.00, 5),
                new Product(105, "Принтер", 9000.00, 1)
        };

        Warehouse warehouse = new Warehouse("Home-1", products);

        warehouse.printReport();
        System.out.println();

        warehouse.sellProduct(102, 3);
        System.out.println();

        warehouse.printReport();

        warehouse.calculateWarehouseValue();
    }
}
