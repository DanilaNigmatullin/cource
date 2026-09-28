package io.practice.array;

import java.util.Scanner;

public class HTTP_Response_Codes {

    public static int[] codes = {200, 404, 500, 200, 301, 200};

    public static void numberOfCodes200(int codes200) {

        int count = 0;

        for (int i = 0; i < codes.length; i++) {
            if (codes200 == codes[i]) {
                count++;
                System.out.println("Позиция: " + i);
            }
        }
        if (count == 0) {
            System.out.println("Такого кода не существует");
        } else {
            System.out.println("Количество кодов " + codes200 + ": " + count);
        }
    }

    public static void firstErrorCode400(int code400) {

        boolean found = false;

        for (int i = 0; i < codes.length; i++) {
            if (codes[i] >= code400) {
                System.out.println("Позиция: " + i);
                System.out.println("Код ошибки: " + codes[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Такого кода ошибки не существует");
        }
    }

    public static void allCodesExcept200 (int except200) {

        for (int i = 0; i < codes.length; i++) {
            if (codes[i] == except200) {
                System.out.println("Пропущено: " + except200 + " - позиция: " + i);
                continue;
            }
            System.out.println("Код: " + codes[i] + " - позиция: " + i);
        }
    }

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите нужный код: ");
        int N = scanner.nextInt();
        numberOfCodes200(N);


        System.out.print("Введите нужный код ошибки: ");
        int P = scanner.nextInt();
        firstErrorCode400(P);

        System.out.print("Введите код для пропуска: ");
        int M = scanner.nextInt();
        allCodesExcept200(M);
    }
}
