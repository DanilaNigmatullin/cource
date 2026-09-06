package io.practice.loop;

public class StartupIncreasingDelay_8 {

    public static void increasingDelay(int baseDelayMs, int maxDelayMs) {

        int delay = baseDelayMs;
        int delayTry = 0;

        while (delay <= maxDelayMs) {
            delayTry = delayTry + 1;
            delay = delay * 2;
            System.out.println(delay + " " + delayTry);
        }
    }

    static void main() {
        increasingDelay(100, 3200);
    }
}
