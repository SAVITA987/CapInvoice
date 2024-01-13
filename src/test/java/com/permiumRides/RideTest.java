package com.permiumRides;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

	public class RideTest {

	    @Test
	    public void testCalculateFareNormalRide() {
	        Ride normalRide = new Ride("normal", 5.0, 10.0);
	        double fare = normalRide.calculateFare();
	        assertEquals(50.0, fare, 0.001); 
	    }

	    @Test
	    public void testCalculateFarePremiumRide() {
	        Ride premiumRide = new Ride("premium", 5.0, 10.0);
	        double fare = premiumRide.calculateFare();
	        assertEquals(70.0, fare, 0.001); 
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testInvalidRideCategory() {
	        Ride invalidRide = new Ride("invalid", 5.0, 10.0);
	        invalidRide.calculateFare(); 
	    }
	}

