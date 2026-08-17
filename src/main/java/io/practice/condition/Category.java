package io.practice.condition;

public class Category {

    /**
     * Определение категории по возрасту и стажу (для допуска к работе)
     * Входные данные: возраст (int), стаж работы в годах (int)
     * Правила:
     * Возраст < 18 → "Не допускается"
     * Возраст ≥ 18 И стаж = 0 → "Стажёр"
     * Возраст ≥ 18 И стаж от 1 до 3 → "Junior"
     * Возраст ≥ 18 И стаж от 4 до 7 → "Middle"
     * Возраст ≥ 18 И стаж > 7 → "Senior"
     * Метод: getJobLevel(int age, int experience)
     */

    public static String getJobLevel(int age, int experience) {
        if (age < 18) {
            return "Не допускается";
        } else if (experience == 0) {
            return "Стажёр";
        } else if (experience >= 1 && experience <= 3) {
            return "Junior";
        } else if (experience >= 4 && experience <= 7) {
            return "Middle";
        } else {
            return "Senior";
        }
    }

    static void main() {
        String result = getJobLevel(20, 2);
        System.out.println(result);
    }
}
