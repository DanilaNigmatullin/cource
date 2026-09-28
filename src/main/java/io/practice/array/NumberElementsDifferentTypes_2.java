package io.practice.array;

import java.util.Scanner;

public class NumberElementsDifferentTypes_2 {

    /**
     * Количество элементов разных типов
     * Постановка задачи:
     * Пользователь вводит целочисленный массив. Программа должна определить количество положительных,
     * отрицательных и нулевых элементов.
     *
     * Требования:
     * - N должно быть больше 0.
     * - Проверить каждый элемент массива.
     * - Использовать отдельные счётчики.
     * - Каждый элемент должен попасть только в одну категорию.
     */

    public static void elementsNumber(int[] array) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive += 1;
            }
        }
        System.out.println("Положительных: " + positive);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative += 1;
            }
        }
        System.out.println("Отрицательных: " + negative);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zero += 1;
            }
        }
        System.out.println("Нулевых: " + zero);

    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Число N должно быть больше 0");
            return;
        }

        int[] array = new int[N];
        System.out.println("Введите " + N + " элементов:");

        for (int i = 0; i < N; i++) {
            System.out.print("Элемент [" + i + "]: ");
            int element = scanner.nextInt();
            array[i] = element;
        }
        elementsNumber(array);
    }
}
