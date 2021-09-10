package com.sports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sports.services.MemberDao;

@Controller
public class MembershipController {
	@Autowired
	private MemberDao dao;
	
	@GetMapping("/activatemembership")
	public String getMembership() {
		Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
		if(!dao.isMembershipActive(authentication.getName())) {
			dao.active(true, authentication.getName());
			return "redirect:/";
		}
		else return "redirect:/membership?already";
	}
	
}
