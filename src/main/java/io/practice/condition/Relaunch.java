package io.practice.condition;

public class Relaunch {

    /**
     * Решение по повторному запуску
     * • Реализуйте «Решение по повторному запуску»: return в ветвях.
     * • String status, int attempts, int maxAttempts, boolean infrastructureError
     * • attempts >= 0; maxAttempts 1..5.
     * • PASSED никогда не перезапускается.
     * • FAILED перезапускается, пока attempts < maxAttempts.
     * <p>
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * • При infrastructureError разрешён один дополнительный запуск.
     * • Метод: boolean shouldRetry(String status, int attempts, int maxAttempts, boolean infrastructureError).
     * • Main только собирает данные и вызывает методы
     * • Имена отражают бизнес-смысл
     * • Результат должен быть воспроизводимым
     */

    public static boolean shouldRetry(String status, int attempts, int maxAttempts, boolean infrastructureError) {
        if (status.equals("PASSED")) {
            return false;
        }
        if (status.equals("FAILED") && attempts < maxAttempts) {
            return true;
        }
        if (infrastructureError && attempts == maxAttempts) {
            return true;
        }
        return false;
    }

    static void main() {
        boolean result = shouldRetry("FAILED", 3, 3, true);
        System.out.println(result);
    }
}
