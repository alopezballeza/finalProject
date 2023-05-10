package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class TripsController {

	@Autowired
	private TripService tripService;
	
	public TripsController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/tripslist", method= RequestMethod.GET)
	public ModelAndView getStudentsList(ModelAndView model) {
		ArrayList<TripsParameters> tripsList = tripService.getTripsList();
		model.addObject("tripsList",tripsList);
		model.setViewName("tripsList");
		return model;
	}

	@RequestMapping(value="/newspringtrip",method=RequestMethod.GET)
	public ModelAndView newSpringStudent(ModelAndView modelView) {
		TripsParameters trip = new TripsParameters();
		modelView.addObject("trip",trip);
		modelView.setViewName("addnewtrip");
		return modelView;
	}
	
	@RequestMapping(value="/addspringtrip", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addSpringStudent(@ModelAttribute TripsParameters trip) {
		System.out.println("----------");
		if (trip.getId() == 0) {
			tripService.addTrip(trip);
		} else {
			tripService.updateTrip(trip);
		}
		ArrayList<TripsParameters> tripsList = tripService.getTripsList();

		return new ModelAndView("tripslist","tripsList",tripsList);
	}
	
	
}
