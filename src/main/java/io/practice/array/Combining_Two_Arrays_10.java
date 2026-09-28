package io.practice.array;

import java.util.Scanner;

public class Combining_Two_Arrays_10 {

    /**
     * Объединение двух массивов
     * Постановка задачи:
     * Пользователь вводит два целочисленных массива. Программа должна объединить их в один массив: сначала
     * поместить элементы первого массива, затем элементы второго.
     * <p>
     * Требования:
     * - Размеры обоих массивов должны быть положительными.
     * - Создать третий массив подходящего размера.
     * - Не использовать System.arraycopy и Arrays.copyOf.
     * - Заполнить итоговый массив с помощью циклов.
     * - Исходные массивы не изменять.
     */

    public static void elementsNumber(int[] arrayN, int[] arrayK) {

        int[] newArray = new int[arrayN.length + arrayK.length];

        for (int i = 0; i < arrayN.length; i++) {
            newArray[i] = arrayN[i];
        }

        for (int i = 0; i < arrayK.length; i++) {
            newArray[arrayN.length + i] = arrayK[i];
        }

        System.out.println("Объединённый массив: ");

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер первого массива N: ");
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

        System.out.print("Введите размер второго массива K: ");
        int K = scanner.nextInt();

        if (K <= 0) {
            System.out.println("Число K должно быть больше 0");
            return;
        }

        int[] arrayK = new int[K];
        System.out.println("Введите " + K + " элементов:");

        for (int i = 0; i < K; i++) {
            System.out.print("Элемент [" + i + "]: ");
            int element = scanner.nextInt();
            arrayK[i] = element;
        }
        elementsNumber(arrayN, arrayK);
    }
}
