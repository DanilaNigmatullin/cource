package io.practice.loop;

public class CheckAtLeastOnce_4 {

    public static String checkOnce (int attempt) {

        int maxChecks = 5;
        boolean success = false;

        do {
            attempt++;
            success = attempt % 2 == 0;
        } while (!success && attempt < maxChecks);
            return "Completed";

    }

    static void main() {
        String result = checkOnce(0);
        System.out.println(result);
    }
}
