package io.practice.array;

import java.util.Scanner;

public class Elements_Larger_Than_Average_3 {

    /**
     * Элементы больше среднего
     * Постановка задачи:
     * Пользователь вводит массив целых чисел. Программа должна вычислить среднее арифметическое, а затем
     вывести все элементы, которые больше среднего.
     *
     * Требования:
     * - N должно быть больше 0.
     * - Сначала отдельным циклом найти сумму и среднее.
     * - Затем вторым циклом найти подходящие элементы.
     * - Вывести также количество найденных элементов.
     * - Если подходящих элементов нет, вывести:
     *   «Элементов больше среднего нет».
     */

    public static void elementsNumber(int[] array) {

        int sum = 0;
        int quantity = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double average = (double) sum / array.length;
        System.out.println("Среднее: " + average);

        System.out.print("Элементы больше среднего: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.print(array[i] + " ");
                quantity++;
            }
        }
        System.out.println("\nКоличество: " + quantity);
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
