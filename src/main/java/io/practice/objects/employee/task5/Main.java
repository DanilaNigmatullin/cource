package io.practice.objects.employee.task5;

public class Main {

    static void main() {

        Employee employee = new Employee(
                "Иван",
                "Разработчик",
                80000,
                4
        );

        employee.increaseSalary(5);
        employee.printInfo();
    }
}
