package com.BusBooking.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/busbooking")
public class UserPage {
	
	@GetMapping("/login")
	public String user() {
		System.out.println("run properly");
		return "index";
	}

}
