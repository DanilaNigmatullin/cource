package io.practice.array;

import java.util.Scanner;

public class Checking_Order_Elements_8 {

    /**
     * Проверка порядка элементов
     * Постановка задачи:
     * Пользователь вводит массив целых чисел. Программа должна определить, является ли массив строго
     * возрастающим, строго убывающим или неупорядоченным.
     * <p>
     * Требования:
     * - Сравнивать соседние элементы.
     * - Равные соседние элементы нарушают и строгий рост, и строгое убывание.
     * - Использовать логические флаги.
     * - Массив из одного элемента считать одновременно возрастающим и убывающим. Вывести:
     * «Недостаточно элементов для определения направления».
     */

    public static void elementsNumber(int[] array) {

        boolean increasing = true;
        boolean decreasing = false;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                increasing = false;
            }
            if (array[i] >= array[i - 1]) {
                decreasing = false;
            }
        }

        if (increasing && decreasing) {
            System.out.println("Недостаточно элементов для определения направления");
        } else if (increasing) {
            System.out.println("Массив строго возрастает");
        } else if (decreasing) {
            System.out.println("Массив строго убывает");
        } else {
            System.out.println("Массив неупорядочен");
        }
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
