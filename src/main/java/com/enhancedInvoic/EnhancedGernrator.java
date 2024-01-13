package com.enhancedInvoic;

import java.util.ArrayList;

public class EnhancedGernrator {

	class EnhancedInvoiceGenerator {
	    private ArrayList<Ride> rides;

	    public EnhancedInvoiceGenerator() {
	        this.rides = new ArrayList<>();
	    }

	    public void addRide(String rideName, double rideFare) {
	        Ride ride = new Ride(rideName, rideFare);
	        rides.add(ride);
	    }

	    public int getTotalRides() {
	        return rides.size();
	    }

	    public double getTotalFare() {
	        double totalFare = 0;
	        for (Ride ride : rides) {
	            totalFare += ride.getRideFare();
	        }
	        return totalFare;
	    }

	    public double getAverageFarePerRide() {
	        if (rides.size() == 0) {
	            return 0.0;
	        }
	        return getTotalFare() / getTotalRides();
	    }

	    public void generateInvoice() {
	        System.out.println("Ride\t\tFare");
	        System.out.println("------------------------");
	        for (Ride ride : rides) {
	            System.out.println(ride.getRideFare() + "\t\t" + ride.getRideFare());
	        }
	        System.out.println("------------------------");
	        System.out.println("Total Rides:\t" + getTotalRides());
	        System.out.println("Total Fare:\t" + getTotalFare());
	        System.out.println("Average Fare per Ride:\t" + getAverageFarePerRide());
	    }
	}
}
