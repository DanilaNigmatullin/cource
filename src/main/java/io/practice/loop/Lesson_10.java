package io.practice.loop;

import java.util.Scanner;

public class Lesson_10 {

    /**
     * Наибольший общий делитель
     * Постановка задачи:
     * Пользователь вводит два положительных целых числа A и B. Программа должна найти их наибольший общий
     * делитель с помощью алгоритма Евклида.
     * <p>
     * Требования:
     * - Использовать цикл while.
     * - A и B должны быть больше 0.
     * - Не перебирать все возможные делители.
     * - При некорректных данных вывести сообщение об ошибке.
     *
     */

    public static int counter(int A, int B) {

        int sum = 0;

        if (A <= 0 || B <= 0) {
            System.out.println("Ошибка: числа должны быть положительными");
        } else {
            while (B != 0) {
                sum = B;
                B = A % B;
                A = sum;
            }
        }
        return sum;
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int p = scanner.nextInt();
        System.out.print("Введите число B: ");
        int k = scanner.nextInt();
        String result = String.valueOf(counter(p, k));
        System.out.println("НОД: " + result);
    }
}
