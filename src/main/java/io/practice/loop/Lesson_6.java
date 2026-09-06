package io.practice.loop;

import java.util.Scanner;

public class Lesson_6 {

    /**
     * Количество цифр
     * Постановка задачи:
     * Пользователь вводит целое число. Программа должна определить количество цифр в этом числе.
     * <p>
     * Требования:
     * - Использовать цикл for.
     * - Не преобразовывать число в строку.
     * - Знак минус не считать цифрой.
     * - Число 0 содержит одну цифру.
     */

    public static void counter(int N) {

        int length = 0;

        if (N == 0) {
            length = 1;
        } else {
            N = Math.abs(N);
            for (int i = N; i > 0; i /= 10) {
                length++;
            }
        }
        System.out.println("Количество цифр в числе " + N + ": " + length);
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        counter(N);
    }
}
