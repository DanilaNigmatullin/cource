package io.practice.loop;

public class FailedTest {

    public static String tests(boolean[] results) {
        String arrayIndex = "Все тесты пройдены";;
        for (int i = 0; i < results.length; i++) {
            if (!results[i]) {
                arrayIndex = String.valueOf(i);
                System.out.println("Найдено!");
                break;
            }
        }
        return arrayIndex;
    }

    static void main() {
        boolean[] resultssssssssss = {true, true, true, true, true};
        String result = tests(resultssssssssss);
        System.out.println(result);
    }
}
