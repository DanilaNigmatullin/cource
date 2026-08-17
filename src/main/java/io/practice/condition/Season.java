package io.practice.condition;

public class Season {

    /**
     * Определение сезона по месяцу
     * Входные данные: номер месяца (int, 1–12)
     * Правила: 12,1,2 → зима; 3,4,5 → весна; 6,7,8 → лето; 9,10,11 → осень; если число вне диапазона 1–12 → "Некорректный месяц"
     * Метод: getSeason(int month) — тренировка на if / else if / else без вложенности
     */

    public static String getSeason(int month) {
        if (month == 12 || month == 1 || month == 2) {
            return "Зима";
        } else if (month == 3 || month == 4 || month == 5) {
            return "Весна";
        } else if (month == 6 || month == 7 || month ==8) {
            return "Лето";
        } else if (month == 9 || month == 10 || month == 11) {
            return "Осень";
        } else {
            return "Некорректный месяц";
        }
    }

    static void main() {
        String result = getSeason(10);
        System.out.println(result);
    }
}
