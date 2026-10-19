package io.practice.objects.bus.routes.task14.app;

import io.practice.objects.bus.routes.task14.model.BusTrip;
import io.practice.objects.bus.routes.task14.service.BusStation;

public class Main {
    public static void main(String[] args) {

        BusTrip[] allTrips = {
                new BusTrip(15, "Афины", 5),
                new BusTrip(10, "Париж", 10),
                new BusTrip(20, "Афины", 3),
                new BusTrip(5, "Рим", 8)
        };

        BusStation stations = new BusStation(allTrips);

        BusTrip trip = stations.findTrip(15);

        trip.reserveSeat(2);
        System.out.println();
        trip.reserveSeat(5);
        System.out.println();
        trip.reserveSeat(2);
        System.out.println();
        trip.cancelReservation(5);
        System.out.println();

        trip.printSeatMap();
        System.out.println();
        System.out.println("Количество свободных мест: " + trip.countFreeSeats());
        System.out.println();

        stations.printAllTrips();
        System.out.println();

        System.out.println("Общее количество полных рейсов: " + stations.countFullTrips());
    }
}
