package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class SpringTestController {
	
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
//	public String viewStudentDetails(ModelMap model) {
//	    model.addAttribute("greetings", "Hi, I am Spring Framework, Glad to meet you :) !!!!");
//	    return "hello"; // view
//	}

	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String welcomeReply(ModelMap model) {
	    model.addAttribute("intro", "My Trips");
	    return "homepage"; // view
	}
	


}
