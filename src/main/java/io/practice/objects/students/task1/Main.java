package io.practice.objects.students.task1;

public class Main {

    public static void main() {

        Student studentAnna = new Student(
                "Анна",
                19,
                new int[]{9, 10, 8, 9, 10}
        );
        studentAnna.printInfo();
    }
}
