package io.practice.array;

import java.util.Scanner;

public class Maximum_Length_Continuous_Segment_16 {

    /**
     * Максимальная сумма непрерывного участка
     * Постановка задачи:
     * Пользователь вводит массив целых чисел. Программа должна найти непрерывный участок с максимальной суммой.
     * <p>
     * Необходимо вывести максимальную сумму, начальный и конечный индексы участка, а также его элементы.
     * <p>
     * Требования:
     * - Массив может содержать положительные, отрицательные и нулевые элементы.
     * - Если все элементы отрицательные, результатом должен стать наибольший элемент.
     * - Использовать алгоритм с одним основным проходом по массиву.
     * - Не перебирать все возможные участки.
     * - Для сумм использовать тип long.
     * - Если несколько участков имеют одинаковую максимальную сумму, выбрать тот, который начинается раньше.
     * - Если начала совпадают, выбрать более короткий участок.
     */

    public static void elementsNumber(int[] arrayN) {

        long currentSum = arrayN[0];
        long maxSum = arrayN[0];

        int currentStart = 0;
        int maxStart = 0;
        int maxEnd = 0;

        for (int i = 1; i < arrayN.length; i++) {
            if (currentSum + arrayN[i] < arrayN[i]) {
                currentSum = arrayN[i];
                currentStart = i;
            } else {
                currentSum += arrayN[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxStart = currentStart;
                maxEnd = i;
            } else if (currentSum == maxSum) {
                if (currentStart < maxStart || (currentStart == maxStart && i - currentStart < maxEnd - maxStart)) {
                    maxStart = currentStart;
                    maxEnd = i;
                }
            }
        }
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Начальный индекс: " + maxStart);
        System.out.println("Конечный индекс: " + maxEnd);
        System.out.print("Участок: ");

        for (int i = maxStart; i <= maxEnd; i++) {
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
