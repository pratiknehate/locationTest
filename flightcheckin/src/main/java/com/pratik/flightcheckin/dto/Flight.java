package com.pratik.flightcheckin.dto;



public class Flight  {
	
	private String flightnumber;
	private String operatingairline;
	private String departurecity;
	private String arrivalcity; 
	private String dateofdeparture;
	private String time;
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getOperatingairline() {
		return operatingairline;
	}
	public void setOperatingairline(String operatingairline) {
		this.operatingairline = operatingairline;
	}
	public String getDeparturecity() {
		return departurecity;
	}
	public void setDeparturecity(String departurecity) {
		this.departurecity = departurecity;
	}
	public String getArrivalcity() {
		return arrivalcity;
	}
	public void setArrivalcity(String arrivalcity) {
		this.arrivalcity = arrivalcity;
	}
	public String getDateofdeparture() {
		return dateofdeparture;
	}
	public void setDateofdeparture(String dateofdeparture) {
		this.dateofdeparture = dateofdeparture;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
 
	
}
