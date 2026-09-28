package io.practice.array;

import java.util.Scanner;

public class Replacing_Negative_Cells_7 {

    /**
     * Замена отрицательных элементов
     * Постановка задачи:
     * Пользователь вводит массив целых чисел. Программа должна заменить каждый отрицательный
     * элемент модулем этого элемента, а каждый нулевой элемент — средним арифметическим положительных
     * элементов массива.
     * <p>
     * Требования:
     * - Сначала найти сумму и количество положительных элементов.
     * - Среднее положительных элементов вычислить с отбрасыванием дробной части.
     * - Затем изменить исходный массив.
     * - Если положительных элементов нет, нули оставить без изменения.
     * - Не создавать второй массив.
     * - Учесть, что Math.abs(Integer.MIN_VALUE) не помещается в int. При наличии такого элемента
     * вывести сообщение об ошибке.
     */

    public static void elementsNumber(int[] array) {

        int sum = 0;
        int quantity = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == Integer.MIN_VALUE){
                System.out.println("Ошибка: элемент Integer.MIN_VALUE нельзя заменить модулем");
                return;
            } else if (array[i] > 0) {
                sum = sum + array[i];
                quantity++;
            }
        }
        System.out.println("Сумма положительных элементов: " + sum);
        System.out.println("Количество положительных элементов: " + quantity);

        if (quantity == 0) {
            System.out.println("Положительных элементов нет");
            return;
        }

        int average = sum / quantity;
        System.out.println("Среднее положительных элементов: " + average);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = average;
            } else if (array[i] < 0) {
                System.out.print("Начальный элемент: " + array[i] + " - ");
                array[i] = Math.abs(array[i]);
                System.out.println("измененный элемент: " + array[i]);
            }
        }

        System.out.println("Итоговый массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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
