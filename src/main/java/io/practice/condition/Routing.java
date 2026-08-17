package io.practice.condition;

public class Routing {

    /**
     * Маршрутизация по ролям
     * Реализуйте «Маршрутизация по ролям»: оператор &&.
     * String role, boolean active, boolean emailVerified, int failedLogins
     * role: admin, tester или viewer.
     * Неактивный пользователь всегда получает отказ.
     * После 3 failedLogins учётная запись блокируется.
     * <p>
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * admin требует emailVerified; tester может запускать, viewer только смотреть.
     * Метод: String resolvePermission(String role, boolean active, boolean emailVerified, int failedLogins).
     * Main только собирает данные и вызывает методы
     * Имена отражают бизнес-смысл
     * Результат должен быть воспроизводимым
     */

    public static String resolvePermission(String role, boolean active, boolean emailVerified, int failedLogins) {
        if (failedLogins < 3) {
            if (role.equals("admin") && emailVerified && active) {
                return "Полный доступ";
            } else if (role.equals("tester") && active) {
                return "Можно запускать тест";
            } else if (role.equals("viewer") && active) {
                return "Можно смотреть";
            }
            return "В доступе отказано";
        }
        return "Попытка ввода пароля 3 раза, учетная запись заблокирована";
    }

    static void main() {
        String result = resolvePermission("admin", true, true, 2);
        System.out.println(result);
    }
}
