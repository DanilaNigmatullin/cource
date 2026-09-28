package io.practice.array;

import java.util.Scanner;

public class Search_Item_4 {

    /**
     * Поиск элемента
     * Постановка задачи:
     * Пользователь вводит целочисленный массив и число X. Программа должна найти все позиции, на которых находится X.
     * <p>
     * Требования:
     * - Индексы выводить с 0.
     * - Использовать линейный поиск.
     * - Подсчитать количество совпадений.
     * - Не завершать поиск после первого совпадения.
     * - Если X отсутствует, вывести:
     * «Элемент не найден».
     */

    public static void elementsNumber(int[] array, int X) {

        int quantity = 0;

        System.out.print("Индексы: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                System.out.print(i + " ");
                quantity++;
            }
        }
        if (quantity == 0) {
            System.out.println("«Элемент не найден»");
        } else {
            System.out.println("\nКоличество совпадений: " + quantity);
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

        System.out.print("Введите число Х: ");
        int X = scanner.nextInt();

        elementsNumber(array, X);
    }
}
