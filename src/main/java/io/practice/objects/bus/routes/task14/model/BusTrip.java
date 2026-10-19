package io.practice.objects.bus.routes.task14.model;

public class BusTrip {

    public int tripNumber;
    public String destination;
    public int totalSeats;
    public boolean[] occupiedSeats;

    public BusTrip(int tripNumber, String destination, int totalSeats) {

        if (tripNumber < 0) {
            throw new RuntimeException("Ошибка: номер рейса должен быть положительным");
        }
        if (totalSeats == 0) {
            throw new RuntimeException("Ошибка: количество мест должно быть больше 0");
        }

        this.tripNumber = tripNumber;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.occupiedSeats = new boolean[totalSeats];
    }

    public boolean reserveSeat(int seatNumber) {

        int index = seatNumber - 1;

        if (index < 0 || index >= occupiedSeats.length) {
            return false;
        }
        if (occupiedSeats[index]) {
            System.out.println("Ошибка: место " + seatNumber + " уже занято");
            return false;
        }
        occupiedSeats[index] = true;
        System.out.println("Место " + seatNumber + " забронировано");
        return true;
    }

    public boolean cancelReservation(int seatNumber) {

        int index = seatNumber - 1;

        if (index < 0 || index >= occupiedSeats.length) {
            return false;
        }
        if (!occupiedSeats[index]) {
            return false;
        }
        occupiedSeats[index] = false;
        System.out.println("Бронь места " + seatNumber + " отменена");
        return true;
    }

    public int countFreeSeats() {

        int count = 0;

        for (boolean occupiedSeat : occupiedSeats) {
            if (!occupiedSeat) {
                count++;
            }
        }
        return count;
    }

    public int countOccupiedSeats() {

        int count = 0;

        for (boolean occupiedSeat : occupiedSeats) {
            if (occupiedSeat) {
                count++;
            }
        }
        return count;
    }

    public boolean isFull() {
        return countFreeSeats() == 0;
    }

    public void printSeatMap() {

        System.out.println("Карта мест: ");
        System.out.println();

        for (int i = 0; i < occupiedSeats.length; i++) {
            System.out.println((i + 1) + " - " + (occupiedSeats[i] ? "занято" : "свободно"));
        }
    }

    public void printInfo() {
        System.out.println("Рейс №" + tripNumber);
        System.out.println("Направление: " + destination);
        System.out.println("Всего мест: " + totalSeats);
        System.out.println("Свободных мест: " + countFreeSeats());
    }
}
