package io.practice.array;

import java.util.Scanner;

public class Deleting_Element_Index_9 {

    /**
     * Удаление элемента по индексу
     * Постановка задачи:
     * Пользователь вводит массив и индекс K. Программа должна удалить элемент с индексом K, сдвинув
     все следующие элементы на одну позицию влево.
     *
     * Требования:
     * - Проверить, что K находится в диапазоне от 0 до N - 1.
     * - Создать новый массив длиной N - 1.
     * - Сохранить порядок оставшихся элементов.
     * - Если индекс некорректен, вывести:
     *   «Ошибка: индекс находится за пределами массива».
     */

    public static void elementsNumber(int[] array, int K) {

        if (K < 0 || K > array.length) {
            System.out.println("Ошибка: индекс находится за пределами массива");
            return;
        }

        int[] newArray = new int[array.length - 1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == K) {
                System.out.println("Удаленный элемент: " + array[i]);
                continue;
            }
            newArray[j] = array[i];
            j++;
        }
        System.out.print("Массив после удаления: ");

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
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

        System.out.print("Введите номер индекса K для удаления значения: ");
        int K = scanner.nextInt();

        elementsNumber(array, K);
    }
}
