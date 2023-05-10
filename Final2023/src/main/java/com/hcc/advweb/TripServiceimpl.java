package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TripServiceimpl implements TripService {

	@Autowired
	private TripDAO tripDAO;
	
	public TripServiceimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addTrip(TripsParameters trip) {
		// TODO Auto-generated method stub
		tripDAO.addTrip(trip);	
		
	}

	@Override
	@Transactional
	public ArrayList<TripsParameters> getTripsList() {
		// TODO Auto-generated method stub
		return tripDAO.getTripsList();
	}

	@Override
	@Transactional
	public TripsParameters getTrip(int Id) {
		// TODO Auto-generated method stub
		return tripDAO.getTrip(Id);
	}

	@Override
	@Transactional
	public TripsParameters updateTrip(TripsParameters trip) {
		// TODO Auto-generated method stub
		return tripDAO.updateTrip(trip);
	}
	
	

}
