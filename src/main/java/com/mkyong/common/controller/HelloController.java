package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/welcome")
public class HelloController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	} 
	// /welcome/welcome/welcome2
	@RequestMapping(value = "/welcome/welcome2", method = RequestMethod.GET)
	public String printWelcome2(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World 2");
		return "hello";

	}
	// /welcome/w3
	@RequestMapping(value = "/w3", method = RequestMethod.GET)
	public String printWelcome3(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World 3");
		return "hello";

	}	
}