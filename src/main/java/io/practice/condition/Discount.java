package io.practice.condition;

public class Discount {
    /**
     * Расчёт скидки
     * ▸ Создайте метод calculateDiscount(int age, boolean isStudent)
     * ▸ Скидка 50%: если age >= 60 ИЛИ isStudent == true
     * ▸ Скидка 20%: если age >= 18 (но не попадает в 50%)
     * ▸ Скидка 0%: если age < 18
     * ▸ Метод возвращает процент скидки (int)
     */
    public static int calculateDiscount(int age, boolean isStudent) {
        if (age >= 60 || isStudent) {
            return 50;
        } else if (age >= 18) {
            return 20;
        } else {
            return 0;
        }
    }

    static void main() {
        int calculateDiscount = calculateDiscount(20, true);
        System.out.println("Ваша скидка " + calculateDiscount + "%!");
    }
}
