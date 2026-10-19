package io.practice.objects.electronic.journal.task11.model;

public class Student {

    public String name;
    public int[] grades;

    public Student(String name, int[] grades) {

        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Ошибка: имя студента не может быть пустым");
        }

        if (grades == null || grades.length == 0) {
            throw new RuntimeException("Ошибка: массив оценок студента не может быть пустым");
        }

        for (int grade : grades) {
            if (grade < 1 || grade > 10) {
                throw new RuntimeException("Ошибка: оценки должны быть от 1 до 10");
            }
        }

        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {

        int sum = 0;

        for (int grade : grades) {
            sum = sum + grade;
        }
        return (double) sum / grades.length;
    }

    public int findMinimumGrade() {

        int min = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    public int findMaximumGrade() {

        int max = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

    public int countGrade(int grade) {

        int count = 0;

        for (int j : grades) {
            if (j == grade) {
                count++;
            }
        }
        return count;
    }

    public boolean hasUnsatisfactoryGrades() {

        for (int grade : grades) {
            if (grade < 4) {
                return true;
            }
        }
        return false;
    }

    public void printInfo() {
        System.out.println("Имя студента: " + name);
        System.out.printf("Средний балл студента: %.2f%n", calculateAverage());
        System.out.println("Минимальная оценка студента: " + findMinimumGrade());
        System.out.println("Максимальная оценка студента: " + findMaximumGrade());
        System.out.println("Неудовлетворительные оценки: " + (hasUnsatisfactoryGrades() ? "есть" : "нет"));
    }
}
