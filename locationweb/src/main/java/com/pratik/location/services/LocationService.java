package com.pratik.location.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.pratik.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationById(int id);
	List<Location> getAllLocations();
}
