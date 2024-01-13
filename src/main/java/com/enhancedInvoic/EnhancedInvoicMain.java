package com.enhancedInvoic;

import java.util.Scanner;

import com.enhancedInvoic.EnhancedGernrator.EnhancedInvoiceGenerator;

public class EnhancedInvoicMain {

	 public static void main(String[] args) {
	        EnhancedInvoiceGenerator invoiceGenerator = new EnhancedInvoiceGenerator();
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rides: ");
	        int numberOfRides = scanner.nextInt();

	        for (int i = 1; i <= numberOfRides; i++) {
	            System.out.print("Enter ride name for ride " + i + ": ");
	            String rideName = scanner.next();
	            System.out.print("Enter fare for ride " + i + ": ");
	            double rideFare = scanner.nextDouble();

	            invoiceGenerator.addRide(rideName, rideFare);
	        }

	        invoiceGenerator.generateInvoice();

	        scanner.close();
	    }
	}

