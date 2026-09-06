package io.practice.loop;

import java.util.Scanner;

public class Lesson_13 {

    /**
     * Разложение числа на простые множители
     * Постановка задачи:
     * Пользователь вводит целое число N, большее 1. Программа должна разложить его на простые множители и
     вывести их в порядке возрастания.
     *
     * Если один множитель встречается несколько раз, он должен быть выведен соответствующее количество раз.
     *
     * Требования:
     * - Использовать циклы while и/или for.
     * - Не использовать массивы и коллекции.
     * - N должно быть больше 1.
     * - Простые множители выводить через символ « * ».
     * - После каждого найденного множителя делить N на него и продолжать проверку.
     * - Не оставлять символ « * » после последнего множителя.
     */

    public static void counter(int N) {

        int n = N;
        boolean first = true;

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                while (n % i == 0) {
                    if (!first) {
                        System.out.print(" * ");
                    }

                    System.out.print(i);
                    first = false;
                    n = n / i;
                }
            }
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        System.out.print("Простые множители " + N + " = ");
        counter(N);
    }
}
