package io.practice.objects.employee.task5;

public class Employee {

    String name;      //имя
    String position;  //должность
    double salary;    //месячная зарплата
    int experience;   //стаж в годах

    Employee(String name, String position, double salary, int experience) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
    }

    double calculateBonus() {                          // вычисляет премию

        double bonus = 0;

        if (experience < 2) {
            bonus = salary * 0.5;
        } else if (experience <= 5) {
            bonus = salary * 0.15;
        } else {
            bonus = salary * 0.25;
        }
        return bonus;
    }

    double calculateAnnualIncome() {                 // возвращает годовой доход с учётом премии

        double annualIncome = 0;

        annualIncome = (salary * 12) + calculateBonus();
        return annualIncome;
    }

    void increaseSalary(double percent) {            // повышает зарплату

        double increase = (salary * percent) / 100;
        salary += increase;
        System.out.println("Повышение составляет: +" + increase);
        System.out.println(" ");
    }

    void printInfo() {                               // выводит данные сотрудника
        System.out.println("Сотрудник: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Стаж: " + experience);
        System.out.println("Месячная зарплата: " + salary);
        System.out.println("Премия: " + calculateBonus());
        System.out.println("Годовой доход: " + calculateAnnualIncome());
    }
}