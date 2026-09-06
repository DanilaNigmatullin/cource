package io.practice.loop;

import java.util.Scanner;

public class Lesson_2 {

    /**
     * Чётные числа в диапазоне
     * Постановка задачи:
     * Пользователь вводит два целых числа A и B. Программа должна вывести все чётные числа от A до B включительно.
     *
     * Требования:
     * - A должно быть меньше или равно B.
     * - Использовать цикл for.
     * - Для проверки чётности использовать остаток от деления.
     * - Если A больше B, вывести сообщение:
     *   «Ошибка: начало диапазона больше конца».
     * - Если чётных чисел нет, вывести:
     *   «Чётных чисел нет».
     */

    public static void counter(int A, int B) {

        if (A <= B) {
            int count = 0;
            for (int i = A; i <= B; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.println("Чётных чисел нет");
            }
        } else {
            System.out.println("Ошибка: начало диапазона больше конца");
        }
    }


    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int p = scanner.nextInt();
        System.out.print("Введите число B: ");
        int k = scanner.nextInt();
        counter(p, k);
    }
}
