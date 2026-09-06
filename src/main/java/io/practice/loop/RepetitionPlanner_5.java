package io.practice.loop;

public class RepetitionPlanner_5 {

    public static String repetitionPlanner(int initialAttempts, int maxAttempts) {

        if (initialAttempts == 0) {
            do {
                initialAttempts++;
            } while (initialAttempts % 3 != 0 && initialAttempts < maxAttempts);
        } else {
            while (initialAttempts % 3 != 0 && initialAttempts < maxAttempts)
                initialAttempts++;
        }
        return "Попытки: " + initialAttempts;
    }

    static void main() {
        String result = repetitionPlanner(9, 6);
        System.out.println(result);
    }
}
