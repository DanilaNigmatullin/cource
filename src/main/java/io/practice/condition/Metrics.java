package io.practice.condition;

public class Metrics {

    /**
     * Безопасное деление метрик
     * • Реализуйте «Безопасное деление метрик»: short-circuit.
     * • double numerator, double denominator, boolean percentage
     * • При denominator == 0 вернуть сообщение "Деление на ноль".
     * • Если percentage=true, умножить результат на 100.
     * <p>
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * • Округлить результат до двух знаков.
     * • Метод: String calculateMetric(double numerator, double denominator, boolean percentage).
     * • Main только собирает данные и вызывает методы
     * • Имена отражают бизнес-смысл
     * • Результат должен быть воспроизводимым
     */

    public static String calculateMetric(double numerator, double denominator, boolean percentage) {
        if (denominator == 0) {
            return "Деление на ноль";
        }
        if (percentage) {
            return String.format("%.2f", (numerator / denominator) * 100);
        }
        return String.format("%.2f", numerator / denominator);
    }

    static void main() {
        String result = calculateMetric(0,5,true);
        System.out.println(result);
    }
}
