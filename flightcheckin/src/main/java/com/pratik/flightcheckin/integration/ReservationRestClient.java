package com.pratik.flightcheckin.integration;

import com.pratik.flightcheckin.dto.Reservation;
import com.pratik.flightcheckin.dto.UpdateResevationRequest;


public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	public Reservation updateReservationRequest(UpdateResevationRequest req);
}
