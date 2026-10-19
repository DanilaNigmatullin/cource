package io.practice.objects.electronic.journal.task11.service;

import io.practice.objects.electronic.journal.task11.model.Student;

public class GradeBook {

    String groupName;
    Student[] students;

    public GradeBook(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    public void findBestStudent() {

        Student bestStudent = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].calculateAverage() > bestStudent.calculateAverage()) {
                bestStudent = students[i];
            }
        }
        System.out.println("Преуспевающий студент: " + bestStudent.name + " - " + bestStudent.calculateAverage());
    }

    public void findWorstStudent() {

        Student worstStudent = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].calculateAverage() < worstStudent.calculateAverage()) {
                worstStudent = students[i];
            }
        }
        System.out.println("Отстающий студент: " + worstStudent.name + " - " + worstStudent.calculateAverage());
    }

    public double calculateGroupAverage() {

        double sum = 0;

        for (Student student : students) {
            sum += student.calculateAverage();
        }
        return sum / students.length;
    }

    public int countSuccessfulStudents() {

        int count = 0;

        for (Student student : students) {
            if (!student.hasUnsatisfactoryGrades()) {
                count++;
            }
        }
        return count;
    }

    public Student findStudent(String name) {

        if (name == null) {
            return null;
        }
        for (Student student : students) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void printRating() {
        System.out.println("Группа: " + groupName);
        System.out.printf("Средний балл группы: %.2f%n", calculateGroupAverage());
        System.out.println("Успешных студентов: " + countSuccessfulStudents());
    }
}

