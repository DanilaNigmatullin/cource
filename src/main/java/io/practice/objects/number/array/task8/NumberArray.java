package io.practice.objects.number.array.task8;

public class NumberArray {

    int[] numbers;                       //массив чисел

    NumberArray(int[] numbers) {
        this.numbers = numbers;
    }

    int countEven() {                    //возвращает количество чётных элементов

        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    int countOdd() {                     //возвращает количество нечётных элементов

        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    void reverse() {                     //разворачивает массив

        for (int i = 0; i < numbers.length / 2; i++) {
            numbers[i] = numbers[i] + numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = numbers[i] - numbers[numbers.length - 1 - i];
            numbers[i] = numbers[i] - numbers[numbers.length - 1 - i];
        }
        System.out.println("После разворота: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    void replaceNegativeWithZero() {     //заменяет отрицательные элементы нулями

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }
        System.out.println("После замены отрицательных элементов: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    void contains(int value) {        //проверяет наличие значения

        for (int number : numbers) {
            if (number == value) {
                System.out.println("Число " + value + " найдено");
                break;
            }
        }
    }

    void printArray() {                  //выводит массив
        System.out.println("Чётных элементов: " + countEven());
        System.out.println("Нечётных элементов: " + countOdd());
    }
}
