package io.practice.condition;

public class Movie {

    /**
     * Проверка возраста для просмотра фильма
     * Входные данные: возраст (int), рейтинг фильма ("0+", "12+", "16+", "18+")
     * Правила: возраст должен быть ≥ числа в рейтинге (для "0+" — всегда можно)
     * Метод: canWatchMovie(int age, String rating) → String с сообщением ("Можно смотреть" / "Слишком мал для этого фильма")
     */

    public static String canWatchMovie (int age, String rating) {
        int num = Integer.parseInt(rating.substring(0, rating.length() - 1));
        // Переводит строку в число и удаляет последний символ
        if (age >= num) {
            return "Можно смотреть";
        }
        return "Слишком мал для этого фильма";
    }

    static void main() {
        String result = canWatchMovie(2,"18+");
        System.out.println(result);
    }
}
