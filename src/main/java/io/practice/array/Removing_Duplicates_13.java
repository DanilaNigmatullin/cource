package io.practice.array;

import java.util.Scanner;

public class Removing_Duplicates_13 {

    /**
     * Удаление дубликатов
     * Постановка задачи:
     * Пользователь вводит массив целых чисел. Программа должна создать новый массив, содержащий
     * каждое значение исходного массива только один раз.
     * <p>
     * Первое появление каждого значения нужно сохранить. Порядок элементов изменять нельзя.
     * <p>
     * Требования:
     * - Не использовать Set, List, Stream API и сортировку.
     * - Сначала определить количество различных значений.
     * - Затем создать массив точного размера.
     * - Проверять наличие элемента с помощью вложенных циклов.
     * - Исходный массив не изменять.
     */

    public static void elementsNumber(int[] arrayN) {

        int uniqueElement = 0;

        for (int i = 0; i < arrayN.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arrayN[i] == arrayN[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                uniqueElement++;
            }
        }

        int[] newArray = new int[uniqueElement];

        int index = 0;

        for (int i = 0; i < arrayN.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arrayN[i] == arrayN[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                newArray[index] = arrayN[i];
                index++;
            }
        }

        System.out.println("Массив без дубликатов: ");

        for (int j : newArray) {
            System.out.print(j + " ");
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
