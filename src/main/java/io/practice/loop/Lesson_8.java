package io.practice.loop;

import java.util.Scanner;

public class Lesson_8 {

    /**
     * Число в обратном порядке
     * Постановка задачи:
     * Пользователь вводит целое число. Программа должна вывести его цифры в обратном порядке.
     *
     * Требования:
     * - Использовать цикл while.
     * - Не использовать StringBuilder, массивы и коллекции.
     * - Знак отрицательного числа сохранить.
     * - Нули в начале перевёрнутого числа можно не выводить.
     */

    public static void counter(int N) {

        int revers = 0;

        while (N != 0 ) {
            int p = N % 10;
            revers = revers * 10 + p;
            N /= 10;
        }
        System.out.println(revers);
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        counter(N);
    }
}
