package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

@Repository
public class TripDAOimpl implements TripDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public TripDAOimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addTrip(TripsParameters trip) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(trip);
		
	}

	@Override
	public ArrayList<TripsParameters> getTripsList() {
		// TODO Auto-generated method stub
		ArrayList<TripsParameters> tripsList = 
				(ArrayList<TripsParameters>)sessionFactory.
				getCurrentSession().createQuery("FROM trips").
				list();
		return tripsList;
		
	}

	@Override
	public TripsParameters getTrip(int Id) {
		// TODO Auto-generated method stub
		TripsParameters trip = (TripsParameters)sessionFactory.getCurrentSession().get(TripsParameters.class, Id);
		return trip;
	}

	@Override
	public TripsParameters updateTrip(TripsParameters trip) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
