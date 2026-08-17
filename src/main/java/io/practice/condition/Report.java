package io.practice.condition;

public class Report {

    /**
     * Проверка прав на отчёт
     * • Реализуйте «Проверка прав на отчёт»: область видимости блока.
     * • String role, String reportOwner, String currentUser, boolean confidential
     * • owner всегда может открыть свой отчёт.
     * • admin может открыть любой отчёт.
     * • tester может открыть чужой отчёт только если confidential=false.
     * <p>
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * • viewer не открывает confidential отчёты.
     * • Метод: boolean canReadReport(String role, String reportOwner, String currentUser, boolean confidential).
     * • Main только собирает данные и вызывает методы
     * • Имена отражают бизнес-смысл
     * • Результат должен быть воспроизводимым
     */

    public static boolean canReadReport(String role, String reportOwner, String currentUser, boolean confidential) {
        if (role.equals("owner")) {
            if (reportOwner.equals(currentUser)) {
                return true;
            }
            return false;
        }
        if (role.equals("admin")) {
            return true;
        }
        if (role.equals("tester")) {
            if (reportOwner.equals(currentUser)) {
                return true;
            }
            if (!confidential) {
                return true;
            }
            return false;
        }
        if (role.equals("viewer")) {
            if (confidential) {
                return false;
            }
            return true;
        }
        return false;
    }

    static void main() {
        boolean result = canReadReport("viewer", "anna", "ivan", true);
        System.out.println(result);
    }
}
