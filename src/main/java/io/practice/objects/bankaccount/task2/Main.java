package io.practice.objects.bankaccount.task2;

public class Main {

    static void main() {
        BankAccount accountIvan = new BankAccount(
                "Ivan",
                "12345",
                1000
        );
        accountIvan.deposit(500);
        accountIvan.withdraw(300);
        accountIvan.withdraw(1500);
        accountIvan.printInfo();
    }
}
