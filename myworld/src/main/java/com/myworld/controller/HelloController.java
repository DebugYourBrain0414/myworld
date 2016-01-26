package com.myworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/test")
	@ResponseBody
	public ModelAndView index() {
		String message = "Hello World and shit!";
		return new ModelAndView("index", "message", message);   
	}
}