package io.practice.condition;

public class ClassifyTest {

    /**
     * Классификация результатов теста
     *▸ Создайте метод classifyTest(int score, int maxScore)
     * ▸ Процент = score * 100 / maxScore
     * ▸ ≥90%: "Отлично", ≥75%: "Хорошо", ≥60%: "Удовл.", <60%: "Неуд."
     * ▸ Проверьте граничные значения: 59, 60, 74, 75, 89, 90
     */

    public static String classifyTest(int score, int maxScore) {
        int percent = score * 100 / maxScore;
        if (percent >= 90) {
            return "Отлично";
        } else if (percent >= 75) {
            return "Хорошо";
        } else if (percent >= 60) {
            return "Удовлетворительно";
        }
        return "Неудовлетворительно";
    }

    static void main() {
        int currentValue = 59;
        String finalScore = classifyTest(currentValue, 100);
        System.out.println("Ваше значение: " + currentValue + "; Ваш результат: " + finalScore);

        currentValue = 60;
        finalScore = classifyTest(currentValue, 100);
        System.out.println("Ваше значение: " + currentValue + "; Ваш результат: " + finalScore);

        currentValue = 74;
        finalScore = classifyTest(currentValue, 100);
        System.out.println("Ваше значение: " + currentValue + "; Ваш результат: " + finalScore);

        currentValue = 75;
        finalScore = classifyTest(currentValue, 100);
        System.out.println("Ваше значение: " + currentValue + "; Ваш результат: " + finalScore);

        currentValue = 89;
        finalScore = classifyTest(currentValue, 100);
        System.out.println("Ваше значение: " + currentValue + "; Ваш результат: " + finalScore);

        currentValue = 90;
        finalScore = classifyTest(currentValue, 100);
        System.out.println("Ваше значение: " + currentValue + "; Ваш результат: " + finalScore);

    }
}
