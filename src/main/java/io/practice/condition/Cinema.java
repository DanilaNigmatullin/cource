package io.practice.condition;

public class Cinema {
    /**
     * Проверка возраста для кинотеатра
     * ▸ Создайте метод canEnterCinema(int age, boolean hasTicket)
     * ▸ Возвращает true, если age >= 18 И hasTicket == true
     * ▸ В противном случае возвращает false
     * ▸ Напишите main, который тестирует метод с разными значениями
     */

    public static boolean canEnterCinema(int age, boolean hasTicket) {
        if (age >= 18 && hasTicket) {
            return true;
        } else {
            return false;
        }
    }

    static void main() {
        boolean canEnterCinema = canEnterCinema(20, true);
        System.out.println(canEnterCinema);
    }
}
