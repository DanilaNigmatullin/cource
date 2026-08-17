package io.practice.condition;

public class Practice {

    /*
        Задача 1 из 2

        Допиши метод sayHello, который будет приветствовать студентов на курсе. Он принимает строковый параметр name — имя
        студента — и выводит в консоль строку Добро пожаловать на курс, имя_студента!. Например, если
        вызвать sayHello("Чебурашка");, в консоль выведется: Добро пожаловать на курс, Чебурашка!
     */
    public static void sayHello(String name) {
        System.out.println("Добро пожаловать на курс, " + name + "!");
    }

    /*
    Задача 2 из 2

    Метод printAverageRating выводит в консоль средний балл студента за три семестра. В него передаются средние
    оценки, например: printAverageRating(4.8, 4.5, 3.9);.
    Допиши метод calculateAverageRating, который будет рассчитывать средний балл за три семестра и
    возвращать его значение.
    */
    public static void printAverageRating(double firstSemesterRating, double secondSemesterRating, double thirdSemesterRating) {
        double averageRating = calculateAverageRating(firstSemesterRating, secondSemesterRating, thirdSemesterRating);
        System.out.println("Средний балл по итогам трёх семестров " + averageRating);
    }

    public static double calculateAverageRating(double firstSemesterRating, double secondSemesterRating, double thirdSemesterRating) {
        return (firstSemesterRating + secondSemesterRating + thirdSemesterRating) / 3;
    }

    static void main() {
        sayHello("Чебурашка");
        printAverageRating(4.8, 4.5, 3.9);
    }
}

