package com.pratik.location.entities;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;


@Entity
public class Flight  extends AbstractEntity{
	
	private String flightNumber;
	private String operatingAirline;
	private String departureCity;
	private String arrivalCity; 
	private String dateOfDeparture;
	private Timestamp estimateDepartureTime;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirline() {
		return operatingAirline;
	}
	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(String dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimateDepartureTime() {
		return estimateDepartureTime;
	}
	public void setEstimateDepartureTime(Timestamp estimateDepartureTime) {
		this.estimateDepartureTime = estimateDepartureTime;
	}
	 
}
