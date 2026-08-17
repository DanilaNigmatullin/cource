package io.practice.condition;

public class WiFi {

    /**
     * Проверка доступа к Wi-Fi в коворкинге
     * Входные данные: тип абонемента ("free", "standard", "premium"), оставшийся баланс (double), время суток (int, часы)
     * Правила:
     * "premium" → доступ всегда
     * "standard" → доступ только если баланс > 0
     * "free" → доступ только с 9:00 до 18:00 И если баланс ≥ 0 (условно бесплатный, но с лимитом по времени)
     * Методы: isPremium, isStandard, isFree, hasBalance, isDaytime, checkWifiAccess
     */

    public static boolean isPremium(String sub) {
        if ("premium".equals(sub)) {
            return true;
        }
        return false;
    }

    public static boolean isStandard(String sub) {
        if (sub.equals("standard")) {
            return true;
        }
        return false;
    }

    public static boolean isFree(String sub) {
        if (sub.equals("free")) {
            return true;
        }
        return false;
    }

    public static boolean hasBalance(double balance) {
        if (balance >= 0) {
            return true;
        }
        return false;
    }

    public static boolean isDaytime(int time) {
        if (time >= 9 && time <= 18) {
            return true;
        }
        return false;
    }

    public static String checkWifiAccess(String sub, double balance, int time) {
        if (isPremium(sub)) {
            return "Доступ разрешен";
        }
        if (isStandard(sub)) {
            if (hasBalance(balance)) {
                return "Доступ разрешен";
            }
            return "Недостаточно средств";
        }
        if (isFree(sub)) {
            if (isDaytime(time)) {
                if (hasBalance(balance)) {
                    return "Доступ разрешен";
                }
                return "Недостаточно средств";
            }
            return "Доступ возможен с 9 до 18";
        }
        return "Подписки не существует";
    }

    static void main() {
        String sub = null;
        double balance = 1;
        int time = 5;
        String finalScore = checkWifiAccess(sub, balance, time);
        System.out.println("Ваша подписка: " + sub + "; " + "Баланс: " + balance + " р." + "; " + "Время: " + time + "; " + finalScore);
    }
}
