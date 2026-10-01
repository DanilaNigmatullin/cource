package io.practice.objects.bankaccount.task2;

public class BankAccount {

    String ownerName;
    String accountNumber;
    double balance;

    BankAccount(String ownerName, String accountNumber, double balance) {

        if (balance < 0) {
            System.out.println("Начальный баланс не может быть отрицательным");
            throw new RuntimeException("Начальный баланс не может быть отрицательным");
        } else {
            this.balance = balance;
            this.ownerName = ownerName;
            this.accountNumber = accountNumber;
        }
    }

    void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Сумма пополнения должна быть больше 0");
            return;
        }
        balance += amount;
        System.out.println("Счёт успешно пополнен");
        System.out.println("Баланс: " + balance);
    }

    boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Сумма снятия должна быть больше 0");
            return false;
        }
        if (amount > balance) {
            System.out.println("Ошибка: недостаточно средств");
            return false;
        }
        balance -= amount;
        System.out.println("Снятие выполнено");
        System.out.println("Баланс: " + balance);
        return true;
    }

    void printInfo() {
        System.out.println("Владелец: " + ownerName);
        System.out.println("Номер счета: " + accountNumber);
        System.out.printf("Итоговый баланс: %.2f%n", balance);
    }
}
