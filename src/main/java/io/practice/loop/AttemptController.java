package io.practice.loop;

public class AttemptController {

    /**
     * Контроллер попыток входа
     * • Реализуйте «Контроллер попыток входа»: итерация.
     * • int totalTests=9, int maxFailures=2, int maxRetries=3
     * • Считать passed и failed отдельно; результат теста задаётся выражением  Math.random() > 0.7 ? "passed" : "failed".
     * • Остановить цикл при failed >= maxFailures.
     *
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * • Повторять failed тест не более maxRetries раз; continue используется только для пропуска отключённого теста.
     * • Метод runBatch(int totalTests, int maxFailures, int maxRetries, boolean stopRequested) возвращает итоговую строку.
     * • Main только собирает данные и вызывает методы
     * • Имена отражают бизнес-смысл
     * • Результат должен быть воспроизводимым
     */

    public static String runBatch(int totalTests, int maxFailures, int maxRetries) {

        int passedCount = 0;
        int failedCount = 0;

        for (int i = 1; i <= totalTests; i++) {
            if (failedCount >= maxFailures) {
                break;
            }

            int retryCount = 0;
            String testResult;

            do {
                testResult = getTestResult();
                retryCount = retryCount + 1;
                System.out.println("Запуска теста № " + i + " Попытка исправления ошибки " + retryCount + " Результат : " + testResult);
            } while (testResult.equals("failed") && retryCount < maxRetries);

            if (testResult.equals("passed")) {
                passedCount = passedCount + 1;
                System.out.println("Тест № " + i + " PASSED");
            } else {
                failedCount = failedCount + 1;
                System.out.println("Тест № " + i + " FAILED");
            }

        }
        return "Пройдено тестов: " + passedCount + ", Провалено тестов: " + failedCount;
    }

    public static String getTestResult() {
        return Math.random() > 0.1 ? "passed" : "failed";
    }

    static void main() {

        int totalTests = 9;
        int maxFailures = 2;
        int maxRetries = 3;

        String result = runBatch(totalTests, maxFailures, maxRetries);
        System.out.println(result);
    }
}
