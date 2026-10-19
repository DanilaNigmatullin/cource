package io.practice.objects.transport.task10.service;

import io.practice.objects.transport.task10.transport.Car;

public class CarService {

    public Car findNewestCar(Car[] cars) {

        Car newestCar = cars[0];

        for (int i = 1; i < cars.length; i++) {
            if (cars[i].year > newestCar.year) {
                newestCar = cars[i];
            }
        }
        return newestCar;
    }

    public int countOldCars(Car[] cars, int currentYear) {

        int count = 0;

        for (Car car : cars) {
            if (car.isOldCar(currentYear)) {
                count++;
            }
        }
        return count;
    }

    public void printCarsWithMileageLessThan(Car[] cars, int limit) {

        for (Car car : cars) {
            if (car.mileage < limit) {
                System.out.println(car.brand + " " + car.model);
            }
        }
    }
}
