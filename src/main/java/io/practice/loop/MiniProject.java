package io.practice.loop;

public class MiniProject {

    public static final Integer TEST_AMOUNT = 10;

    /**
     * • Сценарий: вы тестируете систему авторизации
     * • Программа генерирует 10 случайных тест-кейсов (passed/failed)
     * • Нужно: подсчитать количество passed и failed тестов
     * • Найти номер первого failed теста
     * • Если failed > 3 — вывести предупреждение и прервать подсчёт
     * • Вывести статистику: процент успеха, средний результат
     * <p>
     * • Шаг 1: Создать массив из 10 boolean (см. Модуль 7) или использовать цикл с 10 итерациями
     * • Шаг 2: В цикле for (i от 0 до 9) сгенерировать случайный результат
     * • Шаг 3: Если passed — увеличить passedCount, иначе — failedCount
     * • Шаг 4: Если первый failed ещё не найден — сохранить индекс
     * • Шаг 5: Если failedCount > 3 — break с сообщением 'Критический сбой'
     * • Шаг 6: После цикла вывести passedCount, failedCount, процент
     */

    static void main() {

        int passedCount = 0;
        int failedCount = 0;
        int firstFailedIndex = -1;

        for (int i = 0; i < TEST_AMOUNT; i++) {
            String result = Math.random() > 0.3 ? "passed" : "failed";


            if (result.equals("passed")) {
                passedCount = passedCount + 1;
            } else {
                failedCount = failedCount + 1;

                if (failedCount == 1) {
                    firstFailedIndex = i;
                }
            }

            if (failedCount > 3) {
                System.out.println("Критический сбой");
                break;
            }
        }
        if (firstFailedIndex != -1) {
            System.out.println("Первый failed тест: №" + (firstFailedIndex + 1));
        } else {
            System.out.println("Все тесты пройдены успешно");
        }

        double successRate = ((double) passedCount / TEST_AMOUNT) * 100;
        System.out.println("Пройдено тестов: " + passedCount + "/" + TEST_AMOUNT);
        int totalRun = passedCount + failedCount;
        System.out.println("Провалено тестов: " + failedCount + "/" + totalRun);
        System.out.println("Процент успеха: " + successRate);
    }
}
