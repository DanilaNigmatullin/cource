package io.practice.objects.rectangle.task4;

public class Main {

    static void main() {
        Rectangle rectangle = new Rectangle(
                4,
                6
        );

        rectangle.printInfo();
        System.out.println();
        rectangle.scale(2);
        rectangle.printInfo();
    }
}
