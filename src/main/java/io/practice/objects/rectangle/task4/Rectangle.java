package io.practice.objects.rectangle.task4;

public class Rectangle {

    double width;
    double height;

    Rectangle(double side) {

        if (side <= 0) {
            throw new RuntimeException("Ошибка: ширина должна быть больше 0");
        }

        width = side;
    }

    Rectangle(double width, double height) {

        if (width <= 0) {
            throw new RuntimeException("Ошибка: ширина должна быть больше 0");
        }

        if (height <= 0) {
            throw new RuntimeException("Ошибка: высота должна быть больше 0");
        }

        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return (width + height) * 2;
    }

    boolean isSquare() {
        return width == height;
    }

    void scale(double coefficient) {

        if (coefficient <= 0) {
            throw new RuntimeException("Ошибка: коэффициент масштабирования должен быть больше 0");
        }

        System.out.println("После масштабирования с коэффициентом " + (int) coefficient + ":");
        width *= coefficient;
        height *= coefficient;
    }

    void printInfo() {
        System.out.println("Ширина: " + width);
        System.out.println("Высота: " + height);
        System.out.println("Площадь: " +  calculateArea());
        System.out.println("Периметр: " +   calculatePerimeter());
        System.out.println("Квадрат: " +  (isSquare() ? "да" : "нет"));
    }
}
