package io.practice.array;

import java.util.Scanner;

public class Merging_Sorted_Arrays_15 {

    /**
     * Слияние отсортированных массивов
     * Постановка задачи:
     * Пользователь вводит два массива, отсортированных по возрастанию. Программа должна объединить
     * их в один отсортированный массив.
     * <p>
     * Требования:
     * - Сначала проверить, что каждый исходный массив отсортирован по неубыванию.
     * - Если хотя бы один массив не отсортирован, вывести сообщение об ошибке.
     * - Использовать три индекса: для первого, второго и итогового массивов.
     * - Сравнивать текущие элементы обоих массивов.
     * - После завершения основного цикла скопировать оставшиеся элементы.
     * - Не применять повторную сортировку итогового массива.
     * - Не использовать Arrays.sort.
     */

    public static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void elementsNumber(int[] arrayN, int[] arrayK) {

        if (!isSorted(arrayN)) {
            System.out.println("Первый массив не отсортирован!");
            return;
        }

        if (!isSorted(arrayK)) {
            System.out.println("Второй массив не отсортирован!");
            return;
        }

        int[] newArray = new int[arrayN.length + arrayK.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arrayN.length && j < arrayK.length) {
            if (arrayN[i] <= arrayK[j]) {
                newArray[k] = arrayN[i];
                i++;
            }
            else  {
                newArray[k] = arrayK[j];
                j++;
            }
            k++;
        }

        while (i < arrayN.length) {
            newArray[k] = arrayN[i];
            i++;
            k++;
        }

        while (j < arrayK.length) {
            newArray[k] = arrayK[j];
            j++;
            k++;
        }

        System.out.print("Объединенный массив: ");

        for (int value : newArray) {
            System.out.print(value + " ");
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
