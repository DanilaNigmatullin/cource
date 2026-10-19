package io.practice.objects.transport.task10.app;

import io.practice.objects.transport.task10.service.CarService;
import io.practice.objects.transport.task10.transport.Car;

public class Main {

    public static void main() {

        Car[] cars = {
                new Car("Toyota", "Camry", 2021, 45000),
                new Car("Kia", "Rio", 2018, 78000),
                new Car("BMW", "X5", 2008, 150000),
                new Car("Lada", "Vesta", 2005, 95000),
                new Car("Honda", "Civic", 2015, 120000),
                new Car("Ford", "Focus", 2010, 65000)
        };

        CarService carService = new CarService();

        System.out.println("Самый новый автомобиль:");
        System.out.println();

        Car newestCar = carService.findNewestCar(cars);

        newestCar.printInfo();
        System.out.println();

        System.out.println("Старых автомобилей: " + carService.countOldCars(cars, 2026));
        System.out.println();

        System.out.println("Автомобили с пробегом меньше 100000 км: ");
        carService.printCarsWithMileageLessThan(cars, 100000);
    }
}
