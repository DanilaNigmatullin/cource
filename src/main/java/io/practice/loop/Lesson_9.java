package io.practice.loop;

import java.util.Scanner;

public class Lesson_9 {

    /**
     * Проверка простого числа
     * Постановка задачи:
     * Пользователь вводит целое число N. Программа должна определить, является ли оно простым.
     *
     * Простое число — это натуральное число больше 1, которое делится без остатка только на 1 и на само себя.
     *
     * Требования:
     * - Использовать цикл.
     * - Не проверять делители больше квадратного корня из N.
     * - Для N меньше 2 вывести, что число не является простым.
     * - Завершить цикл сразу после нахождения делителя.
     */

    public static String counter(int N) {

        if (N <= 1) {
            return "Не простое число";
        }
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return "Составное число";
            }
        }
        return "Простое число";
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        String result = counter(N);
        System.out.println(result);
    }
}
