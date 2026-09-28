package io.practice.array;

import java.util.Scanner;

public class Array_Statistics_1 {

    /**
     * Статистика массива
     * Постановка задачи:
     * Пользователь вводит размер целочисленного массива N, а затем N элементов. Программа должна вычислить
     сумму элементов, среднее арифметическое, минимальный и максимальный элементы.
     *
     * Требования:
     * - N должно быть больше 0.
     * - Использовать один массив типа int[].
     * - Для суммы использовать тип long.
     * - Среднее арифметическое вывести как вещественное число.
     * - Минимум и максимум искать самостоятельно с помощью цикла.
     * - Начальные значения минимума и максимума взять из первого элемента массива.
     * - Не использовать Arrays.stream.
     */

    public static void arrayStatistics(int[] array) {

        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма: " + sum);

        double average = (double) sum / array.length;
        System.out.println("Среднее: " + average);

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимум: " + min);

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимум: " + max);
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

            while (element == 0) {
                System.out.println("Элемент не может быть равен 0");
                System.out.print("Введите элемент [" + i + "] ещё раз: ");
                element = scanner.nextInt();
            }

            array[i] = element;
        }
        arrayStatistics(array);
    }
}
