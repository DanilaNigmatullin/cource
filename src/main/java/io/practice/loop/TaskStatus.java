package io.practice.loop;

public class TaskStatus {

    /**
     * Опрос статуса задания
     * • Реализуйте «Опрос статуса задания»: порядок while.
     * • int totalTests=11, int maxFailures=4, int maxRetries=3, boolean stopRequested
     * • Выполнить не более totalTests итераций; номер теста начинается с 1.
     * • Считать passed и failed отдельно; результат теста задаётся выражением testNumber % 5 != 0.
     * • Остановить цикл при failed >= maxFailures или stopRequested=true.
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

            int retryCount = -1;
            String testResult;

            do {
                testResult = getTestResult();
                retryCount = retryCount + 1;
                System.out.println("Запуска теста № " + i + " Результат : " + testResult);
            } while (testResult.equals("failed") && retryCount < maxRetries);
            System.out.println("Попытка исправления ошибки " + retryCount);

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
        return Math.random() > 0.5 ? "passed" : "failed";
    }

    static void main() {

        int totalTests = 11;
        int maxFailures = 4;
        int maxRetries = 3;

        String result = runBatch(totalTests, maxFailures, maxRetries);
        System.out.println(result);
    }
}
