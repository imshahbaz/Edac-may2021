package com.sports.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacilityController {

	
	@GetMapping("/swimming")
	public String swimming() {
		/*
		 * Authentication authentication=
		 * SecurityContextHolder.getContext().getAuthentication();
		 * System.out.println(authentication.getName());
		 */
		
		
		return "swimming";
	}
	
	@GetMapping("/cricket")
	public String cricket() {
		return "cricket";
	}
	
	@GetMapping("/badminton")
	public String badminton() {
		return "badminton";
	}
	
	@GetMapping("/bodyzone")
	public String bodyzone() {
		return "bodyzone";
	}
	
	@GetMapping("/music")
	public String music() {
		return "music";
	}
	
}
