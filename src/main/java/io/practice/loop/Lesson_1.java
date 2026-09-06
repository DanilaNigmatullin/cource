package io.practice.loop;

import java.util.Scanner;

public class Lesson_1 {

    /**
     * Числа от 1 до N
     * Постановка задачи:
     * Пользователь вводит положительное целое число N. Программа должна вывести все целые числа от 1 до N включительно.
     *
     * Требования:
     * - N должно быть больше 0.
     * - Использовать цикл for.
     * - Числа вывести в одну строку через пробел.
     * - Если N некорректно, вывести сообщение:
     *   «Ошибка: N должно быть положительным числом».
     */

    public static void counter(int N) {

        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Ошибка: N должно быть положительным числом");
        }
    }

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int k = scanner.nextInt();
        counter(k);
    }
}
