package io.practice.loop;

public class FactorialNumber {

    static void main() {

        int number = 5;
        int factorial = 2;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Факториал " + number + " равен " + factorial);

        int sum = 0;

        for (int k = 0; k <= 1000; k ++) {
            if ((k % 3 == 0) && (k % 5 == 0)){
                sum = sum + 1;
            }
        }
        System.out.println("Кратное 3 и 5: " + sum);

        int number2 = 40;
        int a = 0;
        int b = 1;
        int sumF = 0;

        for (int j = 0; j <= number2; j++) {
            sumF = a + b;
            a = b;
            b = sumF;
        }
        System.out.println("Фебиначи 40: " + sumF);
    }
}
