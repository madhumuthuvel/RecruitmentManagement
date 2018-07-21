package com.rm.recruitment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	
	@RequestMapping(value= {"/","/home"})
	public ModelAndView homePage() {
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("geeting", "Hello");
		return modelAndView;
	}

}
