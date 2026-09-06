package io.practice.loop;

import java.util.Scanner;

public class Lesson_11 {

    /**
     * Последовательность Фибоначчи
     * Постановка задачи:
     * Пользователь вводит количество элементов N. Программа должна вывести первые N элементов последовательности Фибоначчи.
     * <p>
     * Последовательность начинается так:
     * 0, 1, 1, 2, 3, 5, 8, 13, ...
     * <p>
     * Требования:
     * - Использовать цикл.
     * - N должно находиться в диапазоне от 1 до 92.
     * - Не использовать рекурсию.
     * - Элементы вывести в одну строку через пробел.
     * - Для чисел использовать тип long.
     *
     * @return
     */

    public static void counter(long N) {

        long a = 0;
        long b = 1;

        if (N >= 1 && N <= 92) {
            System.out.print(0 + " ");
            if (N == 1) {
                return;
            }
            System.out.print(1 + " ");
            if (N == 2) {
                return;
            }
            for (int i = 3; i <= N; i++) {
                long sum = a + b;
                a = b;
                b = sum;
                System.out.print(sum + " ");
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
