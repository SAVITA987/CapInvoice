package com.enhancedInvoic;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.junit.Test;

	public class EnhancedInvoiceGeneratorTest<EnhancedInvoiceGenerator> {

	    @Test
	    public void testCalculateTotalFare() {
	        EnhancedInvoiceGenerator invoiceGenerator = new EnhancedInvoiceGenerator();

	        invoiceGenerator.addRide("Ride1", 10.0);
	        invoiceGenerator.addRide("Ride2", 15.0);

	        double totalFare = invoiceGenerator.getTotalFare();

	        assertEquals(25.0, totalFare, 0.001);
	    }

	    @Test
	    public void testGenerateInvoice() {
	        EnhancedInvoiceGenerator invoiceGenerator = new EnhancedInvoiceGenerator();

	        invoiceGenerator.addRide("Ride1", 10.0);
	        invoiceGenerator.addRide("Ride2", 15.0);

	        String expectedInvoice = "Ride\t\tFare\n" +
	                "------------------------\n" +
	                "Ride1\t\t10.0\n" +
	                "Ride2\t\t15.0\n" +
	                "------------------------\n" +
	                "Total Rides:\t2\n" +
	                "Total Fare:\t25.0\n" +
	                "Average Fare per Ride:\t12.5";

	        assertEquals(expectedInvoice, getFormattedInvoice(invoiceGenerator));
	    }

	    private String getFormattedInvoice(EnhancedInvoiceGenerator invoiceGenerator) {
	        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	        System.setOut(new PrintStream(outContent));

	        invoiceGenerator.generateInvoice();

	        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

	        return outContent.toString().trim();
	    }
	}

