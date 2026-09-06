package io.practice.loop;

public class ServiceAvailabilityMonitor_2 {

    public static String availabilityMonitor(int maxPolls, int consecutiveFailureLimit) {

        int poll = 0;
        int streak = 0;

        while (poll < maxPolls && streak < consecutiveFailureLimit) {
            poll = poll + 1;
            if (poll % 4 == 0) {
                streak = 0;
                System.out.println("UP: " + streak);
            } else {
                streak = streak + 1;
                System.out.println("DOWN: " + streak);
            }
        }
        if (streak == consecutiveFailureLimit) {
            return "SERVICE_DOWN";
        }
        return "UP";
    }

    static void main() {
        String result = availabilityMonitor(12, 3);
        System.out.println(result);
    }
}
