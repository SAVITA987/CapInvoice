package com.bridgelab;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class CabInvoicTest {

	    @Test
	    public void calculateFare_ShouldReturnMinimumFare_WhenTotalFareIsLessThanMinimum() {
	        CabInvoic cabInvoic = new CabInvoic();
	        double distance = 2.5;
	        int time = 10;
	        double fare = cabInvoic.calculateFare(distance, time);
	        assertEquals(CabInvoic.min_fare, fare, 0.01); 
	    }

	    @Test
	    public void calculateFare_ShouldReturnTotalFare_WhenTotalFareIsMoreThanMinimum() {
	        CabInvoic cabInvoic = new CabInvoic();
	        double distance = 5.0;
	        int time = 15;
	        double fare = cabInvoic.calculateFare(distance, time);
	        double expectedFare = (distance * CabInvoic.costperkm) + (time * CabInvoic.costpermin);
	        assertEquals(expectedFare, fare, 0.01); 
	    }

	    @Test
	    public void calculateFare_ShouldReturnMinimumFare_WhenTotalFareIsEqualToMinimum() {
	        CabInvoic cabInvoic = new CabInvoic();
	        double distance = 1.0;
	        int time = 4;
	        double fare = cabInvoic.calculateFare(distance, time);
	        assertEquals(CabInvoic.min_fare, fare, 0.01); 
	    }
	}
