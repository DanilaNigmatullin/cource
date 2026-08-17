package io.practice.condition;

public class TestBench {

    /**
     * Система доступа к тестовому стенду
     * • Реализуйте «Система доступа к тестовому стенду»: система доступа.
     * • String username, String password, String role, boolean isWithinHours, int hour
     * • username не пустой; password длиной >= 6.
     * • role допускает admin или student.
     * • admin доступен всегда после базовой проверки.
     * <p>
     * ТРЕБОВАНИЯ К РЕАЛИЗАЦИИ
     * • student доступен с 08:00 включительно до 22:00 не включительно.
     * • Методы: isValidCredentials, isAdmin, checkAccess.
     * • Main только собирает данные и вызывает методы
     * • Имена отражают бизнес-смысл
     * • Результат должен быть воспроизводимым
     */

    public static boolean isValidCredentials(String username, String password) {
        if (!username.isEmpty() && password.length() >= 6) {
            return true;
        }
        return false;
    }

    public static boolean isAdmin(String role) {
        if (role.equals("admin")) {
            return true;
        }
        return false;
    }

    public static boolean isWithinHours(int hour) {
        if (hour >= 8 && hour < 22) {
            return true;
        }
        return false;
    }

    public static String checkAccess(String username, String password, String role, int hour) {
        if (isValidCredentials(username, password)) {
            if (isAdmin(role)) {
                return "Доступ разрешён";
            }
            if (role.equals("student") && isWithinHours(hour)) {
                return "Доступ разрешён";
            }
            return "Отказано по времени";
        }
        return "Неверный логин или пароль";
    }

    static void main() {
        String result = checkAccess("anna", "123" ,"student",29);
        System.out.println(result);
    }
}