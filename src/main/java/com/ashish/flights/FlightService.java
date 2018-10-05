package com.ashish.flights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.ashish.flights.pojo.FlightDetails;

public class FlightService {
	ArrayList<FlightDetails> flightList;
	
	public FlightService() {
		flightList = new ArrayList<FlightDetails>();
	}
	
	public FlightService(int size) {
		flightList = new ArrayList<FlightDetails>(size);
	}
	
	public void addFlight(FlightDetails flightDetails) {
		flightList.add(flightDetails);
	}
	
	public ArrayList<FlightDetails> removeFlightByFlightNo(int flightNo){
		flightList.remove(flightNo);
		return flightList;
	}
	
	public ArrayList<FlightDetails> updateFlightByDestination(int flightNo, String destination){
		for(FlightDetails fd: flightList) {
			if(fd.getFlightNo()==flightNo) {
				fd.setDestination(destination);
				return flightList;
			}
		}
		throw new RuntimeException("Flight not found");
	}
	
	public ArrayList<FlightDetails> updateFlightBySource(int flightNo, String source){
		for(FlightDetails fd: flightList) {
			if(fd.getFlightNo()==flightNo) {
				fd.setSource(source);
				return flightList;
			}
		}
		throw new RuntimeException("Flight not found");
	}
	
	public ArrayList<FlightDetails> updateFlightByDepartureTime(int flightNo, int departureTime){
		for(FlightDetails fd: flightList) {
			if(fd.getFlightNo()==flightNo) {
				fd.setDepartureTime(departureTime);
				return flightList;
			}
		}
		throw new RuntimeException("Flight not found");
	}
	
	public ArrayList<FlightDetails> updateFlightByArrivalTime(int flightNo, int arrivalTime){
		for(FlightDetails fd: flightList) {
			if(fd.getFlightNo()==flightNo) {
				fd.setArrivalTime(arrivalTime);
				return flightList;
			}
		}
		throw new RuntimeException("Flight not found");
	}
	
	public ArrayList<FlightDetails> getAllFlight() {
		return flightList;
	}
	
	public ArrayList<FlightDetails> sortByCost()
	{
		Collections.sort(flightList, new Comparator<FlightDetails>() {
		    public int compare(FlightDetails flight1, FlightDetails flight2) {
		        return flight1.getPrice()-flight2.getPrice();
		    }
		});
		return flightList;
				
	}
	
	
	public ArrayList<FlightDetails> sortFlightByTime(){
        Collections.sort(flightList, new Comparator<FlightDetails>() {

               public int compare(FlightDetails flight1, FlightDetails flight2) {
                     return flight1.getRouteTime()-(flight2.getRouteTime());
               }
               
        });
        return flightList;
 }
 
 public ArrayList<FlightDetails> morningFlights()
{
        ArrayList<FlightDetails> morningFlights=new ArrayList<FlightDetails>();
        for (FlightDetails flight : flightList) {
               if (flight.getDepartureTime()>=600 && flight.getDepartureTime()<1200)
                     morningFlights.add(flight);
               return morningFlights;
        }

        throw new RuntimeException("flight does not exist");
 }

}
