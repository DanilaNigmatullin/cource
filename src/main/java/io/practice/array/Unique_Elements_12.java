package io.practice.array;

import java.util.Scanner;

public class Unique_Elements_12 {

    /**
     * Уникальные элементы
     * Постановка задачи:
     * Пользователь вводит массив целых чисел. Программа должна вывести элементы, которые встречаются
     в массиве ровно один раз.
     *
     * Требования:
     * - Для каждого элемента подсчитать количество его появлений.
     * - Использовать вложенные циклы.
     * - Сохранить исходный порядок элементов.
     * - Не использовать дополнительные массивы, коллекции или Stream API.
     * - Если уникальных элементов нет, вывести:
     *   «Уникальных элементов нет».
     */

    public static void elementsNumber(int[] arrayN) {

        boolean flag = false;

        for (int i = 0; i < arrayN.length; i++) {

            int count = 0;

            for (int j = i; j < arrayN.length; j++) {
                if (arrayN[j] == arrayN[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arrayN[i] + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Уникальных элементов нет");
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

        int[] arrayN = new int[N];
        System.out.println("Введите " + N + " элементов:");

        for (int i = 0; i < N; i++) {
            System.out.print("Элемент [" + i + "]: ");
            int element = scanner.nextInt();
            arrayN[i] = element;
        }
        elementsNumber(arrayN);
    }
}
