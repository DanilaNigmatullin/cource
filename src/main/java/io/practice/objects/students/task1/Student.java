package io.practice.objects.students.task1;

public class Student {

    String name;
    int age;
    int[] grades;

    Student(String name, int age, int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    double calculateAverage() {

        double average = 0;

        for (int grade : grades) {
            average = average + grade;
        }
        return average / grades.length;
    }

    int findMinimumGrade() {

        int min = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    int findMaximumGrade() {

        int max = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    boolean isExcellentStudent() {

        for (int grade : grades) {
            if (grade < 9) {
                return false;
            }
        }
        return true;
    }

    void printInfo() {

        if (name == null) {
            System.out.println("Ошибка: имя не должно быть пустым");
            return;
        }

        if (age < 14 || age > 100) {
            System.out.println("Ошибка: возраст не соответствует требованиям");
            return;
        }

        if (grades.length == 0) {
            System.out.println("Ошибка: массив оценок не должен быть пустым");
            return;
        }

        for (int grade : grades) {
            if (grade < 1 || grade > 10) {
                System.out.println("Ошибка: каждая оценка должна быть от 1 до 10");
            }
        }
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);

        System.out.print("Оценки: ");

        for (int grade : grades) {
            System.out.print(" " + grade);
        }
        System.out.println(" ");

        System.out.println("Средняя оценка: " + calculateAverage());
        System.out.println("Минимальная оценка: " + findMinimumGrade());
        System.out.println("Максимальная оценка: " + findMaximumGrade());
        System.out.println("Отличник: " + (isExcellentStudent() ? "да" : "нет") );
    }
}
