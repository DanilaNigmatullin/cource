package io.practice.objects.order.task9;

public class Order {

    int orderNumber;              //номер заказа
    String productName;           //название товара
    double unitPrice;             //цена одной единицы
    int quantity;                 //количество
    boolean paid;         //оплачен ли заказ

    Order(
            int orderNumber,
            String productName,
            double unitPrice,
            int quantity
    ) {
        if (orderNumber <= 0) {
            throw new RuntimeException("Ошибка: номер заказа должен быть положительным");
        }

        if (unitPrice <= 0) {
            throw new RuntimeException("Ошибка: цена должна быть больше 0");
        }

        if (quantity <= 0) {
            throw new RuntimeException("Ошибка: количество должно быть больше 0");
        }

        this.orderNumber = orderNumber;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.paid = false;
    }

    double calculateCost() {                         //возвращает стоимость без скидки
        return unitPrice * quantity;
    }

    double calculateFinalCost() {                    //возвращает стоимость с учётом скидки;

        if (quantity >= 5 && quantity < 10) {
            return calculateCost() * 0.95;
        } else {
            return calculateCost() * 0.90;
        }
    }

    void pay() {                                     //отмечает заказ как оплаченный
        this.paid = true;
    }

    boolean changeQuantity(int quantity) {           //изменяет количество до оплаты

        if (!paid) {
            this.quantity = quantity;
            return true;
        }
        return false;
    }

    void printInfo() {                               //выводит информацию о заказе
        System.out.println("Заказ №" + orderNumber);
        System.out.println("Товар: " + productName);
        System.out.println("Количество: " + quantity);
        System.out.println("Стоимость без скидки: " + calculateCost());
        System.out.println("Итоговая стоимость: " + calculateFinalCost());
        System.out.println("Статус: " + (paid ? "плачен" : "не оплачен"));
    }
}
