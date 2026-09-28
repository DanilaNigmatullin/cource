package io.practice.array;

import java.util.Scanner;

public class Sorting_Count_17 {
    /**
     * Сортировка подсчётом
     * Постановка задачи:
     * Пользователь вводит массив целых чисел. Программа должна отсортировать его по возрастанию
     * с помощью алгоритма сортировки подсчётом.
     * <p>
     * Требования:
     * - Не использовать Arrays.sort и другие готовые средства сортировки.
     * - Сначала найти минимальный и максимальный элементы.
     * - Создать массив частот размером:
     * maximum - minimum + 1.
     * - Учесть отрицательные числа с помощью смещения относительно минимального элемента.
     * - По массиву частот восстановить отсортированный массив.
     * - Если требуемый массив частот слишком велик, вывести:
     * «Ошибка: диапазон значений слишком большой».
     * - Считать диапазон слишком большим, если его размер превышает 1 000 000.
     * - При вычислении размера диапазона использовать тип long, чтобы избежать переполнения int.
     */

    public static void elementsNumber(int[] arrayN) {

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
