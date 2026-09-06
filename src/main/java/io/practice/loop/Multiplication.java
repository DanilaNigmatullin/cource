package io.practice.loop;

public class Multiplication {

    static void main() {
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= 9; k++) {
                System.out.print(i * k + "\t");
            }
            System.out.println();
        }
    }
}
