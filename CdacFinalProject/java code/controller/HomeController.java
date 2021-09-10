package com.sports.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sports.services.TournamentDao;



@Controller
public class HomeController {
	
	@Autowired
	private TournamentDao dao;
	
	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/login")
	public String Login() {
		Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
		if(authentication==null || authentication instanceof AnonymousAuthenticationToken) {
		return "login";}
		else return "redirect:/";
		
	}
	
	@GetMapping("/membership")
	public String membership() {
		return "membership";
	}
	
	@GetMapping("/contact")
	public String contact() {
		
		return "contact";
	}
	
	@GetMapping("/tournaments")
	public String tournaments(Model model) {
		model.addAttribute("list", this.dao.getAllTournaments());
		return "tournaments";
	}
	
	@GetMapping("/gallery")
	public String gallery() {
		return "gallery";
	}
	
}
