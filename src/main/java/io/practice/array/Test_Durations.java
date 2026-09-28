package io.practice.array;

public class Test_Durations {


    public static void findTheAverageDuration(int[] durationsArray) {    // Средняя длительность

        int sum = 0;

        for (int i = 0; i < durationsArray.length; i++) {
            sum = sum + durationsArray[i];
        }
        double average = (double) sum / durationsArray.length;
        System.out.println("Среднее: " + average);
    }

    public static void findTheLongestTest(int[] durationsLongest) {     // Самый быстрый тест

        int min = durationsLongest[0];

        for (int i = 1; i < durationsLongest.length; i++) {
            if (durationsLongest[i] < min) {
                min = durationsLongest[i];
            }
        }
        System.out.println("Минимум: " + min);
    }

    public static void findTheFastestTest(int[] durationsFastest) {     // Самый долгий тест

        int max = durationsFastest[0];

        for (int i = 1; i < durationsFastest.length; i++) {
            if (durationsFastest[i] > max) {
                max = durationsFastest[i];
            }
        }
        System.out.println("Максимум: " + max);
    }

    public static void howManyTestsLastedLongerThan100Seconds(int[] durations100Seconds) {  // Тесты больше 100 секунд

        int count = 0;

        for (int i = 0; i < durations100Seconds.length; i++) {
            if (durations100Seconds[i] > 100) {
                System.out.println("Индекс тестов, больше 100 секунд: " + i + " - секунды: " + durations100Seconds[i]);
                count++;
            }
        }
        System.out.println("Тестов, которые длились дольше 100 секунд: " + count);
    }

    static void main() {
        int[] durations = {120, 45, 200, 80, 150, 30, 90};
        findTheAverageDuration(durations);
        findTheLongestTest(durations);
        findTheFastestTest(durations);
        howManyTestsLastedLongerThan100Seconds(durations);
    }
}
