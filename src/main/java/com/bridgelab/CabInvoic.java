package com.bridgelab;

public class CabInvoic {

	static final double costperkm=10.0;
	static final double costpermin=1.0;
	static final double min_fare=5;
	
	public double calculateFare(double distnace,int time){
        double totalfare = (distnace*costperkm)+(time*costpermin);
        if(totalfare<5){
            return min_fare;
        }
        return totalfare;
    }

}.

