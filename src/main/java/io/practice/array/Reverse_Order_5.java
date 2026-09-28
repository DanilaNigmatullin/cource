package io.practice.array;

import java.util.Scanner;

public class Reverse_Order_5 {

    /**
     * Обратный порядок
     * Постановка задачи:
     * Пользователь вводит целочисленный массив. Программа должна развернуть его: первый элемент поменять
     с последним, второй — с предпоследним и так далее.
     *
     * Требования:
     * - Изменить исходный массив.
     * - Не создавать второй массив.
     * - Использовать временную переменную для обмена.
     * - Выполнить только необходимое количество обменов.
     * - Вывести изменённый массив.
     */

    public static void elementsNumber(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }
        System.out.print("Перевернутый массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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
