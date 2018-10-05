package com.ashish.flights.pojo;

import java.util.Date;

/**
 * 
 * @author agupt139
 * @since 04-10-2018
 * 
 */
public class FlightDetails {
	
	int flightNo;
	String flightName;
	String destination;
	String source;
	int departureTime;
	int arrivalTime;
	int price;
	int routeTime;
	static int autoFlightNoGen;

	{
		flightNo = ++autoFlightNoGen;
	}
	
	public FlightDetails(String flightName, String destination, String source, int departureTime,
			int arrivalTime, int price, int routeTime) {
		super();
		this.flightName = flightName;
		this.destination = destination;
		this.source = source;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.price = price;
		this.routeTime = routeTime;
	}

	

	public int getRouteTime() {
		return routeTime;
	}



	public void setRouteTime(int routeTime) {
		this.routeTime = routeTime;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getFlightNo() {
		return flightNo;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	public int getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}



	@Override
	public String toString() {
		return "FlightDetails [flightNo=" + flightNo + ", flightName=" + flightName + ", destination=" + destination
				+ ", source=" + source + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", price=" + price + ", routeTime=" + routeTime + "]";
	}



	public int getPrice() {
		return price;
	}

	
	
}
