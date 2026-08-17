package io.practice.condition;

public class Errors {

    /**
     * Фильтр критических ошибок
     * • Реализуйте «Фильтр критических ошибок»: метод возвращает boolean.
     * • String severity, boolean reproducible, int affectedTests
     * • severity: low, medium, high, critical.
     * • critical всегда требует немедленной блокировки релиза.
     * • high блокирует релиз, если reproducible=true.
     *
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * • medium блокирует при affectedTests >= 10; low не блокирует.
     * • Метод: boolean blocksRelease(String severity, boolean reproducible, int affectedTests).
     * • Main только собирает данные и вызывает методы
     * • Имена отражают бизнес-смысл
     * • Результат должен быть воспроизводимым
     */

    public static boolean blocksRelease(String severity, boolean reproducible, int affectedTests) {
        if (severity.equals("critical")) {
            return true;
        }
        if (severity.equals("high") && reproducible) {
            return true;
        }
        if (severity.equals("medium")) {
            if (affectedTests >=10) {
                return true;
            }
        }
        if (severity.equals("low")) {
            return false;
        }
        return false;
    }

    static void main() {
        boolean result = blocksRelease("medium",true,1);
        System.out.println(result);
    }
}
