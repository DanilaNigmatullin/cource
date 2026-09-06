package io.practice.loop;

public class BatchTestExecution_7 {

    public static String testExecution (int maxTests) {

        int passed = 0;
        int failed = 0;

        for (int i = 1; i <= maxTests; i++) {
            if (i % 3 != 0) {
                passed = passed + 1;
            } else {
                failed = failed + 1;
            }
        }
        int totalTests = passed + failed;
        if (totalTests != maxTests){
            return "Yt cjdgflftn";
        }
        return "Всего пройдено тестов: " + totalTests + " Пройдено: " + passed + " Провалено: " + failed;
    }

    static void main() {
        String result = testExecution(2000);
        System.out.println(result);
    }
}
