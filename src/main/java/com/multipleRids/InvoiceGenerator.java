package com.multipleRids;

import java.util.ArrayList;

class InvoiceGenerator {
    private ArrayList<Ride> rides;

    public InvoiceGenerator() {
        this.rides = new ArrayList<>();
    }

    public void addRide(String rideName, double rideFare) {
        Ride ride = new Ride(rideName, rideFare);
        rides.add(ride);
    }

    public double calculateTotalFare() {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.getRideFare();
        }
        return totalFare;
    }

    public void generateInvoice() {
        System.out.println("Ride\t\tFare");
        System.out.println("------------------------");
        for (Ride ride : rides) {
            String rideName = null;
			System.out.println(rideName + "\t\t" + ride.getRideFare());
        }
        System.out.println("------------------------");
        System.out.println("Total Fare:\t" + calculateTotalFare());
    }
}
