package io.practice.loop;

import java.util.Scanner;

public class Lesson_7 {

    /**
     * Сумма цифр числа
     * Постановка задачи:
     * Пользователь вводит целое число. Программа должна вычислить сумму его цифр.
     *
     * Требования:
     * - Использовать цикл while.
     * - Не преобразовывать число в строку.
     * - Отрицательный знак не учитывать.
     * - Цифры получать с помощью операций % и /.
     */

    public static void counter(int N) {

        int sum = 0;

        while (N != 0) {
            sum += N % 10;
            N /= 10;
        }
        System.out.println("Сумма цифр: " + sum);
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        counter(N);
    }
}
