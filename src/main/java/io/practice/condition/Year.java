package io.practice.condition;

public class Year {

    /**
     * Проверка високосного года
     * Входные данные: год (int)
     * Правила: год високосный, если делится на 4, но НЕ делится на 100, ИЛИ делится на 400
     * Метод: isLeapYear(int year) → boolean — классика на &&, ||, скобки приоритета
     */

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    static void main() {
        String result = String.valueOf(isLeapYear(1998));
        System.out.println(11 % 7);
    }
}
