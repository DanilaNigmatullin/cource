package io.practice.objects.transport.task10.transport;

public class Car {

    public String brand;         //марка
    public String model;         //модель
    public int year;             //год выпуска
    public int mileage;          //пробег

    public Car(String brand, String model, int year, int mileage) {

        if (year <= 0) {
            throw new RuntimeException("Ошибка: год выпуска должен быть положительным");
        }

        if (mileage < 0) {
            throw new RuntimeException("Ошибка: пробег не может быть отрицательным");
        }

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void addMileage(int kilometers) {            //добавляемое количество километров

        if (kilometers < 0) {
            throw new RuntimeException("Ошибка: количество километров не может быть отрицательным");
        }
        this.mileage += kilometers;
    }

    public boolean isOldCar(int currentYear) {          //проверка возраста машины
        return (currentYear - year) > 15;
    }

    public void printInfo() {                           //вывод информации
        System.out.println("Марка машины: " + brand);
        System.out.println("Модель машины: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Пробег: " + mileage);
    }
}
