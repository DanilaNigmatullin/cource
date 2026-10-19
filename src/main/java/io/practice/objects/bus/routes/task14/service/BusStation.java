package io.practice.objects.bus.routes.task14.service;

import io.practice.objects.bus.routes.task14.model.BusTrip;

public class BusStation {

    public BusTrip[] trips;

    public BusStation(BusTrip[] trips) {
        this.trips = trips;
    }

    public BusTrip findTrip(int tripNumber) {

        for (BusTrip trip : trips) {
            if (trip.tripNumber == tripNumber) {
                return trip;
            }
        }
        return null;
    }

    public BusTrip findTripWithMostFreeSeats() {

        BusTrip bestTrip = null;
        int maxFree = -1;

        for (BusTrip trip : trips) {
            if (trip.countFreeSeats() > maxFree) {
                maxFree = trip.countFreeSeats();
                bestTrip = trip;
            }
        }
        return bestTrip;
    }

    public int countFullTrips() {

        int count = 0;

        for (BusTrip trip : trips) {
            if (trip.isFull()) {
                count++;
            }
        }
        return count;
    }

    public void printTripsTo(String destination) {

        for (BusTrip trip : trips) {
            if (trip.destination.equals(destination)) {
                trip.printInfo();
            }
        }
    }

    public void printAllTrips() {

        System.out.println("Все рейсы: ");
        System.out.println();

        for (BusTrip trip : trips) {
            trip.printInfo();
            System.out.println();
        }
    }
}
