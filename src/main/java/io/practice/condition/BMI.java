package io.practice.condition;

public class BMI {

    /**
     * Классификация ИМТ (индекс массы тела)
     * Входные данные: вес (double, кг), рост (double, м)
     * Формула: ИМТ = вес / (рост × рост)
     * Правила:
     * < 18.5 → "Недостаточный вес"
     * 18.5–24.9 → "Норма"
     * 25–29.9 → "Избыточный вес"
     * ≥ 30 → "Ожирение"
     * Метод: classifyBMI(double weight, double height) — тренировка на диапазоны через if/else if
     */

    public static String classifyBMI(double weight, double height) {
        double BMI = (weight / (height * height));
        if (BMI < 18.5) {
            return "Недостаточный вес";
        } else if (BMI > 18.5 && BMI < 25) {
            return "Норма";
        } else if (BMI > 25 && BMI < 30) {
            return "Избыточный вес";
        } else if (BMI >= 30) {
            return "Ожирение";
        }
        return "Неверные данные";
    }

    static void main() {
        String result = classifyBMI(72, 1.72);
        System.out.println(result);
    }
}
