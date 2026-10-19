package io.practice.objects.electronic.journal.task11.app;

import io.practice.objects.electronic.journal.task11.model.Student;
import io.practice.objects.electronic.journal.task11.service.GradeBook;

public class Main {

    static void main() {

        Student[] students = {
                new Student("Анна", new int[]{9, 10, 9, 9, 9}),
                new Student("Мария", new int[]{8, 9, 8, 8, 9}),
                new Student("Иван", new int[]{6, 7, 7, 6, 8}),
                new Student("Алексей", new int[]{5, 6, 4, 5, 5}),
                new Student("Дмитрий", new int[]{3, 7, 8, 6, 9}),
                new Student("Елена", new int[]{10, 10, 9, 10, 10})
        };

        GradeBook gradeBook = new GradeBook("Java-01", students);

        gradeBook.printRating();
        System.out.println();

        System.out.println("Рейтинг:");

        Student[] rating = new Student[students.length];

        for (int i = 0; i < rating.length; i++) {
            rating[i] = students[i];
        }

        for (int i = 0; i < rating.length; i++) {
            Student current = rating[i];
            int j = i - 1;

            while (j >= 0 && rating[j].calculateAverage() < current.calculateAverage()) {
                rating[j + 1] = rating[j];
                j--;
            }
            rating[j + 1] = current;
        }

        for (Student student : rating) {
            System.out.println(student.name + " - " + student.calculateAverage());
        }

        System.out.println();
        gradeBook.findBestStudent();
        gradeBook.findWorstStudent();
    }
}
