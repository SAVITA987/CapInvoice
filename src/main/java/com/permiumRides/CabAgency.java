package com.permiumRides;
import java.util.Scanner;

	class Ride {
	    private String rideCategory;
	    private double distance;
	    private double duration;

	    public Ride(String rideCategory, double distance, double duration) {
	        this.rideCategory = rideCategory;
	        this.distance = distance;
	        this.duration = duration;
	    }

	    public double calculateFare() {
	        if ("normal".equalsIgnoreCase(rideCategory)) {
	            double farePerKm = 10.0;
	            double farePerMinute = 1.0;
	            double minimumFare = 5.0;

	            double totalFare = distance * farePerKm + duration * farePerMinute;
	            return Math.max(totalFare, minimumFare);
	        } else if ("premium".equalsIgnoreCase(rideCategory)) {
	            double farePerKm = 15.0;
	            double farePerMinute = 2.0;
	            double minimumFare = 20.0;

	            double totalFare = distance * farePerKm + duration * farePerMinute;
	            return Math.max(totalFare, minimumFare);
	        } else {
	            throw new IllegalArgumentException("Invalid ride category");
	        }
	    }
	}

	public class CabAgency {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter ride category (normal/premium): ");
	        String rideCategory = scanner.next().toLowerCase();

	        System.out.print("Enter distance (in km): ");
	        double distance = scanner.nextDouble();

	        System.out.print("Enter duration (in minutes): ");
	        double duration = scanner.nextDouble();

	        Ride ride = new Ride(rideCategory, distance, duration);
	        double fare = ride.calculateFare();

	        System.out.println("Total fare: Rs." + fare);

	        scanner.close();
	    }
	}

