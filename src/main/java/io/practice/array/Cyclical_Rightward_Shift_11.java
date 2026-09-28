package io.practice.array;

import java.util.Scanner;

public class Cyclical_Rightward_Shift_11 {

    /**
     * Циклический сдвиг вправо
     * Постановка задачи:
     * Пользователь вводит массив и неотрицательное число K. Программа должна циклически сдвинуть
     элементы массива вправо на K позиций.
     *
     * При циклическом сдвиге элементы, вышедшие за правую границу, переносятся в начало массива.
     *
     * Требования:
     * - N должно быть больше 0.
     * - K должно быть неотрицательным.
     * - Учесть, что K может быть больше длины массива.
     * - Создать новый массив для результата.
     * - Позицию каждого элемента вычислить по формуле с остатком от деления.
     */

    public static void elementsNumber(int[] arrayN, int K) {

        int[] newArray = new int[arrayN.length];

        for (int i = 0; i < arrayN.length; i++) {
            int newIndex = (i + K) % arrayN.length;
            newArray[newIndex] = arrayN[i];
        }

        System.out.println("После сдвига: ");

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

        int[] arrayN = new int[N];
        System.out.println("Введите " + N + " элементов:");

        for (int i = 0; i < N; i++) {
            System.out.print("Элемент [" + i + "]: ");
            int element = scanner.nextInt();
            arrayN[i] = element;
        }

        System.out.print("Введите число K для сдвига: ");
        int K = scanner.nextInt();

        if (K <= 0) {
            System.out.println("Число K не может быть отрицательным");
            return;
        }
        elementsNumber(arrayN, K);
    }
}
