package io.practice.condition;

public class Stability {

    /**
     * Оценка стабильности теста
     * Реализуйте «Оценка стабильности теста»: оператор ||.
     * int passedRuns, int failedRuns, double flakyRate
     * passedRuns и failedRuns не могут быть отрицательными.
     * Всего должно быть не менее 5 запусков.
     * STABLE: flakyRate <= 0.05 и failedRuns == 0.
     *
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * FLAKY: flakyRate > 0.05 и <= 0.20; UNSTABLE: выше 0.20.
     * Метод: String classifyStability(int passedRuns, int failedRuns, double flakyRate).
     * Main только собирает данные и вызывает методы
     * Имена отражают бизнес-смысл
     * Результат должен быть воспроизводимым
     */

    public static String classifyStability(int passedRuns, int failedRuns, double flakyRate) {
        if (flakyRate <= 0.05 && failedRuns == 0 && passedRuns >= 5) {
            return "STABLE";
        } else if (flakyRate > 0.05 && flakyRate <= 0.20 && passedRuns >= 5 && failedRuns == 0) {
            return "FLAKY";
        } else if (flakyRate > 0.20 && passedRuns >= 5 && failedRuns == 0) {
            return "UNSTABLE";
        }
        return "INVALID";
    }

    static void main() {
        String result = classifyStability(6, 0, 0.21);
        System.out.println(result);
    }
}
