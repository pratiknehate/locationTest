package com.pratik.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pratik.flightcheckin.dto.Reservation;
import com.pratik.flightcheckin.dto.UpdateResevationRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

	private static final String URI = "http://localhost:8080/locationweb/reservations/";

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(URI+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservationRequest(UpdateResevationRequest req) {
		RestTemplate restTemplate = new RestTemplate();		
		Reservation reservation = restTemplate.postForObject(URI, req, Reservation.class);
		return reservation;
	}

}
