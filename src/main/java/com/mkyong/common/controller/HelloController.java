package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/aaa")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView printWelcome(ModelMap model) {
        ModelAndView sb = new ModelAndView("hello");
        System.out.println("bonjour");
        model.addAttribute("message", "Spring 3 MVC Hello World");
		return sb;

	}
/*	// /welcome/welcome/welcome2
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

	}	*/
}