package io.practice.condition;

public class TestVerify {
    /**
     * Система проверки доступа к тестовой системе
     * ▸ Создайте программу, которая проверяет возможность запуска теста
     * ▸ Входные данные: имя пользователя, пароль, роль ("student" или "admin")
     * ▸ Правила доступа:
     * ▸   • Имя не пустое И пароль длиной ≥ 6 → базовая проверка пройдена
     * ▸   • Если роль = "admin" → доступ разрешён всегда (при базовой проверке)
     * ▸   • Если роль = "student" → доступ разрешён только с 8:00 до 22:00
     * ▸   • В остальных случаях → доступ запрещён
     * ▸ Метод должен возвращать String с сообщением о результате
     * <p>
     * Требования к реализации:
     * • Используйте отдельные методы для каждой проверки (isValidCredentials, isAdmin, isWithinHours)
     * • Используйте &&, ||, ! где уместно
     * • Проверьте все комбинации: валидные/невалидные данные, admin/student, разное время
     * • Добавьте понятные сообщения об ошибках (почему доступ запрещён)
     */

    public static boolean isValidCredentials(String userName, String password) {
        if (userName != null && !userName.isEmpty() && password.length() >= 6) {
            return true;
        }
        return false;
    }

    public static boolean isAdmin(String roleUser) {
        if (roleUser.equals("admin")) {
            return true;
        }
        return false;
    }

    public static boolean isWithinHours(int timeHours) {
        if (timeHours >= 8 && timeHours <= 22) {
            return true;
        }
        return false;
    }

    public static String validationSystem(String userName, String password, String role, int time) {
        if (isValidCredentials(userName, password)) {
            if (isAdmin(role)) {
                return "Доступ разрешён";
            } else if (isWithinHours(time)) {
                return "Доступ разрешён";
            }
            return "Доступ не разрешён c 22 до 8";
        }
        return "Доступ не разрешён, неверные входные данные";
    }

    static void main() {
        String userName = "59";
        String password = "12";
        String role = "admin";
        int time = 5;
        String finalScore = validationSystem(userName, password, role, time);
        System.out.println("Запуск теста для " + userName + ";" + password + ";" + role + ";" + time + ";" + finalScore);

        userName = "59";
        password = "1234567";
        role = "admin";
        time = 5;
        finalScore = validationSystem(userName, password, role, time);
        System.out.println("Запуск теста для " + userName + ";" + password + ";" + role + ";" + time + ";" + finalScore);

        userName = "";
        password = "1234567";
        role = "admin";
        time = 5;
        finalScore = validationSystem(userName, password, role, time);
        System.out.println("Запуск теста для " + userName + ";" + password + ";" + role + ";" + time + ";" + finalScore);

        userName = "59";
        password = "1234567";
        role = "admin";
        time = 10;
        finalScore = validationSystem(userName, password, role, time);
        System.out.println("Запуск теста для " + userName + ";" + password + ";" + role + ";" + time + ";" + finalScore);

        userName = "59";
        password = "1234567";
        role = "student";
        time = 5;
        finalScore = validationSystem(userName, password, role, time);
        System.out.println("Запуск теста для " + userName + ";" + password + ";" + role + ";" + time + ";" + finalScore);

        userName = "59";
        password = "1234567";
        role = "student";
        time = 10;
        finalScore = validationSystem(userName, password, role, time);
        System.out.println("Запуск теста для " + userName + ";" + password + ";" + role + ";" + time + ";" + finalScore);
    }
}
