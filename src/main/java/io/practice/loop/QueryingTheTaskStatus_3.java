package io.practice.loop;

public class QueryingTheTaskStatus_3 {

    public static String taskStatus(int maxPolls) {

        int poll = 1;
        boolean done = false;

        while (!done && poll <= maxPolls) {
            if (poll % 4 == 0) {
                return "Complete";
            }
            System.out.println("Attempt");
            poll = poll + 1;
        }
        return "TimeOut";
    }

    static void main() {
        String result = taskStatus (12);
        System.out.println(result);
    }
}

