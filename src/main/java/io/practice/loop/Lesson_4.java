package io.practice.loop;

import java.util.Scanner;

public class Lesson_4 {

    /**
     * Таблица умножения
     * Постановка задачи:
     * Пользователь вводит целое число N. Программа должна вывести таблицу умножения для N от 1 до 10.
     *
     * Требования:
     * - Использовать цикл for.
     * - Каждое вычисление вывести с новой строки.
     * - Строка результата должна иметь формат:
     *   N * множитель = произведение.
     */

    public static void counter(int N) {

        for (int i = 1; i <= 10; i++ ) {
            int sum = N * i;
            System.out.println(N + " * " + i + " = " + sum);
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        counter(N);
    }
}
