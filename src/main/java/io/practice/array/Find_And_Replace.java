package io.practice.array;

import java.util.Arrays;

public class Find_And_Replace {

    public static void findAndReplace (boolean[] resultsArray) {

        int fixed = 0;

        for (int i = 0; i < resultsArray.length; i++) {
            if (!resultsArray[i]) {
                resultsArray[i] = true;
                System.out.println("Тест: " + i + " исправлен" + " - " + resultsArray[i]);
                fixed++;
            }
        }

        System.out.println("Исправлено тестов: " + fixed);
    }

    static void main() {
        boolean[] results = {true, false, true, false, false, true};
        findAndReplace(results);
        System.out.println("Массив после исправления: " + Arrays.toString(results));
    }
}
