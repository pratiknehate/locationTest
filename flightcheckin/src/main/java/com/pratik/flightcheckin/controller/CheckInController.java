package com.pratik.flightcheckin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pratik.flightcheckin.dto.Reservation;
import com.pratik.flightcheckin.dto.UpdateResevationRequest;
import com.pratik.flightcheckin.integration.ReservationRestClient;

@Controller
public class CheckInController {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CheckInController.class);

	
	@Autowired
	ReservationRestClient reservationRestClient; 
	
	@RequestMapping("/showStartCheckIn")
	public String showStartCheckIn() {
		return "StartCheckIn";
		
	}
	
	@RequestMapping("/StartCheckIn")
	public String StartCheckIn(@RequestParam("reservationId") Long id,ModelMap map) {
		Reservation reservation= reservationRestClient.findReservation(id);
		map.addAttribute("reservation", reservation);
		return "displayReservationDetails";
		
	}
	
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Long reservationId,@RequestParam("numberOfBags")int numberOfBags,ModelMap map) {
		Reservation reservation = reservationRestClient.findReservation(reservationId);
		UpdateResevationRequest req = new UpdateResevationRequest();
		req.setId(reservationId);
		req.setCheckedIn(true);
		req.setNumberOfBags(numberOfBags);
		reservationRestClient.updateReservationRequest(req);
		map.addAttribute("msg", "reservation done for id : "+reservationId);
		LOGGER.info("reservation done for id : "+reservationId);
		return "checkInDone";
	}

}
