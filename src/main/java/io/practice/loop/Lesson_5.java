package io.practice.loop;

import java.util.Scanner;

public class Lesson_5 {

    /**
     * Факториал числа
     * Постановка задачи:
     * Пользователь вводит целое неотрицательное число N. Программа должна вычислить факториал числа N.
     * <p>
     * Факториал:
     * N! = 1 * 2 * 3 * ... * N
     * 0! = 1
     * <p>
     * Требования:
     * - Использовать цикл for.
     * - N должно находиться в диапазоне от 0 до 20.
     * - Для результата использовать тип long.
     * - При некорректном N вывести сообщение об ошибке.
     */

    public static String counter(int N) {

        if (N >= 0 && N <= 20) {
            long factorial = 1;
            for (int i = 1; i <= N; i++) {
                factorial = factorial * i;
            }
            return "Факториал: " + N + "!" + " = " + factorial;
        } else {
            return "Ошибка: N некорректное число";
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        String result = counter(N);
        System.out.println(result);
    }
}
