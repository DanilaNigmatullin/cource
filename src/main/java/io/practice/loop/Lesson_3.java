package io.practice.loop;

import java.util.Scanner;

public class Lesson_3 {

    /**
     * Сумма чисел от 1 до N
     * Постановка задачи:
     * Пользователь вводит положительное целое число N. Программа должна вычислить сумму всех целых чисел от 1 до N.
     *
     * Требования:
     * - Использовать цикл while.
     * - Не использовать формулу суммы арифметической прогрессии.
     * - N должно быть больше 0.
     * - Для хранения суммы использовать тип long.
     */

    public static void counter(int N) {
        if (N > 0) {
            long sum = 0;
            int i = 0;
            while (i <= N) {
                sum = sum + i;
                i++;
            }
            System.out.println("Сумма: " + sum);
        } else {
            System.out.println("Ошибка: N должно быть положительным числом");
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        counter(N);
    }
}
