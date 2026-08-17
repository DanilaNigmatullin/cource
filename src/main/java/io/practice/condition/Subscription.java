package io.practice.condition;

public class Subscription {

    /**
     * Расчёт скидки подписки
     * Реализуйте «Расчёт скидки подписки»: if-else.
     * double monthlyPrice, int months, boolean student, String promoCode
     * monthlyPrice > 0; months допускает 1, 3, 6 или 12.
     * student даёт скидку 10%.
     * promoCode "JAVA20" даёт скидку 20%.
     *
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * Скидки не суммируются: применяется большая.
     * Метод: double calculatePrice(double monthlyPrice, int months, boolean student, String promoCode).
     * Main только собирает данные и вызывает методы
     * Имена отражают бизнес-смысл
     * Результат должен быть воспроизводимым
     */


    public static double calculatePrice(double monthlyPrice, int months, boolean student, String promoCode) {
        if (monthlyPrice > 0) {
            if (months == 1 || months == 3 || months == 6 || months == 12) {
                monthlyPrice = monthlyPrice * months;
                if (student) {
                    if (promoCode.equals("JAVA20")) {
                        return monthlyPrice  * 0.8;
                    }
                    return monthlyPrice * 0.9 ;
                }
                else if (promoCode.equals("JAVA20")) {
                    return monthlyPrice  * 0.8;
                }
                return monthlyPrice;
            } else {
                throw new RuntimeException("Ошибка периода");
            }
        }
        throw new RuntimeException("Ошибка цены");
    }

    static void main() {
        double result = calculatePrice(100, 3, true, "JAVA20");
        System.out.println(result);
    }
}
