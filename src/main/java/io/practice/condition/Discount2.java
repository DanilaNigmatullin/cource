package io.practice.condition;

public class Discount2 {

    /**
     * Расчёт скидки на товар
     * Входные данные: сумма покупки (double), есть ли дисконтная карта (boolean)
     * Правила:
     * Сумма ≥ 5000 И есть карта → скидка 15%
     * Сумма ≥ 5000 И нет карты → скидка 10%
     * Сумма от 1000 до 5000 И есть карта → скидка 5%
     * Иначе → скидки нет
     * Метод: calculateDiscount(double amount, boolean hasCard) → возвращает String с итоговой суммой и процентом скидки
     */

    public static String calculateDiscount(double amount, boolean hasCard) {
        if (amount >= 5000 && hasCard) {
            return "Скидка 15%";
        } if (amount >= 5000) {
            return "Скидка 10%";
        } if (amount >= 1000 && amount < 5000 && hasCard) {
            return "Скидка 5%";
        }
        return "Скидки нет";
    }

    static void main() {
        String result = calculateDiscount(1000, true);
        System.out.println(result);
    }
}
