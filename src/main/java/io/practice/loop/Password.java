package io.practice.loop;

import java.util.Scanner;

public class Password {

    public static String password() {
        Scanner scanner = new Scanner(System.in);

        String result = "Доступ запрещён";
        for (int i = 0; i < 3; i++) {
            String p = scanner.nextLine();
            if (p.equals("123321")) {
                result = "Добро пожаловать!";
                break;
            } else {
                System.out.println("Попробуйте еще раз!");
            }
        }
        return result;
    }

    public static String password2() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String p = scanner.nextLine();
            if (p.equals("123321")) {
                return "Добро пожаловать!";
            } else {
                System.out.println("Попробуйте еще раз!");
            }
        }
        return "Доступ запрещён";
    }

    static void main() {
        String result = password2();
        System.out.println(result);
    }
}
