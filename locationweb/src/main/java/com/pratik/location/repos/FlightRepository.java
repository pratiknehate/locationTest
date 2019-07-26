package com.pratik.location.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.pratik.location.entities.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query(value="SELECT * from p_flight where departure_city=:departureCity and arrival_city=:arrivalCity and date_of_departure=:dateOfDeparture",nativeQuery = true)
	List<Flight> findByCity(@Param("departureCity") String from,@Param("arrivalCity") String to,@Param("dateOfDeparture") String departureDate);
	
	

}