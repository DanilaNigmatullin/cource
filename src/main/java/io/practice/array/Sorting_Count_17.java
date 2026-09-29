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

        int minimum = arrayN[0];
        int maximum = arrayN[0];

        for (int i = 1; i < arrayN.length; i++) {
            if (arrayN[i] < minimum) {
                minimum = arrayN[i];
            }
            if (arrayN[i] > maximum) {
                maximum = arrayN[i];
            }
        }

        long length = (long) maximum - minimum + 1;

        if (length > 1000000) {
            System.out.println("Ошибка: диапазон значений слишком большой");
            return;
        }

        int[] frequencyArray = new int[(int) length];

        for (int i = 0; i < arrayN.length; i++) {
            int index = arrayN[i] - minimum;
            frequencyArray[index]++;
        }

        System.out.println("Статистика:");

        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                int num = i + minimum;
                System.out.println("Число: " + num + " встречается - " + frequencyArray[i] + " раз(а)");
            }
        }

        int index = 0;

        for (int i = 0; i < frequencyArray.length; i++) {
            while (frequencyArray[i] > 0) {
                arrayN[index] = i + minimum;
                index++;
                frequencyArray[i]--;
            }
        }

        System.out.print("Отсортированный массив: ");

        for (int i = 0; i < arrayN.length; i++) {
            System.out.print(arrayN[i] + " ");
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
