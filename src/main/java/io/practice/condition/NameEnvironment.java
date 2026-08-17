package io.practice.condition;

public class NameEnvironment {

    /**
     * Проверка имени окружения
     * • Реализуйте «Проверка имени окружения»: сравнение String через equals.
     * • String environment, String branch, boolean databaseReady
     * • environment: dev, stage, prod.
     * • dev принимает любую непустую ветку.
     * • stage принимает main или release/*.
     * <p>
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * • prod принимает только main и требует databaseReady=true.
     * • Метод: String validateTarget(String environment, String branch, boolean databaseReady).
     * • Main только собирает данные и вызывает методы
     * • Имена отражают бизнес-смысл
     * • Результат должен быть воспроизводимым
     */

    public static String validateTarget(String environment, String branch, boolean databaseReady) {
        if (environment.equals("dev") && !branch.isEmpty()) {
            return "VALID";
        }
        if (environment.equals("stage") && (branch.equals("main") || branch.equals("release/*"))) {
            return "VALID";
        }
        if (environment.equals("stage")) {
            return "INVALID_BRANCH";
        }
        if (environment.equals("prod") && branch.equals("main") && databaseReady) {
            return "VALID";
        }
        return "DATABASE_NOT_READY";
    }

    static void main() {
        String result = validateTarget("prod", "main", true);
        System.out.println(result);
    }
}
