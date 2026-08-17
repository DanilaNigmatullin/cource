package io.practice.condition;

public class ReleaseApproval {

    /**
     * Правила допуска к релизу
     * • Реализуйте «Правила допуска к релизу»: упрощение условий.
     * • int failedTests, int criticalBugs, double passRate, boolean securityPassed
     * • failedTests и criticalBugs >= 0; passRate 0..100.
     * • criticalBugs > 0 всегда запрещает релиз.
     * • securityPassed должен быть true.
     * <p>
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * • passRate должен быть >= 95.0.
     * • Метод: String releaseDecision(int failedTests, int criticalBugs, double passRate, boolean securityPassed).
     * • Main только собирает данные и вызывает методы
     * • Имена отражают бизнес-смысл
     * • Результат должен быть воспроизводимым
     */

    public static String releaseDecision(int failedTests, int criticalBugs, double passRate, boolean securityPassed) {
        if (criticalBugs > 0 || failedTests > 0) {
            return "NO_GO_CRITICAL";
        }
        if (!securityPassed) {
            return "NO_GO_SECURITY";
        }
        if (passRate < 95) {
            return "NO_GO_PASS_RATE";
        }
        return "GO";
    }

    static void main() {
        String result = releaseDecision(0,0,96,true);
        System.out.println(result);
    }
}

