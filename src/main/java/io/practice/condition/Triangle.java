package io.practice.condition;

public class Triangle {

    /**
     * Проверка треугольника
     * Входные данные: три стороны (double a, b, c)
     * Правила:
     * Если сумма любых двух сторон меньше третьей → "Треугольник не существует"
     * Если все стороны равны → "Равносторонний"
     * Если хотя бы две равны → "Равнобедренный"
     * Иначе → "Разносторонний"
     * Метод: checkTriangleType(double a, double b, double c) — хорошая тренировка на порядок проверок в if
     */

    public static String checkTriangleType(double a, double b, double c) {
         if (((a + b) < c) || ((a + c) < b) || ((c + b) < a)) {
             return "Треугольник не существует";
        } if (a == b && b == c && a == c) {
             return "Равносторонний";
        } if (a == b || b == c || a == c) {
             return "Равнобедренный";
        }
         return "Разносторонний";
    }

    static void main() {
        String result = checkTriangleType(1,1,3);
        System.out.println(result);
    }
}
