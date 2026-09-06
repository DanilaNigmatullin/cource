package io.practice.loop;

public class TestIDGenerator_6 {

    public static void idGenerator(int count) {

        String prefix = "TC - ";

        for (int i = 1; i <= count; i++) {
            System.out.println(prefix + String.format("%03d", i));
        }
    }

    static void main() {
        idGenerator(12);
    }
}
