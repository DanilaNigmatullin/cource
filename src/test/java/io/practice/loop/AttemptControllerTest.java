package io.practice.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AttemptControllerTest {

    @Test
    void standardTest() {
        int totalTests = 9;
        int maxFailures = 2;
        int maxRetries = 3;

        String result = AttemptController.runBatch(totalTests, maxFailures, maxRetries);

        Assertions.assertEquals("Пройдено тестов: 9, Провалено тестов: 0", result);
    }
    @Test
    void standardTest2() {
        int totalTests = 10;
        int maxFailures = 2;
        int maxRetries = 3;

        String result = AttemptController.runBatch(totalTests, maxFailures, maxRetries);

        Assertions.assertEquals("Пройдено тестов: 10, Провалено тестов: 0", result);
    }
}
