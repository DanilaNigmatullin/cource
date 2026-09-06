package io.practice.loop;

import java.util.Scanner;

public class Lesson_12 {

    /**
     * Числовой треугольник
     * Постановка задачи:
     * Пользователь вводит высоту N. Программа должна вывести числовой треугольник из N строк.
     * В строке с номером i числа от 1 до i должны выводиться через пробел.
     *
     * Требования:
     * - Использовать два вложенных цикла for.
     * - N должно находиться в диапазоне от 1 до 20.
     * - Каждую строку треугольника начинать с новой строки.
     */

    public static void counter(long N) {

        int steps = 1;

        if (N >= 1 && N <= 20) {
            for (int i = 0; i <= N; i++) {
                for (int k = 0; k <= i; k++) {
                    System.out.print(steps + " ");
                    steps++;
                }
                steps = 1;
                System.out.println();
            }
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        counter(N);
    }
}
