package io.practice.condition;

public class Window {

    /**
     * Проверка окна запуска
     * Реализуйте «Проверка окна запуска»: вложенные условия.
     * int hour, int minute, boolean maintenanceMode, String environment
     * hour 0..23, minute 0..59.
     * environment: dev, stage или prod.
     * dev доступен всегда; stage — 08:00..22:00.
     * <p>
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * prod недоступен при maintenanceMode=true и доступен только 10:00..18:00.
     * Метод: boolean canStartTest(int hour, int minute, boolean maintenanceMode, String environment).
     * Main только собирает данные и вызывает методы
     * Имена отражают бизнес-смысл
     * Результат должен быть воспроизводимым
     */


    public static boolean canStartTest(int hour, int minute, boolean maintenanceMode, String environment) {
        if (environment.equals("dev")) {
            return true;
        } else if (environment.equals("stage") && hour >= 8 && hour < 22 && minute >= 0 && minute <= 59) {
            return true;
        } else if (environment.equals("prod") && !maintenanceMode && hour >= 10 && hour < 18 && minute >= 0 && minute <= 59) {
            return true;
        }
        return false;
    }

    static void main() {
        boolean result = canStartTest(22, 45, true, "stage");
        System.out.println(result);
    }
}

