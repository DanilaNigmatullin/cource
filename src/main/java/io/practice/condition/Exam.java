package io.practice.condition;

public class Exam {

    /**
     * Входные данные: имя, средний балл (double), количество пропусков (int), есть ли долг по оплате (boolean)
     * Правила:
     * Средний балл ≥ 4.0 → допуск по успеваемости пройден
     * Пропусков ≤ 5 → допуск по посещаемости пройден
     * Если есть долг по оплате → допуск запрещён всегда, независимо от остального
     * Допуск разрешён только если оба условия (успеваемость И посещаемость) пройдены и долга нет
     * Методы: isGoodAverage, isAttendanceOk, hasDebt, canTakeExam
     * Сообщения должны объяснять какая именно причина отказа (можно вернуть список причин, а не одну строку — усложнённый вариант)
     */

    public static boolean isGoodAverage(double ball) {
        if (ball >= 4) {
            return true;
        }
        return false;
    }

    public static boolean isAttendanceOk(int propusk) {
        if (propusk <= 5) {
            return true;
        }
        return  false;
    }

    public static boolean hasDebt(boolean dolgOplata) {
        if (!dolgOplata) {
            return true;
        }
        return false;
    }

    public static String canTakeExam(double ball, int propusk, boolean dolgOplata) {
        if (isGoodAverage(ball) && isAttendanceOk(propusk)) {
            if (hasDebt(dolgOplata)) {
                return "Долга нет. Успеваемость и посещаемость в норме";
            }
            return "Есть долг по оплате. Допуск к экзамену отклонен";
        }
        return "Проблема с успеваемостью и посещаемостью";
    }

    static void main() {
        String name = "Vika";
        double ball = 5;
        int propusk = 4;
        boolean dolgOplata = true;
        String finalScore = canTakeExam(ball, propusk, dolgOplata);
        System.out.println("Ученик: " + name + "; " + ball + "; " + propusk + "; " + dolgOplata + "; " + finalScore);
    }
}
