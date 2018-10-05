package com.ashish.flights.cust;

import com.ashish.flights.FlightService;
import com.ashish.flights.pojo.FlightDetails;

public class Customer {
	public static void main(String[] args) {
		
		FlightDetails f1=new FlightDetails("Air India","Lucknow","Delhi",1830,2230,1800, 0);
		FlightDetails f2=new FlightDetails("SpiceJet","Lucknow","Mumbai",1830,0000,12600, 0);
		FlightDetails f3=new FlightDetails("Vistara","Lucknow","Bangalore",0330,2230,9800, 0);
		FlightDetails f4=new FlightDetails("Indigo","Lucknow","Leh",0630,1130,6900, 0);
		FlightService flt=new FlightService();
		flt.addFlight(f1);
		flt.addFlight(f2);
		flt.addFlight(f3);
		flt.addFlight(f4);
		System.out.println(flt.getAllFlight());
		System.out.println(flt.sortByCost());
		System.out.println(flt.sortFlightByTime());
	}
}
