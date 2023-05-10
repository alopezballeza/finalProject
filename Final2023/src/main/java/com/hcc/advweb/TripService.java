package com.hcc.advweb;

import java.util.ArrayList;

public interface TripService {

	public void addTrip(TripsParameters trip);
	
	public ArrayList<TripsParameters> getTripsList();
	
	public TripsParameters getTrip(int Id);
	
	public TripsParameters updateTrip(TripsParameters trip);

}
