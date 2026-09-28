package io.practice.array;

import java.util.Scanner;

public class The_Second_Largest_Element_6 {

    /**
     * Второй максимальный элемент
     * Постановка задачи:
     * Пользователь вводит массив целых чисел. Программа должна найти второй максимальный элемент,
     * отличный от максимального.
     * <p>
     * Требования:
     * - N должно быть не меньше 2.
     * - Не сортировать массив.
     * - Максимальный и второй максимальный элементы должны различаться.
     * - Если различных значений меньше двух, вывести:
     * «Второго максимального элемента нет».
     */

    public static void elementsNumber(int[] array) {

        int firstMax = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMax) {
                firstMax = array[i];
            }
        }

        int secondMax = 0;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < firstMax) {
                secondMax = array[i];
                found = true;
            }
        }

        if (!found) {
            System.out.println("Второго максимального элемента нет");
        } else {
            System.out.println("Максимальный элемент: " + firstMax);
            System.out.println("Второй максимальный элемент: " + secondMax);
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int N = scanner.nextInt();

        if (N <= 2) {
            System.out.println("Число N должно быть больше 2");
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
