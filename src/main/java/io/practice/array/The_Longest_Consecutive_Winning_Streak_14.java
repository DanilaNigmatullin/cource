package io.practice.array;

import java.util.Scanner;

public class The_Longest_Consecutive_Winning_Streak_14 {

    /**
     * Самая длинная возрастающая серия
     * Постановка задачи:
     * Пользователь вводит массив целых чисел. Программа должна найти самый длинный непрерывный участок,
     * элементы которого строго возрастают.
     * <p>
     * Например, в массиве:
     * 5 1 2 4 0 3 7 8 2
     * <p>
     * Самая длинная возрастающая серия:
     * 0 3 7 8
     * <p>
     * Требования:
     * - Рассматривать только соседние элементы.
     * - Не путать непрерывную серию с подпоследовательностью.
     * - Определить начальный индекс и длину найденного участка.
     * - Если несколько серий имеют одинаковую максимальную длину, выбрать первую.
     * - Не создавать дополнительные массивы.
     * - Вывести элементы найденного участка.
     */

    public static void elementsNumber(int[] arrayN) {

        int currentLength = 1;
        int maxLength = 1;
        int currentIndexStart = 0;
        int currentIndexMaxStart = 0;

        for (int i = 1; i < arrayN.length; i++) {
            if (arrayN[i] > arrayN[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
                currentIndexStart = i;
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                currentIndexMaxStart = currentIndexStart;
            }
        }
        System.out.println("Начальный индекс: " + currentIndexMaxStart);
        System.out.println("Длина серии: " + maxLength);
        System.out.print("Самая длинная возрастающая серия: ");

        for (int i = currentIndexMaxStart; i < currentIndexMaxStart + maxLength; i++) {
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
