package io.practice.array;

public class Test_Run_Analyzer {

    public static void testAnalyzerRandom(boolean[] resultsRandom) {

        for (int i = 0; i < resultsRandom.length; i++) {
            resultsRandom[i] = Math.random() > 0.3;
        }

        int passed = 0;
        int failed = 0;

        for (int i = 0; i < resultsRandom.length; i++) {
            if (resultsRandom[i]) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println("Пройдено тестов: " + passed);
        System.out.println("Завалено тестов: " + failed);

        int firstFailedIndex = -1;

        for (int i = 0; i < resultsRandom.length; i++) {
            if (!resultsRandom[i]) {
                firstFailedIndex = i;
                break;
            }
        }
        System.out.println("Индекс первого failed теста: " + firstFailedIndex);

        double successPercent = (double) passed / resultsRandom.length * 100;
        System.out.printf("Процент успешных тестов: %.2f%%\n", successPercent);

        if (failed > 5) {
            System.out.println("Предупреждение: проваленных тестов больше 5!" + " - " + failed + " тестов провалено");
        }

    }

    static void main() {
        boolean[] results = new boolean[20];
        testAnalyzerRandom(results);
    }
}
